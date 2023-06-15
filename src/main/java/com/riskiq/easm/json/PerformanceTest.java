package com.riskiq.easm.json;

import com.riskiq.easm.json.fastjson.FastjsonJsonService;
import com.riskiq.easm.json.gson.GsonJsonService;
import com.riskiq.easm.json.jackson.JacksonJsonService;
import com.riskiq.easm.json.jsoniter.JsoniterJsonService;
import com.riskiq.easm.json.utils.TestUtils;
import org.junit.jupiter.api.Test;

public class PerformanceTest {
    private static final String json = TestUtils.readJsonFile("responses/response001.json");
    private static final String jsonPath = "$.data[0].attributes";

    @Test
    public void testJackson() {
        testService(new JacksonJsonService());
    }

    @Test
    public void testGson() {
        testService(new GsonJsonService());
    }

    @Test
    public void testJsoniter() {
        testService(new JsoniterJsonService());
    }

    @Test
    public void testFastjson() {
        testService(new FastjsonJsonService());
    }

    private void testService(JsonService service) {
        long start = System.currentTimeMillis();
        service.search(json, jsonPath);
        long end = System.currentTimeMillis();
        System.out.println(service.getClass().getSimpleName() + " duration: " + (end - start) + " ms");
    }
}
