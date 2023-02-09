package homework;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Laptop {
    private String brandName;
    private String modelName;
    private LocalDate manufactureDate;
    private String cpu;
    private int ram;
    private int hardDiskSize;
    private String systemOS;
    private String color;

    public Laptop(String brandName, String modelName, LocalDate manufactureDate, String cpu, int ram, int hardDiskSize,
            String systemOS, String color) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.manufactureDate = manufactureDate;
        this.cpu = cpu;
        this.ram = ram;
        this.hardDiskSize = hardDiskSize;
        this.systemOS = systemOS;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getSystemOS() {
        return systemOS;
    }

    public void setSystemOS(String systemOS) {
        this.systemOS = systemOS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // public void addVaccination(Vaccination vaccination) {
    // this.vaccinations.add(vaccination);
    // }

    @Override
    public String toString() {
        return "Laptop{" + "brandName='" + brandName + '\'' +
                ", modelName='" + modelName + '\'' +
                ", manufactureDate=" + manufactureDate + 
                ", cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hardDiskSize='" + hardDiskSize + '\'' +
                ", systemOS='" + systemOS + '\'' +
                ", color='" + color +
                '}';
    }

}
