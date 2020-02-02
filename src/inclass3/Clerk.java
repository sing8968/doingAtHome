/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclass3;

/**
 *
 * @author hp
 */
public class Clerk extends Employee {
    Clerk()
    {
        
    }
    Clerk(int id, String name, String depart, double sal, String desi)
    {
        super();
    }
    public double addBonus(){
        return super.addBonus() - 100;
    }
    public double getSalary()
    {
        return super.getSalary()+addBonus();
    }
    
}
