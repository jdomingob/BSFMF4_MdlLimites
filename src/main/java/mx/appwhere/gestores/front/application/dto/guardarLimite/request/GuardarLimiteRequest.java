
package mx.appwhere.gestores.front.application.dto.guardarLimite.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericRequest;

@Data
public class GuardarLimiteRequest extends GenericRequest {

    @JsonProperty("acuerdo")
    private String acuerdo;
    @JsonProperty("codOrgnApnte")
    private String codOrgnApnte;
    @JsonProperty("importe")
    private String importe;
    @JsonProperty("fechaCtble")
    private String fechaCtble;
    @JsonProperty("fechaValor")
    private String fechaValor;
    @JsonProperty("ind1")
    private String ind1;
    @JsonProperty("ind2")
    private String ind2;

}
