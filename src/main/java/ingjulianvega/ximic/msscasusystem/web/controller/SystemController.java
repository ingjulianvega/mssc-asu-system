package ingjulianvega.ximic.msscasusystem.web.controller;


import ingjulianvega.ximic.msscasuevidencetype.services.EvidenceTypeService;
import ingjulianvega.ximic.msscasuevidencetype.web.model.EvidenceType;
import ingjulianvega.ximic.msscasuevidencetype.web.model.EvidenceTypeDto;
import ingjulianvega.ximic.msscasuevidencetype.web.model.EvidenceTypeList;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class SystemController implements SystemI {

    private final EvidenceTypeService evidenceService;

    @Override
    public ResponseEntity<EvidenceTypeList> get() {
        return new ResponseEntity<>(evidenceService.get(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EvidenceTypeDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(evidenceService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid EvidenceType evidence) {
        evidenceService.create(evidence);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid EvidenceType evidence) {
        evidenceService.updateById(id, evidence);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        evidenceService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
