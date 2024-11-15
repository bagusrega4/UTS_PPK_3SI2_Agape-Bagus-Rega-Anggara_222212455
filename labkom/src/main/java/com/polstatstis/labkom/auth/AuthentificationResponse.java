package com.polstatstis.labkom.auth;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthentificationResponse {
    private String nim;
    private String accessToken;    
}
