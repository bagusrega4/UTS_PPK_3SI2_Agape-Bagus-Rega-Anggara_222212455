package com.polstatstis.labkom.service;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.UserDto;

public interface UserService {
    public UserDto createUser(UserDto user);
    public UserDto getUserByNim(String nim);
    public UserDto changePassword(String nim, String password);
}
