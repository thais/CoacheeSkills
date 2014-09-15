package com.springapp.mvc.controller;

import com.springapp.mvc.model.ObjectiveRepository;
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

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private ObjectiveRepository objectiveRepository;

    @RequestMapping(value = "/task", method = RequestMethod.GET)
    public String listTask(ModelMap model) {
        model.addAttribute("task", new Task());
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("objectiveList", objectiveRepository.findAll());
        return "tasks";
    }

    @RequestMapping(value = "/task/add", method = RequestMethod.POST)
    public String addTask(@ModelAttribute("task") @Valid Task task, BindingResult result) {
        taskRepository.save(task);
        return "redirect:/task";
    }

    @RequestMapping("/task/delete/{taskId}")
    public String deleteTask(@PathVariable("taskId") Long taskId) {

        taskRepository.delete(taskRepository.findOne(taskId));

        return "redirect:/task";
    }

}
