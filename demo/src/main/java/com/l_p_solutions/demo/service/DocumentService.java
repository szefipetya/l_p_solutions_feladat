package com.l_p_solutions.demo.service;

import com.l_p_solutions.demo.model.Solution;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;

@Service
public class DocumentService {
    public void populateModel(BindingAwareModelMap model) {
        Solution solution = new Solution("szefi.web@gmail.com", "Szeifert Péter", "github");
        model.addAttribute("solution",solution);

    }
}
