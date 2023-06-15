package com.riskiq.easm.json.jsoniter;

import com.jsoniter.JsonIterator;
import com.jsoniter.any.Any;
import com.riskiq.easm.json.JsonService;

import java.io.IOException;

public class JsoniterJsonService implements JsonService {

    @Override
    public Object search(String json, String jsonPath) {
        Any any = JsonIterator.deserialize(json);
        Any result = any.get(jsonPath);
        // hacer algo con el resultado
        return null;
    }
}
