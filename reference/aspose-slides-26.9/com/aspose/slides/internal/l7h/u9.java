package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class u9 {
   public t2 l6 = null;
   public s7 k5 = null;

   protected u9() {
   }

   public final t2 k5() {
      return this.l6;
   }

   public final s7 u3() {
      if (this.k5 == null) {
         if (this.l6 != null) {
            this.k5 = this.l6.n5();
         } else {
            this.k5 = t2.k5().n5();
         }
      }

      return this.k5;
   }

   public final boolean a6() {
      return this.k5 != null;
   }

   public void n5() {
      byte[] var1 = new byte[0];
      char[] var2 = new char[this.n5(var1, 0, 0, true)];
      this.n5(var1, 0, 0, var2, 0, true);
      if (this.k5 != null) {
         this.k5.k5();
      }
   }

   public abstract int n5(byte[] var1, int var2, int var3);

   public int n5(byte[] var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      byte[] var5 = new byte[var3];

      for (int var6 = 0; var6 < var3; var6++) {
         var5[var6] = var1[var6 + var2];
      }

      return this.n5(var5, 0, var3);
   }

   public abstract int n5(byte[] var1, int var2, int var3, char[] var4, int var5);

   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, boolean var6) {
      return this.n5(var1, var2, var3, var4, var5);
   }

   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var3 >= 0 && var6 >= 0) {
         byte[] var8 = new byte[var3];

         for (int var9 = 0; var9 < var3; var9++) {
            var8[var9] = var1[var9 + var2];
         }

         char[] var10 = new char[var6];
         int var11 = this.n5(var8, 0, var3, var10, 0, var7);
         if (var11 < var6) {
            var6 = var11;
         }

         for (int var12 = 0; var12 < var6; var12++) {
            var4[var12 + var5] = var10[var12];
         }

         return var6;
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
      }
   }

   public void n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var3 < 0 || var6 < 0) {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
      }

      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var5 >= 0 && var6 >= 0) {
            if (var1.length - var2 < var3) {
               throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
            }

            if (var4.length - var5 < var6) {
               throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
            }

            for (var8[0] = var3; var8[0] > 0; var8[0] /= 2) {
               if (this.n5(var1, var2, var8[0], var7) <= var6) {
                  var9[0] = this.n5(var1, var2, var8[0], var4, var5, var7);
                  var10[0] = var8[0] == var3 && (this.k5 == null || this.k5.l6() == 0);
                  return;
               }

               var7 = false;
            }

            throw new ArgumentException("Conversion buffer overflow.");
         } else {
            throw new ArgumentOutOfRangeException(var5 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }
   }
}
