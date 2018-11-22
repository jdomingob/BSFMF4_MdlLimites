package mx.appwhere.gestores.front.application.dto.uanl.consultaMinimaGestor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

/**
 * @author Carlos Urbina Blancas
 * @version 1.0- 29/10/2018
 */
@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrGtConsGtGestorEVT {

    @JsonProperty("NOMB_GT")
    String nombreGestor;
    @JsonProperty("IND_GT_COMRCL_GT")
    String indGestorComercial;
    @JsonProperty("IND_GT_CONTCT_GT")
    String indGestorContacto;
    @JsonProperty("IND_GT_SITESPCL_GT")
    String indGestorSituacionEspecial;
    @JsonProperty("IND_EXTRN_INTRN")
    String indExternoInterno;
    @JsonProperty("COD_ECV_GT")
    String codEvtGt;
    @JsonProperty("FECHA_ALTA_GT")
    String fechaAltaGestor;
    @JsonProperty("ID_EXT_PE")
    String idExtPe;
    @JsonProperty("COD_ID_EXT_PERS")
    String codIdExtPers;
    @JsonProperty("NOMB_50")
    String nombre50;

}
