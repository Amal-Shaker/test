/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

/**
 *
 * @author rant
 */
public class ItStudent extends student {
    
    
    public ItStudent(int id,String name ,String major,double mid,double project,double finall){
        this.id = id;
        this.name = name;
        this.major = major;
  this.grade = mid*0.30 + project*0.30 + finall*40;
}
    
}
