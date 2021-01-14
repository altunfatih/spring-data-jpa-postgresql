package com.altunfatih.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@ApiModel(value = "Personal Model")
public class Personal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "ID")
    private Long id;

    @Column(length = 100)
    @ApiModelProperty(value = "Name")
    private String name;

    @Column(length = 100)
    @ApiModelProperty(value = "Surname")
    private String surname;

    @OneToMany
    @ApiModelProperty(value = "Addresses")
    private List<Address> addresses;
}
