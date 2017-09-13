package ua.examples.cxf.server;

import javax.activation.DataHandler;

/**
 * Contains file information and data handler.
 */
public class UploadedFile {
    private String name;

    private String fileType;

    private DataHandler dataHandler;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public DataHandler getDataHandler() {
        return dataHandler;
    }

    public void setDataHandler(DataHandler dataHandler) {
        this.dataHandler = dataHandler;
    }
}
