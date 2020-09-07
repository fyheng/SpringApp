package spring_Annoutations02.service;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstBean {
    @Autowired
    private SecondBean secondBean;

    @Autowired
    private ThirdBean thirdBean;

    public FirstBean() {
        System.out.println("FirstBean Init vai Constructor");
    }

    public void populateBeans(){
        secondBean.display();
        thirdBean.display();
    }
}
