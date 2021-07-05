package com.example.cddteam;

import java.util.Scanner;

public class Pharmacy {
    // initialization variable
    int number, queue;
    String name, need;

    Pharmacy next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.print("Input Number        : ");
        number = in.nextInt();
        System.out.print("Input Name      : ");
        name = str.nextLine();
        System.out.print("Input Necessity : ");
        need = str.nextLine();
        System.out.print("Input Queue     : ");
        queue = in.nextInt();
        next = null;
    }

    public void read(){
        System.out.println("|| "+number+" \t|| "+name+" \t|| "+need+" \t|| "+queue+" \t||");
    }

    public static void main(String[] args){
        int Menu = 0;
        linked que = new linked();
        while(Menu != 4){
            System.out.print("1. Medicine Queue\n2. View Queue\n3. Queue Date\n4.Exit Queue\n : ");
            Menu = in.nextInt();
            if
                    (Menu == 1) que.MedicineQueue();
            else if
                    (Menu == 2) que.ViewQueue();
            else if
                    (Menu == 3) que.DateQueue();
            else if
                    (Menu == 4) que.ExitQueue();
            else
                System.out.println("~~~False~~~");
            System.out.println("");
        }
    }
}

class linked {
    Pharmacy head, tail;
    public linked() {
        head = null;
        tail = null;
    }

    public void MedicineQueue(){
        Pharmacy element = new Pharmacy();
        element.input();
        if
                (head == null) head = element;
        else
                tail.next = element;
        tail = element;
    }

    public void ViewQueue(){
        if
                (head == null)
            System.out.println("~~~View Queue~~~");
        else{
            System.out.println("|| Id \t|| Name \t|| Necessity \t|| Queue \t||");
            for (Pharmacy fer = head; fer != null; fer = fer.next) fer.read();
        }
    }

    public void DateQueue(){
        if
        (tail == null)
            System.out.println("~~~Date Queue~~~");
        else{
            System.out.println("Select Date Queue : " + tail.number);
            tail = tail.next;
        }
    }

    public void ExitQueue(){
        if
        (head == null)
            System.out.println("~~~Exit~~~");
        else{
            System.out.println("Exit data with Id : " + head.number);
            head = head.next;
        }
    }
}
