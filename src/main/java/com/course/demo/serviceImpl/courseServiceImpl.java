package com.course.demo.serviceImpl;

import com.course.demo.dto.requestDto;
import com.course.demo.entity.courseEntity;
import com.course.demo.mapper.courseMapper;
import com.course.demo.repo.courseRepo;
import com.course.demo.service.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class courseServiceImpl implements courseService {

    @Autowired
    private courseRepo courseRepo;

    @Autowired
    private courseMapper courseMapper;
    @Override
    public List<courseEntity> getAllcourses() {
        System.err.println("reach there !");
        System.err.println(courseRepo.findAll());
        return courseRepo.findAll();
    }

    @Override
    public void createCourse(requestDto requestbody){
        courseEntity courseEntity =courseMapper.DtoTOEntity(requestbody);
        courseRepo.save(courseEntity);
    }

    @Override
    public Optional<courseEntity> getCourseById(int id) {
        Optional<courseEntity> courseEntity = courseRepo.findById(id);
        return  courseEntity;
    }
}
