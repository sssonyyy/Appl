package com.example.sweater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//Отсюда стартует приложение
@ComponentScan(basePackages = {"com.example.sweater.rep","com.example.sweater.model" }) // Указывает какие пакеты содержат аннотированные классы

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);//Запуск Application
    }
}
