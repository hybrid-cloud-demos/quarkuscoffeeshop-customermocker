package io.quarkuscoffeeshop.customermocker.domain;

import javax.json.JsonBuilderFactory;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class JsonUtil {

    static final Jsonb jsonb = JsonbBuilder.create();

    static String toJson(Object object) {
        return jsonb.toJson(object);
    }
}
