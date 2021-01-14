package com.altunfatih.controller;

import com.altunfatih.dto.AddressDto;
import com.altunfatih.service.AddressService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Api(value = "AddressController API doc")
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    @ApiOperation(value = "Add New Address", notes = "Save Method!")
    public ResponseEntity<AddressDto> save(@RequestBody AddressDto addressDto) {
        return ResponseEntity.ok(addressService.save(addressDto));
    }

    @GetMapping
    @ApiOperation(value = "List Address")
    public ResponseEntity<List<AddressDto>> allList() {
        return ResponseEntity.ok(addressService.getAll());
    }

}
