package org.wang;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws UnsupportedEncodingException {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("aaa1"));
        System.out.println(encoder.encode("bbb1"));
        System.out.println(encoder.encode("ccc1"));
        System.out.println(encoder.encode("ddd1"));
        System.out.println(encoder.encode("eee1"));
        System.out.println(encoder.encode("fff1"));

//        String encode = URLEncoder.encode("http://localhost:8080/myapp?x={0}", "UTF-8");
//        System.out.println(encode);

//        String decode = URLDecoder.decode("https://cas.h3cloudos.com:8443/cas/login?service=http%3A%2F%2Flocalhost%3A8088%2Fcallback%3Fclient_name%3DCasClient",
//                "UTF-8");
//        System.out.println(decode);


    }
}
