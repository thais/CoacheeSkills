package com.springapp.mvc.controller;

import com.springapp.mvc.model.Objective;
import com.springapp.mvc.model.ObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class ObjectiveController {
    @Autowired
    private ObjectiveRepository objectiveRepository;

    @RequestMapping(value = "/objective", method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
        model.addAttribute("objective", new Objective());
        model.addAttribute("objectives", objectiveRepository.findAll());
        return "objectives";
    }

    @RequestMapping(value = "/objective/add", method = RequestMethod.POST)
    public String addObjective(@ModelAttribute("objective") Objective objective, BindingResult result) {

        objectiveRepository.save(objective);

        return "redirect:/objective";
    }

    @RequestMapping("/objective/delete/{objectiveId}")
    public String deleteObjective(@PathVariable("objectiveId") Long objectivesId) {

        objectiveRepository.delete(objectiveRepository.findOne(objectivesId));

        return "redirect:/objective";
    }
}