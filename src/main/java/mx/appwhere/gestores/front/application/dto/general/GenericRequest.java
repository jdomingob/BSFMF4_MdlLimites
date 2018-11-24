package mx.appwhere.gestores.front.application.dto.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.PackagePrivate;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)

@ApiModel( value = "ReqGralDto", description = "Recurso que representa los datos creticios del usuario" )
public class GenericRequest {
    @ApiModelProperty( value = "usuaario de tcb", required = true )

    @Pattern(regexp = "[A-Za-z0-9]+",message = "Usuario solo puede contener  numeros y letras y debe ser al menos de 8 caracteres")
    @Size(min = 8,message = "El usuario debe de ser minimo de 8 caracteres")
    @JsonProperty("usuario")
    String usuario;

    @ApiModelProperty( value = "password del usuario", required = true,example="www" )
    @JsonProperty("password")
    @Pattern(regexp = "[A-Za-z0-9]+",message = "Password solo puede contener  numeros y letras y debe ser al menos de 8 caracteres")
    @Size(min = 8,message = "El Password debe de ser minimo de 8 caracteres")
    String password;

    @ApiModelProperty( value = "entidad de la que procede", required = true )
    @Pattern(regexp = "[0-9]*$",message = "Entidad debe de ser numerica y de al menos 4 caracteres")
    @Size(min = 4,message = "La entidad debe de ser minimo de 4 caracteres y debe ser numerica")
    @JsonProperty("entidad")
    String entidad;

    @ApiModelProperty( value = "terminal asignada", required = true )

    @JsonProperty("terminal")
    @Pattern(regexp = "[0-9]*$",message = "Terminal debe de ser numerica y de al menos 8 caracteres")
    @Size(min = 8,message = "La entidad debe de ser minimo de 8 caracteres y debe ser numerica")
    String terminal;


}
