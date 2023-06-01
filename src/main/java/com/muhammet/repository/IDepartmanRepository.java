package com.muhammet.repository;

import com.muhammet.repository.entity.Departman;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepartmanRepository extends JpaRepository<Departman,Long> {

    /**
     * Spring Data JPA belli keyword ler ile sorguları method isimlerine göre otomatik oluşturur.
     * -- Örneğin: yönetici id sinden yöneticinin bağlı bulunduğu departman listesini bul.
     * ---- Spring Keeyword ler ile sorgu methodu oluşturmak;
     * 1- find ile başlıyoruz.
     * 2- By ile devam ediyoruz. bir kaç yerde değişlikliğe uyrayarak arasına değer girebiliyor.
     * 3- Entity içinde var olan bir property adını ekliyoruz.
     * DİKKAT!!!! burada yazılacak değişken adı mutlaka büyük harf ile başlar ve değişken yazım şekline göre devam eder.
     * 4- bu method için ek özellikler varsa eklenir.
     * 5- methodun talep ettiği değer parametre olarak eklenir.
     * 6- geri dönüş tipi yazılan methodun başına getirilir.
     */
    List<Departman> findByYoneticiid(Long yoneticiid); // find By Yoneticiid -> yoneticiid => select * from tbldepartman where yoneticiid = ?
    List<Departman> findAllByKonum(String konumadi_istedigini_yazabilirsin); // select * from tbldepartman where konum = ?
}
