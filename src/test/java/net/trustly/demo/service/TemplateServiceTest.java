package net.trustly.demo.service;

import net.trustly.demo.model.TemplateModel;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TemplateServiceTest {

    private TemplateService templateService = new TemplateService();

    @Test
    void test() {
        //Arrange

        //Act
        final TemplateModel templateModel = templateService.templateMessage();

        //Assert
        assertThat("Template message is null", templateModel.getTemplate(), is("Service message template"));
    }
}
