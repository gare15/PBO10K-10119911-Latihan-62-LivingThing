/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119911.latihan62.livingthing;

/**
 *
 * @author 
 * NAMA  : Mochamad Tegar Dwi S
 * KELAS : IF10K
 * NIM  `: 10119911
 */ 
public class PBO10K10119911Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human human = new Human();
        human.setNama("Mochamad Tegar");
       
        human.walk(human.getNama());
        human.Breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
