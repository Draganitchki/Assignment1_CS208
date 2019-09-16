/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testresizablecircle;

/**
 *
 * @author s_draganitchki
 */
public abstract class Circle implements GeometricObject {
    
    final int CONSTANT = 1;
    
    int peri;
    int area;
    
    //default constructor
    public Circle(){
        peri = 1;
        area = 1;
    }
    
    public Circle(int peri, int area){
        this.peri = peri;
        this.area = area;
    }
    
    //getters and setters
    @Override
    public int getPerimiter(){
        return peri;
    }
    @Override
    public int getArea(){
        return area;
    }
}
