package com.polstatstis.labkom.dto;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.polstatstis.labkom.entity.Komputer;
import com.polstatstis.labkom.entity.User;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PeminjamanDto {
    private int id_Peminjaman;
    
    private User user;
    
    private Komputer komputer;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date waktu_Peminjaman;
    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date waktu_Pengembalian;
}
