package com.altunfatih.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
public class Personal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String surname;

    @OneToMany
    private List<Address> addresses;
}
