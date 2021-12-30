package ro.unibuc.springlab8example1.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.unibuc.springlab8example1.domain.Address;
import ro.unibuc.springlab8example1.domain.Address.AddressBuilder;
import ro.unibuc.springlab8example1.dto.AddressDto;
import ro.unibuc.springlab8example1.dto.AddressDto.AddressDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-29T21:00:11+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class AddressMapperImpl implements AddressMapper {

    @Override
    public AddressDto mapToDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDtoBuilder addressDto = AddressDto.builder();

        addressDto.id( address.getId() );
        addressDto.address( address.getAddress() );
        addressDto.userId( address.getUserId() );

        return addressDto.build();
    }

    @Override
    public Address mapToEntity(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        AddressBuilder address = Address.builder();

        address.id( addressDto.getId() );
        address.address( addressDto.getAddress() );
        address.userId( addressDto.getUserId() );

        return address.build();
    }
}
