package com.am.dev3.sample.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping(value = "/sample")
    public ResponseEntity<String> getSample(){

        return ResponseEntity.ok(sampleService.get());
    }

    @GetMapping(value = "/healthcheck")
    public ResponseEntity<String> healthcheck(){

        return ResponseEntity.ok("ok");
    }
}
