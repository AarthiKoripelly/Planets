
/**
 * Write a description of class IncDate here.
 *
 * @author Aarthi Koripelly  
 * @version (a version number or a date)
 */
public class IncDate extends Date
{
    
    public IncDate(int newMonth, int newDay, int newYear){
        super(newMonth, newDay, newYear);
    }
    
    public void increment(){
        if (getMonth() == 12){ 
             
            if(day == 31 ){
                month = 1;
                day = 1;
                year += 1;
            }
            else{
                day++; 
            }
        }
        else{
            String[] months = {"x", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            if((getMonth() == 3 || getMonth() == 1 || getMonth() == 5 || getMonth() == 7 || getMonth() == 8 || getMonth() == 10 || getMonth() == 12) && day ==31){
                day = 1; 
                month++; 
            }
            else if((getMonth() == 4 || getMonth() == 6 || getMonth() == 9 || getMonth() == 11) && day ==30){
                day = 1;
                month++;
            }
            else if(month == 2 && day == 28 && year%4 ==0 && year%100 != 0){
                day++; 
            }
            else if (getDay()== 28 && getMonth() == 2 && getYear()%400 != 0 && year !=1988){
                day = 1; 
                month++;
            }
            else if (getDay()== 28 && getMonth() == 2 && getYear()%4 != 0 && year !=1988){
                day = 1; 
                month++;
            }
           else if (getDay() == 29 && getMonth() == 2){
                day =1; 
                month++;
          }
          else{
              day++; 
            }
        }
        
    }
    
    public void increment(int numDays){
       int x=0; 
         while( x < numDays){
              
            increment(); 
            x++;
        }
    }

}