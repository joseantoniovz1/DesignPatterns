package com.designpatterns;

import com.designpatterns.chainOfResponsability.*;
import com.designpatterns.chainOfResponsability.Compressor;
import com.designpatterns.iterator.BrowserHistory;
import com.designpatterns.iterator.Iterator;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.observer.Chart;
import com.designpatterns.observer.DataSource;
import com.designpatterns.observer.SpreadSheet;
import com.designpatterns.strategy.*;
import com.designpatterns.template.TransferMoneyTask;

public class Main {
    public static void main(String[] args) {
        /* Memento Pattern
        var editor = new Editor();
        var history = new History();
        editor.setContent("a");

        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
         */

        /* Iterator Pattern
        var history = new BrowserHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            var url = iterator.current();
            System.out.println(url);
            iterator.next();
        }
        */

        /* Strategy Pattern
        var imageStore = new ImageStore(new JpegCompressor(),
                new BlackAndWhiteFilter());
        imageStore.store("a");
        var imageStore2 = new ImageStore(new PngCompressor(),
                new BlackAndWhiteFilter());
        imageStore2.store("b");
         */

        /* Template Patter
        var task = new TransferMoneyTask();
        task.execute();
         */

        /* Observer Patter
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
         */

        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "123"));
    }
}