package Lab2_1__1_2_3_4_5;

/**
 * Created by Alex on 12.02.2016.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public void satManufacturer(String i) {
        manufacturer = i;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void satSerialNumber(int i) {
        serialNumber = i;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
    public void satPrice(float i) {
        price = i;
    }

    public float getPrice() {
        return price;
    }
    public void satQuantityCPU(int i) {
        quantityCPU = i;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }
    public void satFrequencyCPU(int i) {
        frequencyCPU = i;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }
}

