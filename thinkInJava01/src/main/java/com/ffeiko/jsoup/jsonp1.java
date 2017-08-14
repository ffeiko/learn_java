package com.ffeiko.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by Administrator on 2017/7/6.
 */
public class jsonp1
{

    public static void main(String[] args) {
        String html = "<html><head><title>First parse</title></head>"
                + "<body><p>Parsed HTML into a doc.</p></body></html>";
        Document doc = Jsoup.parse(html);
        System.out.println(doc);
    }







}
