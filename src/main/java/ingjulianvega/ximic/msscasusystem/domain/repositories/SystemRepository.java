package ingjulianvega.ximic.msscasusystem.domain.repositories;

import ingjulianvega.ximic.msscasusystem.domain.SystemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.UUID;

public interface SystemRepository extends JpaRepository<SystemEntity, UUID>, JpaSpecificationExecutor<SystemEntity> {
    List<SystemEntity> findAllByOrderByName();
}
