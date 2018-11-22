
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class STDTRNMSJPARMV {

    @JsonProperty("TEXT_CODE")
    String tEXTCODE;
    @JsonProperty("TEXT_ARG1")
    Object tEXTARG1;

}
