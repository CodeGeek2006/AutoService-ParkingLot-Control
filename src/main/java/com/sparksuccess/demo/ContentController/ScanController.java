package com.sparksuccess.demo.ContentController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ScanController {
    @GetMapping("/scan")
    public String scanGet() {
        return "scan";
    }
}
