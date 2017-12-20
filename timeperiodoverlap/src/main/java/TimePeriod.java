import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimePeriod {
    private LocalTime startPeriod;
    private LocalTime endPeriod;


    public TimePeriod(LocalTime startPeriod, LocalTime endPeriod){
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
    }

    public boolean overlapsWith(TimePeriod timePeriod){


        if (this.startPeriod.isBefore(timePeriod.getEndPeriod()) &&
                this.getEndPeriod().isAfter(timePeriod.getEndPeriod())){
        return true ;
        }


        return false;
    }




    public LocalTime getEndPeriod(){
        return this.endPeriod;
    }
    public LocalTime getStartPeriod(){
        return this.startPeriod;
    }

    public void setStartPeriod(LocalTime startPeriod){
        this.startPeriod = startPeriod;
    }
    public void setEndPeriod(LocalTime endPeriod){
        this.endPeriod = endPeriod;
    }
}
