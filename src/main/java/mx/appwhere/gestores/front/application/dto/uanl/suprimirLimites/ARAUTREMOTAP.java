
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class ARAUTREMOTAP {

    @JsonProperty("COD_NRBE_EN")
    private Object cODNRBEEN;
    @JsonProperty("ID_INTERNO_TERM_TN")
    private Object iDINTERNOTERMTN;
    @JsonProperty("FECHA_OPRCN")
    private String fECHAOPRCN;
    @JsonProperty("HORA_OPRCN")
    private String hORAOPRCN;

}
