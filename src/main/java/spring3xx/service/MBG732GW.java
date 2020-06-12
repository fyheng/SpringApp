package spring3xx.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring3xx.util.MainBoard;

@Component()
@Scope("prototype")
public class MBG732GW implements MainBoard {
    public String getDetail() {
        return "G731GW/G731GV/G731GU (17 inch)";
    }
}
