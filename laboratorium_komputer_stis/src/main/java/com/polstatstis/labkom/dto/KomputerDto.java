package com.polstatstis.labkom.dto;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.entity.Laboratorium;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KomputerDto {
    private int id_Komputer;
    
    private Laboratorium laboratorium;
    
    private String status;
}
