
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import java.util.List;

@Data
@PackagePrivate
public class OTRCANCAUTTEMPTRNO {

    @JsonProperty("RTRN_CD")
    private String rTRNCD;
    @JsonProperty("TR_CANC_AUT_TEMP_EVT_Z")
    private TRCANCAUTTEMPEVTZ tRCANCAUTTEMPEVTZ;
    @JsonProperty("STD_AUTORIZA_V")
    private STDAUTORIZAV sTDAUTORIZAV;
    @JsonProperty("STD_TRN_MSJ_PARM_V")
    private List<STDTRNMSJPARMV> sTDTRNMSJPARMV = null;
    @JsonProperty("STD_TRN_O_PARM_V")
    private STDTRNOPARMV sTDTRNOPARMV;

}
