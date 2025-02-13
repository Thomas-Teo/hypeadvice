package com.example.hypeadvice.domain.bean;

import com.example.hypeadvice.domain.entity.Advice;
import com.example.hypeadvice.domain.service.AdviceService;
import com.example.hypeadvice.domain.vo.AdviceListVO;
import com.example.hypeadvice.domain.vo.AdviceVO;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class AdviceIdBean extends Bean {

    @Autowired AdviceService adviceService;

    private Advice advice = new Advice();
    private AdviceVO adviceVO;

    public void initBean() {
        advice = new Advice();
    }

    public void buscar() {
        try {
            this.adviceVO = adviceService.buscar_id(advice);
        } catch (Exception e) {
            addMessageError(e);
        }
    }

    public AdviceVO getAdviceVO() {
        return adviceVO;
    }

    public void setAdviceVO(AdviceVO adviceVO) {
        this.adviceVO = adviceVO;
    }

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
