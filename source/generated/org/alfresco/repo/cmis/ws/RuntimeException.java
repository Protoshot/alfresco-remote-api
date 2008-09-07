
package org.alfresco.repo.cmis.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.1.2
 * Fri Sep 05 13:45:08 EEST 2008
 * Generated source version: 2.1.2
 * 
 */

@WebFault(name = "runtimeException", targetNamespace = "http://www.cmis.org/2008/05")
public class RuntimeException extends Exception {
    public static final long serialVersionUID = 20080905134508L;
    
    private org.alfresco.repo.cmis.ws.RuntimeExceptionType runtimeException;

    public RuntimeException() {
        super();
    }
    
    public RuntimeException(String message) {
        super(message);
    }
    
    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeException(String message, org.alfresco.repo.cmis.ws.RuntimeExceptionType runtimeException) {
        super(message);
        this.runtimeException = runtimeException;
    }

    public RuntimeException(String message, org.alfresco.repo.cmis.ws.RuntimeExceptionType runtimeException, Throwable cause) {
        super(message, cause);
        this.runtimeException = runtimeException;
    }

    public org.alfresco.repo.cmis.ws.RuntimeExceptionType getFaultInfo() {
        return this.runtimeException;
    }
}
