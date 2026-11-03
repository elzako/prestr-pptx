package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class s0 extends h0 {
   private z6 n5;
   private i9 l6;

   public s0() {
   }

   public s0(a6 var1) {
      this.n5(var1);
   }

   public byte[] n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("rgbData");
      }

      if (this.n5 == null) {
         String var2 = com.aspose.slides.internal.x8w.z3.n5("No RSA key specified");
         throw new CryptographicUnexpectedOperationException(var2);
      }

      if (this.l6 == null) {
         this.l6 = i9.n5();
      }

      return com.aspose.slides.internal.x8w.j5.n5(this.n5, this.l6, var1);
   }

   private void n5(a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      this.n5 = (z6)var1;
   }
}
