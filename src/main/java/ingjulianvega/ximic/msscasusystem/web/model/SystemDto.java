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

    static final long serialVersionUID = -6199280945876709076L;

    private UUID id;
    private UUID patientId;
    private String name;
    private String observations;

}
