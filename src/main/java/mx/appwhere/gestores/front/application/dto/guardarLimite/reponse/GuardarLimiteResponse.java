
package mx.appwhere.gestores.front.application.dto.guardarLimite.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericResponse;

@Data
public class GuardarLimiteResponse extends GenericResponse {

    private String acuerdo;
    private String codOrgnApnte;
    private String importe;
    private String fechaCtble;
    private String fechaValor;
    private String ind1;
    private String ind2;

}
