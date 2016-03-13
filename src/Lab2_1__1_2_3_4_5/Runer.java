package Lab2_1__1_2_3_4_5;

import java.io.IOException;

public class Runer {
    public static void main(String[] args) throws IOException {
        Creator.in();
        int z = 1;
        for (int i = 0; i < Creator.pc.length; i++) {
            System.out.println("\n Computer " + (z+i));
            System.out.println(Creator.pc[i].getManufacturer());
            System.out.println(Creator.pc[i].getSerialNumber());
            System.out.println(Creator.pc[i].getQuantityCPU());
            System.out.println(Creator.pc[i].getPrice());
            System.out.println(Creator.pc[i].getFrequencyCPU());
        }
        float j = 1.10f;
        float pr = 0.0f;
        for (int i = 0; i < Creator.pc.length; i++) {
            pr = Creator.pc[i].getPrice();
            pr *= j;
            Creator.pc[i].satPrice(pr);
            System.out.println("\n New Price of computer " + (z+i));
            System.out.println(Creator.pc[i].getPrice());

        }

        for (int i = 0; i < Creator.pc.length; i++) {
            System.out.println("\n Computer with new price " + (z+i));
            System.out.println(Creator.pc[i].getManufacturer());
            System.out.println(Creator.pc[i].getSerialNumber());
            System.out.println(Creator.pc[i].getQuantityCPU());
            System.out.println(Creator.pc[i].getPrice());
            System.out.println(Creator.pc[i].getFrequencyCPU());
        }
    }
}

