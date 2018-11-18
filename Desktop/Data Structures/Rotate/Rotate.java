import java.util.Arrays; 
/**
 * Write a description of class Rotate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rotate
{
   private int[][] array;  
   
   public static int[][] rotateArray(int[][] array){
     int[][] arr2 = new int[array.length][array.length]; 
     int x = 0; 
     int y = 0;
     for(int r = array.length-1; r >= 0; r--){ 
        for(int c = 0; c < array[r].length; c++){
            arr2[x][y] = array[r][c];
            x++;  
        }
        y++; 
        x=0; 
     }
     array = arr2; 
     return array; 
        
    
    
   }
  
}
    
    

