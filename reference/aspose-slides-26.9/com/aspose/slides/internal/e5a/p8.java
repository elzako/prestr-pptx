package com.aspose.slides.internal.e5a;

import com.aspose.slides.ms.System.d1;

public final class p8 {
   public byte[] n5;
   public int l6;
   public int k5;
   public long u3;
   public byte[] a6;
   public int u9;
   public int h0;
   public long c8;
   public String t2;
   public s7 s7;
   public t4 x8;
   public long n3;
   public int y4 = 6;
   public int e2 = 15;
   public int t9 = 0;

   public final int n5(boolean var1) {
      return this.n5(this.e2, var1);
   }

   public final int n5(int var1, boolean var2) {
      this.e2 = var1;
      if (this.s7 != null) {
         throw new f2("You may not call InitializeInflate() after calling InitializeDeflate().");
      }

      this.x8 = new t4(var2);
      return this.x8.n5(this, var1);
   }

   public final int n5(int var1) {
      if (this.x8 == null) {
         throw new f2("No Inflate State!");
      } else {
         return this.x8.n5(var1);
      }
   }

   public final int n5() {
      if (this.x8 == null) {
         throw new f2("No Inflate State!");
      }

      int var1 = this.x8.k5();
      this.x8 = null;
      return var1;
   }

   public final int l6(int var1, boolean var2) {
      this.y4 = var1;
      return this.l6(var2);
   }

   private int l6(boolean var1) {
      if (this.x8 != null) {
         throw new f2("You may not call InitializeDeflate() after calling InitializeInflate().");
      }

      this.s7 = new s7();
      this.s7.l6(var1);
      return this.s7.n5(this, this.y4, this.e2, this.t9);
   }

   public final int l6(int var1) {
      if (this.s7 == null) {
         throw new f2("No Deflate State!");
      } else {
         return this.s7.h0(var1);
      }
   }

   public final int l6() {
      if (this.s7 == null) {
         throw new f2("No Deflate State!");
      }

      int var1 = this.s7.t2();
      this.s7 = null;
      return var1;
   }

   public final void k5() {
      int var1 = this.s7.a6;
      if (var1 > this.h0) {
         var1 = this.h0;
      }

      if (var1 != 0) {
         if (this.s7.k5.length > this.s7.u3 && this.a6.length > this.u9 && this.s7.k5.length >= this.s7.u3 + var1 && this.a6.length >= this.u9 + var1) {
            com.aspose.slides.ms.System.u3.n5(
               com.aspose.slides.ms.System.u3.n5((Object)(this.s7.k5)), this.s7.u3, com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), this.u9, var1
            );
            this.u9 += var1;
            this.s7.u3 += var1;
            this.c8 += var1;
            this.h0 -= var1;
            this.s7.a6 -= var1;
            if (this.s7.a6 == 0) {
               this.s7.u3 = 0;
            }
         } else {
            throw new f2(d1.n5("Invalid State. (pending.Length={0}, pendingCount={1})",new Object[]{ this.s7.k5.length, this.s7.a6}));
         }
      }
   }

   public final int n5(byte[] var1, int var2, int var3) {
      int var4 = this.k5;
      if (var4 > var3) {
         var4 = var3;
      }

      if (var4 == 0) {
         return 0;
      }

      this.k5 -= var4;
      if (this.s7.h0()) {
         this.n3 = com.aspose.slides.internal.e5a.l6.n5(this.n3, this.n5, this.l6, var4);
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), this.l6, com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, var4);
      this.l6 += var4;
      this.u3 += var4;
      return var4;
   }
}
