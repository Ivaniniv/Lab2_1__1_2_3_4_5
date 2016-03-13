package Lab2_1__1_2_3_4_5;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Alex on 12.02.2016.
 */
public class Creator {
    public static Computer[] pc = new Computer[2];

    public static void in() throws IOException {

        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
            Computer comp = new Computer();
            System.out.println("Manufacturer");
            comp.satManufacturer("" + scanner.next());
            System.out.println("SerialNumber");
            comp.satSerialNumber(scanner.nextInt());
            System.out.println("QuantityCPU");
            comp.satQuantityCPU(scanner.nextInt());
            System.out.println("Price");
            comp.satPrice((float)(Math.random()*100));
            System.out.println("FrequencyCPU");
            comp.satFrequencyCPU(scanner.nextInt());
            pc[j] = comp;

        }

    }
}



