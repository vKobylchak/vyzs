package ua.vyz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.vyz.model.Vyz;
import ua.vyz.repository.VyzRepository;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DefaultVyzService implements VyzService{
    private final VyzRepository vyzRepository;

    @Override
    public List<Vyz> findAll() {
        return vyzRepository.findAll();
    }

    //    @Override
//    public List<Vyz> findAll(int passingScore) {
//        return vyzRepository.getAllByPassingScore(passingScore);
//    }


    @Override
    public List<Vyz> findAllByTown(String town) {
        return vyzRepository.findAllByTown(town);
    }
}
