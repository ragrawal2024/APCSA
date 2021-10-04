
/**
 * Write a description of class ActivityRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActivityRunner
{
    public static void main (String[] args)
    {
          Activity a1 = new Activity("Homework", "Friday",1700,60);
          System.out.println(a1.getName());
          System.out.println(a1.getDay());
          System.out.println(a1.getStartTime());
          System.out.println(a1.getDuration());
          
          Activity a2 = new Activity();
          System.out.println(a2.toString());
          System.out.println(a2.overlap(a1));
          
    }
    
}
