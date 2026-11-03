package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class w2 extends u9 {
   private z6 n5;

   public w2() {
   }

   public w2(a6 var1) {
      this.n5(var1);
   }

   public byte[] n5(byte[] var1) {
      if (this.n5 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("No key pair available."));
      } else {
         byte[] var2 = com.aspose.slides.internal.x8w.j5.a6(this.n5, var1);
         if (var2 != null) {
            return var2;
         } else {
            throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("PKCS1 decoding error."));
         }
      }
   }

   public void n5(a6 var1) {
      this.n5 = (z6)var1;
   }
}
