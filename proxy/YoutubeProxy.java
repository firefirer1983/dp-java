package proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;


class YoutubeProxy {

    private YoutubeService service = null;

    private HashMap<String, Video> videoCache;

    public YoutubeProxy() {
        HashMap<String, Video> videoCache = new HashMap<String, Video>();
        service = new YoutubeService();
    }

    public HashMap<String, Video> getPopularVideos() {
        HashMap<String, Video> popular = service.getPopularVideos();
        Iterator iter = popular.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry video = (Map.Entry)iter.next();
            if (videoCache.containsKey((String)(video.getKey()))) {
                videoCache.put((String)(video.getKey()), (Video)(video.getValue()));
            }
        }
        return popular;
    }

    public Video getVideo(String vid) {
        Video v = videoCache.get(vid);
        if(v == null) {
            v = service.getVideo(vid);
            if(!videoCache.containsKey(vid)) {
                videoCache.put(vid, v);
            }
        }
        return v;
    }
}