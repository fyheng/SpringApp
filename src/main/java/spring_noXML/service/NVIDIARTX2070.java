package spring_noXML.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_noXML.util.GPU;

@Component
@Scope("prototype")
public class NVIDIARTX2070 implements GPU {
    public String getDetail() {
        return "NVIDIA® GeForce RTX™ 2070 with 8GB GDDR6 VRAM";
    }
}
