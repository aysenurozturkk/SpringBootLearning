package com.turkishdeveloper.controller;

import com.turkishdeveloper.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class MyController {

    //@GetMapping(path = "/message/{m}")
   // public String getMessage(@PathVariable("m") String message){     //pathvariable ile parametre almayı sağlar
       // return "Your message is: " + message;
    //}

    //********************************************************

    //@GetMapping( "/message")
    //public String getMyMessage(@RequestParam("m") String message) {
        //return "Your message is: " +message;
    //}

    //*******************************************************************

  //  @GetMapping({"/message1", "/message1/{message"})      //texti direkt alıp çeker. yazdığımız textte araya + koyarsak onu da message olarak döndürür
    //public String getMyMessageWithVariable(@PathVariable(name ="message",required = false) String message) {
        //return "Your message is: " + message;
   // }

    //@GetMapping("/message2")            //veriyi okuyabilir. textte + koyarsak onu message de göstermez boşluk olarak algılar.
    //public  String getMyMessageWithParam(@RequestParam(name = "message",required = false,defaultValue = "my default message")String message) {
       //return "Your message is: " + message;
    //}

    //************************************************

    //@PostMapping("users")
    //public User saveUser(@RequestBody User user){ //kullanıcı user modelini karşılayanı gçnderecek ve ouser değişkenine atayıp kullanıcıya döndürecek
       // System.out.println("User saved!");
       // user.setPassword(""); //güvenlik için password alanını kullanıcıya göndermiyoruz.
       // return user;        //kullanıcıdan bilgi alıp yine ona gönderdik.
    //}

    //@PostMapping("users-all") // listeleme yapabiliriz
    //public List<User> saveAllUser(@RequestBody List<User> users){
       // System.out.println("All users saved!");

        //users.forEach(user-> user.setPassword(""));
        //return users;
    //}


    //*****************************************************************

   // @GetMapping("/header")
    //public String getHeader(@RequestHeader("My-Header")String myHeader){
        //return  "Your header is" +myHeader;
   // }


}
