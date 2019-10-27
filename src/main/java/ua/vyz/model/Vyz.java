package ua.vyz.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
//@Data
@Getter
//@RequiredArgsConstructor
@Table(name = "vyzs")
public class Vyz {

    @Id
//    @Column(name = "ID")
    private int id;

//    @Column(name = "TITLE")
    private String title;

//    @Column(name = "TOWN")
    private String town;

//    @Column(name = "PASSING_SCORE")
    private int passingScore;

    @OneToMany(mappedBy = "vyz", cascade = CascadeType.ALL)
    private List<Facultet> facultets = new ArrayList<>();


//    @ManyToMany
//    Set<Facultet> facultets;
//
//    @ManyToMany
//    @JoinTable(
//            name = "facultets_vyz",
//            joinColumns = @JoinColumn(name = "vyz_id"),
//            inverseJoinColumns = @JoinColumn(name = "facultet_id"))
//    Set<Facultet> facultets;

//    public Vyz(int id, String title, String town, int passingScore) {
//        this.id = id;
//        this.title = title;
//        this.town = town;
//        this.passingScore = passingScore;
//    }

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
