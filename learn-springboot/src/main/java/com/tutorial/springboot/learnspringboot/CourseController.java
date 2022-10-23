package com.tutorial.springboot.learnspringboot;

// endpoint - /courses
//  Course: id, name, author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // /courses
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "Abuchi"),
                new Course(1, "Learn Java", "Ken")
        );
    }
}
