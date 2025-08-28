package com.example.demo2;

import org.apache.axis2.AxisFault;
import org.apache.axis2.context.MessageContext;
import org.apache.axis2.engine.AxisConfiguration;
import org.apache.axis2.kernel.http.HTTPConstants;
// import org.apache.axis2.transport.http.HTTPConstants;

public class Axis2ServiceUtil {
    // Example: Get Axis2 configuration
    public static AxisConfiguration getAxisConfiguration() throws AxisFault {
        MessageContext msgCtx = MessageContext.getCurrentMessageContext();
        if (msgCtx != null) {
            return msgCtx.getConfigurationContext().getAxisConfiguration();
        }
        throw new AxisFault("No MessageContext available");
    }

    // Example: Set a custom HTTP header in the response
    public static void setCustomHeader(String headerName, String headerValue) {
        MessageContext msgCtx = MessageContext.getCurrentMessageContext();
        if (msgCtx != null) {
            msgCtx.setProperty(HTTPConstants.HTTP_HEADERS, headerName + ": " + headerValue);
        }
    }
}
