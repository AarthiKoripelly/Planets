
/**
 * Write a description of class SquareMatrixClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SquareMatrix implements SquareMatrixInterface{ 
    private int[][] arr; 
    public SquareMatrix(int n){
        arr = new int[n][n]; 
    }
    public SquareMatrix(int[][] array){
        arr = array; 
    }
    public int getSize(){ 
        return arr.length; 
    }
    public int getValue(int row, int column){
        return this.arr[row][column]; 
    }
    public void  setValue(int row, int column, int value){
        arr[row][column] = value;  
    }
    
    public void fillValue(int value){
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = value; 
            }
        }
    }
    
    public void makeZero(){
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                arr[r][c] = 0; 
            }
        }
    }
    
    public  String toString(){
        String str = ""; 
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                str += "[" + arr[r][c] + "] "; 
            }
            str += "\n"; 
        }
        return str; 
    }
    public SquareMatrix add(SquareMatrix obj){
         SquareMatrix square = new SquareMatrix(arr.length); 
          
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                int x = obj.getValue(r,c) + arr[r][c]; 
                square.setValue(r,c,x); 
            }
        }
        return square;
    }
    public SquareMatrix subtract(SquareMatrix obj){
        SquareMatrix square = new SquareMatrix(arr.length); 
          
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                int x = arr[r][c] - obj.getValue(r,c); 
                square.setValue(r,c,x); 
            }
        }
        return square;
    }   
    public SquareMatrix copy(){
        SquareMatrix square = new SquareMatrix(arr.length); 
          
        for(int r  = 0; r < arr.length; r++){
            for(int c = 0; c < arr[r].length; c++){
                int x =arr[r][c]; 
                square.setValue(r,c,x); 
            }
        }
        return square;
    }
   
}

