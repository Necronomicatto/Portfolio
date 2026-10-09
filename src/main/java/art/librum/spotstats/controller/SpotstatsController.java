package art.librum.spotstats.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;




@Controller 
@RequestMapping("/api")
public class SpotstatsController {
    
    private final SpotstatsService spotstatsService;

    public SpotstatsController(SpotstatsService spotstatsService) {
        this.spotstatsService = spotstatsService;
    }
    
    @GetMapping("/me")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
}
