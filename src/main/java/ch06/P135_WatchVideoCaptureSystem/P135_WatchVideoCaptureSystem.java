package ch06.P135_WatchVideoCaptureSystem;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P135_WatchVideoCaptureSystem {

    public static void main(String[] args) throws IOException, InterruptedException {

        final Path path = Paths.get("D:/captures");
        VideoCaptureWatcher watcher = new VideoCaptureWatcher();

        watcher.watchVideoCaptureSystem(path);
    }

}
