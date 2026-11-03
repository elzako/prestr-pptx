package com.aspose.slides.internal.x8w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.o8m.f2;
import com.aspose.slides.internal.o8m.z6;

public class c8 extends com.aspose.slides.internal.o8m.t2 {
   private z6 n5;
   private f2 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("MD5SHA1");

   public c8() {
   }

   public c8(com.aspose.slides.internal.o8m.a6 var1) {
      this.n5(var1);
   }

   @Override
   public byte[] n5(byte[] var1) {
      if (this.n5 == null) {
         throw new CryptographicUnexpectedOperationException("The key is a null reference");
      } else if (this.l6 == null) {
         throw new CryptographicUnexpectedOperationException("The hash algorithm is a null reference.");
      } else if (var1 == null) {
         throw new ArgumentNullException("The rgbHash parameter is a null reference.");
      } else {
         return j5.l6(this.n5, this.l6, var1);
      }
   }

   @Override
   public void n5(String var1) {
      switch (k5.n5(var1)) {
         case 0:
            this.l6 = new a6();
            break;
         default:
            this.l6 = f2.k5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.o8m.a6 var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, z6.class)) {
         throw new ArgumentException("Specfied key is not an RSA key");
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(var1, z6.class);
   }
}
