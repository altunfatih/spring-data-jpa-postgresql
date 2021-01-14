package com.altunfatih.service;

import com.altunfatih.dto.PersonalDto;

import java.util.List;

public interface PersonalService {
    PersonalDto save(PersonalDto personalDto);

    void delete(Long id);

    List<PersonalDto> getAll();
}
