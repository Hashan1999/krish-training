/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HASHA
 */
public class Computer {

    private final String RAM;
    private final String model;
    private final String gpu;
    private final String ssd;
    private final String processor;
    private final String brand;

    public Computer(ComputerBuilder computerBuilder) {

        this.processor = computerBuilder.processor;
        this.ssd = computerBuilder.ssd;
        this.gpu = computerBuilder.gpu;
        this.RAM = computerBuilder.RAM;
        this.model = computerBuilder.model;
        this.brand = computerBuilder.brand;
    }

    public String getRAM() {
        return RAM;
    }

    public String getModel() {
        return model;
    }

    public String getGpu() {
        return gpu;
    }

    public String getSsd() {
        return ssd;
    }

    public String getProcessor() {
        return processor;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        String output = "Brand :" + getBrand() + "\n"
                + "Model : " + getModel() + "\n"
                + "Gpu : " + getGpu() + "\n"
                + "SSD : " + getSsd() + "\n"
                + "Processor : " + getProcessor() + "\n"
                + "RAM : " + getRAM() + "\n";

        return output;

    }

    public static class ComputerBuilder {

        private String RAM;
        private String model;
        private String gpu;
        private String ssd;
        private String processor;
        private String brand;

        public ComputerBuilder() {
           
        }

        public Computer build() {
            Computer computer = new Computer(this);
            return computer;
        }

        public ComputerBuilder setRAM(String ram) {
            this.RAM = ram;
            return this;
        }

        public ComputerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setSsd(String ssd) {
            this.ssd = ssd;
            return this;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

    }

}
