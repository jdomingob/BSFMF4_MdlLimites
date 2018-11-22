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
public class ConsultaMinGestor {
    @JsonProperty("OTR_GT_CONS_GT_GESTOR_TRN")
    OtrGtConsGtGestorTrn consultaGestor;
}
