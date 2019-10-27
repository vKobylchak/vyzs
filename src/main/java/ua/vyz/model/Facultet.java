package ua.vyz.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Table(name = "facultets")
public class Facultet {

    @Id
//    @Column(name = "ID")
    private int id;

    private String title;

//    @ManyToMany(mappedBy = "facultets")
//    Set<Vyz> vyzes;

    @ManyToOne
    @JoinColumn(name = "vyz_id")
    private Vyz vyz;

    public Facultet(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public Facultet() {
    }
}
