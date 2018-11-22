
package mx.appwhere.gestores.front.application.dto.uanl.consultaLimites;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

@Data
@PackagePrivate
public class ConsultarLimites {

    @JsonProperty("OTR_CONSULTA_GLOBAL_AT_TR")
    OTRCONSULTAGLOBALATTR oTRCONSULTAGLOBALATTR;

}
