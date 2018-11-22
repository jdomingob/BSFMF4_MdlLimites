
package mx.appwhere.gestores.front.application.dto.uanl.guardarLimites;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import lombok.experimental.PackagePrivate;


@Data
@PackagePrivate
public class ARAUTREMOTAP {

    @JsonProperty("COD_NRBE_EN")
    Object cODNRBEEN;
    @JsonProperty("ID_INTERNO_TERM_TN")
    Object iDINTERNOTERMTN;
    @JsonProperty("FECHA_OPRCN")
    String fECHAOPRCN;
    @JsonProperty("HORA_OPRCN")
    String hORAOPRCN;


}
