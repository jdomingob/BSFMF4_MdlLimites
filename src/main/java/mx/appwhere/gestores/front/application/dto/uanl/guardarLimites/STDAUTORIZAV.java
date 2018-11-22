
package mx.appwhere.gestores.front.application.dto.uanl.guardarLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class STDAUTORIZAV {

    @JsonProperty("IND_BORRADO_AR")
    Object iNDBORRADOAR;
    @JsonProperty("DESCR_TX")
    Object dESCRTX;
    @JsonProperty("IND_AUT_SOLIC")
    Object iNDAUTSOLIC;
    @JsonProperty("IND_ATRIB_MANC_EP")
    Object iNDATRIBMANCEP;
    @JsonProperty("COD_ESTADO_AR")
    Object cODESTADOAR;
    @JsonProperty("ID_EMPL_SOL_AUT")
    Object iDEMPLSOLAUT;
    @JsonProperty("IND_VERIF_ATRIB")
    Object iNDVERIFATRIB;
    @JsonProperty("IND_URG_AR")
    Object iNDURGAR;
    @JsonProperty("MOTIVO_ACCION_AUT_LEN")
    String mOTIVOACCIONAUTLEN;
    @JsonProperty("MOTIVO_ACCION_AUT")
    Object mOTIVOACCIONAUT;
    @JsonProperty("IND_ESCALABLE")
    Object iNDESCALABLE;
    @JsonProperty("IMP_AUT")
    String iMPAUT;
    @JsonProperty("IMPORTE_AR")
    String iMPORTEAR;
    @JsonProperty("AR_AUT_REMOTA_P")
    ARAUTREMOTAP aRAUTREMOTAP;
    @JsonProperty("AR_TRN_MSJ_PARM_V")
    List<ARTRNMSJPARMV> aRTRNMSJPARMV = null;
    @JsonProperty("STD_TARGET_TERMINAL_V")
    List<STDTARGETTERMINALV> sTDTARGETTERMINALV = null;
    @JsonProperty("AR_ID_SALTADO_V")
    ARIDSALTADOV aRIDSALTADOV;

}
