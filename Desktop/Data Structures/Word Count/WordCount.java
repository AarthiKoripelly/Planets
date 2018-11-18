
/**
 * Write a description of class WordCount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordCount implements Comparable<WordCount>  
{
 private String itself; 
 private int count; 
 public WordCount(String str){
     itself = str; 
     count = 1; 
    }
 public String getWord(){
        return itself; 
    }
 public int getCount(){    
        return count; 
    }
 public void increment(){
    count++; 
    }
 public String toString(){
     String str = itself + " " + count; 
     return str; 
    }
 public boolean equals(WordCount other){  
     return itself == other.getWord();  
    }
 public int compareTo(WordCount other){ 
     int compare = other.getCount(); 
     return compare - count; 
   }
}
