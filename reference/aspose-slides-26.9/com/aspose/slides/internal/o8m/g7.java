package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;

public class g7 extends t2 {
   private z6 n5;
   private f2 l6;

   @Override
   public byte[] n5(byte[] var1) {
      if (this.n5 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("No key pair available."));
      } else if (this.l6 == null) {
         throw new CryptographicUnexpectedOperationException(com.aspose.slides.internal.x8w.z3.n5("Missing hash algorithm."));
      } else if (var1 == null) {
         throw new ArgumentNullException("rgbHash");
      } else {
         return com.aspose.slides.internal.x8w.j5.l6(this.n5, this.l6, var1);
      }
   }

   @Override
   public void n5(String var1) {
      this.l6 = f2.k5(var1);
   }

   @Override
   public void n5(a6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("key");
      }

      this.n5 = (z6)var1;
   }
}
