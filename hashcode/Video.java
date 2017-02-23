package hashcode;

import java.util.ArrayList;
import java.util.List;


public class Video {
    public int id;
    public int size;
    public int requests;
    public ArrayList<Cache> cacheServers;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return this.size;
    }
    public void setRequests(int requests){
        this.requests = requests;
    }
    public int getRequests(){
        return this.requests;
    }
    public void setCacheServers(int size){
        this.size = size;
    }
    public ArrayList<Cache> getCacheServers(){
        return this.cacheServers;
    }
}
