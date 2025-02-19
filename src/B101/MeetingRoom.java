/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B101;

import java.util.Date;
import java.util.Scanner;

public class MeetingRoom extends Room {

    private int Capactiy;

    public MeetingRoom() {
    }

    public MeetingRoom(int Capactiy) {
        this.Capactiy = Capactiy;
    }

    public MeetingRoom(int Capactiy, String id, String name, double baseCost, Date checkindate, Date checkoutdate) {
        super(id, name, baseCost, checkindate, checkoutdate);
        this.Capactiy = Capactiy;
    }

    public int getCapactiy() {
        return Capactiy;
    }

    @Override
    public Date getCheckindate() {
        return checkindate;
    }

    @Override
    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCapactiy(int Capactiy) {
        this.Capactiy = Capactiy;
    }

    @Override
    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    @Override
    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    @Override
    public void enter() {
        Scanner s = new Scanner(System.in);
        super.enter();
        System.out.print("Enter Capactiy room :  ");
        this.Capactiy = s.nextInt();

    }

    @Override
    public double calculateCost() {
        if (Capactiy > 50) {
            return this.getBaseCost() * 1.2 * this.dayStays();
        }
        return this.getBaseCost() * this.dayStays();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Capactiy room : " + Capactiy);
        System.out.println("calculateCost room : " + calculateCost());
    }

    @Override
    public void update() {
        Scanner s = new Scanner(System.in);
        super.update();
        System.out.print("Enter Capactiy room :  ");
        this.Capactiy = s.nextInt();
    }
}
