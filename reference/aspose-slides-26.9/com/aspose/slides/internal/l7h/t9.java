package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public abstract class t9 {
   public q0 n5 = null;
   public z3 l6 = null;

   protected t9() {
   }

   public final q0 n5() {
      return this.n5;
   }

   public final z3 l6() {
      if (this.l6 == null) {
         if (this.n5 != null) {
            this.l6 = this.n5.n5();
         } else {
            this.l6 = q0.k5().n5();
         }
      }

      return this.l6;
   }

   public final boolean k5() {
      return this.l6 != null;
   }

   public void u3() {
      char[] var1 = new char[0];
      byte[] var2 = new byte[this.n5(var1, 0, 0, true)];
      this.n5(var1, 0, 0, var2, 0, true);
      if (this.l6 != null) {
         this.l6.u3();
      }
   }

   public abstract int n5(char[] var1, int var2, int var3, boolean var4);

   public abstract int n5(char[] var1, int var2, int var3, byte[] var4, int var5, boolean var6);

   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, boolean var7) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var3 >= 0 && var6 >= 0) {
         char[] var8 = new char[var3];

         for (int var9 = 0; var9 < var3; var9++) {
            var8[var9] = var1[var9 + var2];
         }

         byte[] var10 = new byte[var6];
         int var11 = this.n5(var8, 0, var3, var10, 0, var7);
         if (var11 < var6) {
            var6 = var11;
         }

         for (int var12 = 0; var12 < var6; var12++) {
            var4[var12] = var10[var12 + var5];
         }

         return var6;
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
      }
   }

   public void n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var3 < 0 || var6 < 0) {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
      }

      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var5 >= 0 && var6 >= 0) {
            if (var1.length - var2 < var3) {
               throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
            }

            if (var4.length - var5 < var6) {
               throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
            }

            for (var8[0] = var3; var8[0] > 0; var8[0] /= 2) {
               if (this.n5(var1, var2, var8[0], var7) <= var6) {
                  var9[0] = this.n5(var1, var2, var8[0], var4, var5, var7);
                  var10[0] = var8[0] == var3 && (this.l6 == null || this.l6.k5() == 0);
                  return;
               }

               var7 = false;
            }

            throw new ArgumentException("Conversion buffer overflow.");
         } else {
            throw new ArgumentOutOfRangeException(var5 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }
   }
}
