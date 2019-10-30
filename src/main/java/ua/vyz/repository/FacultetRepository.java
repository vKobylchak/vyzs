package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vyz.model.Facultet;

import java.util.List;
import java.util.Optional;

public interface FacultetRepository extends JpaRepository<Facultet, Integer> {

    @Override
    <S extends Facultet> S save(S s);

    @Override
    List<Facultet> findAll();

    Facultet findByTitle(String title);

//    @Override
//    Facultet getOne(Integer integer);

//    Facultet findByNumber(String number);
}
