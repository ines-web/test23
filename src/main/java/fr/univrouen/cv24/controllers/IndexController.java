package fr.univrouen.cv24.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class IndexController {
@GetMapping("/")
public String index() {
return "Hello cv24 !";
}
}