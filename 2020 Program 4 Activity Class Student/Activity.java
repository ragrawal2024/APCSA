/**
 * Write a description of class Activity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Activity
{
    private String name, day;
    private int startTime, duration;
    
    public Activity(String name, String day, int startTime, int duration){
        this.name = name;
        this.day = day;
        this.startTime = startTime;
        this.duration = duration;
    }
    
    public Activity(){
        name= "Unknown";
        day = "Monday";
        startTime = 1700;
        duration = 60;
    }
    
    public void setName (String n){
        name = n;
    }
    public void setDay (String n){
        day = n;
    }
    public void setStartTime (int n){
        startTime = n;
    }
    public void setDuration (int n){
        duration = n;
    }
    
    public String getName (){
        return this.name;
    }
    public String getDay (){
        return this.day;
    }
    public int getStartTime (){
        return this.startTime;
    }
    public int getDuration (){
        return this.duration;
    }
    
    @Override
    public String toString(){
        return name + "\t" + day + "\t" + startTime + "\t" + duration + "\t";
    }
    
    public int getEndTime(){
        int endTime = startTime + (duration/60)*100 + duration%60;
        if(endTime%100>=60){
            endTime += 100-endTime%100;
        }
        return endTime;
    }
    
    public boolean overlap(Activity compare){
        if(compare.getStartTime()>=this.getEndTime()||compare.getEndTime()<=this.startTime){
            return true;
        }
        return false;
    }
    
    
    
}