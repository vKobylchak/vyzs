package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.vyz.model.Vyz;

import java.util.List;

public interface VyzRepository extends JpaRepository<Vyz, Integer> {

    List<Vyz> findAllByTown(String town);

    List<Vyz> findByPassingScoreLessThanEqual(int passingScore);

    List<Vyz> findByPassingScoreLessThanEqualAndTown(int passingScore, String town);

    @Query("SELECT v FROM Vyz v LEFT JOIN v.facultets f WHERE f.title = :facultetTitle")
    List<Vyz> findVyzsByFacultetTitle(@Param("facultetTitle") String facultetTitle);

    @Query("SELECT v FROM Vyz v LEFT JOIN v.facultets f WHERE f.title = :facultetTitle and v.passingScore <= :passingScore and v.town = :town")
    List<Vyz> findVyzsByFacultetTitleAndPassingScoreAndTown(@Param("facultetTitle") String facultetTitle, @Param("passingScore") int passingScore, @Param("town") String town);

}
