package mx.appwhere.gestores.front.domain.services.limites;

import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.reponse.ConsultaAcuerdoResponse;
import mx.appwhere.gestores.front.application.dto.consultaAcuerdo.request.ConsultaAcuerdoRequest;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.reponse.ConsultaLimitesResponse;
import mx.appwhere.gestores.front.application.dto.consultaLimitesDto.request.ConsultaLimitesRequest;
import mx.appwhere.gestores.front.application.dto.guardarLimite.reponse.GuardarLimiteResponse;
import mx.appwhere.gestores.front.application.dto.guardarLimite.request.GuardarLimiteRequest;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.reponse.SuprimirLimitesResponse;
import mx.appwhere.gestores.front.application.dto.suprimirLimite.request.SuprimirLimitesRequest;
import org.springframework.web.servlet.ModelAndView;

public interface LimitesService {
    ModelAndView getMainView (String bsfOperador);
    ModelAndView getSecondaryView (String bsfOperador);

    ConsultaAcuerdoResponse consultaAcuerdo(ConsultaAcuerdoRequest request);
    ConsultaLimitesResponse consultaLimites(ConsultaLimitesRequest request);
    SuprimirLimitesResponse suprimirLimites(SuprimirLimitesRequest request);
    GuardarLimiteResponse guardarLimites(GuardarLimiteRequest request);
}
