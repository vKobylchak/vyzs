package ua.vyz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.vyz.model.Town;
import ua.vyz.model.Vyz;

import java.util.List;

public interface VyzRepository extends JpaRepository<Vyz, Integer> {

    List<Vyz> findAllByTown(Town town);

    @Query("select v FROM Vyz as v join v.facultets as f where v.town.name = :town and f.number = :number")
    List<Vyz> findAllByTownAndFacultet(
            @Param("town") String town, @Param("number") String number);

    @Query("select v FROM Vyz as v join v.facultets as f where v.town.name = :town and f.title = :title")
    List<Vyz> findAllByTownAndFacultetTitle(
            @Param("town") String town, @Param("title") String title);

}
