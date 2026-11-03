package com.aspose.slides.internal.p5k;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.q1;

public class n5 {
   private byte n5;
   private int l6;
   private com.aspose.slides.internal.z0k.l6 k5;

   public n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.k5 = new com.aspose.slides.internal.z0k.l6(var1);
   }

   public final void n5(int var1) {
      this.k5.n5((byte)var1);
   }

   public final void n5(byte[] var1) {
      this.k5.n5(var1);
   }

   public final void l6(int var1) {
      this.k5.n5((short)var1);
   }

   public final void k5(int var1) {
      this.k5.l6(var1);
   }

   public final void n5(boolean var1, boolean var2) {
      this.l6++;
      if (var1) {
         this.n5 = (byte)(this.n5 & 0xFF | (byte)(1 << 8 - this.l6) & 0xFF);
      }

      this.n5(var2);
   }

   public final void n5(int var1, int var2, boolean var3) {
      this.n5(var1 < 0, false);
      if (var2 > 1) {
         long var4 = 4294967295L;
         int var6 = (int)(var1 < 0 ? 4294967295L + var1 + 1L & 4294967295L >> 32 - var2 + 1 : q1.n5(var1));
         this.l6(var6, var2 - 1, var3);
      }
   }

   public final void l6(int var1, int var2, boolean var3) {
      int var4 = var2 / 8 + (var2 % 8 > 0 ? 1 : 0);
      int var5 = 8 + var2 - var4 * 8;
      byte[] var6 = new byte[4];
      com.aspose.slides.internal.n2d.t4.n5(var1, var6, 0);
      int var7 = var4 - 1;

      for (int var8 = var7; var8 >= 0; var8--) {
         if (var8 == var7) {
            this.n5(var6[var8], var5, false);
         } else {
            this.n5(var6[var8], 8, false);
         }
      }

      this.n5(var3);
   }

   public final void n5(double var1, int var3, boolean var4) {
      if (var3 < 17) {
         throw new ArgumentException("length cannot be less than 18");
      }

      boolean var5 = var1 < 0.0;
      if (var5) {
         var1 = 2.147483647E9 + var1 + 1.0;
      }

      int var6 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
      double var7 = var1 - var6;
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var7 * 65536.0, 14);
      if (var5) {
         var6 -= Integer.MAX_VALUE;
      }

      int var10 = var3 - 16;
      this.n5(var6, var10, false);
      this.l6(var9, 16, false);
      this.n5(var4);
   }

   private void n5(byte var1, int var2, boolean var3) {
      while (var2 > 0) {
         this.n5 = (byte)(this.n5 & 0xFF | (byte)((var1 & 255) << 8 - var2 >> this.l6) & 0xFF);
         int var4 = this.l6;
         this.l6 = this.l6 + (var2 < 8 - this.l6 ? var2 : 8 - this.l6);
         var2 -= this.l6 - var4;
         this.n5(false);
      }

      this.n5(var3);
   }

   public final void n5() {
      if (this.l6 != 0) {
         if (this.l6 != 8) {
            this.l6(0, 8 - this.l6 - 1, false);
         }

         this.k5.n5(this.n5);
         this.n5 = 0;
         this.l6 = 0;
      }
   }

   private void n5(boolean var1) {
      if (var1 && this.l6 != 0 || this.l6 == 8) {
         this.n5();
      }
   }

   public final void n5(String var1) {
      byte[] var2 = com.aspose.slides.internal.l7h.j5.z3().u3(var1);
      this.k5.n5(var2);
      this.k5.n5((byte)0);
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1) {
      this.k5.n5((byte)var1.k5());
      this.k5.n5((byte)var1.u3());
      this.k5.n5((byte)var1.a6());
   }

   public final void l6(com.aspose.slides.internal.p1s.n5 var1) {
      this.n5(var1);
      this.k5.n5((byte)var1.l6());
   }

   public final void n5(int var1, int var2, int var3, int var4) {
      int var5 = n5(new int[]{var1, var2, var3, var4});
      this.l6(var5, 5, false);
      this.n5(var1, var5, false);
      this.n5(var2, var5, false);
      this.n5(var3, var5, false);
      this.n5(var4, var5, true);
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      boolean var2 = var1.u3() != 1.0F || var1.h0() != 1.0F;
      boolean var3 = var1.a6() != 0.0F || var1.u9() != 0.0F;
      this.n5(var2, false);
      if (var2) {
         this.n5(var1.u3(), var1.h0());
      }

      this.n5(var3, false);
      if (var3) {
         this.n5(var1.a6(), var1.u9());
      }

      int var4 = com.aspose.slides.internal.n2d.t4.n5(var1.c8());
      int var5 = com.aspose.slides.internal.n2d.t4.n5(var1.t2());
      int var6 = n5(new int[]{var4, var5});
      this.l6(var6, 5, false);
      this.n5(var4, var6, false);
      this.n5(var5, var6, true);
   }

   private void n5(float var1, float var2) {
      var1 = var1 < 0.0F ? var1 - 1.0F : var1;
      var2 = var2 < 0.0F ? var2 - 1.0F : var2;
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1, 13);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(var2, 13);
      int var5 = n5(new int[]{var3, var4}) + 16;
      this.l6(var5, 5, false);
      this.n5(var1, var5, false);
      this.n5(var2, var5, false);
   }

   public final void n5(int var1, int var2) {
      int var3 = 0;
      var3 |= var1 << 6;
      var3 |= 63;
      this.l6((short)var3);
      this.k5(var2);
   }

   public static int n5(int[] var0) {
      if (var0.length == 0) {
         return 0;
      }

      long[] var1 = new long[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2] == Integer.MIN_VALUE ? 0L : q1.n5(var0[var2]) & 4294967295L;
      }

      return n5(var1) + 1;
   }

   public static int n5(long[] var0) {
      long var1 = var0[0];

      for (int var3 = 0; var3 < var0.length; var3++) {
         var1 = q1.l6(var1, var0[var3]);
      }

      return ((var1 & 4294967295L) == 0L ? 0 : com.aspose.slides.internal.v6g.k5.u3(q1.n5(var1 & 4294967295L, 2.0), 14)) + 1;
   }

   public final com.aspose.slides.internal.z0k.l6 l6() {
      return this.k5;
   }
}
