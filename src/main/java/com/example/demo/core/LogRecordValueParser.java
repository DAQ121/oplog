package com.example.demo.core;

import lombok.Data;
import org.springframework.context.expression.AnnotatedElementKey;


public class LogRecordValueParser {

    LogRecordEvaluationContext logRecordEvaluationContext;

    LogRecordExpressionEvaluator expressionParser;

    public LogRecordValueParser(LogRecordEvaluationContext logRecordEvaluationContext, LogRecordExpressionEvaluator expressionParser) {
        this.logRecordEvaluationContext = logRecordEvaluationContext;
        this.expressionParser = expressionParser;
    }

    public String parseExpression(String expression, AnnotatedElementKey methodKey){
        System.out.println("methodKey.getClass().getSimpleName() = " + methodKey.getClass().getSimpleName());
        return expressionParser.parseExpression(expression, methodKey,logRecordEvaluationContext);
    }

    public LogRecordEvaluationContext getLogRecordEvaluationContext() {
        return logRecordEvaluationContext;
    }

    public void setLogRecordEvaluationContext(LogRecordEvaluationContext logRecordEvaluationContext) {
        this.logRecordEvaluationContext = logRecordEvaluationContext;
    }

    public LogRecordExpressionEvaluator getExpressionParser() {
        return expressionParser;
    }

    public void setExpressionParser(LogRecordExpressionEvaluator expressionParser) {
        this.expressionParser = expressionParser;
    }
}
