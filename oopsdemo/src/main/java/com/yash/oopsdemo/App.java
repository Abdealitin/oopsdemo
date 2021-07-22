package com.yash.oopsdemo;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
        Engineer ee = new Engineer(30,40,20,"Dry");
        double cost = ee.getCost();
        ArrayList<Labour> labours = new ArrayList<Labour>();
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        labours.add(new Labour("Arjun","7514863295","Carpenter"));
        Construction c = new Construction();
        c.getHouse(labours, cost);
        
    }
}
