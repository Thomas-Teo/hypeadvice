package com.example.hypeadvice.domain.dto;

import java.util.Date;

public class SlipDTO {
    private Long id;
    private String advice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

}
