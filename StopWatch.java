/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designandanalysis;

/**
 *
 * @author vik
 */
public class StopWatch {
    private final long start;
    
    public StopWatch(){
        start=System.currentTimeMillis();
    }
    
    public void currentTime(){
         System.out.println(start);
    }
    
}
