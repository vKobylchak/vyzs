package ua.vyz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.vyz.model.Facultet;
import ua.vyz.model.Vyz;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.VyzRepository;

import java.util.*;

@SpringBootApplication
public class VyzApplication {

    public static void main(String[] args) {
        SpringApplication.run(VyzApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(final VyzRepository vyzRepository, final FacultetRepository facultetRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
                Facultet botanu = new Facultet(1, "Ботани");
                List<Facultet> facultets = new ArrayList<>();
                facultets.add(botanu);

                facultetRepository.save(botanu);
                List<Vyz> vyzs = Arrays.asList(new Vyz(1, "MED", "Odessa", 120, facultets),
                        new Vyz(2, "NAO", "Lviv", 120, facultets),
                        new Vyz(3, "SHMAO", "Kyiv", 120, facultets),
                        new Vyz(4, "PUT", "Kyiv", 120, facultets),
                        new Vyz(5, "KOC", "Lviv", 120, facultets),
                        new Vyz(6, "UNI", "Kharkiv", 120, facultets));

                vyzs.forEach(vyzRepository::save);

//                Vyz vyz = new Vyz(1, "MED", "Odessa", 120, facultets);
//                Vyz vyz1 = new Vyz(1, "NAO", "Lviv", 120, facultets);
//                Vyz vyz2 = new Vyz(1, "SHMAO", "Kyiv", 120, facultets);
//                Vyz vyz3 = new Vyz(1, "PUT", "Kyiv", 120, facultets);
//                Vyz vyz4 = new Vyz(1, "KOC", "Lviv", 120, facultets);
//                Vyz vyz5 = new Vyz(1, "UNI", "Kharkiv", 120, facultets);
//                vyzRepository.save(vyz);

            }
        };
    }
}
