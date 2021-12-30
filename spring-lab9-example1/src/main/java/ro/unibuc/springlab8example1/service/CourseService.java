package ro.unibuc.springlab8example1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.unibuc.springlab8example1.domain.Course;
import ro.unibuc.springlab8example1.dto.CourseDto;
import ro.unibuc.springlab8example1.mapper.CourseMapper;
import ro.unibuc.springlab8example1.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;

    @Autowired
    CourseRepository courseRepository;

    public CourseDto create(CourseDto courseDto) {

        Course course = courseMapper.mapToEntity(courseDto);
        Course savedCourse = courseRepository.save(course);
        return courseMapper.mapToDto(savedCourse);

    }

    public CourseDto get(String name) {

        Course course = courseRepository.findByName(name);
        CourseDto courseDto = courseMapper.mapToDto(course);
        return courseDto;

    }

}
