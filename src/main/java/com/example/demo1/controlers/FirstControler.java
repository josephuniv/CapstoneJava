package com.example.demo1.controlers;

import com.example.demo1.model.Person;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/First")
public class FirstControler {
    @GetMapping
    public String fun1(){
        return "111111";
    }

    @GetMapping("/users2")
    public String fun2(){
        return "22222";
    }

    @GetMapping(value = "/users3")
    public String fun3(){
        return "33333";
    }

    @GetMapping("/users4")  //http://localhost:8080/First/users4?name=vvv  //http://localhost:8080/First/users4/?name=vvv
    public String fun4(@RequestParam(value="name",defaultValue = "nn") String name) {
        return "44444" + name;
    }

    @GetMapping("/users5")
    public Person fun5() { return new Person(1,"pp"); }

    @PostMapping(value = "/users6")
    public String fun6() { return "66666"; }

}
