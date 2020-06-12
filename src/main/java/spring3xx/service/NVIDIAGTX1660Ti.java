package spring3xx.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring3xx.util.GPU;

@Component
@Scope("prototype")
public class NVIDIAGTX1660Ti implements GPU {

    public String getDetail() {
        return "NVIDIA® GeForce GTX™ 1660Ti with 6GB GDDR6 VRAM";
    }
}
