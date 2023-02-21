package com.designpatterns;

import com.designpatterns.chainOfResponsability.*;
import com.designpatterns.chainOfResponsability.Compressor;
import com.designpatterns.composite.Group;
import com.designpatterns.composite.Shape;
import com.designpatterns.iterator.BrowserHistory;
import com.designpatterns.iterator.Iterator;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.observer.Chart;
import com.designpatterns.observer.DataSource;
import com.designpatterns.observer.SpreadSheet;
import com.designpatterns.strategy.*;
import com.designpatterns.template.TransferMoneyTask;
import com.designpatterns.visitor.AnchorNode;
import com.designpatterns.visitor.HeadingNode;
import com.designpatterns.visitor.HighlightOperation;
import com.designpatterns.visitor.HtmlDocument;

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

        /* Observer Pattern
        var dataSource = new DataSource();
        var sheet1 = new SpreadSheet(dataSource);
        var sheet2 = new SpreadSheet(dataSource);
        var chart = new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(1);
         */

        /* Chain of Responsability Pattern
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var server = new WebServer(authenticator);

        server.handle(new HttpRequest("admin", "123"));
         */

        /* Composite Pattern
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
         */

        // Component Pattern
        var group1 = new Group();
        group1.add(new Shape());
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape());
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();


    }
}