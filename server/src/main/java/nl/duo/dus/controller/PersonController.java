package nl.duo.dus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/person")
    public String getPerson() {
        return "Ik ben Johan Cruijff";
    }
}
