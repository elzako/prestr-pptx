package com.aspose.slides;

public interface IProtectionManager {
   boolean getEncryptDocumentProperties();

   void setEncryptDocumentProperties(boolean var1);

   boolean isEncrypted();

   boolean isOnlyDocumentPropertiesLoaded();

   boolean isWriteProtected();

   String getEncryptionPassword();

   boolean getReadOnlyRecommended();

   void setReadOnlyRecommended(boolean var1);

   void encrypt(String var1);

   void removeEncryption();

   void setWriteProtection(String var1);

   void removeWriteProtection();

   boolean checkWriteProtection(String var1);
}
