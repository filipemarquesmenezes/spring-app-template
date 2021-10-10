package net.trustly.demo.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import lombok.extern.slf4j.Slf4j;
import net.trustly.demo.model.TemplateModel;
import net.trustly.demo.service.TemplateService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TemplateController {

    private final TemplateService templateService;

    public TemplateController(TemplateService templateService) {
        this.templateService = templateService;
    }

    @Operation(
            summary = "Template Summary",
            parameters = {
                    @Parameter(
                            in = ParameterIn.PATH,
                            name = "template",
                            description = "Template description"),
            }
    )
    @GetMapping(value = "/template", produces = MediaType.APPLICATION_JSON_VALUE)
    public TemplateModel template() {
        return templateService.templateMessage();
    }
}
