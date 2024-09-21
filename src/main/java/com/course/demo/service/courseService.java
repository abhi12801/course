package com.course.demo.service;

import com.course.demo.dto.requestDto;
import com.course.demo.entity.courseEntity;

import java.util.List;
import java.util.Optional;


public interface courseService {

    public List<courseEntity> getAllcourses() ;

    public void createCourse(requestDto dto );

    public Optional<courseEntity> getCourseById(int id);

}
