package ua.vyz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.vyz.model.Facultet;
import ua.vyz.model.Town;
import ua.vyz.model.Vyz;
import ua.vyz.repository.FacultetRepository;
import ua.vyz.repository.VyzRepository;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultVyzService implements VyzService {
    private final VyzRepository vyzRepository;
    private final FacultetRepository facultetRepository;

    @Override
    public List<Vyz> findAll() {
        return vyzRepository.findAll();
    }

    @Override
    public List<Vyz> findAllByTown(Town town) {
        return vyzRepository.findAllByTown(town);
    }

//    @Override
//    public List<Vyz> getVyzByPassingScore(int passingScore) {
//
//        return vyzRepository.findByPassingScoreLessThanEqual(passingScore);
//    }

//    @Override
//    public List<Vyz> getVyzByPassingScoreAndTown(int passingScore, String town) {
//        return vyzRepository.findByPassingScoreLessThanEqualAndTown(passingScore, town);
//    }

    @Override
    public List<Vyz> getVyzsByFacultetTitle(String facultetTitle) {
        Facultet facultet = facultetRepository.findByTitle(facultetTitle);
        return facultet.getVyzs();
    }

//    @Override
//    public List<Vyz> getVyzsByFacultetId(int id) {
//        Facultet facultet = facultetRepository.getOne(id);
//        if (facultet == null) return Collections.emptyList(); // проверить логику, если нет такой id
//        return facultet.getVyzs();
//    }

//    @Override
//    public List<Vyz> getVyzsByFacultetNumber(String  number) {
//        Facultet facultet = facultetRepository.findByNumber(number);
//        if (facultet == null) return Collections.emptyList(); // проверить логику, если нет такой number
//        return facultet.getVyzs();
//    }


    //    @Override
//    public List<Vyz> findVyzsByFacultetTitle(String facultetTitle) {
//        return vyzRepository.findVyzsByFacultetTitle(facultetTitle);
//    }
//
//    @Override
//    public List<Vyz> getVyzByAllParams(String facultetTitle, int passingScore, String town) {
//        return vyzRepository.findVyzsByFacultetTitleAndPassingScoreAndTown(facultetTitle, passingScore, town);
//    }
//

}
