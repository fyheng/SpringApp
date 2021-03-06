package spring_noXML.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_noXML.util.CPU;

@Component
@Scope("prototype")
public class Corei9 implements CPU {
    public String getDetail() {
         return "Intel® Core™ i9-9880H";
    }
}
