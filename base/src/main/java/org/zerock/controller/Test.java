package org.zerock.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class Test {
    
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        System.out.println(ClassLoader.getSystemClassLoader().getResource(".").getPath());
        
        String path = "/Users/jang-won-yong/dev/workspace/ToyProject/base/bin/";
        File dirFile = new File(path);
        File[] fileList = dirFile.listFiles();
        for (File tempFile : fileList) {
            if (tempFile.isFile()) {
                String tempPath = tempFile.getParent();
                String tempFileName = tempFile.getName();
                System.out.println("Path=" + tempPath);
                System.out.println("FileName=" + tempFileName);
                /*** Do something withd tempPath and temp FileName ^^; ***/
            }
        }


    }
    
}
