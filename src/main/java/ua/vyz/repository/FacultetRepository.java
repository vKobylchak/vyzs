package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vyz.model.Facultet;

import java.util.List;

public interface FacultetRepository extends JpaRepository<Facultet, Integer> {

    @Override
    <S extends Facultet> S save(S s);

    Facultet findByTitle(String title);
}
