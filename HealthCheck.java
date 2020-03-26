/**
 * This is a translation of the same program I wrote in Python.
 * It checks disk space on your machine.
 * Eventually I'll also check CPU usage.
 * 
 * My Java isn't quite as strong as my Python, so this one is less scalable.
 * Suggestions are always welcome!
 * */

import java.io.*;

public class HealthCheck {
  
  
  public static void main(String[] args) { 
        File file = new File("/"); 
        
        diskUsage(file);
    
  }
  
  public static boolean diskUsage(File file){
    // queries for free space of the given disk.
    
    double total = file.getTotalSpace() / (1024.0 * 1024 * 1024); // Gets total space on disk
    double free = file.getFreeSpace() / (1024.0 * 1024 * 1024); // Gets total free space
    
    double percentAvailable = free / total * 100;
    
    System.out.printf("Your disk has %.2f GB free. That's %.2f%% free space. ", free, percentAvailable);
    
    
    if (percentAvailable > 20){
    
      System.out.println("Your disk usage looks good.");
      
    } else {
    
      System.out.println("Your disk usage looks a little high");
      return false;
    
    }
  
    return true; // booleans returned for scalability
  
  } //diskUsage()
  
   
  
  
}
