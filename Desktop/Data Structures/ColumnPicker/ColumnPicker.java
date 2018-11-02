import kareltherobot.*;
/**
 * Counts the number of beepers in a column and puts the same
 * number of beepers at the base of the column
 * 
 * @author 
 * @version 
 */
public class ColumnPicker extends Robot
{
    public ColumnPicker(int street, int avenue, Direction direction, int beepers)
    {
        super(street, avenue, direction, beepers);
    }
    
    public void countColumns()
    {
        if(!nextToABeeper()){
            countAndPlacePile(); 
            turnRight();
            move();
            turnLeft();
            countColumns(); 
        }
        else{
            turnOff(); 
        }
        
    }
    
    public int countColumn(int numStreets)
    {
        if(numStreets <=0){
           return 0;  //base case to end recursion 
        }
        move();       //move up one block 
        int count  = countPile() + countColumn(numStreets-1); 
        moveBackwards(); 
        return count; 
    }
    
    public int countPile(){
        if(!nextToABeeper()){
            return 0; 
        }
        pickBeeper(); 
        int num = 1 + countPile(); 
        putBeeper();
        return num; 
    }
    
    public void countAndPlacePile(){
        int total  = countColumn(8);
        putNBeepers(total); 
    }
    
    public void putNBeepers(int n){
        if(n <= 0){
            return;  
            
        }
        putNBeepers(n-1);
        putBeeper();
    }
    
    public void moveBackwards(){
        turnAround();
        move(); 
        turnAround();
    }
    
    public void turnAround(){
        turnLeft();
        turnLeft(); 
    }
    
    public void turnRight(){
        turnAround();
        turnLeft(); 
    }
}