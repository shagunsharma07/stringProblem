
import org.java.util;
import java.lang.String;
import java.lang.StringBuilder;

public class removeCharacters{
    String newString;
    String oldString;
    Char a;

      public void removeCharacters()
      {
        newString="";
        oldString="";
        a='';
      }

       public void removeCharacters(String input, char a)
      {
        oldString=input;
        a=a;
      }

      public String newString()
      {
        return newString;
      }

      public String removeCharfromString(String input, Char a)
      {
        char c[];
        StringBuilder sb=new StringBuilder();
        Character c[]=new Character[100];
        c[]= input.toCharArray();

        for (int i=0;i< input.length();i++)
        {
          if (c[i] != a)
          {
            sb.append(c[i]);
          }

        }
        return sb.string();
      }
  
      public String removeChar(String input,Char a)
      {
        newString = input.replaceAll(a.toString(),"");
        return newString;
      }
  
  }
