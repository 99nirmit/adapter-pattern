package com.pattern.adapter.model;

public class FileOperationsAdapter implements FileOperations{

    private ThirdPartyFileOperations thirdPartyFileOperations;

    public FileOperationsAdapter(ThirdPartyFileOperations thirdPartyFileOperations){
        this.thirdPartyFileOperations = thirdPartyFileOperations;
    }

    @Override
    public void saveFile(String fileName, String content) {
        thirdPartyFileOperations.writeFile(fileName, content);
    }
}
