package com.riskiq.easm.json.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.riskiq.easm.json.JsonService;

public class FastjsonJsonService implements JsonService {

    @Override
    public Object search(String json, String jsonPath) {
        JSONObject jsonObject = JSON.parseObject(json);
        Object result = jsonObject.get(jsonPath);
        // hacer algo con el resultado
        return result;
    }
}
