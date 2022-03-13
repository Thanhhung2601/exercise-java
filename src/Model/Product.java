/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MSII
 */
public class Product {
    private String idProduct , idCategory , nameProduct ;
    private double price ;
    private int numberOfCurrent;

    public Product(String idProduct ,String idCategory , String nameProduct , double price , int numberOfCurrent) {
        this.idProduct = idProduct;
        this.idCategory = idCategory;
        this.nameProduct = nameProduct;
        this.price = price;
        this.numberOfCurrent = numberOfCurrent;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public int getNumberOfCurrent() {
        return numberOfCurrent;
    }

    public double getPrice() {
        return price;
    }
    
           
}
