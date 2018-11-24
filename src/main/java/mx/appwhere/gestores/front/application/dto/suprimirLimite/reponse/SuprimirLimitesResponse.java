
package mx.appwhere.gestores.front.application.dto.suprimirLimite.reponse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericResponse;

@Data
public class SuprimirLimitesResponse extends GenericResponse {

    private String nombre;
    private String prpdadCta;
    private String numSecAc;
    private String numSubac;
    private String idExpReclam;
    private String codCta;
    private String codNumrcoMoneda;
    private String fechaValor;
}