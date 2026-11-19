package com.spring.learn_spring.boot;


import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RequestMapping("/course")
@RestController
//Controller-Used when you return JSP pages
//RestController-Used when you return JSON/text, NOT pages.

public class CourseController {

    //inside this container i want to control request and response

//    List<Course> courses = LinkedList<>(List.of(
//            new Course("1", "JFS", "50000"),
//            new Course("2", "PFS", "60000"),
//            new Course("3", "DS", "670000"),
//            new Course("4", "DA", "100000"),
//            new Course("5", "DSA", "120000"),
//            new Course("6", "AA", "90000")));

    List<Course> initialData = Arrays.asList(
            new Course("1", "JFS", "50000"),
            new Course("2", "PFS", "60000"),
            new Course("3", "DS", "670000"),
            new Course("4", "DA", "100000"),
            new Course("5", "DSA", "120000"),
            new Course("6", "AA", "90000")
    );

    List<Course> courses = new LinkedList<>(initialData);

    @GetMapping("/courses")
    public List<Course> RetrieveAllCourses() {
        return courses;


    }

    @PostMapping("/inserted")
    public String insertCourse() {

        Course c = new Course("10", "Java", "50000");
        courses.add(c);

        return "course added";
    }



    @PutMapping("/updates")
    public String updateCourse() {

        for (Course c : courses) {
            if (c.getId().equals("1")) {
                c.setName("BFS");
                c.setFees("99999");
                return "Course Updated!";
            }
        }

        return "Course not found!";
    }





    @DeleteMapping("/delete")
    public String deleteCourse() {

        courses.remove(0);   // deletes the first course in the list

        return "Course deleted!";
    }



//    @PutMapping("/update")
//    public List<Course> UpdateCourse() {
//
//        return courses;
//    }
//    @PostMapping("/insert")
//    public LinkedList<Course> InsertCourse(){
//        new Course("7","dd","9098");
//        return (LinkedList<Course>) courses;
//    }
}


