package congnhan.controller;

import congnhan.models.service.impl.IWorkerSer;
import congnhan.models.service.interfaceService.InterSer;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterSer interSer = new IWorkerSer();
        int choice;
        do {
            System.out.println("You choice: \n" +
                    "1. Display worker list. \n" +
                    "2. Add worker. \n" +
                    "3. Exit.");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
            }
        }while (choice != 3);
    }
}
