package com.sparksuccess.demo.ContentController;


import com.sparksuccess.demo.model.Car;
import com.sparksuccess.demo.repository.CarRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CarRepos repo;
    @GetMapping("/")
    public String homeGet(@RequestParam(name="pageNum" ,required=false , defaultValue="0")String pageNum ,
                          Model model) {
      return "home";
    }
    @GetMapping("/search")
    public String homePost(  @RequestParam(name = "model") String vehicleModel,
                             @RequestParam(name = "year") String year,
                             @RequestParam(name = "color") String color,
                             @RequestParam(name = "body") String body,
                             Model model
                             ){
        // 01XX444XX777XX002
        String queryVinCode = body+"XX"+color+"XX"+vehicleModel+"XX"+year;
        List<Car> carList = repo.findByCustomVIN(queryVinCode);

        model.addAttribute("cars", carList);
        //Repository search handles
        return "home";
    }
}
