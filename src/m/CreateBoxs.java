package m;

import b.*;

import java.util.Scanner;

public class CreateBoxs {
    BoxSh createBoxS() {
        Scanner sc = new Scanner(System.in);
        BoxSh newBoxSh = new BoxSh();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter shampoo name");
        newBoxSh.setName(sc.next());
        System.out.println("Enter box volume");
        newBoxSh.setVolume(sc.nextInt());
        System.out.println("Enter shampoo bottle volume");
        newBoxSh.setShampooVolume(sc.nextInt());
        return newBoxSh;
    }

    BoxS createBoxSoap() {
        Scanner sc = new Scanner(System.in);
        BoxS newBoxS = new BoxS();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter soap name");
        newBoxS.setName(sc.next());
        System.out.println("Enter box volume");
        newBoxS.setVolume(sc.nextInt());
        System.out.println("Enter soap weight");
        newBoxS.setWeight(sc.nextInt());
        return newBoxS;

    }

    BoxD createBoxD() {
        Scanner sc = new Scanner(System.in);
        BoxD newBoxD = new BoxD();
        System.out.println("-------------------------------------------------------------");
        System.out.println("Enter drink name");
        newBoxD.setName(sc.next());
        System.out.println("Enter box volume");
        newBoxD.setVolume(sc.nextInt());
        System.out.println("Enter bottle volume");
        newBoxD.setBottleVolume(sc.nextInt());
        return newBoxD;
    }
}