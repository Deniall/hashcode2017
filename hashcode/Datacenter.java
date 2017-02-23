package hashcode;

import java.util.ArrayList;

/**
 * Created by Niall on 23/02/2017.
 */

public class Datacenter {
    public ArrayList<Video> videos;

    public ArrayList<Video> getVideos(){
        return this.videos;
    }
    public void setVideos(ArrayList<Video> videos){
        this.videos = videos;
    }

    public Video getVideo(int index){
        return videos.get(index);
    }
}
