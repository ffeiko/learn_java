package com.ffeiko.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Created by Administrator on 2017/7/6.
 */
public class jsonp3 {

    public static void main(String[] args) {
        Document doc = null;
        Document doc1 = null;
        try {
            doc = Jsoup.connect("http://www.open-open.com/jsoup/load-document-from-url.htm").get();

             doc1 = Jsoup.connect("http://example.com")
                    .data("query", "Java")
                    .userAgent("Mozilla")
                    .cookie("auth", "token")
                    .timeout(3000)
                    .post();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = doc.title();
        System.out.println(title);
        System.out.println(doc1);
    }
}
