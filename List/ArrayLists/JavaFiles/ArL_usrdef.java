import java.util.*;

public class ArL_usrdef{

    public static void main(String[] args){

        ArrayList <Friends> frndDataList = new ArrayList<Friends>();

        frndDataList.add(new Friends("Monu","DCM",20));
        frndDataList.add(new Friends("Lalit","Imbrahimpur",19));
        frndDataList.add(new Friends("Krishna","Rohini",18));

        Iterator<Friends> itr = frndDataList.iterator();

        while(itr.hasNext()){
            Friends f = itr.next();
            System.out.println("Name       : " + f.name);
            System.out.println("Place      : " + f.place);
            System.out.println("Age        : " + f.age);
            System.out.println("------------------------------");
        }
        
    }

}