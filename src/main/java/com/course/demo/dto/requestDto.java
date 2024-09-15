package com.course.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class requestDto {

    private int id;
    private String Name;
    private int Price;
    private String Duration;
    private  String createdBy;
    private String createdOn;
}
