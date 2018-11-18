
/**
 * Write a description of class WordCountList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordCountList
{
   private WordCount[] list; 
   int size; 
   public WordCountList(){
       list = new WordCount[size]; 
       size = 0; 
    }
   public int size(){
       return size; 
    }
   public void add(String word){
       int count = 0; 
       int index = 0; 
       for(int i  = 0; i < list.length; i++){
           if(word.equals(list[i].getWord())){
               count++; 
               index = i; 
            }
        }
       if(count > 0){
           list[index].increment();
        }
       else{
           WordCount holder[] = new WordCount[size + 1]; 
           for(int i = 0; i < list.length; i++){
               holder[i] = list[i]; 
            }
           holder[holder.length-1] = new WordCount(word); 
           list = holder; 
           size++; 
       }
       
    }
   public WordCount get(int index){
       return list[index]; 
    }
   public void rank(){
    //used bubble sort 
     WordCount temp; 
       for (int i = 0; i < list.length; i++) {
        for (int j = 1; j < (list.length - i); j++) {
            if (list[j - 1].compareTo(list[j]) > 0) {
                temp = list[j - 1];
                list[j - 1] = list[j];
                list[j] = temp;
            }
        }
    }
   }
}
