package com.ffeiko.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/6.
 */
public class jsonp4 {

    public static void main(String[] args) {
        File input = new File("/tmp/input.html");
        Document doc = null;
        try {
            doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements links = doc.select("a[href]"); //带有href属性的a元素
        Elements pngs = doc.select("img[src$=.png]");
        //扩展名为.png的图片

        Element masthead = doc.select("div.masthead").first();
        //class等于masthead的div标签

        Elements resultLinks = doc.select("h3.r > a"); //在h3元素之后的a元素
    }
}
