package ingjulianvega.ximic.msscasusystem.services;


import ingjulianvega.ximic.msscasusystem.web.model.System;
import ingjulianvega.ximic.msscasusystem.web.model.SystemDto;
import ingjulianvega.ximic.msscasusystem.web.model.SystemList;

import java.util.UUID;

public interface SystemService {
    SystemList get(Boolean usingCache);

    SystemDto getById(UUID id);

    void create(System system);

    void updateById(UUID id, System system);

    void deleteById(UUID id);
}
