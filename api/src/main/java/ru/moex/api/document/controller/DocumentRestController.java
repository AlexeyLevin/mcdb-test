package ru.moex.api.document.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DocumentRestController {
    @GetMapping(path = "/hello")
    public ResponseEntity hello() {
        return ResponseEntity.ok("hello");
    }
}
