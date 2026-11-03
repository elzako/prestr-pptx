package com.aspose.slides;

import com.aspose.slides.exceptions.InvalidOperationException;
import java.util.Date;

public class DigitalSignature implements IDigitalSignature {
   private com.aspose.slides.internal.f3c.h0 n5;
   private String l6;
   private com.aspose.slides.ms.System.j5 k5 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.o5<Boolean> u3 = new com.aspose.slides.ms.System.o5<>();

   public DigitalSignature(byte[] certData, String password) {
      this.n5 = new com.aspose.slides.internal.f3c.h0(certData, password);
   }

   public DigitalSignature(String filePath, String password) {
      this.n5 = new com.aspose.slides.internal.f3c.h0(filePath, password);
   }

   DigitalSignature() {
   }

   @Override
   public final byte[] getCertificate() {
      return this.n5.x8();
   }

   final com.aspose.slides.internal.f3c.h0 n5() {
      return this.n5;
   }

   final void n5(com.aspose.slides.internal.f3c.h0 var1) {
      if (this.n5 == null) {
         this.n5 = var1;
      } else {
         throw new InvalidOperationException("Certificate is already set.");
      }
   }

   @Override
   public final boolean isValid() {
      return com.aspose.slides.ms.System.o5.n5(this.u3, new com.aspose.slides.ms.System.o5<>(true));
   }

   final void n5(boolean var1) {
      this.u3 = new com.aspose.slides.ms.System.o5<>(var1);
   }

   @Override
   public final Date getSignTime() {
      return com.aspose.slides.ms.System.j5.k5(this.l6());
   }

   com.aspose.slides.ms.System.j5 l6() {
      return this.k5;
   }

   final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.k5);
   }

   @Override
   public final String getComments() {
      String var1 = this.l6;
      if (var1 == null) {
         var1 = "";
      }

      return var1;
   }

   @Override
   public final void setComments(String value) {
      this.l6 = value;
   }
}
