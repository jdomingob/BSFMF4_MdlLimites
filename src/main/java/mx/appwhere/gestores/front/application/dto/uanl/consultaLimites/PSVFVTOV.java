
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class PSVFVTOV {

    @JsonProperty("FECHA_OPRCN")
    String fECHAOPRCN;

}