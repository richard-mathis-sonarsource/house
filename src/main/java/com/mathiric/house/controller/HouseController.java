package com.mathiric.house.controller;


import com.mathiric.house.domain.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
public class HouseController {

    public HouseController() {
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return newEmployee;
    }

    // Single item

    @GetMapping("/employees/{id}")
    Employee one(@PathVariable Long id) {

        return new Employee("toto", "tre");
    }

}