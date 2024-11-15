package com.polstatstis.labkom.service;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.UserDto;
import com.polstatstis.labkom.entity.User;
import com.polstatstis.labkom.mapper.UserMapper;
import com.polstatstis.labkom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    
    @Override
    public UserDto createUser(UserDto userDto) {
        // Validasi role yang diperbolehkan
        if (!userDto.getRole().equalsIgnoreCase("admin") && !userDto.getRole().equalsIgnoreCase("mahasiswa")) {
            throw new IllegalArgumentException("Role harus berupa 'admin' atau 'mahasiswa'.");
        }

        // Set password terenkripsi
        userDto.setPassword(passwordEncoder.encode(userDto.getPassword()));
        
        // Simpan user
        User user = userRepository.save(UserMapper.mapToUser(userDto));
        return UserMapper.mapToUserDto(user);
    }
    
    @Override
    public UserDto changePassword(String nim, String password) {
        User user = userRepository.findByNim(nim);
        if (user == null) {
            throw new RuntimeException("User not found with NIM: " + nim);
        }
        user.setPassword(passwordEncoder.encode(password));
        user = userRepository.save(user);
        return UserMapper.mapToUserDto(user);
    }

    
    @Override
    public UserDto getUserByNim(String nim) {
        User user = userRepository.findByNim(nim);
        return UserMapper.mapToUserDto(user);
    }
}
