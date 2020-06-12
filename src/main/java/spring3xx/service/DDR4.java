package spring3xx.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring3xx.util.RAM;

@Component
@Scope("prototype")
public class DDR4 implements RAM {
    public String getDetail() {
        return "DDR4 2666MHz SDRAM Up to 32GB";
    }
}
