package com.polstatstis.labkom.dto;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LaboratoriumDto {
    private int id_Laboratorium;
    
    private String nama_Laboratorium;
    
    private String lokasi;
}
