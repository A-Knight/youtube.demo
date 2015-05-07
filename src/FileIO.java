
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class FileIO
{
    public static void main(String[] args) 
    {
         
        String fileName = "out.txt";
        PrintWriter outputStream = null;
        Scanner kbd = new Scanner(System.in);
         
        try
        {
            outputStream = new PrintWriter(fileName);
            outputStream.println("1 3 8 65 45");
            outputStream.println("17 44 32 99");
            outputStream.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Program will now terminate");
            kbd.nextLine();
            System.exit(0);
        }
         
        
        Scanner inputStream = null;
    
    try
    {
        inputStream = new Scanner(new File(fileName));
    }
    catch(FileNotFoundException e)
    {
        System.out.println(fileName + " (The system cannot find the file"
            + " specified");
    }
     }
}
