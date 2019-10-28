package ua.vyz;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.vyz.model.Facultet;
import ua.vyz.model.Vyz;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.VyzRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

                Facultet pacuku = new Facultet(2, "pacanu");
                List<Facultet> facultetPacuku = new ArrayList<>();
                facultetPacuku.add(pacuku);

                facultetRepository.save(botanu);
                facultetRepository.save(pacuku);
                List<Vyz> vyzs = Arrays.asList(new Vyz(1, "MED", "Odessa", 120, facultets),
                        new Vyz(2, "NAO", "Lviv", 120, facultets),
                        new Vyz(3, "SHMAO", "Kyiv", 130, facultets),
                        new Vyz(4, "PUT", "Kyiv", 140, facultetPacuku),
                        new Vyz(5, "KOC", "Lviv", 150, facultets),
                        new Vyz(6, "UNI", "Kharkiv", 180, facultets));

                vyzs.forEach(vyzRepository::save);

            }
        };
    }
}
