package ua.examples.cxf.server;

import javax.activation.DataHandler;
import javax.jws.WebService;
import java.io.*;

/**
 * Implementation of {@link UploadService} SEI.
 */
@WebService(endpointInterface = "ua.examples.cxf.server.UploadService")
public class UploadServiceEndpointImpl implements UploadService {

    /**
     * Implementation of method.
     *
     * @param uploadedFile - contains source file to upload and information.
     */
    public void uploadFile(UploadedFile uploadedFile) {
        DataHandler dataHandler = uploadedFile.getDataHandler();

        try {
            InputStream inputStream = dataHandler.getInputStream();

            OutputStream fileOutputStream = new FileOutputStream(new File(uploadedFile.getName() + "." + uploadedFile.getFileType()));

            byte[] bytesBuffer = new byte[100000];

            int bytesRead;

            while ((bytesRead = inputStream.read(bytesBuffer)) != -1) {
                fileOutputStream.write(bytesBuffer, 0, bytesRead);
            }

            fileOutputStream.flush();

            fileOutputStream.close();
            inputStream.close();

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
