package spring_noXML.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_noXML.util.MainBoard;

@Component
@Scope("prototype")
public class MBG732GW implements MainBoard {
    public String getDetail() {
        return "G731GW/G731GV/G731GU (17 inch)";
    }
}
