package com.tuiling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.regex.Matcher;
public class UrlPool {
    public static void main(String[] args) {
        getUrl("https://www.nipic.com/");
    }

    //初始 首页地址
    private static void getUrl(String baseurl) {
        Map<String, Boolean> oldMap = new LinkedHashMap<String, Boolean>(); //存放容器
        String oldLinkHost = "";   //取一个域名
        Pattern p = Pattern.compile("(https?://)?[^/\\s]");//用正则表达式获取出来，小括号里是正则表达式的匹配机制
        Matcher m = p.matcher(baseurl);
        //如果有东西，也算取到值了
        if (m.find()) {
            //开始匹配
            oldLinkHost = m.group();
        }
        String baseUrl = null;
        oldMap.put(baseUrl, false);
        oldMap = crawlLinks(oldLinkHost, oldMap);
        for (Map.Entry<String, Boolean> mapping : oldMap.entrySet()) {
            System.out.println("链接：" + mapping.getKey());
        }

    }

    //以下是递归方法 也是代码的主逻辑
    private static Map<String, Boolean> crawlLinks(String oldLinkHost, Map<String, Boolean> oldMap) {
        Map<String, Boolean> newMap = new LinkedHashMap<String, Boolean>(); //换成正在遍历中的容器
        String oldLInk = "";
        for (Map.Entry<String, Boolean> mapping : oldMap.entrySet()) {
            //用if来判断是否遍历过
            if (!mapping.getValue()) {
                String oldLink = mapping.getKey();
                try {
                    URL url = new URL(oldLink);
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("Get");
                    if (connection.getResponseCode() == 200) {
                        BufferedReader reader = new BufferedReader(
                                new InputStreamReader(connection.getInputStream()));
                        Pattern p = Pattern.compile("<a.*?href=[\"'] ?((https?://)?/?[^\"']+)[\"']?");
                        Matcher matcher = null;
                        String line = "";
                        while ((line = reader.readLine()) != null) {
                            matcher = p.matcher(line);
                            if (matcher.find()) {
                                String newLink = matcher.group(1).trim();
                                if (!newLink.startsWith("https")) {
                                    if (newLink.startsWith("/")) {
                                        newLink = oldLinkHost + newLink;
                                    } else {
                                        newLink = oldLinkHost + "/" + newLink;
                                    }
                                }
                                if (newLink.endsWith("/")) {
                                    newLink = newLink.substring(0, newLink.length() - 1);

                                }
                                if (!oldMap.containsKey(newLink)
                                        && !newMap.containsKey(newLink)
                                        && !newLink.startsWith(oldLinkHost)) {
                                    newMap.put(newLink, false);

                                }
                            }
                        }
                    }

                } catch (Exception e) {

                } finally {

                }
                oldMap.replace(oldLink, false, true);
            }
        }

            if (!newMap.isEmpty()) {
                oldMap.putAll(newMap);
                oldMap.putAll(crawlLinks(oldLinkHost, oldMap));
            }
            return oldMap;
        }

    }

