package com.template.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateModel {

    private String template;

    @JsonIgnore
    public String getCustomTemplate() {
        return "Not exposed";
    }
}
