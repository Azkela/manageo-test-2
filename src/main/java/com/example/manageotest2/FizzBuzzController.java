package com.example.manageotest2;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FizzBuzzController {
    private final FizzBuzz fizzBuzz;

    @GetMapping("/fizzbuzz/{number}")

    public List<String> generateFizzBuzz(@PathVariable("number") int number) {
        List<String> results = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            results.add(fizzBuzz.fizzBuzz(i));
        }
        return results;
    }
}
