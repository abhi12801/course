package com.course.demo.controller;


import com.course.demo.dto.requestDto;
import com.course.demo.entity.courseEntity;
import com.course.demo.service.courseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping("v1/course")
public class courseContoller {

    @Autowired
    private courseService  courseService;

    @GetMapping("/all")
    public List<courseEntity> getCourse(){
        List<courseEntity> courseList =courseService.getAllcourses();
        return courseList;
    }

    @GetMapping("/{id}")
    public Optional<courseEntity> getCourseById(@PathVariable int id ){
        Optional<courseEntity> courseEntity =courseService.getCourseById(id);
        return courseEntity;
    }

//    @PostMapping("/create")
//    public  void createCourse(@RequestBody requestDto requestbody){
//        courseService.createCourse(requestbody);
//    }
//



}
