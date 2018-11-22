
package mx.appwhere.gestores.front.application.dto.uanl.guardarLimites;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OTRCREAAUTTEMPTRNO {

    @JsonProperty("RTRN_CD")
    String rTRNCD;
    @JsonProperty("TR_CREA_AUT_TEMP_EVT_Z")
    TRCREAAUTTEMPEVTZ tRCREAAUTTEMPEVTZ;
    @JsonProperty("STD_AUTORIZA_V")
    STDAUTORIZAV sTDAUTORIZAV;
    @JsonProperty("STD_TRN_MSJ_PARM_V")
    List<STDTRNMSJPARMV> sTDTRNMSJPARMV = null;
    @JsonProperty("STD_TRN_O_PARM_V")
    STDTRNOPARMV sTDTRNOPARMV;

}
