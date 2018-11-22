
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class ARTRNMSJPARMV {

    @JsonProperty("TEXT_CODE")
    private String tEXTCODE;
    @JsonProperty("TEXT_ARG1")
    private Object tEXTARG1;

}
