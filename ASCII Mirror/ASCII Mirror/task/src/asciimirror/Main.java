package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList <String> list=new ArrayList<>();
    public static ArrayList <String> reversedList=new ArrayList<>();
    public static String reversedLine;

    public static void main(String[] args) {


        System.out.println("Input the file path:        ");
        Scanner sc=new Scanner(System.in);
        String filePath=sc.nextLine();
        sc.close();
        File file=new File(filePath);
        int max=0;
        try(Scanner scan=new Scanner(file)){
            while(scan.hasNext()){
            String line= scan.nextLine();
            reversedLine=line;
            StringBuilder str=new StringBuilder(reversedLine);
            StringBuilder reverseStr=str.reverse();
            reversedLine=reverseStr.toString();
            char[] reversedArray=reversedLine.toCharArray();
            for(int i=0;i<reversedArray.length;i++){
                if(reversedArray[i]=='<'){
                    reversedArray[i]='>';
                }
                else if(reversedArray[i]=='>'){
                    reversedArray[i]='<';
                }
                else if(reversedArray[i]=='['){
                    reversedArray[i]=']';
                }
                else if(reversedArray[i]==']'){
                    reversedArray[i]='[';
                }
                else if(reversedArray[i]=='('){
                    reversedArray[i]=')';
                }
                else if(reversedArray[i]=='/'){
                    reversedArray[i]='\\';
                }
                else if(reversedArray[i]=='\\'){
                    reversedArray[i]='/';
                }
                else if(reversedArray[i]==')'){
                    reversedArray[i]='(';
                }



            }
            String reversedLine=new String(reversedArray);



                if(line.length()>max){max=line.length();}
            list.add(line);
            reversedList.add(reversedLine);}
        }catch(FileNotFoundException e) {System.out.println("File not found");}
        for (int i=0; i< list.size();i++) {
            String firstLine=String.format("%-"+max+"s",list.get(i));
            String secondLine=String.format("%"+max+"s",reversedList.get(i));

            System.out.println(firstLine+" | "+secondLine);


        }
        /*
        if (filePath.equals("C:\\ASCII_Animals\\MooFolder\\Cow.txt")) {
            System.out.println(filePath);
            System.out.println("            ^__^");
            System.out.println("    _______/(oo)");
            System.out.println("/\\/(       /(__)");
            System.out.println("   | w----||    ");
            System.out.println("   ||     ||    ");
        }else if(filePath.equals("C:\\ASCII_Animals\\HumphFolder\\Camel.txt")){
            System.out.println(filePath);
            System.out.println("   //");
            System.out.println(" _oo\\");
            System.out.println("(__/ \\  _  _");
            System.out.println("   \\  \\/ \\/ \\");
            System.out.println("   (         )\\");
            System.out.println("    \\_______/  \\");
            System.out.println("     [[] [[]");
            System.out.println("     [[] [[]");



        }*/
    }
}