package ingjulianvega.ximic.msscasusystem.services;

import ingjulianvega.ximic.msscasusystem.configuration.ErrorCodeMessages;
import ingjulianvega.ximic.msscasusystem.domain.SystemEntity;
import ingjulianvega.ximic.msscasusystem.domain.repositories.SystemRepository;
import ingjulianvega.ximic.msscasusystem.exception.SystemException;
import ingjulianvega.ximic.msscasusystem.web.Mappers.SystemMapper;
import ingjulianvega.ximic.msscasusystem.web.model.System;
import ingjulianvega.ximic.msscasusystem.web.model.SystemDto;
import ingjulianvega.ximic.msscasusystem.web.model.SystemList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Slf4j
@Service
public class SystemServiceImpl implements SystemService {

    private final SystemRepository systemRepository;
    private final SystemMapper systemMapper;

    @Cacheable(cacheNames = "systemListCache", condition = "#usingCache == false")
    @Override
    public SystemList get(Boolean usingCache) {
        log.debug("get()...");
        return SystemList
                .builder()
                .systemList(systemMapper.systemEntityListToSystemDtoList(systemRepository.findAllByOrderByName()))
                .build();
    }

    @Cacheable(cacheNames = "systemCache")
    @Override
    public SystemDto getById(UUID id) {
        log.debug("getById()...");
        return systemMapper.systemEntityToSystemDto(
                systemRepository.findById(id)
                        .orElseThrow(() -> new SystemException(ErrorCodeMessages.SYSTEM_NOT_FOUND, "")));
    }

    @Override
    public void create(System system) {
        log.debug("create()...");
        systemMapper.systemEntityToSystemDto(
                systemRepository.save(
                        systemMapper.systemDtoToSystemEntity(
                                SystemDto
                                        .builder()
                                        .name(system.getName())
                                        .build())));
    }

    @Override
    public void updateById(UUID id, System system) {
        log.debug("updateById...");
        SystemEntity evidenceEntity = systemRepository.findById(id)
                .orElseThrow(() -> new SystemException(ErrorCodeMessages.SYSTEM_NOT_FOUND, ""));

        evidenceEntity.setName(system.getName());

        systemRepository.save(evidenceEntity);
    }

    @Override
    public void deleteById(UUID id) {
        log.debug("deleteById...");
        systemRepository.deleteById(id);
    }
}
