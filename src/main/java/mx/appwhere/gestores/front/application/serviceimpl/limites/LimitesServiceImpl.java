package mx.appwhere.gestores.front.application.serviceimpl.limites;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mx.appwhere.gestores.front.application.constants.ViewsLocation;
import mx.appwhere.gestores.front.application.dto.AttrCatalogueDto;
import mx.appwhere.gestores.front.application.dto.AttrCatalogueSetDto;
import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.reponse.ConsultaAcuerdoResponse;
import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.request.ConsultaAcuerdoRequest;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.reponse.ConsultaLimitesResponse;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.request.ConsultaLimitesRequest;
import mx.appwhere.gestores.front.application.dto.guardarLimite.reponse.GuardarLimiteResponse;
import mx.appwhere.gestores.front.application.dto.guardarLimite.request.GuardarLimiteRequest;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.reponse.SuprimirLimitesResponse;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.request.SuprimirLimitesRequest;
import mx.appwhere.gestores.front.application.dtoBackend.bsfOperador.BsfOperadorDto;
import mx.appwhere.gestores.front.domain.services.BsfOperadorService;
import mx.appwhere.gestores.front.domain.services.ConverterService;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.services.catalogos.CatalogoSetService;
import mx.appwhere.gestores.front.domain.services.catalogos.CatalogosService;
import mx.appwhere.gestores.front.domain.services.limites.LimitesService;
import mx.appwhere.gestores.front.domain.util.RestClient;
import mx.appwhere.gestores.front.domain.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class LimitesServiceImpl implements LimitesService {


    private String usuario;
    private String password;
    private String entidad;
    private String terminal;

    @Value("${wso2.esb.wsBsfLimitesDescubiertosEx.guardar-limite}")
    private String urlGuardarLimite;
    @Value("${wso2.esb.wsBsfLimitesDescubiertosEx.surpimir-limite}")
    private String urlSuprimirLimite;
    @Value("${wso2.esb.wsBsfLimitesDescubiertosEx.consulta-limite}")
    private String urlConsultarLimite;

    @Value("${wso2.as.asBsfConsultaTransacciones.consultaDatosPorAcuerdo}")
    private String urlConsultaAcuerdo;

    @Autowired
    GenericService genericService;
    @Autowired
    CatalogosService catalogosService;
    @Autowired
    CatalogoSetService catalogoSetService;

    RestClient restClient;
    ConverterService converterService;
    Util util;
    BsfOperadorService operadorService;
    BsfOperadorDto bsfOperadorDto;

    @Autowired
    public LimitesServiceImpl(GenericService genericService, ConverterService converterService, RestClient restClient, CatalogosService catalogosService, BsfOperadorService operadorService, Util util) {
        this.genericService = genericService;
        this.converterService = converterService;
        this.restClient = restClient;
        this.catalogosService = catalogosService;
        this.operadorService = operadorService;
        this.util = util;
    }


    public BsfOperadorDto DesencriptaBsfOperador(String bsfOperadorDto) {
        bsfOperadorDto = bsfOperadorDto.replaceAll("\"", "");
        bsfOperadorDto = bsfOperadorDto.replaceAll("\\r\\n", "");
        BsfOperadorDto bsfOperador = operadorService.decryptBsfOperador(bsfOperadorDto);
        usuario = bsfOperador.getUSERTCB();
        password = (String) bsfOperador.getPASSTCB();
        entidad = bsfOperador.getENTIDAD();
        terminal = String.valueOf(bsfOperador.getTERMINAL());
        return bsfOperador;
    }

    @Override
    public ModelAndView getMainView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        bsfOperadorDto = DesencriptaBsfOperador(bsfOperador);
        AttrCatalogueDto[] catalogoOperaciones = catalogosService.consultaCatalogoOperaciones();
        AttrCatalogueSetDto[] catalogoMonedas = catalogoSetService.consultaCatalogoMonedas();
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_LIMITES);
        mv.addObject("catalogoOperaciones",catalogoOperaciones);
        mv.addObject("catalogoMonedas",catalogoMonedas);
        mv.addObject("bsfOperador", bsfOperador);
        return mv;
    }

    @Override
    public ModelAndView getSecondaryView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        ModelAndView mv = new ModelAndView(ViewsLocation.VISTA_PRINCIPAL);
        mv.addObject("bsfOperador", bsfOperador);
        return mv;
    }

    @Override
    public ConsultaAcuerdoResponse consultaAcuerdo(ConsultaAcuerdoRequest request) {
        request.setAcuerdo(request.getAcuerdo());
        request.setUsuario(bsfOperadorDto.getUSERTCB());
        request.setPassword((String) bsfOperadorDto.getPASSTCB());
        request.setEntidad(bsfOperadorDto.getENTIDAD());
        request.setTerminal(String.valueOf(bsfOperadorDto.getTERMINAL()));
        UriComponents uri = UriComponentsBuilder.fromUriString(urlConsultaAcuerdo).build();
        ConsultaAcuerdoResponse response =  new ConsultaAcuerdoResponse();
        try{
            response = restClient.post(uri, new HttpHeaders(), request, ConsultaAcuerdoResponse.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return response;
    }

    @Override
    public ConsultaLimitesResponse consultaLimites(ConsultaLimitesRequest request) {
        return null;
    }

    @Override
    public SuprimirLimitesResponse suprimirLimites(SuprimirLimitesRequest request) {
        return null;
    }

    @Override
    public GuardarLimiteResponse guardarLimites(GuardarLimiteRequest request) {
        return null;
    }


}
