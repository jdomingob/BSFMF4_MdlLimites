
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import java.util.List;

@Data
@PackagePrivate
public class STDAUTORIZAV {

    @JsonProperty("IND_BORRADO_AR")
    private Object iNDBORRADOAR;
    @JsonProperty("DESCR_TX")
    private Object dESCRTX;
    @JsonProperty("IND_AUT_SOLIC")
    private Object iNDAUTSOLIC;
    @JsonProperty("IND_ATRIB_MANC_EP")
    private Object iNDATRIBMANCEP;
    @JsonProperty("COD_ESTADO_AR")
    private Object cODESTADOAR;
    @JsonProperty("ID_EMPL_SOL_AUT")
    private Object iDEMPLSOLAUT;
    @JsonProperty("IND_VERIF_ATRIB")
    private Object iNDVERIFATRIB;
    @JsonProperty("IND_URG_AR")
    private Object iNDURGAR;
    @JsonProperty("MOTIVO_ACCION_AUT_LEN")
    private String mOTIVOACCIONAUTLEN;
    @JsonProperty("MOTIVO_ACCION_AUT")
    private Object mOTIVOACCIONAUT;
    @JsonProperty("IND_ESCALABLE")
    private Object iNDESCALABLE;
    @JsonProperty("IMP_AUT")
    private String iMPAUT;
    @JsonProperty("IMPORTE_AR")
    private String iMPORTEAR;
    @JsonProperty("AR_AUT_REMOTA_P")
    private ARAUTREMOTAP aRAUTREMOTAP;
    @JsonProperty("AR_TRN_MSJ_PARM_V")
    private List<ARTRNMSJPARMV> aRTRNMSJPARMV = null;
    @JsonProperty("STD_TARGET_TERMINAL_V")
    private List<STDTARGETTERMINALV> sTDTARGETTERMINALV = null;
    @JsonProperty("AR_ID_SALTADO_V")
    private ARIDSALTADOV aRIDSALTADOV;

}
