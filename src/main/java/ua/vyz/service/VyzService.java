package ua.vyz.service;

import ua.vyz.model.Vyz;

import java.util.List;
import java.util.Set;

public interface VyzService {
//    List<Vyz> findAll(int passingScore);
    List<Vyz> findAll();

    List<Vyz> findAllByTown(String town);

}
