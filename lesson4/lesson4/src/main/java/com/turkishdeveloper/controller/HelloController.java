package com.turkishdeveloper.controller;

import org.springframework.web.bind.annotation.*;

@RestController     //Spring Framework'ün bir parçası olan Spring Web modülünde kullanılan bir anotasyondur. Bir sınıfa @RestController anotasyonu eklendiğinde, bu sınıfın belirli HTTP isteklerine nasıl yanıt vereceği tanımlanır.
@RequestMapping(path = "/api")      //Bu anotasyon, bir metodu belirli bir HTTP istek yoluyla ilişkilendirmek için kullanılır.
public class HelloController {

    //GET :veri görüntülemek istediğimiz zaman kullanılıyor @GetMapping
    //POST: veri kaydetmek istediğimiz zaman kullanılıyor @PostMapping
    //PUT: veri güncellemek istediğimiz zaman kullanılıyor @PutMapping
    //PATCH: verinin bir bölümünü güncellemek istediğimiz zaman kullanılıyor @PatchMapping
    //örn: parolo güncellemek gibi.
    //DELETE: veri silmek istediğimiz zaman kullanılıyor @DeleteMapping


    //localhost:8080/api/hello
    // @GetMapping(path="/hello")      //kodun okunmasını kolaylaştırır.Bu anotasyon, bir metodu belirli bir HTTP GET isteği yoluyla ilişkilendirmek için kullanılır.
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello World";

    }

   @PostMapping(path = "/save")
    public String save() {
        return "Data saved!";
    }
    @DeleteMapping(path = "/delete")
    public String delete() {
        return "Data Deleted!";
    }
}


