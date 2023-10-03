/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv22weatherinyear;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    private final Scanner scanner;

    public App() {
        scanner = new Scanner(System.in);
    }
    
    public void run() {
        System.out.println("---Weather in year---");
        boolean repeat = true;
        do{
          System.out.println("задачи: ");
          System.out.println("0. выход из программы");
          System.out.println("1. Погода в указанную дату");
          System.out.println("2. дни когда была самая теплая и самая холодная погода");
          System.out.println("3. Средняя температура за указанный месяц");
          System.out.println("4. Средняя температура по всем месяцам");
          System.out.print("выберите номер задачи: ");
          int task = scanner.nextInt();scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выход из программы");
                    repeat= false;
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                    
                default:
                    System.out.println("выберите номер задачи из списка");
            }
        }while(repeat);
        System.out.println("---end---");
    }
    
}
