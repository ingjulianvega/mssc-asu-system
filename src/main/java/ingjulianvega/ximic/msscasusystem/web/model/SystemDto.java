package ingjulianvega.ximic.msscasusystem.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemDto implements Serializable {

    static final long serialVersionUID = -5758448973072836916L;

    private UUID id;
    private String name;

}
