package hashcode;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int endpointCount = 0;
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();

        String[] splitted = firstLine.split(" ");
        int noVideos = Integer.parseInt(splitted[0]);
        int noEndpoints = Integer.parseInt(splitted[1]);
        int noRequests = Integer.parseInt(splitted[2]);
        int noCacheServers = Integer.parseInt(splitted[3]);
        int cacheServerSize = Integer.parseInt(splitted[4]);

        Datacenter datacenter = new Datacenter();
        ArrayList<Video> videos = new ArrayList<Video>();

        //SecondLine Data (put in method)
        String secondLine = scanner.nextLine();
        String[] videoSizes = secondLine.split(" ");

        for (int i = 0; i < noVideos; i++ ){
            Video video = new Video();
            video.setId(i);
            video.setSize(Integer.parseInt(videoSizes[i]));
            videos.add(video);
        }
        datacenter.setVideos(videos);

        ArrayList<Endpoint> endpoints = new ArrayList<>();

        for(int i = 0; i < noEndpoints; i++){
            Endpoint endpoint = new Endpoint().generateEndpoint(scanner, noEndpoints, cacheServerSize, endpointCount);
            endpointCount+=1;
            endpoints.add(endpoint);
            System.out.println(endpoint.getId());
        }
        
        ArrayList<Score> scores = new Score().generateScore(scanner, datacenter, noRequests);
        for(int i = 0; i < noRequests; i++){
        	System.out.println(scores.get(i).getScore());
        }
       
    }

}
