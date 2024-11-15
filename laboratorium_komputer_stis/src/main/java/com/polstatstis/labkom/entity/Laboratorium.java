package com.polstatstis.labkom.entity;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "laboratorium")
public class Laboratorium {
    @Id
    private int id_Laboratorium;
    
    @Column(nullable = false)
    private String nama_Laboratorium;
    
    @Column(nullable = false)
    private String lokasi;
    
    @OneToMany(mappedBy = "laboratorium")
    private List<Komputer> komputer;
}
