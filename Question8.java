import java.util.*;
class Qusetion8{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
             boolean isValid = true;
            Stack<Character> stak=new Stack<>();
            for(char c:input.toCharArray()){
                if(c=='{' || c=='[' || c=='('){
                    stak.push(c);
                }else{
                    if(stak.isEmpty()){
                        isValid=false;
                        break;
                    }
                    char topele=stak.pop();
                    if((c==')' && topele!='(')||(c=='}' && topele!='{') || (c==']' && topele!='[')){
                        isValid=false;
                        break;
                    }
                }
            }
            if(!stak.isEmpty()){
                isValid=false;
            }
            System.out.println(isValid);
        }
    }
}



