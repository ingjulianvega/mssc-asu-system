package ingjulianvega.ximic.msscasusystem.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class System implements Serializable {

    static final long serialVersionUID = -462949395461349890L;

    @NotBlank
    private String name;

}
