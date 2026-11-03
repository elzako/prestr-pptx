package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;

public final class ProtectionManager implements IProtectionManager {
   private Presentation n5;
   private boolean l6;
   private String k5;
   private boolean u3 = true;
   private boolean a6;
   private com.aspose.slides.internal.k0r.f7 u9;

   @Override
   public final boolean getEncryptDocumentProperties() {
      return this.u3;
   }

   @Override
   public final void setEncryptDocumentProperties(boolean value) {
      if (this.isOnlyDocumentPropertiesLoaded() && value) {
         throw new InvalidOperationException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"EncryptDocumentProperties must be false ", "when property IsOnlyDocumentPropertiesLoaded is true."})
         );
      }

      this.u3 = value;
   }

   @Override
   public final boolean isEncrypted() {
      return this.l6;
   }

   @Override
   public final boolean isOnlyDocumentPropertiesLoaded() {
      return this.u9 != null;
   }

   @Override
   public final boolean isWriteProtected() {
      return this.n5.n3().n5().n5() || this.n5.y4().l6().n5();
   }

   @Override
   public final void encrypt(String encryptionPassword) {
      this.l6 = true;
      this.k5 = encryptionPassword;
   }

   @Override
   public final void removeEncryption() {
      this.l6 = false;
      this.k5 = null;
   }

   @Override
   public final void setWriteProtection(String password) {
      this.n5.n3().n5().n5(password);
      this.n5.y4().l6().n5(password);
   }

   @Override
   public final void removeWriteProtection() {
      this.n5.n3().n5().l6();
      this.n5.y4().l6().l6();
   }

   @Override
   public final boolean checkWriteProtection(String password) {
      return this.n5.y4().l6().l6(password) || this.n5.n3().n5().l6(password);
   }

   ProtectionManager(Presentation parentPresentation) {
      this.n5 = parentPresentation;
   }

   @Override
   public final String getEncryptionPassword() {
      return this.k5;
   }

   @Override
   public final boolean getReadOnlyRecommended() {
      return this.a6;
   }

   @Override
   public final void setReadOnlyRecommended(boolean value) {
      this.a6 = value;
   }

   final void n5(com.aspose.slides.internal.z0k.t4 var1) {
      var1.setPosition(0L);

      com.aspose.slides.internal.x1.x8 var2;
      try {
         var2 = new com.aspose.slides.internal.x1.x8(var1);
      } catch (com.aspose.slides.internal.x1.u3 var4) {
         throw new PptxUnsupportedFormatException(var4.getMessage(), var4);
      } catch (RuntimeException var5) {
         throw new PptxReadException("Can't read MSCDFileSystem.", var5);
      }

      com.aspose.slides.internal.x1.x8 var3 = var2;
      if (var3.n5().l6("EncryptedPackage") && var3.n5().l6("EncryptionInfo")) {
         this.u3 = !var3.n5().l6("\u0005SummaryInformation") && !var3.n5().l6("]ocumentSummaryInformation");
         if (!this.u3) {
            this.n5.n5(var3);
         }
      }
   }

   final void n5(com.aspose.slides.internal.x1.x8 var1) {
      this.u3 = !var1.n5().l6("\u0005SummaryInformation") && !var1.n5().l6("]ocumentSummaryInformation");
      if (this.n5.a6().getOnlyLoadDocumentProperties()) {
         if (this.u3) {
            this.u9 = null;
            throw new InvalidPasswordException(
               com.aspose.slides.ms.System.d1.n5(new String[]{
                  "Can't load document properties. ",
                  "Document properties are encrypted. ",
                  "Set LoadOptions.OnlyLoadDocumentProperties to false ",
                  "and try to load presentation with right password."
               })
            );
         }

         this.u9 = new com.aspose.slides.internal.k0r.f7(var1, true);
         this.n5.n5(var1);
      } else {
         throw new InvalidPasswordException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Presentation is encrypted but LoadOptions.Password is null. ", "Set right password or set LoadOptions.OnlyLoadDocumentProperties to true."
            })
         );
      }
   }

   final void n5() {
      if (this.getEncryptionPassword() == null) {
         throw new InvalidPasswordException(
            com.aspose.slides.ms.System.d1.n5(new String[]{
               "Presentation is encrypted but LoadOptions.Password is null. ", "Load presentation with right password or remove presentation encryption."
            })
         );
      }
   }
}
