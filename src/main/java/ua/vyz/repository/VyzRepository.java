package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vyz.model.Vyz;

import java.util.List;

public interface VyzRepository extends JpaRepository<Vyz, Integer> {
//    @Query("SELECT v FROM Vyz AS v WHERE v.passingScore > :passingScore")
//    List<Vyz> getAllVyzByPassingScore(int passingScore);
//    List<Vyz>getAllByPassingScore(int passingScore);

    List<Vyz> findAllByTown(String town);


}
