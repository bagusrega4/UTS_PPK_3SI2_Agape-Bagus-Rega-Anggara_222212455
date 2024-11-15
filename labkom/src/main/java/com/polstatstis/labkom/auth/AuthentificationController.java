package com.polstatstis.labkom.auth;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.UserDto;
import com.polstatstis.labkom.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthentificationController {
    @Autowired
    AuthenticationManager authManager;
    
    @Autowired
    JwtUtil jwtUtil;
    
    @Autowired
    UserService userService;
    
    @PostMapping("/changePassword")
    public ResponseEntity<?> changePassword(@RequestBody PasswordRequest request) {
        UserDto user = userService.changePassword(request.getNim(),request.getPassword());
        return ResponseEntity.ok().body(user);
    }
    
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto request) {
        if (!request.getRole().equals("admin") && !request.getRole().equals("mahasiswa")) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .body("Role harus admin atau mahasiswa.");
        }
        UserDto user = userService.createUser(request);
        return ResponseEntity.ok().body(user);
    }    
    
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody @Valid AuthentificationRequest request) {
        try {
            Authentication authentication = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getNim(), request.getPassword()));
            String accessToken = jwtUtil.generateAccessToken(authentication);
            AuthentificationResponse response = new AuthentificationResponse(request.getNim(), accessToken);
            return ResponseEntity.ok().body(response);
        } catch (BadCredentialsException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("NIM atau password salah.");
        }
    }
}
