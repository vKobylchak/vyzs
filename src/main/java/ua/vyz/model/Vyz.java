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
    private String fullTitle;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private Town address;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "town_id", referencedColumnName = "id")
    private Town town;


    @ManyToMany
    @JoinTable(
            name = "facultet_vyz",
            joinColumns = @JoinColumn(name = "vyz_id"),
            inverseJoinColumns = @JoinColumn(name = "facultet_id"))
    List<Facultet> facultets;

    private String link;

    private String picture;

    public Vyz(int id, String title, String fullTitle, Town town, List<Facultet> facultets, String link, String picture) {
        this.id = id;
        this.title = title;
        this.fullTitle = fullTitle;
        this.town = town;
        this.facultets = facultets;
        this.link = link;
        this.picture = picture;
    }

    public Vyz() {
    }

}
