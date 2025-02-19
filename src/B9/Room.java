/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9;

import java.util.Scanner;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public abstract double calculate();

    public void input() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id room : ");
        this.id = s.nextLine();

        System.out.print("Enter name room : ");
        this.name = s.nextLine();

        System.out.print("Enter basecost: ");
        this.baseCost = s.nextDouble();

    }

    @Override
    public void displayDetails() {
        System.out.print("id room : " + id);

        System.out.print(" name room : " + name);

        System.out.print(" basecost room: " + baseCost);

    }

    public void update() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter name room : ");
        this.name = s.nextLine();

        System.out.print("Enter basecost: ");
        this.baseCost = s.nextDouble();
    }
}
