package com.albab.controller;


import com.albab.dto.CombineRuleRequest;
import com.albab.entity.Node;
import com.albab.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/rules")
public class RuleController {

    @Autowired
    private RuleService ruleService;

    @PostMapping("/create")
    public Node createRule(@RequestBody String ruleString) {
        return ruleService.createRule(ruleString);
    }

    @PostMapping("/combine")
    public Node combineRules(@RequestBody CombineRuleRequest request, @RequestParam String operator) {
        return ruleService.combineRules(request.getRule1(), request.getRule2(), operator);
    }

    @PostMapping("/evaluate")
    public boolean evaluateRule(@RequestBody Node rule, @RequestBody Map<String, Object> data) {
        return ruleService.evaluateRule(rule, data);
    }
}
