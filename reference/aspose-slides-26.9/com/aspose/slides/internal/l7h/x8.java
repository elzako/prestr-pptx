package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class x8 extends u9 {
   private j5 n5;
   private boolean u9;
   public boolean u3;
   public int a6;

   public x8(j5 var1) {
      this.n5 = var1;
      this.l6 = this.n5.n3();
      this.n5();
   }

   public x8() {
      this.n5 = null;
      this.n5();
   }

   @Override
   public void n5() {
      if (this.k5 != null) {
         this.k5.k5();
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3) {
      return this.n5(var1, var2, var3, false);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         }

         this.u9 = var4;
         this.u3 = true;
         return this.n5.n5(var1, var2, var3, this);
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "index" : "count", "Non-negative number required.");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5) {
      return this.n5(var1, var2, var3, var4, var5, false);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, boolean var6) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         } else if (var5 >= 0 && var5 <= var4.length) {
            int var7 = var4.length - var5;
            return this.n5(var1, var2, var3, var4, var5, var7, var6);
         } else {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "chars" : "bytes", "Array cannot be null.");
      } else if (var3 >= 0 && var6 >= 0) {
         this.u9 = var7;
         this.u3 = true;
         return this.n5.n5(var1, var2, var3, var4, var5, var6, this);
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
      }
   }

   @Override
   public void n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var2 < 0 || var3 < 0) {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }

      if (var5 >= 0 && var6 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         }

         if (var4.length - var5 < var6) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
         }

         if (var4 == null || var1 == null) {
            throw new ArgumentNullException(var4 == null ? "chars" : "bytes", "Array cannot be null.");
         }

         if (var3 >= 0 && var6 >= 0) {
            this.u9 = var7;
            this.u3 = false;
            this.a6 = 0;
            var9[0] = this.n5.n5(var1, var2, var3, var4, var5, var6, this);
            var8[0] = this.a6;
            var10[0] = var8[0] == var3 && (!var7 || !this.l6()) && (this.k5 == null || this.k5.l6() == 0);
         } else {
            throw new ArgumentOutOfRangeException(var3 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var5 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }
   }

   public final boolean u9() {
      return this.u9;
   }

   public boolean l6() {
      return false;
   }

   public final void h0() {
      this.u9 = false;
   }
}
