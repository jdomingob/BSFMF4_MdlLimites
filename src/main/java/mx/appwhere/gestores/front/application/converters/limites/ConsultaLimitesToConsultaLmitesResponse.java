package mx.appwhere.gestores.front.application.converters.gestores;

import mx.appwhere.gestores.front.application.converters.AbstractConverter;
import mx.appwhere.gestores.front.application.dto.consultagestor.response.ConsultaGestor.ConsultaGestorResponse;
import mx.appwhere.gestores.front.application.dto.consultagestor.response.ConsultaGestor.DatosGestor;
import mx.appwhere.gestores.front.application.dto.consultagestor.response.ConsultaGestor.DatosPersona;
import mx.appwhere.gestores.front.application.dto.consultagestor.response.RelacionGestor.DatosRelacionGestor;
import mx.appwhere.gestores.front.application.dto.consultagestor.response.RelacionGestor.RelacionGestorResponse;
import mx.appwhere.gestores.front.application.dto.uanl.consultagestor.ConsultaGestor;
import mx.appwhere.gestores.front.application.dto.uanl.relacionGestor.RelacionGestor;
import org.springframework.stereotype.Component;

/**
 * @author Ivan Solorio Garcia
 * version 1.0 2018/10/17
 */
@Component
public class ConsultaGestorToConsultaGestorResponse extends AbstractConverter<ConsultaGestor,ConsultaGestorResponse> {
    @Override
    public ConsultaGestorResponse convert(ConsultaGestor source) {
        ConsultaGestorResponse consultaGestorResponse= new ConsultaGestorResponse();
        DatosGestor datosGestor= new DatosGestor();
        DatosPersona datosPersona= new DatosPersona();
        modelMapper.map(source.getConsultaGestor().getDatos().getDatosGestor(),datosGestor);
        modelMapper.map(source.getConsultaGestor().getDatos().getDatosPersona(),datosPersona);
        consultaGestorResponse.setDatosGestor(datosGestor);
        consultaGestorResponse.setDatosPersona(datosPersona);
        return consultaGestorResponse;
    }
}
