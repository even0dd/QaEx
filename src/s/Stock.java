package s;

import b.*;

import java.util.ArrayList;

public class Stock {

    private int volume = 50;
    private ArrayList<Box> boxs = new ArrayList<Box>();

    public ArrayList<Box> setGoods(Box box, int amount) {
        ArrayList<Box> boxes = new ArrayList<>();
        if (box == null) {
            throw new NullPointerException();
        } else {
            for (int i = 0; i < amount; i++)
                if (volume > 0) {
                    boxs.add(box);
                    volume -= box.getVolume();
                } else {
                    boxes.add(box);
                }
        }
        return boxes;
    }

    public void deleteGoods(int amount, Box box) {
        for (int i = 0; i < amount; i++) {
            if (boxs.get(i).getType().equals(box.getType())) {
                boxs.remove(i);
                volume += boxs.get(i).getVolume();
                System.out.println("Found");
            }
        }
    }

    public void showTypes() {
        int countShampoo = 0;
        int countSoap = 0;
        int countDrink = 0;
        for (int i = 0; i < boxs.size(); i++) {
            if (boxs.get(i).getType().equals("Box with shampoo")) {
                countShampoo++;
            }
            if (boxs.get(i).getType().equals("Bos with soap")) {
                countSoap++;
            }
            if (boxs.get(i).getType().equals("Block with drinks")) {
                countDrink++;
            }
        }
        System.out.println("Shampoo's = " + countShampoo);
        System.out.println("Soap = " + countSoap);
        System.out.println("Drink's = " + countDrink);
    }

    @Override
    public String toString() {
        return
                "Volume=" + volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public ArrayList<Box> getBoxs() {
        return boxs;
    }

    public void setBoxs(ArrayList<Box> boxs) {
        this.boxs = boxs;
    }
}