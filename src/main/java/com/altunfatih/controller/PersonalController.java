package com.altunfatih.controller;

import com.altunfatih.dto.PersonalDto;
import com.altunfatih.service.PersonalService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personal")
@RequiredArgsConstructor
@Api(value = "PersonalController API doc")
public class PersonalController {

    private final PersonalService personalService;

    @PostMapping
    @ApiOperation(value = "Add New Personal", notes = "Save Method!")
    public ResponseEntity<PersonalDto> save(@RequestBody PersonalDto personalDto) {
        return ResponseEntity.ok(personalService.save(personalDto));
    }

    @GetMapping
    @ApiOperation(value = "List Personal")
    public ResponseEntity<List<PersonalDto>> allList() {
        return ResponseEntity.ok(personalService.getAll());
    }

}
