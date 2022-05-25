package com.portfolioManagerAP.portfoliobackend.service;

import com.portfolioManagerAP.portfoliobackend.dto.FinalUserDto;
import com.portfolioManagerAP.portfoliobackend.entity.FinalUser;
import com.portfolioManagerAP.portfoliobackend.repository.AuthUserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthUserService {

    @Autowired
    AuthUserRepository authUserRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public boolean isUserEnabled(FinalUserDto finalUserDto) {
        boolean isUserEnabled = false;
        List<FinalUser> users = authUserRepository.findByEmailAndIsEnabledTrue(finalUserDto.getEmail());
        if (!users.isEmpty()) {
            FinalUser finalUser = users.get(0);
            if (passwordEncoder.matches(finalUserDto.getPassword(), finalUser.getPassword())) {
                isUserEnabled = true;
            }
        }
        return isUserEnabled;
    }

    public void createUser(FinalUser finalUser) throws Exception {
        List<FinalUser> users = authUserRepository.findByEmailAndIsEnabledTrue(finalUser.getEmail());
        if (!users.isEmpty()) {
            throw new Exception("El email ya está registrado.");
        } else {
            finalUser.setPassword(passwordEncoder.encode(finalUser.getPassword()));
            finalUser.setEnabled(true);
            authUserRepository.save(finalUser);
        }
    }
}
