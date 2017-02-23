package hashcode;

import java.util.Dictionary;
import java.util.Enumeration;

/**
 * Created by Niall on 23/02/2017.
 */

public class Cache {

    public int id;
    public int size;
    public Dictionary<Endpoint, Integer> latencies = new Dictionary<Endpoint, Integer>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Enumeration<Endpoint> keys() {
            return null;
        }

        @Override
        public Enumeration<Integer> elements() {
            return null;
        }

        @Override
        public Integer get(Object o) {
            return 0;
        }

        @Override
        public Integer put(Endpoint endpoint, Integer latency) {
            return null;
        }

        @Override
        public Integer remove(Object o) {
            return 0;
        }
    };

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setSize(int id){
        this.id = id;
    }
    public int getSize(){
        return this.id;
    }

    public void setLatencies(Dictionary<Endpoint, Integer> latencies){
        this.latencies = latencies;
    }
    public Dictionary<Endpoint, Integer> getLatencies(){
        return this.latencies;
    }
    
   

}
