package com.altunfatih.service.impl;

import com.altunfatih.dto.PersonalDto;
import com.altunfatih.entity.Personal;
import com.altunfatih.repository.PersonalRepository;
import com.altunfatih.service.PersonalService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonalServiceImpl implements PersonalService {

    private final PersonalRepository personalRepository;

    @Override
    @Transactional
    public PersonalDto save(PersonalDto personalDto) {
        Personal personal = new Personal();
        personal.setName(personalDto.getName());
        personal.setSurname(personalDto.getSurname());
        personalDto.setAddressesDto(personalDto.getAddressesDto());

        Personal personalDb = personalRepository.save(personal);
        personalDto.setId(personalDb.getId());

        return personalDto;
    }

    @Override
    public void delete(Long id) {
        personalRepository.deleteById(id);
    }

    @Override
    public List<PersonalDto> getAll() {
        List<Personal> personals = personalRepository.findAll();
        List<PersonalDto> personalDtos = new ArrayList<>();

        personals.forEach(it -> {
            PersonalDto personalDto = new PersonalDto();
            personalDto.setId(it.getId());
            personalDto.setName(it.getName());
            personalDto.setSurname(it.getSurname());
            personalDtos.add(personalDto);
        });

        return personalDtos;
    }
}
