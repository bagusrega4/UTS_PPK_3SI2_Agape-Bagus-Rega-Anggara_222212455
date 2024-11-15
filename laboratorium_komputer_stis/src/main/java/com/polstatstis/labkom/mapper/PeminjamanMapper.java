package com.polstatstis.labkom.mapper;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.dto.PeminjamanDto;
import com.polstatstis.labkom.entity.Peminjaman;

public class PeminjamanMapper {
    static Peminjaman mapToPeminjaman(PeminjamanDto peminjamanDto){
        return Peminjaman.builder()
            .id_Peminjaman(peminjamanDto.getId_Peminjaman())
            .user(peminjamanDto.getUser())
            .komputer(peminjamanDto.getKomputer())
            .waktu_Peminjaman(peminjamanDto.getWaktu_Peminjaman())
            .waktu_Pengembalian(peminjamanDto.getWaktu_Pengembalian())
            .build();
    }
    public static PeminjamanDto mapToPeminjamanDto(Peminjaman peminjaman){
        return PeminjamanDto.builder()
            .id_Peminjaman(peminjaman.getId_Peminjaman())
            .user(peminjaman.getUser())
            .komputer(peminjaman.getKomputer())
            .waktu_Peminjaman(peminjaman.getWaktu_Peminjaman())
            .waktu_Pengembalian(peminjaman.getWaktu_Pengembalian())
            .build();
    }
}
