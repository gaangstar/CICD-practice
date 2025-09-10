package org.example.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("test 6");
    }
}
