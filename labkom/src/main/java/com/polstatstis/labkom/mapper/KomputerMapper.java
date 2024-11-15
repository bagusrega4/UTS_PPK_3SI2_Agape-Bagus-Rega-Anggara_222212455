package com.polstatstis.labkom.mapper;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.KomputerDto;
import com.polstatstis.labkom.entity.Komputer;

public class KomputerMapper {
    static Komputer mapToKomputer(KomputerDto komputerDto){
        return Komputer.builder()
            .id_Komputer(komputerDto.getId_Komputer())
            .laboratorium(komputerDto.getLaboratorium())
            .status(komputerDto.getStatus())
            .build();
    }
    public static KomputerDto mapToKomputerDto(Komputer komputer){
        return KomputerDto.builder()
            .id_Komputer(komputer.getId_Komputer())
            .laboratorium(komputer.getLaboratorium())
            .status(komputer.getStatus())
            .build();
    }
}
