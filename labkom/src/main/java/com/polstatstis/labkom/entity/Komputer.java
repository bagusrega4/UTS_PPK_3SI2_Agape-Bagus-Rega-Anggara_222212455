package com.polstatstis.labkom.entity;

/**
 * @author Agape Bagus Rega Anggara (222212455)
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "komputer")
public class Komputer {
    @Id
    private int id_Komputer;
   
    @ManyToOne 
    @JoinColumn(name = "lab_id")
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Laboratorium laboratorium;
    
    @Column(nullable = false)
    private String status;
    
    @OneToMany(mappedBy = "komputer")
    private List<Peminjaman> peminjaman;
}
