package com.muhammet.repository.view;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@Builder
public class VwDepartmanList {
    Long id;
    String ad;
    public VwDepartmanList(Long id, String ad){
        this.id = id;
        this.ad = ad;
    }
}
