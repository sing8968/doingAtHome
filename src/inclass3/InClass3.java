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
public class InClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee employee1 = new Employee( 123456, "Tajender", "IT", 100000, "Manager");
        System.out.println(employee1);
        
    }
    public static void displayEmployeeInfo(Employee emp)
    {
        if(emp instanceof Employee)
            return ;
    }
    
}
