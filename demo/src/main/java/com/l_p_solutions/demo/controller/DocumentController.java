package com.l_p_solutions.demo.controller;

import java.util.List;

import com.l_p_solutions.demo.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
class DocumentController {
    @Autowired
    private DocumentService documentService;

    @GetMapping(value = "/")
    public String init( BindingAwareModelMap model) {
      /*  model.addAttribute("name", "Szeifert Péter");
        model.addAttribute("email", "email");
        model.addAttribute("repo_url", "repo_url");*/
       // model.addAttribute("name","name");
        documentService.populateModel(model);
        return "index";
    }

}