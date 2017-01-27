import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;
import java.lang.Math.*;
public class Lab_12
{
    private int hours, minutes;
	
    private double mph, distance;
    
    public MilesPerHour(double dist, int time1, int time2){
        distance=dist;
        hours=time1;
        minutes=time2;
        mph=0;
    }

    public void setValues(double dist, int time1, int time2){
        distance=dist;
        hours=time1;
        minutes=time2;
        mph=0;
    }

    void calcMPH(){
        mph = (distance / (hours + minutes / 60.0));
    }

    public double getMph(){
        return mph;
    }
}