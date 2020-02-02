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
public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String designation;
    private double bonus = 200;
    public Employee()
    {
        
    }
    public Employee(int id, String name, String depart, double sal, String desi){
        employeeId = id;
        this.name = name;
        department = depart;
        salary = sal;
        designation = desi;
    }
    public void setId(int id)
    {
        this.employeeId = id;
    }
    public void setName( String name)
    {
        this.name = name;
    }
    public void setDepartment(String depart)
    {
        this.department = depart;
    }
    public void setSalary(double sal)
    {
        this.salary = sal;
    }
    public void setDesignation(String desi)
    {
        this.designation = desi;
    }
    public int getId()
    {
        return employeeId;
    }
    public String getName()
    {
        return name;
    }
    public String getDepart()
    {
        return department;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getDesi()
    {
        return designation;
    }
    public double addBonus()
    {
        return bonus;
    }
    public boolean equals(Object o)
    {
        if(o == null)
            return false;
        if(o==this)
            return true;
        if(o instanceof Employee){
            Employee e = (Employee)o;
            if(this.getDesi()== e.getDesi())
                return true;
        }
        return false;
    }
    public String toString()
    {
        return "The total salary of " + getName() + " is $" + getSalary(); 
    }
}
