
package mx.appwhere.gestores.front.application.dto.suprimirLimite.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import mx.appwhere.gestores.front.application.dto.general.GenericRequest;

@Data
public class SuprimirLimitesRequest extends GenericRequest {

    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("prpdadCta")
    private String prpdadCta;
    @JsonProperty("numSecAc")
    private String numSecAc;
    @JsonProperty("numSubac")
    private String numSubac;
    @JsonProperty("idExpReclam")
    private String idExpReclam;
    @JsonProperty("codCta")
    private String codCta;
    @JsonProperty("codNumrcoMoneda")
    private String codNumrcoMoneda;
    @JsonProperty("fechaValor")
    private String fechaValor;
}