package com.mw.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindLine {
	
	
	public static void main(String args[])
    {
    File file =new File("N:/Tomcat/webapps/mwdev3/hart50.jsp");
    Scanner in = null;
    try {
        in = new Scanner(file);
        while(in.hasNext())
        {
            String line=in.nextLine();
            if(line.contains("Manager.refresh"))
                System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

  }
}
