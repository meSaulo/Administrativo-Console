/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author wasabi
 */
import java.text.NumberFormat;
import java.util.Locale; 


public class Funcionario {
    
    
        
    private String firstname; 
    private String lastname;
    private String role; 
    private Double salary;
    

    public Funcionario(String firstname, String lastname, String role, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    public String salarioFormatado(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(salary);
    }
    
   
    @Override 
    
    public String toString(){
    
        return "\nPrimeiro Nome : " + this.getFirstname().toUpperCase() + "\nSegundo Nome : "  + this.getLastname().toUpperCase() +
                 "\nFunção Dentro Da Empresa : " + this.role + "\nSalário do Funcionario : " + salarioFormatado();
    
    }
    
   
    
    
}
