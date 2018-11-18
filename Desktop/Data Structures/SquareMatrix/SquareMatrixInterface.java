
/**
 * Write a description of class SquareMatrixInterface here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SquareMatrixInterface
{
    public int getSize(); 
    int getValue(int row, int column);
    void  setValue(int row, int column, int value);
    void fillValue(int value);
    void makeZero(); 
    String toString(); 
    SquareMatrix add(SquareMatrix obj); 
    SquareMatrix subtract(SquareMatrix obj);
    SquareMatrix copy(); 
}
