package com.mytests.thymeleaf.thymeleafnestedeach;

import com.mytests.thymeleaf.thymeleafnestedeach.model.DataRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 3/31/2023.</p>
 * <p>Project: thymeleaf-nested-each</p>
 * *
 */
@Controller
public class MyController {

    private final DataRepository dataRepository;

    public MyController(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    @RequestMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("dataList",dataRepository.getAllData());
        return "home";
    }
}
