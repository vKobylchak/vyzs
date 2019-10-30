package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.vyz.model.Town;
import ua.vyz.model.Vyz;

import java.util.List;

public interface VyzRepository extends JpaRepository<Vyz, Integer> {

//    List<Vyz> findAllByTown(String town);

    List<Vyz> findAllByTown(Town town);

//    List<Vyz> findByPassingScoreLessThanEqual(int passingScore);
//
//    List<Vyz> findByPassingScoreLessThanEqualAndTown(int passingScore, String town);


    //    @Query("select v FROM Vyz as v where v.town.name = :town ")
    @Query("select v FROM Vyz as v join v.facultets as f where v.town.name = :town and f.number = :number")
    List<Vyz> findAllByTownAndFacultet(
            @Param("town") String town, @Param("number") String number);

    @Query("select v FROM Vyz as v join v.facultets as f where v.town.name = :town and f.title = :title")
    List<Vyz> findAllByTownAndFacultetTitle(
            @Param("town") String town, @Param("title") String title);


//        @Query("SELECT v FROM Vyz v LEFT JOIN v.facultets f WHERE f.title = :facultetTitle") // +++++++++++++++
//    List<Vyz> findVyzsByFacultetTitle(@Param("facultetTitle") String facultetTitle);     // +++++++++++++++


//    @Query("SELECT v FROM Vyz v LEFT JOIN v.facultets f WHERE f.title LIKE :facultetTitle")
//    List<Vyz> findVyzsByFacultetTitle(@Param("facultetTitle") String facultetTitle);

//    @Query("SELECT v FROM Vyz v LEFT JOIN v.facultets f WHERE f.title = :facultetTitle and v.passingScore <= :passingScore and v.town = :town")
//    List<Vyz> findVyzsByFacultetTitleAndPassingScoreAndTown(@Param("facultetTitle") String facultetTitle, @Param("passingScore") int passingScore, @Param("town") String town);


}
