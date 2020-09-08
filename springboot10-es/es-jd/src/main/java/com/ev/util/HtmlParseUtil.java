package com.ev.util;

import com.ev.entities.Content;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

@Component
public class HtmlParseUtil {

    public static void main(String[] args) throws Exception {
        List<Content> list = new HtmlParseUtil().parseJD("python");
        for (Content content : list) {
            System.out.println(content);
        }
    }

    public List<Content> parseJD(String keywords) throws Exception {
        String url = "https://search.jd.com/Search?keyword=" + keywords;
        //解析网页
        Document document = Jsoup.parse(new URL(url), 30000);
        //获取js中的方法
        Element element = document.getElementById("J_goodsList");
        /*System.out.println(element)*/
        //获取所有li元素
        Elements elements = element.getElementsByTag("li");
        ArrayList<Content> goodsList = new ArrayList<>();
        for (Element el : elements) {
            String img = el.getElementsByTag("img").eq(0).attr("src");
            String price = el.getElementsByClass("p-price").eq(0).text();
            String name = el.getElementsByClass("p-name").eq(0).text();
            /*System.out.println("============================================");
            System.out.println(img);
            System.out.println(price);
            System.out.println(name);*/
            Content content = new Content();
            content.setTitle(name);
            content.setImg(img);
            content.setPrice(price);
            goodsList.add(content);
        }
        return goodsList;
    }
}
