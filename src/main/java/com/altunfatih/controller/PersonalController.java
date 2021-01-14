package com.altunfatih.controller;

import com.altunfatih.dto.PersonalDto;
import com.altunfatih.service.PersonalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal")
@RequiredArgsConstructor
public class PersonalController {

    private final PersonalService personalService;

    @PostMapping
    public ResponseEntity<PersonalDto> save(@RequestBody PersonalDto personalDto) {
        return ResponseEntity.ok(personalService.save(personalDto));
    }

    @GetMapping
    public ResponseEntity<List<PersonalDto>> allList() {
        return ResponseEntity.ok(personalService.getAll());
    }

}
