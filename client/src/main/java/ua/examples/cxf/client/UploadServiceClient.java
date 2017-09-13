package ua.examples.cxf.client;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import ua.examples.cxf.server.UploadWS;
import ua.examples.cxf.server.UploadedFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Client for Upload Web service.
 */
public class UploadServiceClient {

    /**
     * Client entry point.
     *
     * @param args - console arguments
     */
    public static void main(String[] args) throws IOException {
        JaxWsProxyFactoryBean wsProxyFactory = new JaxWsProxyFactoryBean();

        wsProxyFactory.getInInterceptors().add(new LoggingInInterceptor());

        wsProxyFactory.getOutInterceptors().add(new LoggingOutInterceptor());

        wsProxyFactory.setServiceClass(UploadWS.class);
        wsProxyFactory.setAddress("http://localhost:8080/services/UploadWS");

        UploadWS client = (UploadWS) wsProxyFactory.create();

        UploadedFile uploadedFile = new UploadedFile();

        uploadedFile.setName("document1");
        uploadedFile.setFileType("pdf");

        Path filePath = Paths.get("document1.pdf");

        byte[] dataHandler = Files.readAllBytes(filePath);

        uploadedFile.setDataHandler(dataHandler);

        client.uploadFile(uploadedFile);

        System.out.println("Uploaded successfully.");
    }
}
