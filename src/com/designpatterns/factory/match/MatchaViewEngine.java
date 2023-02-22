package com.designpatterns.factory.match;

import java.util.Map;
import java.util.Objects;

public class MatchaViewEngine implements ViewEngine {

    @Override
    public String render(String view, Map<String, Object> context) {
        return "View rendered by Matcha";
    }

}
