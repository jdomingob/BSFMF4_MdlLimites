
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class CODINTERNOUOV {

    @JsonProperty("COD_INTERNO_UO")
    Integer cODINTERNOUO;

}
