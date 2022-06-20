package m;

import b.*;
import s.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu extends CreateBoxs {
    private static final Scanner in = new Scanner(System.in);
    private ArrayList<Stock> stocks = new ArrayList<>();

    public void mainMenu() {
        while (true) {
            int mainMenuItem;
            line();
            System.out.println("Select menu item");
            System.out.println(" 1) Work with goods");
            System.out.println(" 2) Work with storages");
            System.out.println(" 0) Exit program");
            mainMenuItem = in.nextInt();
            if (mainMenuItem == 1) {
                workWithP();
            } else if (mainMenuItem == 2) {
                workWithSt();
            } else if (mainMenuItem == 0) {
                line();
                System.out.println("Exiting program...");
                System.exit(0);
            } else {
                line();
                System.out.println("Error. Enter number from menu!!!");
            }
        }
    }


    private void workWithP() {
        while (true) {
            int mainMenuItem;
            line();
            System.out.println("Select a menu item in working with products");
            System.out.println(" 1) Adding goods to the warehouse");
            System.out.println(" 2) Adding a group of goods to the warehouse");
            System.out.println(" 3) Removing an item from a warehouse");
            System.out.println(" 4) Deleting a group of goods from the warehouse");
            System.out.println(" 5) Show product types and quantities");
            System.out.println(" 0) Exit to the main menu");
            mainMenuItem = in.nextInt();
            if (mainMenuItem == 1) {
                setGoodsWarehouse(0);
            } else if (mainMenuItem == 2) {
                int amountItem;
                line();
                System.out.println("Enter amount");
                amountItem = in.nextInt();
                setGoodsWarehouse(amountItem);
            } else if (mainMenuItem == 3) {
                deleteGoodsWarehouse(1);
            } else if (mainMenuItem == 4) {
                int amountItem;
                line();
                System.out.println("Enter amount");
                amountItem = in.nextInt();
                deleteGoodsWarehouse(amountItem);
            } else if (mainMenuItem == 5) {
                showWarehousesTypes();
            } else if (mainMenuItem == 0) {
                mainMenu();
            }
        }
    }

    private void showWarehousesTypes() {
        int setGoodsItem;
        while (true) {
            line();
            System.out.println("Choose a warehouse(1,2,3,...)");
            setGoodsItem = in.nextInt();
            stocks.get(setGoodsItem - 1).showTypes();
            workWithP();
        }
    }

    private void deleteGoodsWarehouse(int amountItem) {
        int setGoodsItem;
        while (true) {
            line();
            System.out.println("Choose a warehouse(1,2,3,...)");
            setGoodsItem = in.nextInt();
            deleteB(setGoodsItem - 1, amountItem);
        }
    }

    private void deleteB(int setGoodsItem, int amountItem) {
        int setBoxItem;
        while (true) {
            line();
            System.out.println(" 1) Shampoo");
            System.out.println(" 2) Soap");
            System.out.println(" 3) Drinks");
            setBoxItem = in.nextInt();
            if (setBoxItem == 1) {
                Box boxS = new BoxSh();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxS);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else if (setBoxItem == 2) {
                Box boxSoap = new BoxS();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxSoap);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else if (setBoxItem == 3) {
                Box boxDrinks = new BoxD();
                stocks.get(setGoodsItem).deleteGoods(amountItem, boxDrinks);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else {
                error();
            }
        }
    }

    private void setGoodsWarehouse(int amountItem) {
        int setGoodsItem;
        while (true) {
            line();
            System.out.println("Choose a warehouse(1,2,3,...)");
            setGoodsItem = in.nextInt();
            setB(setGoodsItem - 1, amountItem);
        }
    }

    private void setB(int a, int amountItem) {
        int setBoxItem;
        while (true) {
            line();
            System.out.println(" 1) Shampoo");
            System.out.println(" 2) Soap");
            System.out.println(" 3) Drinks");
            setBoxItem = in.nextInt();
            if (setBoxItem == 1) {
                stocks.get(a).setGoods(createBoxS(), amountItem);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else if (setBoxItem == 2) {
                stocks.get(a).setGoods(createBoxSoap(), amountItem);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else if (setBoxItem == 3) {
                stocks.get(a).setGoods(createBoxD(), amountItem);
                System.out.println(stocks.get(0) + " " + stocks.get(1) + " " + stocks.get(2));
                workWithP();
            } else {
                error();
            }
        }
    }

    private void workWithSt() {
        while (true) {
            int mainMenuItem;
            line();
            System.out.println("Select a menu item in working with warehouses");
            System.out.println(" 1) Show a list of warehouses and goods in them");
            System.out.println(" 2) Add new warehouse");
            System.out.println(" 3) Delete warehouse");
            System.out.println(" 0) Exit to the main menu");
            mainMenuItem = in.nextInt();
            if (mainMenuItem == 1) {
                showAllS();
            } else if (mainMenuItem == 2) {
                addNewS();
            } else if (mainMenuItem == 3) {
                deleteS();
            } else if (mainMenuItem == 0) {
                mainMenu();
                break;
            } else {
                error();
            }
        }
    }

    private void showAllS() {
        for (Stock stock : stocks) {
            System.out.println("Stock " + stock);
            for (Box box : stock.getBoxs()) {
                System.out.println(box);
            }
        }
        workWithSt();
    }

    private void deleteS() {
        int delStockItem;
        line();
        System.out.println("Which warehouse do you want to delete?");
        for (int i = 0; i < stocks.size(); i++) {
            System.out.println("Stock  №" + (i + 1));
        }
        delStockItem = in.nextInt();
        stocks.remove(delStockItem - 1);
        line();
        System.out.println("Warehouse deleted!");
        workWithSt();
    }

    private void addNewS() {
        Stock stock = new Stock();
        stocks.add(stock);
        System.out.println("Warehouse added!");
        workWithSt();
    }

    public Menu(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }

    public void setStocks(ArrayList<Stock> stocks) {
        this.stocks = stocks;
    }

    public static void error() {
        System.out.println("Error");
    }

    public static void line() {
        System.out.println("-------------------------------------------------------------");
    }
}