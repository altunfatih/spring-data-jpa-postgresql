package com.altunfatih.service.impl;

import com.altunfatih.dto.AddressDto;
import com.altunfatih.entity.Address;
import com.altunfatih.repository.AddressRepository;
import com.altunfatih.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Override
    @Transactional
    public AddressDto save(AddressDto addressDto) {
        Address address = new Address();
        address.setAddress(addressDto.getAddress());
        address.setAddressType(addressDto.getAddressType());
        address.setIsActive(addressDto.getIsActive());

        Address addressDb = addressRepository.save(address);
        addressDto.setId(addressDb.getId());

        return addressDto;
    }

    @Override
    public void delete(Long id) {
        addressRepository.deleteById(id);
    }

    @Override
    public List<AddressDto> getAll() {
        List<Address> addresses = addressRepository.findAll();
        List<AddressDto> addressDtos = new ArrayList<>();

        addresses.forEach(it -> {
            AddressDto addressDto = new AddressDto();
            addressDto.setId(it.getId());
            addressDto.setAddress(it.getAddress());
            addressDto.setIsActive(it.getIsActive());
            addressDto.setAddressType(it.getAddressType());
            addressDtos.add(addressDto);
        });

        return addressDtos;
    }
}
