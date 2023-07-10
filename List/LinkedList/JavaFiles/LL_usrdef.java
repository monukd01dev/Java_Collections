import java.util.*;

public class LL_usrdef{


    public static void main(String[] args){

        LinkedList<User> data = new LinkedList<User>(Arrays.asList(new User(1,"Monu Kumar","monukd01dev@gmail.com")));

        data.add(new User(2,"Lalit Kumar","lalitguptaofficial@gmail.com"));

        for(User u : data){
            System.out.println(u.userid+" "+u.username+" "+u.email);
        }

    }

    
}