package com.example.demo1.controlers;

import com.example.demo1.model.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/First")    // Or: @RequestMapping(path = "/First")
public class FirstControler {
    @GetMapping
    public String fun1(){
        return "1111";
    }

    @GetMapping("/users2")    // Or:  @GetMapping(value = "/users2")
    public String fun2(){
        return "2222";
    }

    @GetMapping("/users3")  //http://localhost:8080/First/users4?name=vvv  //http://localhost:8080/First/users4/?name=vvv
    public String fun3(@RequestParam(value="name",defaultValue = "dddd") String name) {
        return "3333" + name;
    }

    @GetMapping("/users4")   // Return Object
    public Person fun4() { return new Person(1,"pppp"); }

    @GetMapping("/users44")   // Return List of objects
    public List<Person> fun44() { return List.of(new Person(1,"pppp")); }

    @GetMapping(value = "/users444")   // Return List (array)
    public List<String> fun444() { return List.of("4444","LLLL"); }

    @PostMapping(value = "/users5")   // Post
    public String fun5() { return "5555"; }

}
