package com.course.demo.mapper;

import com.course.demo.dto.requestDto;
import com.course.demo.dto.responseDto;
import com.course.demo.entity.courseEntity;
import org.springframework.stereotype.Component;


@Component
public class courseMapper {

    public courseEntity DtoTOEntity(requestDto requestDto){
        courseEntity course = new courseEntity();
        course.setId(requestDto.getId());
        course.setName(requestDto.getName());
        course.setDuration(requestDto.getDuration());
        course.setPrice(requestDto.getPrice());
        return  course;

    }

    public responseDto EntityTODto(courseEntity courseEntity){
        responseDto responseDto= new responseDto();
        responseDto.setId(courseEntity.getId());
        responseDto.setMessage("data is sucessfully set");
        return  responseDto;
    }




}
