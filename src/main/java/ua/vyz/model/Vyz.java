package ua.vyz.model;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(name = "vyzs")
public class Vyz {
    @Id
    private int id;
    private String title;
    private String town;
    private int passingScore;
    @ManyToMany
    @JoinTable(
            name = "facultet_vyz",
            joinColumns = @JoinColumn(name = "vyz_id"),
            inverseJoinColumns = @JoinColumn(name = "facultet_id"))
    List<Facultet> facultets;

    public Vyz(int id, String title, String town, int passingScore, List<Facultet> facultets) {
        this.id = id;
        this.title = title;
        this.town = town;
        this.passingScore = passingScore;
        this.facultets = facultets;
    }

    public Vyz() {
    }

}
