package in.projects.hard.limitsservice.controller;

import in.projects.hard.limitsservice.configuration.LimitConfigurations;
import in.projects.hard.limitsservice.model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hardeep Singh
 */
@RestController
public class LimitsConfigurationController {

    @Autowired
    private LimitConfigurations limitConfigurations;

    @GetMapping(value = "/limits")
    public LimitConfiguration retrieveLimitsFromConfiguration(){
        return new LimitConfiguration(limitConfigurations.getMaximum(), limitConfigurations.getMinimum());
    }
}
