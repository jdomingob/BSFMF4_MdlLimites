
package mx.appwhere.gestores.front.application.dto.uanl.suprimirLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class AFAPNTEE {

    @JsonProperty("COD_NRBE_EN")
    private Object cODNRBEEN;
    @JsonProperty("COD_CENT_UO")
    private Object cODCENTUO;
    @JsonProperty("PRPDAD_CTA")
    private Object pRPDADCTA;
    @JsonProperty("NUM_SEC_AC")
    private String nUMSECAC;
    @JsonProperty("NUM_SUBAC")
    private String nUMSUBAC;
    @JsonProperty("ID_EXP_RECLAM")
    private String iDEXPRECLAM;
    @JsonProperty("COD_CTA")
    private Object cODCTA;
    @JsonProperty("COD_NUMRCO_MONEDA")
    private Object cODNUMRCOMONEDA;
    @JsonProperty("NUM_SEC")
    private String nUMSEC;
    @JsonProperty("SGN")
    private Object sGN;
    @JsonProperty("IMP_APNTE")
    private String iMPAPNTE;
    @JsonProperty("FECHA_CTBLE")
    private String fECHACTBLE;
    @JsonProperty("FECHA_VALOR")
    private String fECHAVALOR;
    @JsonProperty("IND_1")
    private Object iND1;
    @JsonProperty("IND_2")
    private Object iND2;
    @JsonProperty("IND_3")
    private Object iND3;
    @JsonProperty("IND_4")
    private Object iND4;
    @JsonProperty("IND_5")
    private Object iND5;
    @JsonProperty("IND_6")
    private Object iND6;
    @JsonProperty("IND_7")
    private Object iND7;
    @JsonProperty("IND_8")
    private Object iND8;
    @JsonProperty("IND_9")
    private Object iND9;
    @JsonProperty("IND_10")
    private Object iND10;
    @JsonProperty("COD_ORGN_APNTE")
    private Object cODORGNAPNTE;
    @JsonProperty("ID_ORGN_APNTE")
    private Object iDORGNAPNTE;
    @JsonProperty("CONCPT_APNTE_LEN")
    private String cONCPTAPNTELEN;
    @JsonProperty("CONCPT_APNTE")
    private Object cONCPTAPNTE;
    @JsonProperty("COD_ORIGEN")
    private Object cODORIGEN;
    @JsonProperty("COD_INTERNO_UO")
    private Object cODINTERNOUO;
    @JsonProperty("COD_LINEA")
    private Object cODLINEA;
    @JsonProperty("ID_GRP_PD")
    private Object iDGRPPD;

}
