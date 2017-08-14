package com.ffeiko.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

/**
 * Created by Administrator on 2017/7/6.
 */
public class jsonp6 {

    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("http://www.open-open.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element link = doc.select("a").first();
        String relHref = link.attr("href"); // == "/"
        String absHref = link.attr("abs:href"); // "http://www.open-open.com/"
        System.out.println(relHref);
        System.out.println(absHref);
    }
}
