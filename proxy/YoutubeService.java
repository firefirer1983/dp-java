package proxy;

import java.util.HashMap;


class YoutubeService {

    private HashMap<String, Video> videoRepo = new HashMap<String, Video>();

    public YoutubeService() {
        netWorkDelay();
        videoRepo.put("catzzzzzzzzz", new Video("sadgahasgdas", 3600, "Catzzzz.avi"));
        videoRepo.put("mkafksangasj", new Video("mkafksangasj", 4800, "Dog play with ball.mp4"));
        videoRepo.put("dancesvideoo", new Video("asdfas3ffasd", 5200, "Dancing video.mpq"));
        videoRepo.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", 6000, "Barcelona vs RealM.mov"));
        videoRepo.put("3sdfgsd1j333", new Video("3sdfgsd1j333", 1200, "Programing lesson#1.avi"));
    }

    public HashMap<String, Video> getPopularVideos() {
        netWorkDelay();
        HashMap<String, Video> popular = new HashMap<String, Video>();
        popular.put("catzzzzzzzzz", videoRepo.get("catzzzzzzzzz"));
        popular.put("mkafksangasj", videoRepo.get("mkafksangasj"));
        popular.put("dancesvideoo", videoRepo.get("dancesvideoo"));
        return popular;
    }

    public Video getVideo(String vid) {
        netWorkDelay();
        return videoRepo.get(vid);
    }

    private void netWorkDelay() {
        int min = 5;
        int max = 10;
        int randDelayCnt = min + (int)(Math.random()*(max- min + 1));
        for (int i=0; i<randDelayCnt; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }
}