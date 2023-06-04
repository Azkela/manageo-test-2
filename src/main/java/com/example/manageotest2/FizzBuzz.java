package com.example.manageotest2;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzz {

    public String fizzBuzz(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Fizz");
        }
        if (number % 5 == 0) {
            result.append("Buzz");
        }
        if (result.length() == 0) {
            result.append(number);
        }

        return result.toString();
    }
}
