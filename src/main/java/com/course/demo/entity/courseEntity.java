package com.course.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "custom_course")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class courseEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    @Column
    private String Name;

    @Column
    private int Price;


    @Column(name = "duration", nullable = false , length = 20, unique = true)
    private String Duration;
}
