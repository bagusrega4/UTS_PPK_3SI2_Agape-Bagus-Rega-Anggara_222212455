package com.polstatstis.labkom.mapper;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.UserDto;
import com.polstatstis.labkom.entity.User;

public class UserMapper {
   public static User mapToUser(UserDto userDto){
        return User.builder()
            .nim(userDto.getNim())
            .nama(userDto.getNama())
            .kelas(userDto.getKelas())
            .email(userDto.getEmail())
            .password(userDto.getPassword())
            .role(userDto.getRole())
            .build();
    }
    public static UserDto mapToUserDto(User user){
        return UserDto.builder()
            .nim(user.getNim())
            .nama(user.getNama())
            .kelas(user.getKelas())
            .email(user.getEmail())
            .password(user.getPassword())
            .role(user.getRole())
            .build();
    }
}
