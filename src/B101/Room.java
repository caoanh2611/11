/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B101;

import java.util.*;
import java.text.*;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;
    Date checkindate;
    Date checkoutdate;

    public Room() {
    }

    public Room(String id, String name, double baseCost, Date checkindate, Date checkoutdate) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
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

    public Date getCheckindate() {
        return checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
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

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    @Override
    public abstract double calculateCost();

    public void enter() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter id  room : ");
        this.id = s.nextLine();
        System.out.print("Enter id  name : ");
        this.name = s.nextLine();
        System.out.print("Enter id  baseCost : ");
        this.baseCost = s.nextDouble();
        s.hasNextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter checkindate: ");
            String star = s.nextLine();
            System.out.print("Enter checkoutdate: ");
            String end = s.nextLine();
            try {
                this.checkindate = df.parse(star);
                this.checkoutdate = df.parse(end);
                break;
            } catch (Exception e) {
                System.out.println("findnot !");
            }
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Id room : " + id);
        System.out.println("Name room : " + name);
        System.out.println("BaseCost room : " + baseCost);
        System.out.println("Id room : " + df.format(checkindate));
        System.out.println("Id room : " + df.format(checkoutdate));
    }

    public long dayStays() {
        if (this.checkindate != null && this.checkoutdate != null) {
            long days = this.checkoutdate.getTime() - this.checkindate.getTime();
            return days / (1000 * 60 * 60 * 24);
        } else {
            System.out.println("Check in of Check out not find !");
            return 0;
        }
    }

    public void update() {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter id  name : ");
        this.name = s.nextLine();
        System.out.print("Enter id  baseCost : ");
        this.baseCost = s.nextDouble();
        s.hasNextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        while (true) {
            System.out.print("Enter checkindate: ");
            String star = s.nextLine();
            System.out.print("Enter checkoutdate: ");
            String end = s.nextLine();
            try {
                this.checkindate = df.parse(star);
                this.checkoutdate = df.parse(end);
                break;
            } catch (Exception e) {
                System.out.println("findnot !");
            }
        }
    }
}
