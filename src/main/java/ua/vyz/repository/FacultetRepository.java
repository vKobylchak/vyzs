package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vyz.model.Facultet;

public interface FacultetRepository extends JpaRepository<Facultet, Integer> {

    @Override
    <S extends Facultet> S save(S s);
}
