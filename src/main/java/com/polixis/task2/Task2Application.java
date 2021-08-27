package com.polixis.task2;

import com.polixis.task2.service.BitSetUniqueIpCounter;
import com.polixis.task2.service.UniqueIpCounter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Task2Application {

    public static void main(String[] args) {
        System.out.println("Enter file address: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        if (fileName == null || fileName.trim().isEmpty()) {
            System.out.println("Wrong arguments. Use '-file file_name' to specify file for processing");
            return;
        }

        UniqueIpCounter counter = new BitSetUniqueIpCounter();
        long numberOfUniqueIp = counter.countUniqueIp(fileName);
        if (numberOfUniqueIp != -1) {
            System.out.println("Found " + numberOfUniqueIp + " unique IP's");
        } else {
            System.out.println("Some errors here. Check log for details.");
        }
    }

}
