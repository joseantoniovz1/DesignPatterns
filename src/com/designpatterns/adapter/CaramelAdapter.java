package com.designpatterns.adapter;

import com.designpatterns.adapter.avaFilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter{

    @Override
    public void apply(Image image) {
        init();
        render(image);
    }
}
