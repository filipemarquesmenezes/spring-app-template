package com.template.service;

import lombok.extern.slf4j.Slf4j;
import com.template.model.TemplateModel;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TemplateService {

    public TemplateModel templateMessage() {
        return new TemplateModel("Service message template");
    }

}
