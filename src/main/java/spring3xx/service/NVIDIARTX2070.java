package spring3xx.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring3xx.util.GPU;

@Component
@Scope("prototype")
//@Primary // to set default
public class NVIDIARTX2070 implements GPU {
    public String getDetail() {
        return "NVIDIA® GeForce RTX™ 2070 with 8GB GDDR6 VRAM";
    }
}
