/********************************************************************
 * Programmer:	Dayaveer Singh Gill
 * Class:  CS20S
 *
 * Assignment: A0 
 * Program Name:  A0
 *
 * Description: Convert Binary Digits to Base 10 Digits
 ***********************************************************************/
 
 // import java libraries here as needed
 
 import javax.swing.*;
 //import java.text.DecimalFormat;
 import java.io.*;
 import java.lang.Math;

public class A0 {  // begin class
    
    public static void main(String[] args)throws IOException {  // begin main
    
    // ********* declaration of constants **********
    // ********** declaration of variables **********

        String strin;		// string data input from keyboard
        String strout;		// processed info string to be output
        String bannerOut;		// string to print banner to message dialogs

        String prompt;		// prompt for use in input dialogs

        String delim = "[ :]+";	// delimiter string for splitting input string
        String[] tokens;                        // string array for gathering input
        
        String nl = System.lineSeparator();
        
        
        int binlength = 0;                      //number of binary digiats
        char charDigit = '-';                   // reads single digits from text file
        int num = 0;                            //prints the single digits 
        double tbin =0;                         // is the converted base 10 from base 2
        double basetotal = 0;                      // the total added up base 10s
        int length = 0;                         // its the power that you times by 2 to get the base 10     

    // ***** create objects *******       
    BufferedReader fin = new BufferedReader(new FileReader("Base2.txt"));
    PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outFile.txt")));
    
    // ********** Print output Banner **********
    printBanner();      // call printBanner method
    fileBanner(fout);       // call fileBanner method

    // ************************ get input **********************
    // ************************ processing **************************
    strin = fin.readLine();                              // reads 
    while ( strin != null){                              // priming the loops
    binlength = length = strin.length(); 
    basetotal = 0;
    length--;
    binlength--;
    
    // process individual binary digiats
    for(int i =0; i <= binlength; i++){
        
    charDigit = strin.charAt(i);
    num=Integer.parseInt(String.valueOf(charDigit));  
    tbin = num * Math.pow(2,length--);
    basetotal += tbin;
    System.out.println("base10 = " +tbin );
    fout.println("Base10 = "+ tbin);
    
    }
    
    System.out.println(nl + "Base10 Total = " + basetotal + nl);
    fout.println(nl + "Base10 Total = " + basetotal + nl);
    strin = fin.readLine();                      //update the control variable 
    
    } // end of whole
    // ************************ print output ****************************
    // ******** closing message *********
        
    System.out.println("end of processing.");
    fout.println("end of processing");
        
    // ***** close streams *****
        
    fin.close();                // close input buffer stream
    fout.close();               // close output stream
        
    }  // end main
    

    /* **************************************************************/
    public static String windowBanner(){
        String bannerOut = "";
        
    	bannerOut = "*******************************************\n";
    	bannerOut += "Name:		Dayaveer\n";
    	bannerOut += "Class:		CS30S\n";
    	bannerOut += "Assignment:	A0\n";
    	bannerOut += "*******************************************\n\n"; 
        
        return bannerOut;
    } // end bannerOut

    /***********************************************************
    *   Purpose: print a banner to the console window
    *   Interface:  no parameters
    *   Returns:    no return
    * **************************************************************/    
    public static void printBanner(){
   	System.out.println("*******************************************");
    	System.out.println("Name:		Dayaveer");
    	System.out.println("Class:		CS30S");
    	System.out.println("Assignment:   	A0");
    	System.out.println("*******************************************");        
    } // end print banner
        
    
 
    /***********************************************************
    *   Purpose: prints a banner to the output file
    *   Interface:  print writer fout
    *   Returns:    no return
    * **************************************************************/
    public static void fileBanner(PrintWriter fout){
     	fout.println("*******************************************");
    	fout.println("Name:		Dayaveer");
    	fout.println("Class:		CS30S");
    	fout.println("Assignment:	A0");
    	fout.println("*******************************************");       
    } // end bannerOut

}  // end class
