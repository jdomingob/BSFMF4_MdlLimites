
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class TRAFCONSEVTV {

    @JsonProperty("AF_APNTE_E")
    AFAPNTEE aFAPNTEE;
    @JsonProperty("IMP_SDO")
    String iMPSDO;
    @JsonProperty("AF_AUDIT_E")
    AFAUDITE aFAUDITE;

}
