package com.designpatterns;

import com.designpatterns.iterator.BrowserHistory;
import com.designpatterns.iterator.Iterator;
import com.designpatterns.memento.Editor;
import com.designpatterns.memento.History;

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
    }
}