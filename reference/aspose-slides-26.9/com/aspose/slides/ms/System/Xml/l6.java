package com.aspose.slides.ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class l6 {
   private byte[] n5;
   private int l6;
   private char[] k5 = new char[76];

   public abstract void n5(char[] var1, int var2, int var3);

   public final void n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (var3 > var1.length - var2) {
         throw new ArgumentOutOfRangeException("count");
      }

      if (this.l6 > 0) {
         int var4;
         for (var4 = this.l6; var4 < 3 && var3 > 0; var3--) {
            this.n5[var4++] = var1[var2++];
         }

         if (var3 == 0 && var4 < 3) {
            this.l6 = var4;
            return;
         }

         int var5 = com.aspose.slides.ms.System.z3.n5(this.n5, 0, 3, this.k5, 0);
         this.n5(this.k5, 0, var5);
      }

      this.l6 = var3 % 3;
      if (this.l6 > 0) {
         var3 -= this.l6;
         if (this.n5 == null) {
            this.n5 = new byte[3];
         }

         for (int var7 = 0; var7 < this.l6; var7++) {
            this.n5[var7] = var1[var2 + var3 + var7];
         }
      }

      int var8 = var2 + var3;

      for (int var9 = 57; var2 < var8; var2 += var9) {
         if (var2 + var9 > var8) {
            var9 = var8 - var2;
         }

         int var6 = com.aspose.slides.ms.System.z3.n5(var1, var2, var9, this.k5, 0);
         this.n5(this.k5, 0, var6);
      }
   }

   public final void n5() {
      if (this.l6 > 0) {
         int var1 = com.aspose.slides.ms.System.z3.n5(this.n5, 0, this.l6, this.k5, 0);
         this.n5(this.k5, 0, var1);
         this.l6 = 0;
      }
   }
}
