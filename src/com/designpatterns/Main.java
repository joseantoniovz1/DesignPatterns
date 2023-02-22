package com.designpatterns;

import com.designpatterns.adapter.CaramelFilter;
import com.designpatterns.adapter.Image;
import com.designpatterns.adapter.ImageView;
import com.designpatterns.adapter.VividFilter;
import com.designpatterns.adapter.avaFilter.Caramel;
import com.designpatterns.bridge.AdvancedRemoteControl;
import com.designpatterns.bridge.RemoteControl;
import com.designpatterns.bridge.SamsungTV;
import com.designpatterns.bridge.SonyTV;
import com.designpatterns.chainOfResponsability.*;
import com.designpatterns.chainOfResponsability.Compressor;
import com.designpatterns.composite.Group;
import com.designpatterns.composite.Shape;
import com.designpatterns.decorator.CloudStream;
import com.designpatterns.decorator.CompressCloudStream;
import com.designpatterns.decorator.EncryptedCloudStream;
import com.designpatterns.decorator.Stream;
import com.designpatterns.facade.Message;
import com.designpatterns.facade.NotificationServer;
import com.designpatterns.facade.NotificationService;
import com.designpatterns.flyweight.PointIconFactory;
import com.designpatterns.flyweight.PointService;
import com.designpatterns.iterator.BrowserHistory;
import com.designpatterns.iterator.Iterator;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;
import com.designpatterns.observer.Chart;
import com.designpatterns.observer.DataSource;
import com.designpatterns.observer.SpreadSheet;
import com.designpatterns.proxy.*;
import com.designpatterns.strategy.*;
import com.designpatterns.template.TransferMoneyTask;
import com.designpatterns.visitor.AnchorNode;
import com.designpatterns.visitor.HeadingNode;
import com.designpatterns.visitor.HighlightOperation;
import com.designpatterns.visitor.HtmlDocument;

import java.lang.reflect.Member;

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

        /* Component Pattern
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
        */

        /* Adapter Pattern
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
         */

        /* Decorator Pattern
        storeCreditCard(new EncryptedCloudStream(new CompressCloudStream(new CloudStream())));
         */

        /* Facade Pattern
        var service = new NotificationService();
        service.send("Hello Message", "target");
         */

        /* Flyweight Pattern
        var service = new PointService(new PointIconFactory());
        for (var point: service.getPoints())
            point.draw();
         */

        /* Bridge Pattern
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
         */

        /* Proxy Pattern
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (var fileName: fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("a");
        library.openEbook("b");
         */

        // Prototype Pattern

    }

    /*
    public static void storeCreditCard(Stream stream) {
        stream.write("123-123-123-1234");
    }
     */
}