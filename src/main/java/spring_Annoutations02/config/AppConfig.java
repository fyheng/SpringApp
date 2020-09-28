package spring_Annoutations02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import spring_Annoutations02.service.FirstBean;
import spring_Annoutations02.service.SecondBean;
import spring_Annoutations02.service.ThirdBean;

@Configuration
public class AppConfig {

    /**
     * in face firstBean is init at 1 and then secondBean
     * but this we custom to set thirdBean is 1 and then secondBean
     * This is how DependsOn use for.
     */
    @Bean("firstBean")
    @DependsOn(value = {"thirdBean","secondBean"})
    public FirstBean firstBean(){
        return new FirstBean();
    }

    @Bean("secondBean")
    public SecondBean secondBean(){
        return new SecondBean();
    }

    @Bean("thirdBean")
    public ThirdBean thirdBean(){
        return new ThirdBean();
    }
}
