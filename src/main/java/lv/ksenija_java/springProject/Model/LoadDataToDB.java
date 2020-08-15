package lv.ksenija_java.springProject.Model;

import lv.ksenija_java.springProject.repository.UserAndRolesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDataToDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDataToDB.class);

    @Bean
    CommandLineRunner saveTpDataBase(UserAndRolesRepository userAndRolesRepository) {
        return args -> {
            log.info("Save to DB " + userAndRolesRepository.save(new UserAndRole("Ksenija", "Cool")));
        };
    }
}
