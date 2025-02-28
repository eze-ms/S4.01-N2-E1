package cat.itacademy.s04.t01.n02.controller;

import cat.itacademy.s04.t01.n02.exceptions.CustomException;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name) {
        if ("error".equalsIgnoreCase(name)) {
            throw new CustomException("Este es un error de prueba");
        }
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }

    @GetMapping({"/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        if ("error".equalsIgnoreCase(name)) {
            throw new CustomException("Este es un error de prueba");
        }
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }
}
