/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jarvis
 */
public class Cars {
   public String carName;
   public String serialNumber;
   public String carModel;
   public String manufacturingYear;
   public String carCapacity;
   public String location;
   public String availability;
   public String certificateExpiry;
   

    public Cars(String carName, String serialNumber, String carModel, String manufacturingYear, String location,String carCapacity, String certificateExpiry, String availability) {
        this.carName = carName;
        this.carModel = carModel;
        this.serialNumber = serialNumber;
        this.manufacturingYear = manufacturingYear;
        this.carCapacity = carCapacity;
        this.location = location;
        this.availability = availability;
        this.certificateExpiry = certificateExpiry;
    }
 public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(String manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }
    public String getCarCapacity() {
        return carCapacity;
    }

    public void setCarCapacity(String carCapacity) {
        this.carCapacity = carCapacity;
    }
   
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getCertificateExpiry() {
        return certificateExpiry;
    }

    public void setCertificateExpiry(String certificateExpiry) {
        this.certificateExpiry = certificateExpiry;
    }

   
    
}
