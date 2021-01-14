package com.altunfatih.entity;

import com.altunfatih.dto.PersonalDto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String address;

    private AddressType addressType;

    private Boolean isActive;

    @ManyToOne
    private Personal personal;

}
