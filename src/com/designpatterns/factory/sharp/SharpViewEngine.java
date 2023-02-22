package com.designpatterns.factory.sharp;

import com.designpatterns.factory.match.ViewEngine;

import javax.swing.text.View;
import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String view, Map<String, Object> context) {
        return "View rendered a Sharp";
    }
}
