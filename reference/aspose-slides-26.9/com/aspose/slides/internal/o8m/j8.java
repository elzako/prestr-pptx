package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class j8 extends u9 {
   private z6 n5;

   public j8() {
   }

   public j8(a6 var1) {
      this.n5(var1);
   }

   public byte[] n5(byte[] var1) {
      if (this.n5 == null) {
         String var4 = com.aspose.slides.internal.x8w.z3.n5("No RSA key specified");
         throw new CryptographicUnexpectedOperationException(var4);
      } else {
         s4 var2 = s4.a6();
         byte[] var3 = com.aspose.slides.internal.x8w.j5.n5(this.n5, var2, var1);
         if (var3 != null) {
            return var3;
         } else {
            throw new CryptographicException(com.aspose.slides.internal.x8w.z3.n5("OAEP decoding error."));
         }
      }
   }

   public void n5(a6 var1) {
      this.n5 = (z6)var1;
   }
}
