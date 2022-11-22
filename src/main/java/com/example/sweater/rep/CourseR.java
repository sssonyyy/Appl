package com.example.sweater.rep;

import com.example.sweater.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository//Наследование интерфейса, в данном случае CRUD(добавление,удаление данных и пр.)
public interface CourseR extends CrudRepository <Course, Long>//Интерфейс
{

    public default List<Course> getCourse() //Коллекция
    {
        //Добавляем данные, которые хотим в дальнейшем отобразить в view

        Date CourseDateBeg= Date.valueOf(LocalDate.parse("2000-12-11"));
        Date CourseDateEnd= Date.valueOf(LocalDate.parse("2001-12-11"));
        Course e1= new Course(1L, "E01", CourseDateBeg,CourseDateEnd, "hhh" );
        Course e2= new Course(2L, "Ey1", CourseDateBeg,CourseDateEnd, "hkhh" );

        List<Course> list= new ArrayList<Course>();
        list.add(e1);
        list.add(e2);

        return list;
    }

}