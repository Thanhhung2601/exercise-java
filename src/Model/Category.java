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
public class Category {
    private String idCategory ,nameCategory ;
    
    public Category(String idCategory ,String nameCategory) {
        this.idCategory = idCategory;
        this.nameCategory = nameCategory;
    }   

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }
    
    
}
