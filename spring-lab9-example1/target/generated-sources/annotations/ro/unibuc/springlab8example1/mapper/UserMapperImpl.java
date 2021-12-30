package ro.unibuc.springlab8example1.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.unibuc.springlab8example1.domain.Address;
import ro.unibuc.springlab8example1.domain.Address.AddressBuilder;
import ro.unibuc.springlab8example1.domain.User;
import ro.unibuc.springlab8example1.domain.User.UserBuilder;
import ro.unibuc.springlab8example1.domain.UserDetails;
import ro.unibuc.springlab8example1.domain.UserDetails.UserDetailsBuilder;
import ro.unibuc.springlab8example1.dto.AddressDto;
import ro.unibuc.springlab8example1.dto.AddressDto.AddressDtoBuilder;
import ro.unibuc.springlab8example1.dto.UserDto;
import ro.unibuc.springlab8example1.dto.UserDto.UserDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-29T22:04:06+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto mapToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDtoBuilder userDto = UserDto.builder();

        userDto.cnp( userUserDetailsCnp( user ) );
        userDto.age( userUserDetailsAge( user ) );
        userDto.otherInformation( userUserDetailsOtherInformation( user ) );
        userDto.address( userAddressAddress( user ) );
        userDto.addressDto( addressToAddressDto( user.getAddress() ) );
        userDto.id( user.getId() );
        userDto.username( user.getUsername() );
        userDto.fullName( user.getFullName() );
        userDto.courseId( user.getCourseId() );

        return userDto.build();
    }

    @Override
    public User mapToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserBuilder user = User.builder();

        user.userDetails( userDtoToUserDetails( userDto ) );
        user.address( userDtoToAddress( userDto ) );
        user.id( userDto.getId() );
        user.username( userDto.getUsername() );
        user.fullName( userDto.getFullName() );
        user.courseId( userDto.getCourseId() );

        return user.build();
    }

    private String userUserDetailsCnp(User user) {
        if ( user == null ) {
            return null;
        }
        UserDetails userDetails = user.getUserDetails();
        if ( userDetails == null ) {
            return null;
        }
        String cnp = userDetails.getCnp();
        if ( cnp == null ) {
            return null;
        }
        return cnp;
    }

    private Integer userUserDetailsAge(User user) {
        if ( user == null ) {
            return null;
        }
        UserDetails userDetails = user.getUserDetails();
        if ( userDetails == null ) {
            return null;
        }
        Integer age = userDetails.getAge();
        if ( age == null ) {
            return null;
        }
        return age;
    }

    private String userUserDetailsOtherInformation(User user) {
        if ( user == null ) {
            return null;
        }
        UserDetails userDetails = user.getUserDetails();
        if ( userDetails == null ) {
            return null;
        }
        String otherInformation = userDetails.getOtherInformation();
        if ( otherInformation == null ) {
            return null;
        }
        return otherInformation;
    }

    private String userAddressAddress(User user) {
        if ( user == null ) {
            return null;
        }
        Address address = user.getAddress();
        if ( address == null ) {
            return null;
        }
        String address1 = address.getAddress();
        if ( address1 == null ) {
            return null;
        }
        return address1;
    }

    protected AddressDto addressToAddressDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDtoBuilder addressDto = AddressDto.builder();

        addressDto.id( address.getId() );
        addressDto.address( address.getAddress() );
        addressDto.userId( address.getUserId() );

        return addressDto.build();
    }

    protected UserDetails userDtoToUserDetails(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        UserDetailsBuilder userDetails = UserDetails.builder();

        userDetails.cnp( userDto.getCnp() );
        userDetails.age( userDto.getAge() );
        userDetails.otherInformation( userDto.getOtherInformation() );

        return userDetails.build();
    }

    protected Address userDtoToAddress(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        AddressBuilder address = Address.builder();

        address.address( userDto.getAddress() );

        return address.build();
    }
}
