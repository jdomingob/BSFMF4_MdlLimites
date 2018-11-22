
package mx.appwhere.gestores.front.application.dto.uanl.guardarLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class ARTRNMSJPARMV {

    @JsonProperty("TEXT_CODE")
    String tEXTCODE;
    @JsonProperty("TEXT_ARG1")
    Object tEXTARG1;


}
