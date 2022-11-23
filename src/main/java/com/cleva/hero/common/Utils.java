package com.cleva.hero.common;

import com.cleva.hero.common.Constants;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    private Utils() {throw new IllegalCallerException();}

    public static List<String> readFile(String path) {
        List list = new ArrayList();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNext()){
                list.add(scanner.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
