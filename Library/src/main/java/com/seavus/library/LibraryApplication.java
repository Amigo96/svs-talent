package com.seavus.library;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sun.tools.jar.CommandLine;


@SpringBootApplication
@EnableJpaRepositories
public class LibraryApplication {
    public static void main(String[] args){

        ConfigurableApplicationContext context = SpringApplication.run(LibraryApplication.class, args);


        System.out.println("Da ada ");

        Book book = new Book("Pat okolu svet za 80 dena", "122323");

    }

    @Bean
    CommandLineRunner runner(BookRepository repository){
        return args -> {
          repository.save(new Book("Pat okolu svet za 80 dena", "122323"));
        };
    }
}
