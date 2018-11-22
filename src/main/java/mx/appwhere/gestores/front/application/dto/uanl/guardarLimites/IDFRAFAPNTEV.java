
package mx.appwhere.gestores.front.application.dto.uanl.guardarLimites;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class IDFRAFAPNTEV {

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

}
