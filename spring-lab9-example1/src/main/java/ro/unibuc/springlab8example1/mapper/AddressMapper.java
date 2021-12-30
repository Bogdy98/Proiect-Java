package ro.unibuc.springlab8example1.mapper;

import org.mapstruct.Mapper;
import ro.unibuc.springlab8example1.domain.Address;
import ro.unibuc.springlab8example1.dto.AddressDto;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressDto mapToDto(Address address);

    Address mapToEntity(AddressDto addressDto);

}
