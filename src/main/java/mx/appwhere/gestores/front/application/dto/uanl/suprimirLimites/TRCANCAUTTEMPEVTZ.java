
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class TRCANCAUTTEMPEVTZ {

    @JsonProperty("IMP_SDO")
    private String iMPSDO;
    @JsonProperty("FECHA_SDO")
    private String fECHASDO;
    @JsonProperty("AF_APNTE_E")
    private AFAPNTEE aFAPNTEE;

}
