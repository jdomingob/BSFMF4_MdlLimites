
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class PSVCODNUMRCOMONEDAV {

    @JsonProperty("COD_NUMRCO_MONEDA")
    String cODNUMRCOMONEDA;

}
