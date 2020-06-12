package spring_noXML.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import spring_noXML.util.*;

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

    @Autowired
    public Lenovo(MainBoard mainBoard, CPU cpu, GPU gpu, RAM ram) {
        this.mainBoard = mainBoard;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
    }

    //default constructor
    public Lenovo() {
    }

    public String getSpecs() {
        return "MainBoard: "+mainBoard.getDetail()+"\n" +
                "CPU: "+cpu.getDetail()+"\n" +
                "GPU: "+gpu.getDetail()+"\n" +
                "RAM: "+ram.getDetail()+"\n";
    }
}
