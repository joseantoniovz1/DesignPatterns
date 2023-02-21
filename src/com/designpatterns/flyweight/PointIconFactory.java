package com.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {

    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType pointType) {
        if(!icons.containsKey(pointType)){
            var icon = new PointIcon(pointType, null);
            icons.put(pointType, icon);
        }
        return icons.get(pointType);
    }

}
