package ro.unibuc.springlab8example1.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import ro.unibuc.springlab8example1.domain.Course;
import ro.unibuc.springlab8example1.domain.User;
import ro.unibuc.springlab8example1.dto.CourseDto;
import ro.unibuc.springlab8example1.dto.UserDto;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Mapping(target = "id", source = "course.id")
    @Mapping(target = "userDtos", source = "course.users", qualifiedByName = "usersToUserDtos")
    CourseDto mapToDto(Course course);

    @Named(value = "usersToUserDtos")
    default  List<UserDto> usersToUserDtos(List<User> users) {

        return users.stream().map(u -> {
//            UserDto userDto = new UserDto();
//            userDto.setId(u.getId());
//            userDto.setUsername(u.getUsername());
//            userDto.setFullName(u.getFullName());
//            userDto.setCnp(u.getUserDetails().getCnp());
//            userDto.setAge(u.getUserDetails().getAge());
//            userDto.setOtherInformation(u.getUserDetails().getOtherInformation());
//            userDto.setCourseId(u.getCourseId());
//            userDto.setAddress(u.getAddress().getAddress());
//            return userDto;
            return  UserMapper.INSTANCE.mapToDto(u);
        }).collect(Collectors.toList());

    }

    @Mapping(target = "id", source = "courseDto.id")
//    @Mapping(target = "users", source = "courseDto.userDtos")
    Course mapToEntity(CourseDto courseDto);

}
