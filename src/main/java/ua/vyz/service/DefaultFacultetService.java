package ua.vyz.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.vyz.model.Facultet;
import ua.vyz.repository.FacultetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultFacultetService implements FacultetService{

    private final FacultetRepository facultetRepository;

    @Override
    public List<Facultet> findAll() {
        return facultetRepository.findAll();
    }

    @Override
    public Facultet findByTitle(String title) {
        return facultetRepository.findByTitle(title);
    }

}
