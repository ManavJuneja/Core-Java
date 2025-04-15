package Multithreading.CH11_Executors;

import java.util.Timer;
import java.util.concurrent.*;

/*
Fetching Data from Multiple APIs in Parallel
Imagine you're building a backend service (say, for a travel booking app) that needs to fetch data
from multiple APIs: flights, hotels, and car rentals—all at once.
You don't want to block your app waiting for each one sequentially.
That’s where Callable + ExecutorService comes in clutch.
 */

//RECS-FG (Return type, ExecutorService, Callable, Submit, Future, Get Result
public class TravelAggregatorService {
    public static void main(String[] args) {
        //Create a thread pool of 3 thread for parallel task
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //callable task to fetch flight data
        Callable<String> fetchFlights = () -> {
            Thread.sleep(2000);//simulate api delay
            return "Flight Data (Indigo, AirAsia)";
        };
        Callable<String> fetchHotels = () -> {
            Thread.sleep(1000);;//simulate api
            return "Hotel Data (OYO, Taj)";
        };
        Callable<String> fetchCarRentals = () -> {
            Thread.sleep(1500);//Simulate API delays
            return "Car Rental Data (ZoomCar, Uber)";
        };

        try{
            //Submit all callables in parallel
            Future<String> flightsFuture = executor.submit(fetchFlights);
            Future<String> hotelFuture = executor.submit(fetchHotels);
            Future<String> carsFuture = executor.submit(fetchCarRentals);


            //Get results (will block until each is done, but they run in parallel)
            String flights = flightsFuture.get(3,TimeUnit.SECONDS);//Max wait 3s
            String hotels = hotelFuture.get(2,TimeUnit.SECONDS);//Max wait 2s
            String cars = carsFuture.get(2,TimeUnit.SECONDS);//Max wait 2s

            //Combine all data like a pro
            System.out.println("== Aggregated Travel Package ==");
            System.out.println(flights);
            System.out.println(hotels);
            System.out.println(cars);
        }catch (TimeoutException e){
            System.err.println("API Timeout: One of the services took long!");
        }
        catch (InterruptedException | ExecutionException e){
            System.err.println("Error during API Call: " + e.getMessage());
        }finally {
            executor.shutdown();
        }
    }

}
