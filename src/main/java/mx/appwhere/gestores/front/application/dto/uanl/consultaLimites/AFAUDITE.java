
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class AFAUDITE {

    @JsonProperty("COD_NRBE_EN")
    Object cODNRBEEN;
    @JsonProperty("COD_CENT_UO")
    Object cODCENTUO;
    @JsonProperty("NUM_SEC_AC")
    String nUMSECAC;
    @JsonProperty("PRPDAD_CTA")
    Object pRPDADCTA;
    @JsonProperty("NUM_SUBAC")
    String nUMSUBAC;
    @JsonProperty("ID_EXP_RECLAM")
    String iDEXPRECLAM;
    @JsonProperty("COD_CTA")
    Object cODCTA;
    @JsonProperty("COD_NUMRCO_MONEDA")
    Object cODNUMRCOMONEDA;
    @JsonProperty("NUM_SEC")
    String nUMSEC;
    @JsonProperty("FECHA_OPRCN")
    String fECHAOPRCN;
    @JsonProperty("HORA_OPRCN")
    String hORAOPRCN;
    @JsonProperty("COD_INDIC")
    Object cODINDIC;
    @JsonProperty("ID_INTERNO_TERM_TN")
    Object iDINTERNOTERMTN;
    @JsonProperty("COD_TX")
    Object cODTX;
    @JsonProperty("ID_EMPL_AUT")
    Object iDEMPLAUT;
    @JsonProperty("ID_INTERNO_EMPL_EP")
    Object iDINTERNOEMPLEP;
    @JsonProperty("COD_NRBE_EN_1")
    Object cODNRBEEN1;
    @JsonProperty("COD_INTERNO_UO")
    Object cODINTERNOUO;
    @JsonProperty("FECHA_CTBLE")
    String fECHACTBLE;

}
