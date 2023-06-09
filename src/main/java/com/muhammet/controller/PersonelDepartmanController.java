package com.muhammet.controller;

import com.muhammet.dto.request.GetNameUpperCaseRequestDto;
import com.muhammet.exceptions.ErrorType;
import com.muhammet.exceptions.Java8StartException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personeldepartman")
@RequiredArgsConstructor
public class PersonelDepartmanController {

    @PostMapping("/getname")
    public ResponseEntity<String> getNameUpperCase(@RequestBody GetNameUpperCaseRequestDto dto){
        if(dto.getName()==null)
            throw new Java8StartException(ErrorType.NAME_IS_NULL);
        String nameUpper = dto.getName().toUpperCase();
        return ResponseEntity.ok(nameUpper);
    }


    @GetMapping("/test")
    public void test(){

        int s1= 1;
        int s2= 0;
        String ifade = null;
        try{
            ifade.toUpperCase();
            int sonuc = s1/s2;
        }catch (ArithmeticException ex){
            System.out.println("İşlem hatası oluştu....: "+ ex.toString());
        } catch (NullPointerException ex){
            System.out.println("Girilen değer null olamaz....: "+ ex.toString());
        }




    }

}
