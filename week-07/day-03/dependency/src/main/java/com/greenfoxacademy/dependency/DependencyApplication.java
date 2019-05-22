package com.greenfoxacademy.dependency;

import com.greenfoxacademy.dependency.services.ColorableInterface;
import com.greenfoxacademy.dependency.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyApplication implements CommandLineRunner {
    @Autowired
    Printer printer;

    @Autowired
    CommandLineRunner commandLineRunner;

    @Qualifier("BlueColor")
    @Autowired
    ColorableInterface colorableInterface;

    public static void main(String[] args) {
        SpringApplication.run(DependencyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        colorableInterface.printColor();
        System.out.println("SOME SPRING INFO");
        printer.log("hello");
        System.out.println("SOME SPRING INFO");
    }
}