package ro.unibuc.springlab8example1.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ro.unibuc.springlab8example1.domain.Course;
import ro.unibuc.springlab8example1.domain.Course.CourseBuilder;
import ro.unibuc.springlab8example1.dto.CourseDto;
import ro.unibuc.springlab8example1.dto.CourseDto.CourseDtoBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-12-29T22:04:06+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Oracle Corporation)"
)
@Component
public class CourseMapperImpl implements CourseMapper {

    @Override
    public CourseDto mapToDto(Course course) {
        if ( course == null ) {
            return null;
        }

        CourseDtoBuilder courseDto = CourseDto.builder();

        courseDto.id( course.getId() );
        courseDto.userDtos( usersToUserDtos( course.getUsers() ) );
        courseDto.name( course.getName() );

        return courseDto.build();
    }

    @Override
    public Course mapToEntity(CourseDto courseDto) {
        if ( courseDto == null ) {
            return null;
        }

        CourseBuilder course = Course.builder();

        course.id( courseDto.getId() );
        course.name( courseDto.getName() );

        return course.build();
    }
}
