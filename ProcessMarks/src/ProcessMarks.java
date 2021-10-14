import java.util.*;

public class ProcessMarks //name of the class
{
  int []x= new int [5000];// temporary array
  public static int max(int x[])// max methods
  {
    int[] myListOfMarks = x;
    int maxNum= myListOfMarks[0];//starts checking from the first  array
    for (int i = 1; i < myListOfMarks.length; i++) 
    {
      if (myListOfMarks[i] > maxNum) maxNum = myListOfMarks[i];// check every number on the loop and tries to find out if any number is bigger that the current one
    }
    System.out.print("Maximum Mark is: ");
    return maxNum;
  }
  
  public static int min(int x[])//min method
  {
    int[] myListOfMarks = x;
    int minNum= myListOfMarks[0];//starts checking from the first  array
    for (int i = 1; i < myListOfMarks.length; i++) 
    {
      if (myListOfMarks[i] < minNum) minNum = myListOfMarks[i]; //check every number on the loop and tries to find out if any number is smaller  that the current one
    }
    System.out.print("Minimum Mark is: ");
    return minNum;
  }
  
  
  public static int range(int x[])
  {
    int[] myListOfMarks = x;
    int minNum= myListOfMarks[0];
    int maxNum= myListOfMarks[0];
    for (int i = 1; i < myListOfMarks.length; i++) 
    {
      if (myListOfMarks[i] < minNum) minNum = myListOfMarks[i];//getting the max number
    }
    for (int i = 1; i < myListOfMarks.length; i++) 
    {
      if (myListOfMarks[i] > maxNum) maxNum = myListOfMarks[i];//getting the mini number
    }
    
    int rangeMarks=maxNum-minNum;
    System.out.print("Difference between the maximum and minimum marks is: ");
    return rangeMarks;
  }
  
  public static double mean(int x[])//mean methods 
  {
    int[] myListOfMarks = x;
    double total = 0;
    for (int i = 0; i < myListOfMarks.length; i++) 
    {
      total += myListOfMarks[i];//finding the total
    }
    
    double meanMarks=total/myListOfMarks.length;// finding the mean
    System.out.print("The mean of the set of marks is: ");
    return meanMarks;
  }
  
  public static int median(int x[])
  {
    int[] myListOfMarks = x;
    int[] myListOfMarks2= new int [myListOfMarks.length];//creating a new arry
    for (int i = 0; i < myListOfMarks.length; i++) { myListOfMarks2[i] = myListOfMarks[i];}//copping the arry into new array 
    
    int mean;
    int temp;
    for (int i = 1; i < myListOfMarks2.length; i++) {
      for (int j = i; j > 0; j--) {
        if (myListOfMarks2[j] < myListOfMarks2 [j - 1]) {
          temp = myListOfMarks2[j];
          myListOfMarks2[j] = myListOfMarks2[j - 1];
          myListOfMarks2[j - 1] = temp;}}}// sorting all the data in the array 
    int xx = myListOfMarks2.length;
    if(xx%2==0){int y=myListOfMarks2.length/2;//findng out if the length is odd or even number
      mean=(myListOfMarks2[y]+myListOfMarks2[y+1])/2;
    }else{ int y=myListOfMarks2.length-1;
      y=y/2;
      mean=myListOfMarks2[y];}//finding out the mean
    System.out.print("The median value of the set of marks is: ");
    return mean;
  }
  
  
  public static int mode(int x[])
  {
    int[] myListOfMarks = x;
    int modeNum=0;
    int maxCount=0;
    
    for (int i = 0; i < myListOfMarks.length; ++i) {
      int count = 0;
      for (int j = 0; j < myListOfMarks.length; ++j) {
        if (myListOfMarks[j] == myListOfMarks[i]) ++count;//counting the number of times one perticuler number appirs 
      }
      if (count > maxCount) {//ditermining if any  number  appairs more time than the current one or not
        maxCount = count;
        modeNum = myListOfMarks[i];
      }
    }
    System.out.print("Mode of the set of marks is: ");
    
    return modeNum;
  }
  
  
  
  public static String grade(int x[])//returning a string 
  {
    int[] myListOfMarks = x;
    char[] gradesArray = {'A', 'B', 'C', 'D','E','F'};//array of grades 
    System.out.println("All Grades are:");
    for (int i = 0; i < myListOfMarks.length; i++) 
    { if (myListOfMarks[i]>=90){System.out.print((gradesArray[0])+"  ");}else//finding out who is getting which  grade
      if (myListOfMarks[i]>=75){System.out.print((gradesArray[1])+"  ");}else
        if (myListOfMarks[i]>=60){System.out.print((gradesArray[2])+"  ");}else
          if (myListOfMarks[i]>=50){System.out.print((gradesArray[3])+"  ");}else
            if (myListOfMarks[i]>=45){System.out.print((gradesArray[4])+"  ");}else{System.out.print((gradesArray[5])+"  ");}   
          if (i % 30 == 29) { System.out.println(); }}// putting 30 per line only
    return "";
  }
  
  public static String gradeDistn(int x[])
  {
    int[] myListOfMarks =x;
    int countA,countB,countC,countD,countE,countF;
    countA=countB=countC=countD=countE=countF=0;//counter for each grade
    for (int i = 0; i < myListOfMarks.length; i++) 
    { if (myListOfMarks[i]>=90){countA++;}else
      if (myListOfMarks[i]>=75){countB++;}else
        if (myListOfMarks[i]>=60){countC++;}else
          if (myListOfMarks[i]>=50){countD++;}else
            if (myListOfMarks[i]>=45){countE++;}else{countF++;}}// counting each grade 
    System.out.println("Number of occurrences of each grade is:");
    System.out.println("A: "+countA);
    System.out.println("B: "+countB);
    System.out.println("C: "+countC);
    System.out.println("D: "+countD);
    System.out.println("E: "+countE);
    System.out.println("F: "+countF);
    return "";
  }
}
