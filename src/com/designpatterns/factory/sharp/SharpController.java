package com.designpatterns.factory.sharp;

import com.designpatterns.factory.match.Controller;
import com.designpatterns.factory.match.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
