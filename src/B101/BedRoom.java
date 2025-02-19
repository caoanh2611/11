/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B101;

import java.util.Date;
import java.util.Scanner;

public class BedRoom extends Room {

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public BedRoom(int numberOfBeds, String id, String name, double baseCost, Date checkindate, Date checkoutdate) {
        super(id, name, baseCost, checkindate, checkoutdate);
        this.numberOfBeds = numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    @Override
    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    @Override
    public Date getCheckindate() {
        return checkindate;
    }

    @Override
    public Date getCheckoutdate() {
        return checkoutdate;
    }

   @Override
    public void enter() {
        Scanner s = new Scanner(System.in);
        super.enter();
        System.out.print("Enter numberOfBeds room :  ");
        this.numberOfBeds = s.nextInt();

    }
    @Override
    public double calculateCost() {
        if (numberOfBeds >+ 3) {
            return this.getBaseCost() * 1.1 * this.dayStays();
        }
        return this.getBaseCost() * this.dayStays();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("numberOfBeds room : " + numberOfBeds);
        System.out.println("calculateCost room : " + calculateCost());
    }

    @Override
    public void update() {
        Scanner s = new Scanner(System.in);
        super.update();
        System.out.print("Enter numberOfBeds room :  ");
        this.numberOfBeds = s.nextInt();
    }
}
