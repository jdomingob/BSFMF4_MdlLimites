
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import java.util.List;

@Data
@PackagePrivate
public class TRCONSULTAGLOBALATEVT {

    @JsonProperty("COD_INTERNO_UO_V")
    CODINTERNOUOV cODINTERNOUOV;
    @JsonProperty("TR_AF_CONS_EVT_V")
    List<TRAFCONSEVTV> tRAFCONSEVTV = null;
    @JsonProperty("NOMB_50")
    String nOMB50;
    @JsonProperty("PSV_F_VTO_V")
    List<PSVFVTOV> pSVFVTOV = null;
    @JsonProperty("PSV_COD_NUMRCO_MONEDA_V")
    PSVCODNUMRCOMONEDAV pSVCODNUMRCOMONEDAV;

}
