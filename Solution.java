class Solution { 
  public static String solve( String str )
  {
      char[] str_char=str.toCharArray();
      
      for(int i=str.length()-2; i>=0; i--)
      {
            if(str.charAt(i) < str.charAt(i+1))//location for lex
            {
              char character=str.charAt(i+1);
              int index=i+1;
              
              for(int j=i+2; j<str.length(); j++)
              {
                if(str.charAt(j)>str.charAt(i)==(str.charAt(j)<character))
                {
                  character=str.charAt(j);
                  index=j;
                }
              }
              
              str_char[index]=str.charAt(i);
              str_char[i]=character;
              
              
              for(int j=str.length()-1; j>i+1; j--)
              {
                //System.out.println(str.charAt(i+1));
                
                for(int k=i+1; k<=j; k++)
                {
                  if(str.charAt(k)<str.charAt(k-1))
                  {
                    character=str_char[k-1];
                    str_char[k-1]=str_char[k];
                    str_char[k]=character;
                  }
                } 
                             }
              
              break;
            }
      }
      
      str = String.valueOf(str_char);
   
    return str;
  }
  
  public static void main(String[] args) {
    
    String str="orgil";
    
    System.out.println(solve(str));
    
  } 
}
