package br.com.silviofrancoms.apispringdezembro.services;

import br.com.silviofrancoms.apispringdezembro.domain.User;

public interface UserService {
    User findById(Integer id);
}
