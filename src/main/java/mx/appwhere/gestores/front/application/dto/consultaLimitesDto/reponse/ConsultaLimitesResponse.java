
package mx.appwhere.gestores.front.application.dto.consultaLimitesDto.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericResponse;

@Data
public class ConsultaLimitesResponse extends GenericResponse {

    private String numSecAc;
    private String numSec;
    private String stdChar10;

}
