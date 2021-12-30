package ro.unibuc.springlab8example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.springlab8example1.dto.AddressDto;
import ro.unibuc.springlab8example1.service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping()
    public ResponseEntity<AddressDto> createAddress(@RequestBody AddressDto addressDto) {

        return ResponseEntity.ok().body(addressService.create(addressDto));

    }

    @GetMapping("/{name}")
    public ResponseEntity<AddressDto> getAddress(@PathVariable String name) {
        return ResponseEntity.ok(addressService.get(name));
    }
    
}
