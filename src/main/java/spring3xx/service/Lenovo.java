package spring3xx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring3xx.util.*;

@Component
@Scope("prototype")
public class Lenovo implements Computer {
    private MainBoard mainBoard;
    private CPU cpu;
    private GPU gpu;
    private RAM ram;

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    //default constructor
    public Lenovo() {
    }


    /**
     * bean pass value to class my constructor
     * Qualifier("---") set specifet bean
     * Autowired use to sean all properties in parameter add to bean
     */

    @Autowired
    public Lenovo(MainBoard mainBoard, CPU cpu, @Qualifier("NVIDIAGTX1660Ti") GPU gpu, RAM ram) {
        this.mainBoard = mainBoard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    public String getSpecs() {
        return "MainBoard: "+mainBoard.getDetail()+"\n" +
                "CPU: "+cpu.getDetail()+"\n" +
                "GPU: "+gpu.getDetail()+"\n" +
                "RAM: "+ram.getDetail()+"\n";
    }
}
