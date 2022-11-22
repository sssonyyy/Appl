package com.example.sweater;

import com.example.sweater.model.Course;
import com.example.sweater.rep.CourseR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;


@Controller // Расширенный @Component, проинформирует, когда сделан запрос
public class MainController {

    @Autowired // Для подключения одного компонента к другому без создания экземпляра
    private CourseR courseR;


    @RequestMapping("/course") // Указание URI, маппинг запросов
    public String get(Model model) {

        List<Course> courses = courseR.getCourse();
        model.addAttribute("course", courses);
        return"course"; //Возвращает страницу
    }




}
   /* @PostMapping
    public String add (@RequestParam)
        return "main";
           @GetMapping
    public String main (Map<String, Object> model){
       CourseR instance = null;
        Iterable<Course> courses =  instance.findAll();;
        return "course";
    }*/



