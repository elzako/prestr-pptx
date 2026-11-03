package com.aspose.slides;

import java.io.OutputStream;

public interface IPresentationInfo {
   boolean isEncrypted();

   boolean isPasswordProtected();

   byte isWriteProtected();

   int getLoadFormat();

   boolean checkPassword(String var1);

   boolean checkWriteProtection(String var1);

   IDocumentProperties readDocumentProperties();

   void updateDocumentProperties(IDocumentProperties var1);

   void writeBindedPresentation(OutputStream var1);

   void writeBindedPresentation(String var1);
}
