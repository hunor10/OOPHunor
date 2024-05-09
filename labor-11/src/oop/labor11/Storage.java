package oop.labor11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Storage {
    private List<Product> productList = new ArrayList<>();

    public Storage(String filename) {

        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                productList.add(new Product(Integer.parseInt(items[0].trim()), items[1].trim(), Integer.parseInt(items[2].trim()), Integer.parseInt(items[3].trim())));

            }
            Collections.sort(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int update(String filename) {
        int modifiedproduct = 0;
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                int amount = Integer.parseInt(items[1].trim());
                int found = Collections.binarySearch(productList, new Product(id, "", 0, 0));
                if (found >= 0) {
                    modifiedproduct += 1;
                    productList.get(found).increaseAmount(amount);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    return modifiedproduct;}
}


