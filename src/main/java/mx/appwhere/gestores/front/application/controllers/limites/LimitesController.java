package mx.appwhere.gestores.front.application.controllers.limites;

import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.reponse.ConsultaAcuerdoResponse;
import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.request.ConsultaAcuerdoRequest;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.reponse.ConsultaLimitesResponse;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.request.ConsultaLimitesRequest;
import mx.appwhere.gestores.front.application.dto.guardarLimite.reponse.GuardarLimiteResponse;
import mx.appwhere.gestores.front.application.dto.guardarLimite.request.GuardarLimiteRequest;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.reponse.SuprimirLimitesResponse;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.request.SuprimirLimitesRequest;
import mx.appwhere.gestores.front.domain.services.GenericService;
import mx.appwhere.gestores.front.domain.services.limites.LimitesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LimitesController {

    private GenericService genericService;
    private LimitesService limitesService;

    @Autowired
    public LimitesController(LimitesService limitesService, GenericService genericService) {
        this.limitesService = limitesService;
        this.genericService = genericService;
    }

    @PostMapping("vista-principal")
    public ModelAndView getSecondaryView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        return limitesService.getSecondaryView(bsfOperador);
    }

    @PostMapping("consultaDatosPorAcuerdo")
    public ConsultaAcuerdoResponse consultaAcuerdo(ConsultaAcuerdoRequest request) {
        return limitesService.consultaAcuerdo(request);
    }

    @PostMapping("consulta-limite")
    public ConsultaLimitesResponse consultaLimites(ConsultaLimitesRequest request) {
        return null;
    }

    @PostMapping("surpimir-limite")
    public SuprimirLimitesResponse suprimirLimites(SuprimirLimitesRequest request) {
        return null;
    }

    @PostMapping("guardar-limite")
    public GuardarLimiteResponse guardarLimites(GuardarLimiteRequest request) {
        return null;
    }

    @PostMapping("vista-limites")
    public ModelAndView getMainView(@RequestParam("BSFOPERADOR") String bsfOperador) {
        return limitesService.getMainView(bsfOperador);
    }





}
