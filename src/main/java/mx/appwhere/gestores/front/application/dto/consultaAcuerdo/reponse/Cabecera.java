
package mx.appwhere.gestores.front.application.dto.consultaAcuerdo.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class Cabecera {

    @JsonProperty("mensaje")
    private String mensaje;
    @JsonProperty("status")
    private String status;
    @JsonProperty("errores")
    private Object errores;

}
