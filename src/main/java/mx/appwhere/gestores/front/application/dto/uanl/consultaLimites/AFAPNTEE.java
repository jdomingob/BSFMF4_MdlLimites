
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class AFAPNTEE {

    @JsonProperty("COD_NRBE_EN")
    Object cODNRBEEN;
    @JsonProperty("COD_CENT_UO")
    Object cODCENTUO;
    @JsonProperty("PRPDAD_CTA")
    Object pRPDADCTA;
    @JsonProperty("NUM_SEC_AC")
    String nUMSECAC;
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
    @JsonProperty("SGN")
    Object sGN;
    @JsonProperty("IMP_APNTE")
    String iMPAPNTE;
    @JsonProperty("FECHA_CTBLE")
    String fECHACTBLE;
    @JsonProperty("FECHA_VALOR")
    String fECHAVALOR;
    @JsonProperty("IND_1")
    Object iND1;
    @JsonProperty("IND_2")
    Object iND2;
    @JsonProperty("IND_3")
    Object iND3;
    @JsonProperty("IND_4")
    Object iND4;
    @JsonProperty("IND_5")
    Object iND5;
    @JsonProperty("IND_6")
    Object iND6;
    @JsonProperty("IND_7")
    Object iND7;
    @JsonProperty("IND_8")
    Object iND8;
    @JsonProperty("IND_9")
    Object iND9;
    @JsonProperty("IND_10")
    Object iND10;
    @JsonProperty("COD_ORGN_APNTE")
    Object cODORGNAPNTE;
    @JsonProperty("ID_ORGN_APNTE")
    Object iDORGNAPNTE;
    @JsonProperty("CONCPT_APNTE_LEN")
    String cONCPTAPNTELEN;
    @JsonProperty("CONCPT_APNTE")
    Object cONCPTAPNTE;
    @JsonProperty("COD_ORIGEN")
    Object cODORIGEN;
    @JsonProperty("COD_INTERNO_UO")
    Object cODINTERNOUO;
    @JsonProperty("COD_LINEA")
    Object cODLINEA;
    @JsonProperty("ID_GRP_PD")
    Object iDGRPPD;

}
