package com.gr.jiang.streamtest;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * Created by jiang on 2017/10/16.
 */
public class Streams2 {
    public static void main(String [] args){
        final Path path = new File("/Users/jiang/Documents/learn/workspace/Java8Project/src/com/gr/jiang/streamtest/Streams2.java").toPath();
        try(Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8)){
            lines.onClose(() -> System.out.println("Done")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
