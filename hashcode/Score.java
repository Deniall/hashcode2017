package hashcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Niall on 23/02/2017.
 */

public class Score {

    public int requests;
    public int videoId;
    public int endpointId;
    public double score;
    public int getRequests(){
        return this.requests;
    }
    public void setRequests(int requests){
        this.requests = requests;
    }
    public int getVideoId(){
        return this.videoId;
    }
    public void setVideoId(int videoId){
        this.videoId = videoId;
    }
    public int getEndpointId(){
        return this.endpointId;
    }
    public void setEndpointId(int endpointId){
        this.endpointId = endpointId;
    }
    public double getScore(){
        return this.score;
    }
    public void setScore(double score){
        this.score = score;
    }
    
    public ArrayList<Score> generateScore(Scanner scanner, Datacenter datacenter, int requests){
        ArrayList<Score> scoreLst = new ArrayList<>();
    	for(int i = 0; i < requests; i++){
        	String request = scanner.nextLine();
        	String[] reqStr = request.split(" ");
        	this.videoId = Integer.parseInt(reqStr[0]);
        	this.endpointId = Integer.parseInt(reqStr[1]);
        	this.requests = Integer.parseInt(reqStr[2]);
        	Video video = datacenter.getVideo(videoId);
            double score = this.requests / video.getSize();
            this.setScore(score);
            scoreLst.add(this);
        }
    	return scoreLst;
    };
}
