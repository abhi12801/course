package com.course.demo.repo;

import com.course.demo.entity.courseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface courseRepo extends JpaRepository<courseEntity,Integer> {
}