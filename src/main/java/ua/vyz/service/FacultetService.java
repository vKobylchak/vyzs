package ua.vyz.service;

import ua.vyz.model.Facultet;

import java.util.List;

public interface FacultetService {
    List<Facultet> findAll();
    Facultet findByTitle(String title);

}
