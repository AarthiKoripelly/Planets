import java.util.Scanner; 
import java.util.Stack; 
/**
 * Write a description of class PostFixEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PostfixEvaluator 
{
    public static int evaluate(String expression) throws PostfixException{
        Scanner tokenizer = new Scanner(expression); 
        Stack<Integer> stack = new Stack<Integer>(); 
        int value;
        String operator = "";  
        
        int operand1 = 0;
        int operand2 = 0;
        int result = 0;
        
        
        while(tokenizer.hasNext()){
            if(tokenizer.hasNextInt()){
                value = tokenizer.nextInt(); 
                stack.push(value);
            }
            else
            {
                operator = tokenizer.next(); 
            
                if(!((operator.equals("/") || operator.equals("*") ||  operator.equals("+") || operator.equals("-")))){
                throw new PostfixException("Illegal symbol: " + operator); 
              }
              if(stack.isEmpty()){
                    throw new PostfixException("Not `enough operands-stack underflow");
              }
              operand2 = stack.peek(); 
              stack.pop();
              if(stack.isEmpty()){
                    throw new PostfixException("Not `enough operands-stack underflow");
              }
              operand1 = stack.peek(); 
              stack.pop();
            
              if(operator.equals("/")){
                result = operand1 / operand2; 
              }
              else if(operator.equals("*")){
                result = operand1*operand2; 
               }
                else if(operator.equals("+")){
                result = operand1+operand2; 
               }
                else if(operator.equals("-")){
                result = operand1-operand2; 
               }
               stack.push(result); 
            }
        }
        if(stack.isEmpty())
            throw new PostfixException("Not enough operands - stack underflow");
        result = stack.peek();
        stack.pop();
        
        if(!stack.isEmpty())
            throw new PostfixException("Too many operands- operands left over)"); 
         
        return result;
        }   
    }
    

