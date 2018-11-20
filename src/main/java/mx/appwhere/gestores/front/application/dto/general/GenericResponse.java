package mx.appwhere.gestores.front.application.dto.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.experimental.PackagePrivate;

/**
 * @author Ivan Solorio Garcia
 * version 1.0 2018/10/17
 */
@Data
@PackagePrivate
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenericResponse {
    String codigo;
    String mensaje;
}
