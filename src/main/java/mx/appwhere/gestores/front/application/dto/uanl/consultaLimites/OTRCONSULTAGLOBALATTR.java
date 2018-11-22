
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import java.util.List;

@Data
@PackagePrivate
public class OTRCONSULTAGLOBALATTR {

    @JsonProperty("RTRN_CD")
    String rTRNCD;
    @JsonProperty("NUMBER_OF_RECORDS")
    String nUMBEROFRECORDS;
    @JsonProperty("MORE_DATA_IN")
    String mOREDATAIN;
    @JsonProperty("TR_CONSULTA_GLOBAL_AT_EVT")
    TRCONSULTAGLOBALATEVT tRCONSULTAGLOBALATEVT;
    @JsonProperty("STD_TRN_MSJ_PARM_V")
    List<STDTRNMSJPARMV> sTDTRNMSJPARMV = null;
    @JsonProperty("STD_TRN_O_PARM_V")
    STDTRNOPARMV sTDTRNOPARMV;

}
