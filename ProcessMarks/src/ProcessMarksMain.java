public class ProcessMarksMain
{
  public static void main(String[] args) // main methods
  {
    System.out.println(ProcessMarks.max(Marks.getMarks()));
    System.out.println(ProcessMarks.min(Marks.getMarks()));
    System.out.println(ProcessMarks.range(Marks.getMarks()));
    System.out.println(ProcessMarks.mean(Marks.getMarks()));
    System.out.println(ProcessMarks.median(Marks.getMarks()));
    System.out.println(ProcessMarks.mode(Marks.getMarks()));
    System.out.println(ProcessMarks.grade (Marks.getMarks()));
    System.out.println(ProcessMarks.gradeDistn (Marks.getMarks()));
  }
}