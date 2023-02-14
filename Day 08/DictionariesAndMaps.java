import java.util.*;

class Solution{
    public static void main(String []argh){
        
        Scanner in = new Scanner(System.in);        //creates scanner object
        int n = in.nextInt();                       //declares no. of entries in map
        
        //creates hashmap for storing names & phone numbers
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);             //adds entries in map
        }
        
        while(in.hasNext()){
            String s = in.next();
            
            //if entry is present, print the entry else print "not found"
            if(phoneBook.containsKey(s))
                System.out.println(s + "=" + phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
}
