package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

//    @Autowired
//    @Qualifier("greetingServiceImpl")
//    private GreetingService greetingService;
//
//    @Autowired
//    private FarewellService farewellService;
//
//    @GetMapping("/greet")
//    public String greet() {
//        return greetingService.getGreeting();
//    }
//
//    @GetMapping("/farewell")
//    public String farewell() {
//        return farewellService.getFarewell();
//    }

    private final GreetingService greetingService;
    private final LazyService lazyService;

    @Autowired
    public GreetingController(@Qualifier("greetingServiceImpl") GreetingService greetingService, LazyService lazyService) {
        this.greetingService = greetingService;
        this.lazyService = lazyService;
    }

    @GetMapping("/greet")
    public String greet() {
        return greetingService.getGreeting();
    }

    @GetMapping("/use-lazy")
    public String useLazy() {
        return "Using Lazy Service!";
    }
}

