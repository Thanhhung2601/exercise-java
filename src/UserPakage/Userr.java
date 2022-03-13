/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserPakage;

/**
 *
 * @author MSII
 */
public class Userr {
    private int id ;
    private String nameUserr , passWordd ;

    public Userr(int id, String nameUserr, String passWordd) {
        this.id = id;
        this.nameUserr = nameUserr;
        this.passWordd = passWordd;
    }

    public int getId() {
        return id;
    }

    public String getNameUserr() {
        return nameUserr;
    }

    public String getPassWordd() {
        return passWordd;
    }
    
    
    
}
