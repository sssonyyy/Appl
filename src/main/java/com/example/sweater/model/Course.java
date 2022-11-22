package com.example.sweater.model;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import javax.persistence.*;
import java.util.Date;

@Component //Указывает что класс является компонентом, т.е. кандидатом на автоматическое обнаружение

@Entity  //Указывает, что класс является сущностью

public class Course //Представлен класс модели
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Ниже представлены поля таблицы, в дальнейшем они помечаются @Column
    private Long Id; //Идентификатор данных
    private String Name;//Название
    private Date CourseDateBeg;//Дата начала курса
    private Date CourseDateEnd;//Дата окончания
    private String AvtivityType;//Признак активности
    public Course() {

    }

    //Конструктор класса
    public Course(Long Id, String Name,Date CourseDateBeg,
                   Date CourseDateEnd,  String AvtivityType) {
        this.Id = Id;
        this.Name = Name;
        this.CourseDateBeg =CourseDateBeg;
        this.CourseDateEnd = CourseDateEnd;
        this.AvtivityType = AvtivityType;
    }

    //Геттеры и сеттеры
    public Long geId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Date getCourseDateBeg() {
        return CourseDateBeg;
    }

    public void setCourseDateBeg(Date CourseDateBeg) {
        this.CourseDateBeg = CourseDateBeg;
    }

    public Date getCourseDateEnd() {
        return CourseDateEnd;
    }

    public void setCourseDateEnd(Date CourseDateEnd) {
        this.CourseDateEnd = CourseDateEnd;
    }

    public String getAvtivityType() {
        return AvtivityType;
    }

    public void setAvtivityType(String AvtivityType) {
        this.AvtivityType = AvtivityType;
    }
}

