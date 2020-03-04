package com.knoldus.day2.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCountUtil {
    public Map<String, Integer> getWordCountOfDataFromFile(String filePath) {
        Map<String, Integer> result = new HashMap<>();
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            lines.forEach(line -> Arrays.stream(line.split(" "))
                    .forEach(str -> {
                        int one = 1;
                        if (result.containsKey(str)) {
                            result.replace(str, result.get(str) + one);
                        } else {
                            result.put(str, one);
                        }

                    }));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
