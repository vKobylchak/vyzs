package ua.vyz.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "towns")
public class Town {
    @Id
    private int id;
    private String name;

    @OneToOne
    private Vyz vyz;

    public Town(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Town() {
    }
}
