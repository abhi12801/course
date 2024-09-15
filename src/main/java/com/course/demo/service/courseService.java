package com.course.demo.service;

import com.course.demo.dto.requestDto;
import com.course.demo.entity.courseEntity;
import org.springframework.stereotype.Service;

import java.util.List;





public interface courseService {

    public List<courseEntity> getAllcourses() ;

    public void createCourse(requestDto dto );

    public courseEntity getCourseById(int id);

}
