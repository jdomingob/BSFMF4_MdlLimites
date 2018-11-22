package mx.appwhere.gestores.front.application.dto.uanl.consultaMinimaGestor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import java.util.List;

/**
 * @author Carlos Urbina Blancas
 * @version 1.0- 29/10/2018
 */
@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class OtrGtConsGtGestorTrn {
    @JsonProperty("RTRN_CD")
    String codigo;
    @JsonProperty("TR_GT_CONS_GT_GESTOR_EVT")
    TrGtConsGtGestorEVT datos;
    @JsonProperty("STD_TRN_MSJ_PARM_V")
    List<MensajeParms> mensajesParams;
    @JsonProperty("STD_TRN_O_PARM_V")
    Metadata metadata;
}
