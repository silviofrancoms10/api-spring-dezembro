package br.com.silviofrancoms.apispringdezembro.services.impl;

import br.com.silviofrancoms.apispringdezembro.domain.User;
import br.com.silviofrancoms.apispringdezembro.repositories.UserRepository;
import br.com.silviofrancoms.apispringdezembro.services.UserService;
import br.com.silviofrancoms.apispringdezembro.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado! Id: " + id));
    }
}
