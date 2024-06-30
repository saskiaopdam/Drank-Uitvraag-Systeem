package nl.duo.dus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreferenceController {
    @GetMapping("/preference")
    public String getPreference() {
        return "Sterke koffie met een rietje";
    }
}
