
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class SuprimirLimites {

    @JsonProperty("OTR_CANC_AUT_TEMP_TRN_O")
    private OTRCANCAUTTEMPTRNO oTRCANCAUTTEMPTRNO;

}
