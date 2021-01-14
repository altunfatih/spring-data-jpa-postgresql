package com.altunfatih.dto;

import lombok.Data;

import java.util.List;

@Data
public class PersonalDto {

    private Long id;

    private String name;

    private String surname;

    private List<AddressDto> addressesDto;
}
