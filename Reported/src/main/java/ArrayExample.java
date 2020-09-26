import lombok.Data;

import java.util.*;

@Data
public class ArrayExample<S> {



    public static List<String> getList(int ReportID, String nameReport, String description , String type , boolean status) {
        List<String> Rep =new ArrayList<>();
       Rep.add("F");
        return Rep;
    }


    public static Set<String> getSet(int ReportID,String nameReport, String description ,String type ,boolean status) {
        Set<String> Rep = new HashSet<String>(Collections.singleton(nameReport));

        Rep.add("2");
        Rep.add("mm");
        Rep.add("gg");
        Rep.add("tt");
        Rep.add("true");
        String[] Rep1 = new String[ReportID];
        for (int i = 0; i < Rep1.length; i++) {
            Rep1[i] = "add String" + i ;
            i++;
            if(nameReport == "true"){

                ArrayList<String> pass = new ArrayList<>();
                pass.add(String.valueOf(Rep));
                System.out.println("goood");
                break;

            }else {
                System.out.println("i  u");
            }

            System.out.println(Rep);
            System.out.println(nameReport);
        }

        return Rep;
    }

    public static String[] getArray(int ReportID,String nameReport, String description ,String type ,boolean status) {
        String[] Rep = new String[ReportID];

        return Rep;
    }


    public static String[] getArray(Report getSetArrayDemo) {
        return new String[0];
    }

    public static void methodss ()  {


    }
}
    /*String[] Rep1 = new String[ReportID];
        for (int i = 0; i < Rep1.length; i++) {
        Rep1[i] = "add String" + i ;
        i++;
        if(nameReport == "true"){

        ArrayList<String> pass = new ArrayList<>();
        pass.add(String.valueOf(Rep));
        System.out.println("goood");
        break;

        }else {
        System.out.println("i love u");
        }

        System.out.println(Rep);
        System.out.println(nameReport);
        /*
        }
     */