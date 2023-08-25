package ch06.P134_SimpleWalkingPaths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class P134_SimpleWalkingPaths {
    
    public static void main(String[] args) throws IOException {
        
        Path path = Paths.get("D:/learning");        
        
        PathVisitor visitor = new PathVisitor();
        Files.walkFileTree(path, visitor);                
    }
    
}
