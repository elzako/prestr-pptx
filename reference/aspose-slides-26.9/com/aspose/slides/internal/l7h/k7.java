package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class k7 extends t9 {
   public char k5;
   private j5 u9;
   private boolean h0;
   public boolean u3;
   public int a6;

   public k7(j5 var1) {
      this.u9 = var1;
      this.n5 = this.u9.x8();
      this.u3();
   }

   public k7() {
      this.u9 = null;
      this.u3();
   }

   @Override
   public void u3() {
      this.k5 = 0;
      if (this.l6 != null) {
         this.l6.u3();
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, boolean var4) {
      if (var1 == null) {
         throw new ArgumentNullException("chars", "Array cannot be null.");
      }

      if (var1.length - var2 < var3) {
         throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
      }

      if (var2 < 0 || var3 < 0) {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "index" : "count", "Non-negative number required.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      this.h0 = var4;
      this.u3 = true;
      return this.u9.n5(var1, var2, var3, this);
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, boolean var6) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
         } else if (var5 >= 0 && var5 <= var4.length) {
            int var7 = var4.length - var5;
            return this.n5(var1, var2, var3, var4, var5, var7, var6);
         } else {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, boolean var7) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      } else if (var6 >= 0 && var3 >= 0) {
         this.h0 = var7;
         this.u3 = true;
         return this.u9.n5(var1, var2, var3, var4, var5, var6, this);
      } else {
         throw new ArgumentOutOfRangeException(var6 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, boolean var7, int[] var8, int[] var9, boolean[] var10) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var2 < 0 || var3 < 0) {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }

      if (var5 >= 0 && var6 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
         }

         if (var4.length - var5 < var6) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         }

         if (var4 == null || var1 == null) {
            throw new ArgumentNullException(var4 == null ? "bytes" : "chars", "Array cannot be null.");
         }

         if (var3 >= 0 && var6 >= 0) {
            this.h0 = var7;
            this.u3 = false;
            this.a6 = 0;
            var9[0] = this.u9.n5(var1, var2, var3, var4, var5, var6, this);
            var8[0] = this.a6;
            var10[0] = var8[0] == var3 && (!var7 || !this.h0()) && (this.l6 == null || this.l6.k5() == 0);
         } else {
            throw new ArgumentOutOfRangeException(var3 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var5 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }
   }

   public final j5 a6() {
      return this.u9;
   }

   public final boolean u9() {
      return this.h0;
   }

   public boolean h0() {
      return this.k5 != 0;
   }

   public final void c8() {
      this.h0 = false;
   }
}
