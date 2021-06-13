package ingjulianvega.ximic.msscasusystem.web.controller;



import ingjulianvega.ximic.msscasusystem.services.SystemService;
import ingjulianvega.ximic.msscasusystem.web.model.System;
import ingjulianvega.ximic.msscasusystem.web.model.SystemDto;
import ingjulianvega.ximic.msscasusystem.web.model.SystemList;
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

    private final SystemService systemService;

    @Override
    public ResponseEntity<SystemList> get(Boolean usingCache) {
        return new ResponseEntity<>(systemService.get(usingCache), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<SystemDto> getById(@NotNull UUID id) {
        return new ResponseEntity<>(systemService.getById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> create(@NotNull @Valid System system) {
        systemService.create(system);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updateById(@NotNull UUID id, @NotNull @Valid System system) {
        systemService.updateById(id, system);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Void> deleteById(@NotNull UUID id) {
        systemService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
