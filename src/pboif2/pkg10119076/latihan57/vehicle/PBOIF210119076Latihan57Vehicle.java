/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119076.latihan57.vehicle;

/**
 *
 * @author ACER
 * Nama : Sulthon Naufal Akmal
 * Kelas : IF2
 * NIM : 10119076
 * Deskripsi : Vehicle
 */

public class PBOIF210119076Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        System.out.println();
        SkateBoard skate = new SkateBoard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : " + skate.getMyBrand());
        System.out.println("Model : " + skate.getMyModel());
        System.out.println("Panjang Board : " + skate.getMyBoardLength());
    }
}