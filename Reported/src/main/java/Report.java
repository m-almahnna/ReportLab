import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
public class Report {



    private  int reportID;
    private  String nameReport;
    private  String description;
    private  String type;
    private  boolean status;


    public static List<String> getListArrayDemo(int reportID,String nameReport, String description ,String type ,boolean status){
        return ArrayExample.getList(reportID, nameReport,  description , type , status);
    }

    public static Set<String>getSetArrayDemo(int reportID,String nameReport, String description ,String type ,boolean status){
        return ArrayExample.getSet(reportID, nameReport,  description , type , status);

    }

    public static String[] getArrayArrayDemo(int reportID,String nameReport, String description ,String type ,boolean status){

        return ArrayExample.getArray( reportID, nameReport,  description , type , status);
    }


}
    //public Report( int reportID,String nameReport,String description,  String type, boolean status) {
     //   this.reportID=
    //}


    //public Report(int reportID, String nameReport, String description, String type, boolean status) {
        //this.reportID = reportID;
        //this.nameReport = nameReport;
       // this.description = description;
        //this.type = type;
      //  this.status = status;
    //}

    //@Override
   // public String toString() {
      //  return "Report{" +
        //        "reportID=" + reportID +
          //      ", nameReport='" + nameReport + '\'' +
            //    ", description='" + description + '\'' +
              //  ", type='" + type + '\'' +
                //", status=" + status +
                //'}';
  //  }


//}
