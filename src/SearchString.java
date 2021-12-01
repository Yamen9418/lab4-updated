import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchString {


    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            list.add(sc.nextLine());
            if (sc.next().equals("<<")) {
                break;
            }
        }



        //BufferedReader bf = new BufferedReader(new InputStreamReader());


    }


}
