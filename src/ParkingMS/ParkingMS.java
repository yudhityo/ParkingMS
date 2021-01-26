/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingMS;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author fadhilmda-PC
 */
public class ParkingMS {

    public double timeIn, timeOut, duration, price, res;
    double x = 5.00;
    double y = 4.00;
    double z = 3.00;

    ParkingMS(double in, double out) {
        timeIn = in;
        timeOut = out;
    }

    public double Calculate() {
        duration = timeOut - timeIn;

        if (duration <= 1) {
            price = x;
        } else if (duration <= 2) {
            price = x + y;
        } else if (duration > 3) {
            res = duration - 3;
            duration = res * z;
            price = x + y + duration;

            DecimalFormat df = new DecimalFormat("0.00");

            JOptionPane.showMessageDialog(null, "Price: RM" + df.format(price));
        } 
        return price;
    }

    public static void main(String[] args) {
        ParkingMS calc = new ParkingMS(9.00, 15.00);
        calc.Calculate();

        ParkingMS calc2 = new ParkingMS(13.00, 15.00);
        calc2.Calculate();

        ParkingMS calc3 = new ParkingMS(15.00, 15.00);
        calc3.Calculate();

        ParkingMS calc4 = new ParkingMS(15.00, 18.00);
        calc4.Calculate();
    }

    //getter setter
//    public double getTimeIn() {
//        return timeIn;
//    }
//
//    public void setTimeIn(double timeIn) {
//        this.timeIn = timeIn;
//    }
//
//    public double getTimeOut() {
//        return timeOut;
//    }
//
//    public void setTimeOut(double timeOut) {
//        this.timeOut = timeOut;
//    }
//
//    public double getDuration() {
//        return duration;
//    }
//
//    public void setDuration(double duration) {
//        this.duration = duration;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public double getRes() {
//        return res;
//    }
//
//    public void setRes(double res) {
//        this.res = res;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    public double getZ() {
//        return z;
//    }
//
//    public void setZ(double z) {
//        this.z = z;
//    }

}
