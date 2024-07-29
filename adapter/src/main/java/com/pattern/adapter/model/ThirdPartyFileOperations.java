package com.pattern.adapter.model;

public class ThirdPartyFileOperations {

    void writeFile(String fileName, String content){
        System.out.println("Writing to file: " + fileName + " with content: " + content);
    }
}
