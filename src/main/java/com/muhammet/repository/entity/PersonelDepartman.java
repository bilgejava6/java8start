package com.muhammet.repository.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "tblpersoneldepartman")
public class PersonelDepartman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long departmanid;
    Long personelid;
}
