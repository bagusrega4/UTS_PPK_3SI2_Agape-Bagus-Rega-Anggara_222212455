package com.polstatstis.labkom.mapper;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.LaboratoriumDto;
import com.polstatstis.labkom.entity.Laboratorium;

public class LaboratoriumMapper {
    static Laboratorium mapToLab(LaboratoriumDto labDto){
        return Laboratorium.builder()
            .id_Laboratorium(labDto.getId_Laboratorium())
            .nama_Laboratorium(labDto.getNama_Laboratorium())
            .lokasi(labDto.getLokasi())
            .build();
    }
    public static LaboratoriumDto mapToLabDto(Laboratorium lab){
        return LaboratoriumDto.builder()
            .id_Laboratorium(lab.getId_Laboratorium())
            .nama_Laboratorium(lab.getNama_Laboratorium())
            .lokasi(lab.getLokasi())
            .build();
    }
}
