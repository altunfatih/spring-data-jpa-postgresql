package com.altunfatih.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@ApiModel(value = "Address Model")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "Address")
    private String address;

    @ApiModelProperty(value = "AddressType")
    private AddressType addressType;

    @ApiModelProperty(value = "isActive")
    private Boolean isActive;

    @ManyToOne
    @ApiModelProperty(value = "Personal")
    private Personal personal;

}
