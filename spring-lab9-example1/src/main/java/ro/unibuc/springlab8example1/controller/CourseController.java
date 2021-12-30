package ro.unibuc.springlab8example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.unibuc.springlab8example1.dto.CourseDto;
import ro.unibuc.springlab8example1.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping()
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto) {

        return ResponseEntity.ok().body(courseService.create(courseDto));

    }

    @GetMapping("/{name}")
    public ResponseEntity<CourseDto> getCourse(@PathVariable String name) {
        return ResponseEntity.ok(courseService.get(name));
    }

}
