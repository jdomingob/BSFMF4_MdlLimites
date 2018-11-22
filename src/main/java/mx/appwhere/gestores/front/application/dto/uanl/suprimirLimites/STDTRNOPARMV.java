
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class STDTRNOPARMV {

    @JsonProperty("FECHA_OPRCN")
    private Integer fECHAOPRCN;
    @JsonProperty("HORA_OPRCN")
    private Integer hORAOPRCN;

}
