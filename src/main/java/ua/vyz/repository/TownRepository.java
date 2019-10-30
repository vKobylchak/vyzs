package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vyz.model.Town;

public interface TownRepository extends JpaRepository<Town, Integer> {

    Town findByName(String name);

}
