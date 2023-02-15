package com.allforland.template.restful.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping()
    public ResponseEntity<?> testWithNon() {
        HashMap<String, Object> data = new HashMap<>();
        data.put("id", "some_id");
        data.put("pw", "some_pw");
        return ResponseEntity.ok(data);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> testWithParam(@RequestBody HashMap<String, Object> body) {
        HashMap<String, Object> data = new HashMap<>();
        data.put("body", body.toString());
        return ResponseEntity.ok(data);
    }
}
