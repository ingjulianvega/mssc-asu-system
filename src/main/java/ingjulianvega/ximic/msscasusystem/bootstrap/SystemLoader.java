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
                SystemEntity.builder().name("Nervioso").build(),
                SystemEntity.builder().name("Respiratorio").build(),
                SystemEntity.builder().name("Digestivo").build(),
                SystemEntity.builder().name("Urinario").build(),
                SystemEntity.builder().name("Genital").build(),
                SystemEntity.builder().name("Endocrino").build(),
                SystemEntity.builder().name("Osteomuscular").build(),
                SystemEntity.builder().name("Otro").build()
        ));
    }
}