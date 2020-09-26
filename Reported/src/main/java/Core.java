import lombok.Data;

import java.util.Set;

@Data
public class Core {
    public static void main(String[] args) {
      //  Report re =new Report();
        ArrayExample pass =new  ArrayExample<>();

       System.out.println(pass);

        Set<String> StringSet = ArrayExample.getSet(1,"moha","ohm","open",true);
       // StringSet.forEach(System.out ::println);
        for(String value : StringSet){
            System.out.println(value);
        }


    }
}
