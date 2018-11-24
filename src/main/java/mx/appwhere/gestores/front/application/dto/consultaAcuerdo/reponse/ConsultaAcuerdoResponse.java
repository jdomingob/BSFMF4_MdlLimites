
package mx.appwhere.gestores.front.application.dto.consultaAcuerdo.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data

public class ConsultaAcuerdoResponse{

    @JsonProperty("cabecera")
    private Cabecera cabecera;
    @JsonProperty("idInternoPe")
    private String idInternoPe;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("centro")
    private String centro;
    @JsonProperty("moneda")
    private String moneda;

}
