package com.example.demo.Controller;

import com.example.demo.DTO.TestRequestDTO;
import com.example.demo.DTO.TestResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/test")
    public TestResponseDTO doTest(@RequestBody TestRequestDTO testRequestDTO) {
        System.out.println("request");
        TestResponseDTO testResponseDTO = new TestResponseDTO();
        testResponseDTO.setData("OK");
        testResponseDTO.setCode("200");
        return testResponseDTO;
    }
}
