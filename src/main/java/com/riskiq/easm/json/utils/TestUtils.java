package com.riskiq.easm.json.utils;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class TestUtils {

    public static String readJsonFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
