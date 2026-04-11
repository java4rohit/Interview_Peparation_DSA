package RiderAvailabiltyAPp;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class TwoDLocation {
    int x;
    int y;

    public TwoDLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

     public  static void main(String[] args){

         List<Riders> riders = List.of(
                 new Riders(true , new TwoDLocation(1,2),"Amit"),
                 new Riders(false , new TwoDLocation(4,3),"raj"),
                 new Riders(true , new TwoDLocation(0,2),"rohit"),
                 new Riders(true , new TwoDLocation(2,2),"karan")
         );

         Resturant resturant = new Resturant("PizzaHut",
                 new TwoDLocation(1,1));
         int k = 2;
         List<Riders> nesrestRiders = findNearestLcationRider(riders,resturant,k);

     }

    public static int distance(TwoDLocation fistRider,TwoDLocation resDist ) {

        int xdiff = fistRider.x  - resDist.x;
        int ydiff = fistRider. y -  - resDist.y;
        return  xdiff * xdiff + ydiff * ydiff;
    }

    private static List<Riders> findNearestLcationRider(List<Riders> riders, Resturant resturant, int k) {

        PriorityQueue<Riders>  priorityQueue = new PriorityQueue<>(
                (a1,a2) -> Integer.compare(
                        distance(a1.location  , resturant.location),
                        distance(a2.location  , resturant.location)
                )
        );


        System.out.println(priorityQueue);
         return new ArrayList<>();
    }
}

 class Riders {
    String name;
    boolean avaiable;
    TwoDLocation location;

    public Riders(boolean avaiable, TwoDLocation location, String name) {
        this.avaiable = avaiable;
        this.location = location;
        this.name = name;
    }
}

class Resturant {
    String name;
    TwoDLocation location;

    public Resturant(String name,TwoDLocation location) {
        this.location = location;
        this.name = name;
    }
}

 class findRider {

     int distance(TwoDLocation fistRider,TwoDLocation resDist ) {

        int xdiff = fistRider.x  - resDist.x;
         int ydiff = fistRider. y -  - resDist.y;
        return  xdiff * xdiff + ydiff * ydiff;
     }
     //findNearestLcationRider

 }
