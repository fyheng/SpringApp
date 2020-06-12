package spring_noXML.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_noXML.util.GPU;

@Component
@Scope("prototype")
@Primary
public class NVIDIAGTX1660Ti implements GPU {

    public String getDetail() {
        return "NVIDIA® GeForce GTX™ 1660Ti with 6GB GDDR6 VRAM";
    }
}
