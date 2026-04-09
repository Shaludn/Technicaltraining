package week4.DataStructures.Nonlinear.Heaps;

import java.time.LocalDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

//Comparator: Multiple Values
class Patient{
    String name;
    int severity;
    LocalDateTime arrivalTime;

    public Patient(String name, int severity, LocalDateTime arrivalTime){
        this.name=name;
        this.severity=severity;
        this.arrivalTime=arrivalTime;
    }
    @Override
    public String toString(){
        return name + "(severity="+ severity + ", arrival="+ arrivalTime+ ")";
    }
}

public class EmergencyRoomLII {
    public static void main(String[] args) {
        //Custom Comparator : first ny severit . then by arrival time
        Queue<Patient> queue=new PriorityQueue<>((p1,p2) -> {
            if(p1.severity!=p2.severity){
                return Integer.compare(p1.severity, p2.severity);
            }else{
                return p1.arrivalTime.compareTo(p2.arrivalTime);
            }
        });
        //Simualting the patient based on arrival time
        queue.offer(new Patient("Allen", 3,
                LocalDateTime.of(2026, 4,9,10,0)));
        queue.offer(new Patient("Adam", 1,
                LocalDateTime.of(2026, 4,9,10,5)));
        queue.offer(new Patient("Britney", 1,
                LocalDateTime.of(2026, 4,9,10,2)));
        //Lets print the patient whos treated frst
        Patient treated=queue.poll();
        System.out.println("Patient that gets operated first:"+ treated);
        //Remaining patients
        System.out.println("Patinet in queue: "+queue);
    }

}
