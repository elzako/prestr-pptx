package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class v3 extends c8 {
   private z6 n5;
   private String l6;

   public v3() {
   }

   public v3(a6 var1) {
      this.n5(var1);
   }

   @Override
   public void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("strName");
      }

      this.l6 = var1;
   }

   @Override
   public void n5(a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      this.n5 = (z6)var1;
   }

   @Override
   public boolean n5(byte[] var1, byte[] var2) {
      if (this.n5 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("No public key available."));
      } else if (this.l6 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("Missing hash algorithm."));
      } else if (var1 == null) {
         throw new ArgumentNullException("rgbHash");
      } else if (var2 == null) {
         throw new ArgumentNullException("rgbSignature");
      } else {
         return com.aspose.slides.internal.x8w.j5.n5(this.n5, f2.k5(this.l6), var1, var2);
      }
   }
}
