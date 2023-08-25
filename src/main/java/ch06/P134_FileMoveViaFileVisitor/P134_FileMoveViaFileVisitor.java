package ch06.P134_FileMoveViaFileVisitor;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.EnumSet;

public class P134_FileMoveViaFileVisitor {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException {

        Path moveFrom = Paths.get("D:/learning/packt");
        Path moveTo = Paths.get("D:/packt");

        MoveFileVisitor moveFileVisitor = new MoveFileVisitor(moveFrom, moveTo);
        EnumSet opts = EnumSet.of(FileVisitOption.FOLLOW_LINKS);

        Files.walkFileTree(moveFrom, opts, Integer.MAX_VALUE, moveFileVisitor);
    }

}
