
package mx.appwhere.gestores.front.application.dto.consultaLimitesDto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericRequest;

@Data
public class ConsultaLimitesRequest extends GenericRequest {

    @JsonProperty("numSecAc")
    private String numSecAc;
    @JsonProperty("numSec")
    private String numSec;
    @JsonProperty("stdChar10")
    private String stdChar10;

}
