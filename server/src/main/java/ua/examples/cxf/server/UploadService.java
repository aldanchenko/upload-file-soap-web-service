package ua.examples.cxf.server;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Uploader Service Endpoint Interface (SEI).
 */
@WebService(name = "UploadWS")
public interface UploadService {

    /**
     * File upload method.
     *
     * @param uploadedFile - contains source file to upload and information.
     */
    void uploadFile(@WebParam(name="Dfile") UploadedFile uploadedFile);
}
