package ingjulianvega.ximic.msscasusystem.bootstrap;

import ingjulianvega.ximic.msscasusystem.domain.SystemEntity;
import ingjulianvega.ximic.msscasusystem.domain.repositories.SystemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@RequiredArgsConstructor
@Component
public class SystemLoader implements CommandLineRunner {

    private final SystemRepository systemRepository;

    @Override
    public void run(String... args) throws Exception {
        if (systemRepository.count() == 0) {
            loadEvidenceTypeObjects();
        }
    }

    private void loadEvidenceTypeObjects() {
        systemRepository.saveAll(Arrays.asList(
                SystemEntity.builder().name("Personal").build(),
                SystemEntity.builder().name("Familiar").build(),
                SystemEntity.builder().name("Quirúrgico").build(),
                SystemEntity.builder().name("Tóxico").build(),
                SystemEntity.builder().name("Alérgico").build(),
                SystemEntity.builder().name("Deportivo").build(),
                SystemEntity.builder().name("Ocupacional").build(),
                SystemEntity.builder().name("Ginecológico").build(),
                SystemEntity.builder().name("Traumático").build(),
                SystemEntity.builder().name("Inmuológico").build(),
                SystemEntity.builder().name("Otro").build()
        ));
    }
}