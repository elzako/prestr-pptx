package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;

public class n5 extends u8 {
   private static final e5[] n5 = new e5[]{new e5(128, 128, 0)};
   private static final e5[] l6 = new e5[]{new e5(128, 256, 64)};

   public n5() {
      this.h0 = n5;
      this.c8 = l6;
      this.k5 = n5[0].n5();
      this.a6 = this.c8[0].n5();
      this.t2 = 8;
      this.s7 = 1;
      this.x8 = 2;
      this.n5();
      this.l6();
   }

   @Override
   public i1 n5(byte[] var1, byte[] var2) {
      this.n5(var1);
      this.l6(var2);
      return new k5(var1, var2, this.n3(), this.y4(), true);
   }

   @Override
   public i1 l6(byte[] var1, byte[] var2) {
      this.n5(var1);
      this.l6(var2);
      return new k5(var1, var2, this.n3(), this.y4(), false);
   }

   @Override
   public void n5() {
      this.u9 = new byte[this.u9() / 8];
      j9 var1 = new j9();
      var1.n5(this.u9);
   }

   @Override
   public void l6() {
      this.u3 = new byte[this.c8() / 8];
      j9 var1 = new j9();
      var1.n5(this.u3);
   }

   private void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("rgbKey", "The value cannot be undefined.");
      }

      if (!this.a6(var1.length * 8)) {
         throw new ArgumentException("The key has an invalid size for this algorithm.", "rgbKey");
      }
   }

   private void l6(byte[] var1) {
      if (this.n3() != 2) {
         if (var1 == null) {
            throw new CryptographicException("The specified encryption mode requires the use of an initialization vector (IV).");
         }

         if (var1.length * 8 != 128) {
            throw new ArgumentException("The specified initialization vector (IV) does not match the block size for this algorithm.", "rgbIV");
         }
      }
   }
}
