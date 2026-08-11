public class StringFunctionDemo
{
    public static void main(String[] args)
    {
        String str1="Java Programming";
        String str2="java programming";
        String str3="Welcome to Java";
        System.out.println("original String :" +str1);
        System.out.println("Length :"+str1.length());
        System.out.println("Character at index 5:"+str1.charAt(5));
        System.out.println("Substring(5):"+str1.substring(5));
        System.out.println("Substring(5,11):"+str1.substring(5,11));
        System.out.println("Concatenation:"+str1.concat("Language"));
        System.out.println("Equals:"+str1.equals(str2));
        System.out.println("Equals Ignore Case:"+ str1.equalsIgnoreCase(str2));
        System.out.println("CompareTo Ignore Case:" +str1.compareToIgnoreCase(str2));
        System.out.println("Contains 'Java':"+ str1.contains("Java"));
        System.out.println("Starts with 'Java':"+ str1.startsWith("Java"));
        System.out.println("Ends with 'ming':" +str1.endsWith("ming"));
        System.out.println("Index of 'P' :"+str1.indexOf('P'));
        System.out.println("Last Index  of 'a':"+str1.lastIndexOf('a'));
        System.out.println("Replace Java with Python:"+str1.replace("Java","Python"));
        System.out.println("Replace All vowels:" +str1.replaceAll("[AEIOUaeiou]","*")); 
        System.out.println( "Upper Case:"+str1.toUpperCase());
        System.out.println("Lower Case:"+str1.toLowerCase());
        System.out.println("Trim :" +str3.trim()+"");
        String str4="";
        System.out.println("Is Empty:" +str4.isEmpty());
        String[] words=str1.split(" ");
        System.out.println("split :");
        for(String word:words){
            System.out.println(word);
        }
        int num=100;
        String s=String.valueOf(num);
        System.out.println("ValueOf():"+s);
        char[]ch=str1.toCharArray();
        System.out.println("Charater array :");
        for(char c:ch)
        {
            System.out.print(c+" ");
        }
        System.out.println();
        String joined=String.join("-","Java","Python","c++");
        System.out.println("Join:"+joined);
      
    }
}