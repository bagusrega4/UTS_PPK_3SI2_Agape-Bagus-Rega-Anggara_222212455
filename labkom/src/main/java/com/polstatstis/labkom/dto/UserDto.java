package com.polstatstis.labkom.dto;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import java.util.Collection;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements UserDetails{
    private String nim;    
    private String role;    
    private String nama;   
    private String email;        
    private String password;    
    private String kelas;     
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of((GrantedAuthority) () -> this.role.toUpperCase());
    }
        
    @Override
        public String getUsername() {
        return this.nim;
    }
        
    @Override
        public boolean isAccountNonLocked() {
        return true;
    }
        
    @Override
        public boolean isAccountNonExpired() {
        return true;
    }
        
    @Override
        public boolean isEnabled() {
        return true;
    }
        
    @Override
        public boolean isCredentialsNonExpired() {
        return true;
    }
}
