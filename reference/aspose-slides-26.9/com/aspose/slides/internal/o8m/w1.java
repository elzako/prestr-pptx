package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class w1 extends t2 {
   private z3 n5;

   @Override
   public byte[] n5(byte[] var1) {
      if (this.n5 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("missing key"));
      } else {
         return this.n5.n5(var1);
      }
   }

   @Override
   public void n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("strName");
      }

      try {
         s4.n5(var1);
      } catch (ClassCastException var3) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("DSA requires SHA1"));
      }
   }

   @Override
   public void n5(a6 var1) {
      if (var1 != null) {
         this.n5 = (z3)var1;
      } else {
         throw new ArgumentNullException("key");
      }
   }
}
