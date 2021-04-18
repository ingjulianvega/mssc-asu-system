package ingjulianvega.ximic.msscasusystem.web.Mappers;



import ingjulianvega.ximic.msscasusystem.domain.SystemEntity;
import ingjulianvega.ximic.msscasusystem.web.model.SystemDto;
import org.mapstruct.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper(uses = DateMapper.class)
public interface SystemMapper {
    SystemDto systemEntityToSystemDto(SystemEntity systemEntity);

    SystemEntity systemDtoToSystemEntity(SystemDto systemDto);

    ArrayList<SystemDto> systemEntityListToSystemDtoList(List<SystemEntity> systemEntityList);
}
