package ro.unibuc.springlab8example1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import ro.unibuc.springlab8example1.domain.User;
import ro.unibuc.springlab8example1.dto.UserDto;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "cnp", source = "userDetails.cnp")
    @Mapping(target = "age", source = "userDetails.age")
    @Mapping(target = "otherInformation", source = "userDetails.otherInformation")
    @Mapping(target = "address", source = "address.address")
    @Mapping(target = "addressDto", source = "address")
    UserDto mapToDto(User user);

//    @Mapping(target = "userDetails.cnp", source = "cnp")
//    @Mapping(target = "userDetails.age", source = "age")
//    @Mapping(target = "userDetails.otherInformation", source = "otherInformation")
//    User mapToEntity(UserDto user);
    @Mapping(target = "userDetails.cnp", source = "userDto.cnp")
    @Mapping(target = "userDetails.age", source = "userDto.age")
    @Mapping(target = "userDetails.otherInformation", source = "userDto.otherInformation")
    @Mapping(target = "address.address", source = "address")
//    @Mapping(target = "user.address", source = "addressDto")
    User mapToEntity(UserDto userDto);

}
