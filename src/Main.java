import java.util.*;
import java.util.stream.Collectors;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String database_name=null;
        String collection_name = null;
        String connection="mongodb+srv://livepeer-webhook:yYk4b7EobdvMD3ikLQKFKbAm5XXMfdYmNj2VYMDF2RzCDifsJJEPFFFuJTEQjcZ4TPkotj9wEGjuG8jPpPYLhoGrNDrGfDL6XX@orb-user-db.bxckw.mongodb.net/?retryWrites=true;w=majority;db=orbdb;doc=upload-video";
        String[] DatabaseDetails=connection.split(";");
        for(String DatabaseDetail: DatabaseDetails){
            String[] pair=DatabaseDetail.split("=");
            if (pair.length==2&&pair[0].equals("db")){
                database_name=pair[1];
            }
            if (pair.length==2&&pair[0].equals("doc")){
                collection_name=pair[1];
            }

        }System.out.println("database_name: "+database_name);
        System.out.println("collection_name: "+collection_name);
    }
}