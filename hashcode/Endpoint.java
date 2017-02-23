package hashcode;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Scanner;


public class Endpoint {

    public int id;
    public int datacenterLatency;
    public int noCaches;
    public Dictionary<Integer, Cache> latencies = new Dictionary<Integer, Cache>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Enumeration<Integer> keys() {
            return null;
        }

        @Override
        public Enumeration<Cache> elements() {
            return null;
        }

        @Override
        public Cache get(Object o) {
            return null;
        }

        @Override
        public Cache put(Integer latency, Cache cache) {
            return null;
        }

        @Override
        public Cache remove(Object o) {
            return null;
        }
    };
    public Dictionary<Integer, Video> requests = new Dictionary<Integer, Video>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public Enumeration<Integer> keys() {
            return null;
        }

        @Override
        public Enumeration<Video> elements() {
            return null;
        }

        @Override
        public Video get(Object o) {
            return null;
        }

        @Override
        public Video put(Integer integer, Video video) {
            return null;
        }

        @Override
        public Video remove(Object o) {
            return null;
        }
    };

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNoCaches(int caches){
        this.noCaches = caches;
    }
    public int getNoCaches(){
        return this.noCaches;
    }
    public void setDatacenterLatency(int datacenterLatency){
        this.datacenterLatency = datacenterLatency;
    }
    public int getDatacenterLatency(){
        return this.datacenterLatency;
    }
    public void setLatencies(Dictionary<Integer, Cache> latencies){
        this.latencies = latencies;
    }
    public Dictionary<Integer, Cache> getLatencies(){
        return this.latencies;
    }
    public void setRequests(Dictionary<Integer, Video> requests){
        this.requests = requests;
    }
    public Dictionary<Integer, Video> getRequests(){
        return this.requests;
    }

    public Endpoint generateEndpoint (Scanner scanner, int noEndpoints, int cacheSize, int endpointCount){
        String endpointData = scanner.nextLine();
        String[] data = endpointData.split(" ");
        Endpoint endpoint = new Endpoint();
        endpoint.setId(endpointCount);
        endpoint.setDatacenterLatency(Integer.parseInt(data[0]));
        endpoint.setNoCaches(Integer.parseInt(data[1]));
        for(int i = 0; i < endpoint.noCaches; i++){
            Dictionary latencies = new Dictionary() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public Enumeration keys() {
                    return null;
                }

                @Override
                public Enumeration elements() {
                    return null;
                }

                @Override
                public Object get(Object o) {
                    return null;
                }

                @Override
                public Object put(Object o, Object o2) {
                    return null;
                }

                @Override
                public Object remove(Object o) {
                    return null;
                }
            };
            Cache cache = new Cache();
            String cacheData = scanner.nextLine();
            String[] cacheStr = cacheData.split(" ");
            cache.setId(Integer.parseInt(cacheStr[0]));
            cache.setSize(cacheSize);
            latencies.put(endpoint, Integer.parseInt(cacheStr[1]));
            cache.setLatencies(latencies);

        }

        return endpoint;

    }
}

