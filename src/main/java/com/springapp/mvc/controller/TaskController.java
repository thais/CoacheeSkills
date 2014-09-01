package com.springapp.mvc.controller;

import com.springapp.mvc.model.Task;
import com.springapp.mvc.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by thais on 9/1/14.
 */
@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public String listTask(ModelMap model) {
        model.addAttribute("task", new Task());
        model.addAttribute("tasks", taskRepository.findAll());
        return "tasks";
    }


    @RequestMapping(value = "/task/add", method = RequestMethod.POST)
    public String addTask(@ModelAttribute("task") Task task, BindingResult result) {
        taskRepository.save(task);
        return "redirect:/task";
    }


    @RequestMapping("/task/delete/{taskId}")
    public String deleteTask(@PathVariable("taskId") Long taskId) {

        taskRepository.delete(taskRepository.findOne(taskId));

        return "redirect:/task";
    }

}
