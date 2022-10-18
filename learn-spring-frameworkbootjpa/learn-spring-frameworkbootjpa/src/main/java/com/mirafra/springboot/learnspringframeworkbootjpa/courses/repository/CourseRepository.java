
package com.mirafra.springboot.learnspringframeworkbootjpa.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mirafra.springboot.learnspringframeworkbootjpa.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
