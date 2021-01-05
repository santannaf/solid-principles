package main.com.example.solid.SingleResponsability.utils;

import main.com.example.solid.SingleResponsability.solution.RuleCalculate;
import main.com.example.solid.SingleResponsability.solution.RuleFifteenOrTwentyFivePercent;
import main.com.example.solid.SingleResponsability.solution.RuleTeenOrTwentyPercent;

public enum OfficeTwo {
    DEVELOPER(new RuleTeenOrTwentyPercent()),
    DBA(new RuleFifteenOrTwentyFivePercent());

    private final RuleCalculate ruleCalculate;

    OfficeTwo(RuleCalculate ruleCalculate) {
        this.ruleCalculate = ruleCalculate;
    }

    public RuleCalculate getRuleCalculate() {
        return this.ruleCalculate;
    }
}
