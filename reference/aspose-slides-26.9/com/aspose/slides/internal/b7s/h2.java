package com.aspose.slides.internal.b7s;

import com.aspose.slides.internal.r1x.v3;

public class h2 implements com.aspose.slides.internal.b8u.m3 {
   protected byte[] n5;
   protected int l6;
   protected int k5;
   public final v3 u3;
   private int a6;
   private int u9;
   private int h0;
   private final Object c8 = new Object();

   public h2(v3 var1) {
      synchronized (var1.n5()) {
         this.u3 = var1;
         this.u9 = (int)var1.l6();
         this.h0 = 0;
      }

      this.n5 = new byte[4096];
   }

   @Override
   public final Object n5() {
      return this.u3 != null ? this.u3.n5() : this.c8;
   }

   public final int l6() {
      return this.u9 + this.l6;
   }

   public final int k5() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void l6(int var1) {
      if (var1 > 0) {
         while (var1 > this.k5) {
            var1 -= this.k5;
            if (!this.a6()) {
               return;
            }
         }
      }

      this.l6 += var1;
      this.k5 -= var1;
   }

   public final boolean u3() {
      return this.k5 != 0 || this.a6();
   }

   public boolean a6() {
      synchronized (this.u3.n5()) {
         this.u9 = this.u9 + this.h0;
         this.u3.n5(this.u9);
         this.h0 = this.u3.n5(this.n5, 0, 4096);
      }

      if (this.h0 <= 0) {
         this.k5 = 0;
         return false;
      } else {
         this.k5 = this.h0;
         this.l6 = 0;
         return true;
      }
   }

   public final boolean n5(int[] var1) {
      if (!this.u3()) {
         var1[0] = 0;
         return false;
      }

      this.k5--;
      var1[0] = (this.n5[this.l6++] & 255) << 8;
      if (!this.u3()) {
         return false;
      }

      this.k5--;
      var1[0] += this.n5[this.l6++] & 255;
      return true;
   }

   public final boolean l6(int[] var1) {
      if (!this.u3()) {
         var1[0] = 0;
         return false;
      } else {
         this.k5--;
         var1[0] = this.n5[this.l6++] & 255;
         return true;
      }
   }

   public final int n5(byte[] var1, int var2, int var3) {
      if (this.k5 == 0 && !this.a6()) {
         return 0;
      }

      int var4 = var3;

      while (var4 > this.k5) {
         System.arraycopy(this.n5, this.l6, var1, var2, this.k5);
         var2 += this.k5;
         var4 -= this.k5;
         if (!this.a6()) {
            return var3 - var4;
         }
      }

      System.arraycopy(this.n5, this.l6, var1, var2, var4);
      this.l6 += var4;
      this.k5 -= var4;
      return var3;
   }

   public final byte u9() {
      if (this.a6 != 0) {
         byte var6 = (byte)this.a6;
         this.a6 = 0;
         return var6;
      }

      if (!this.u3()) {
         return -39;
      }

      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = !this.l6(var2);
      var1 = var2[0];
      if (var3) {
         return 1;
      }

      while (var1 != 255) {
         var2[0] = var1;
         boolean var4 = !this.l6(var2);
         var1 = var2[0];
         if (var4) {
            return 1;
         }
      }

      do {
         var2[0] = var1;
         boolean var7 = !this.l6(var2);
         var1 = var2[0];
         if (var7) {
            return 1;
         }
      } while (var1 == 255);

      return com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.n5p.u3.class), (byte)var1)
         ? (byte)var1
         : 1;
   }

   public final void h0() {
      synchronized (this.u3.n5()) {
         this.u3.n3();
         this.u9 = 0;
         this.h0 = 0;
      }

      this.k5 = 0;
      this.l6 = 0;
   }
}
