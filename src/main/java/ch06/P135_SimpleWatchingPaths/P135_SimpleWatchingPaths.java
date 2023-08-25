package ch06.P135_SimpleWatchingPaths;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P135_SimpleWatchingPaths {

    public static void main(String[] args) throws IOException, InterruptedException {

        final Path path = Paths.get("D:/learning/packt");
        FolderWatcher watcher = new FolderWatcher();

        watcher.watchFolder(path);
    }

}
