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
@Table(name = "user")
public class User {
    @Id
    private String nim;
    
    @Column(nullable = false)
    private String nama;
    
    @Column(nullable = true)
    private String kelas;
    
    @Column(nullable = true)
    private String email;
    
    @Column(nullable = false)
    private String password;
    
    @Column(nullable = false)
    private String role;
    
    @OneToMany(mappedBy = "user")
    private List<Peminjaman> peminjaman;
}
