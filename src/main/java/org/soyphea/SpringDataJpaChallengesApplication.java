package org.soyphea;

import org.soyphea.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaChallengesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaChallengesApplication.class, args);
    }

    @Autowired
    AuthorRepository authorRepository;

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            authorRepository.save(new Author(100L, "Dara"));
            Optional<Author> author = authorRepository.findById(100L);
            System.out.println(author.isPresent());
        };
    }
}
