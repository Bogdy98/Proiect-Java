package ro.unibuc.springlab8example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.springlab8example1.domain.Address;
import ro.unibuc.springlab8example1.dto.AddressDto;
import ro.unibuc.springlab8example1.mapper.AddressMapper;
import ro.unibuc.springlab8example1.repository.AddressRepository;

@Service
public class AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    AddressRepository addressRepository;

    public AddressDto create(AddressDto addressDto) {

        Address address = addressMapper.mapToEntity(addressDto);
        Address savedAddress = addressRepository.save(address);
        return addressMapper.mapToDto(savedAddress);

    }

    public AddressDto get(String name) {

        Address address = addressRepository.findByAddress(name);
        return addressMapper.mapToDto(address);

    }

}
