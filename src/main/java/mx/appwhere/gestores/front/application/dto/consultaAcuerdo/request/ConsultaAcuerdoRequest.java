
package mx.appwhere.gestores.front.application.dto.consultaAcuerdo.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericRequest;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaAcuerdoRequest extends GenericRequest {

    @JsonProperty("acuerdo")
    private String acuerdo;

}
