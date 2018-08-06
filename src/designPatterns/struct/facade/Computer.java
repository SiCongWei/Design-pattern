package designPatterns.struct.facade;

import java.util.concurrent.CountDownLatch;

public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;


    public Computer(){
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("start the computer");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start the computer finished");
    }

    public void shutdown(){
        System.out.println("shutdown the computer");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("shutdown the computer finished");
    }


    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
