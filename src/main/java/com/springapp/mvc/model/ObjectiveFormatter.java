package com.springapp.mvc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class ObjectiveFormatter implements Formatter<Objective> {

    @Autowired
    ObjectiveRepository objectiveRepository;

    public String print(Objective objective, Locale locale) {
        return null;
    }

    public Objective parse(String objectiveId, Locale locale) throws ParseException {
        return objectiveRepository.findOne(Long.valueOf(objectiveId));
    }
}
