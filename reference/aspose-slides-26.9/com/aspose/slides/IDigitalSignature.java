package com.aspose.slides;

import java.util.Date;

public interface IDigitalSignature {
   byte[] getCertificate();

   boolean isValid();

   Date getSignTime();

   String getComments();

   void setComments(String var1);
}
