package com.altunfatih.service;

import com.altunfatih.dto.AddressDto;

import java.util.List;

public interface AddressService {
    AddressDto save(AddressDto addressDto);

    void delete(Long id);

    List<AddressDto> getAll();
}
