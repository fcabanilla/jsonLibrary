package com.riskiq.easm.json;

import com.riskiq.easm.json.gson.GsonJsonService;
import com.riskiq.easm.json.jackson.JacksonJsonService;
import com.riskiq.easm.json.utils.TestUtils;
import org.junit.jupiter.api.Test;

public class PerformanceTest {
    private static final String json = TestUtils.readJsonFile("responses/response001.json");
    private static final String jsonPath = "$.data[0].attributes";


    @Test
    public void testJackson() {
        JsonService service = new JacksonJsonService();
        long start = System.currentTimeMillis();
        service.search(json, jsonPath);
        long end = System.currentTimeMillis();
        System.out.println("Jackson duración: " + (end - start) + " ms");
    }

    @Test
    public void testGson() {
        JsonService service = new GsonJsonService();
        long start = System.currentTimeMillis();
        service.search(json, jsonPath);
        long end = System.currentTimeMillis();
        System.out.println("Gson duración: " + (end - start) + " ms");
    }
}
