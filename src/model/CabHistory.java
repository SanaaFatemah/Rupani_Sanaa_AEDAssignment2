/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author hs_sa
 */
public class CabHistory {
    private ArrayList<CabProfile> history;

    public CabHistory(ArrayList<CabProfile> history) {
        this.history = history;
    }

    public CabHistory(){
        this.history = new ArrayList<CabProfile>();
    }
    
    public ArrayList<CabProfile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CabProfile> history) {
        this.history = history;
    }
    public CabProfile addNewCar(){
        CabProfile NewCar = new CabProfile();
        history.add(NewCar);
        return NewCar;
    }
   
    
    public void deleteCar(CabProfile CAB){
        history.remove(CAB);
    }
    
}
