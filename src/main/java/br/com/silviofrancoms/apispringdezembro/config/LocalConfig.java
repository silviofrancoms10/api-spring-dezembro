package br.com.silviofrancoms.apispringdezembro.config;

import br.com.silviofrancoms.apispringdezembro.domain.User;
import br.com.silviofrancoms.apispringdezembro.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public boolean startDB() {
        User u1 = new User(null, "Silvio", "oH6lG@example.com", "123");
        User u2 = new User(null, "Maria", "4k6tT@example.com", "123");

        repository.saveAll(List.of(u1, u2));
        return true;
    }
}
