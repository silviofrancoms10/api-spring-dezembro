package br.com.silviofrancoms.apispringdezembro.repositories;

import br.com.silviofrancoms.apispringdezembro.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
