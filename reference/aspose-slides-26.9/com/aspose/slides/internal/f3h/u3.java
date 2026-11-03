package com.aspose.slides.internal.f3h;

import com.aspose.slides.ms.System.d1;

public final class u3 {
   public byte[] n5;
   public int l6;
   public int k5;
   public long u3;
   public byte[] a6;
   public int u9;
   public int h0;
   public long c8;
   public String t2;
   c8 s7;
   t9 x8;
   long n3;
   public int y4 = 6;
   public int e2 = 15;
   public int t9 = 0;

   public int n5(boolean var1) {
      return this.n5(this.e2, var1);
   }

   public int n5(int var1, boolean var2) {
      this.e2 = var1;
      if (this.s7 != null) {
         throw new a6("You may not call InitializeInflate() after calling InitializeDeflate().");
      }

      this.x8 = new t9(var2);
      return this.x8.n5(this, var1);
   }

   public int n5(int var1) {
      if (this.x8 == null) {
         throw new a6("No Inflate State!");
      } else {
         return this.x8.n5(var1);
      }
   }

   public int n5() {
      if (this.x8 == null) {
         throw new a6("No Inflate State!");
      }

      int var1 = this.x8.k5();
      this.x8 = null;
      return var1;
   }

   public int l6(int var1, boolean var2) {
      this.y4 = var1;
      return this.l6(var2);
   }

   private int l6(boolean var1) {
      if (this.x8 != null) {
         throw new a6("You may not call InitializeDeflate() after calling InitializeInflate().");
      }

      this.s7 = new c8();
      this.s7.l6(var1);
      return this.s7.n5(this, this.y4, this.e2, this.t9);
   }

   public int l6(int var1) {
      if (this.s7 == null) {
         throw new a6("No Deflate State!");
      } else {
         return this.s7.a6(var1);
      }
   }

   public int l6() {
      if (this.s7 == null) {
         throw new a6("No Deflate State!");
      }

      this.s7 = null;
      return 0;
   }

   void k5() {
      int var1 = this.s7.a6;
      if (var1 > this.h0) {
         var1 = this.h0;
      }

      if (var1 != 0) {
         if (this.s7.k5.length > this.s7.u3 && this.a6.length > this.u9 && this.s7.k5.length >= this.s7.u3 + var1 && this.a6.length >= this.u9 + var1) {
            System.arraycopy(this.s7.k5, this.s7.u3, this.a6, this.u9, var1);
            this.u9 += var1;
            this.s7.u3 += var1;
            this.c8 += var1;
            this.h0 -= var1;
            this.s7.a6 -= var1;
            if (this.s7.a6 == 0) {
               this.s7.u3 = 0;
            }
         } else {
            throw new a6(d1.n5("Invalid State. (pending.Length={0}, pendingCount={1})",new Object[]{ this.s7.k5.length, this.s7.a6}));
         }
      }
   }

   int n5(byte[] var1, int var2, int var3) {
      int var4 = this.k5;
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 == 0) {
         return 0;
      }

      this.k5 -= var4;
      if (this.s7.h0()) {
         this.n3 = com.aspose.slides.internal.f3h.n5.n5(this.n3, this.n5, this.l6, var4);
      }

      System.arraycopy(this.n5, this.l6, var1, var2, var4);
      this.l6 += var4;
      this.u3 += var4;
      return var4;
   }
}
