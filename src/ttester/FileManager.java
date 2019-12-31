package ttester;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vinay
 */
public class FileManager {
    private static String str;
   private static String strarr[];
   private static ArrayList<String> specific;
    public static String readFile(String Location)
    {
        str=null;
       File f=new File(Location);
    
         try (final FileReader reader = new FileReader(f)) {
               int x1 = 0;  
            char arr[]=new char[(int)f.length()];
                x1 = reader.read(arr);
        str=new String(arr);
            }
        catch (Exception e)
        {
            System.out.println(e);
        }
         return str;
    }
    public static String[] getWords()
    {
        strarr=str.split(" ");
        return strarr;
    }
    public static ArrayList<String> getSpecificWords(int lowerbound,int higherbound)
    {
        String s1[]=getWords();
        specificElements(lowerbound,higherbound,s1);
        return specific;
    }
    public static String[] getSentences()
    {
        strarr=str.split(".");
        return strarr;
    }
     public static ArrayList<String> getSpecificSentences(int lowerbound,int higherbound)
    {
        String s1[]=getSentences();
        specificElements(lowerbound,higherbound,s1);
        return specific;
    }
    public static String[] getParagraphs()
    {
        strarr=str.split("\n");
        return strarr;
    }
    public static ArrayList<String> getSpecificParagraphs(int lowerbound,int higherbound)
    {
        String s1[]=getSentences();
        specificElements(lowerbound,higherbound,s1);
                return specific;
            }
    
    public static void specificElements(int lowerbound,int higherbound,String s1[])
    {
        specific=new ArrayList<>();
        for(int i=lowerbound;i<=higherbound;i++)
        {
            specific.add(s1[i]);
        }

    }
    
    
    
}
