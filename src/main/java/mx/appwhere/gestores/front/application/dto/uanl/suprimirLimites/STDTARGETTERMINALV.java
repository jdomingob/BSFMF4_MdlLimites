
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class STDTARGETTERMINALV {

    @JsonProperty("ID_INTERNO_EMPL_EP")
    private Object iDINTERNOEMPLEP;
    @JsonProperty("ID_INTERNO_TERM_TN")
    private Object iDINTERNOTERMTN;
    @JsonProperty("COD_ECV_SESION")
    private Object cODECVSESION;

}
