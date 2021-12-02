import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchString {


    public static void main(String[] args) throws IOException {
        System.out.println("search <pattern> <file>");
        System.out.println("EOF = <<");
        Scanner sc = new Scanner(System.in);
        String[] list = new String[3];
        while (sc.hasNext()) {
            list = sc.nextLine().split(" ");
            if (sc.next().equals("<<")) {
                break;
            }
        }

        File file = new File("src/"+ list[2] + ".txt");
        BufferedReader bf = new BufferedReader(new FileReader(file));
        Pattern pattern = Pattern.compile("[A-Za-z][a-z]+");
        String line;
        while((line = bf.readLine()) != null){
            if(line.contains(list[1])) System.out.println("--" + line);
       /**/     System.out.println(line.contains(list[1]) ? line : "No matches"); //
           /* Matcher match = pattern.matcher(line);
            while(match.find()){
                System.out.println(bf.readLine().substring(match.group(0)));
            }*/
        }



    }


}
