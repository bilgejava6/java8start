package com.muhammet.services;

import com.muhammet.repository.IPersonelDepartmanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonelDepartmanService {
    private final IPersonelDepartmanRepository repository;

}
