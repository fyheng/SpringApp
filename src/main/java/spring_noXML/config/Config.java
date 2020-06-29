package spring_noXML.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_noXML.service.Lenovo;
import spring_noXML.util.CPU;
import spring_noXML.util.GPU;
import spring_noXML.util.MainBoard;
import spring_noXML.util.RAM;

@Configuration
@ComponentScan("spring_noXML.service")
public class Config {

    @Bean
    @Scope("prototype")
    @Autowired
    public Lenovo lenovoP1 (MainBoard mainBoard, CPU cpu , @Qualifier("NVIDIARTX2070") GPU gpu, RAM ram){
        return new  Lenovo(mainBoard, cpu, gpu, ram);
    }
}
