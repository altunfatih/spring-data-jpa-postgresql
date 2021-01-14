package com.altunfatih.dto;

import com.altunfatih.entity.AddressType;
import lombok.Data;

@Data
public class AddressDto {
    private Long id;

    private String address;

    private AddressType addressType;

    private Boolean isActive;

    private PersonalDto personalDto;

}
