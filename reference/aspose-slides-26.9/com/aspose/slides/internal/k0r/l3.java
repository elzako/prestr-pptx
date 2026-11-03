package com.aspose.slides.internal.k0r;

import com.aspose.slides.ms.System.IDisposable;

public class l3 implements IDisposable {
   private com.aspose.slides.internal.o8m.f2 n5;
   private final byte[] l6;
   private final long k5;
   private final long u3;
   private final byte[] a6;
   private boolean u9;

   public l3(String var1, byte[] var2, long var3, boolean var5) {
      this.a6 = com.aspose.slides.internal.l7h.j5.z1().u3(var1);
      long var6 = (var3 & 4294967295L) / 8L & 4294967295L;
      if ((var3 & 4294967295L) == 40L) {
         var6 = 16L;
      }

      this.k5 = var6;
      this.u3 = var3;
      this.n5 = c0.n5(var5);
      if (var5) {
         byte[] var8 = new byte[var2.length + this.a6.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var2), com.aspose.slides.ms.System.u3.n5(var8), var2.length);
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(this.a6), 0, com.aspose.slides.ms.System.u3.n5(var8), var2.length, this.a6.length);
         this.l6 = this.n5.l6(var8);
      } else {
         byte[] var12 = this.n5.l6(this.a6);
         byte[] var9 = new byte[5 + var2.length];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var12), com.aspose.slides.ms.System.u3.n5(var9), 5);
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var2), 0, com.aspose.slides.ms.System.u3.n5(var9), 5, var2.length);
         byte[] var10 = new byte[336];

         for (int var11 = 0; var11 < 16; var11++) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(var9), 0, com.aspose.slides.ms.System.u3.n5(var10), var11 * 16, var9.length);
         }

         this.l6 = this.n5.l6(var9);
      }
   }

   public final c1 n5(long var1) {
      byte[] var3 = com.aspose.slides.internal.v6g.k5.l6(this.n5, com.aspose.slides.internal.o8m.h6.class) ? this.l6(var1) : this.k5(var1);
      return new c1(var3);
   }

   public final byte[] l6(long var1) {
      byte[] var3 = com.aspose.slides.ms.System.x8.n5(var1);
      byte[] var4 = new byte[this.l6.length + 4];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), com.aspose.slides.ms.System.u3.n5((Object)(var4)), this.l6.length);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), this.l6.length, var3.length);
      byte[] var5 = this.n5.l6(var4);
      byte[] var6 = new byte[(int)(this.k5 & 4294967295L)];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), com.aspose.slides.ms.System.u3.n5((Object)(var6)), this.k5 & 4294967295L);
      if ((this.u3 & 4294967295L) == 40L) {
         for (int var7 = 5; var7 < var6.length; var7++) {
            var6[var7] = 0;
         }
      }

      return var6;
   }

   public final byte[] k5(long var1) {
      byte[] var3 = com.aspose.slides.ms.System.x8.n5(var1);
      byte[] var4 = new byte[9];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), com.aspose.slides.ms.System.u3.n5((Object)(var4)), 5);
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 5, var3.length);
      byte[] var5 = this.n5.l6(var4);
      byte[] var6 = new byte[(int)(this.k5 & 4294967295L)];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), com.aspose.slides.ms.System.u3.n5((Object)(var6)), this.k5 & 4294967295L);
      return var6;
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.u9) {
         if (var1) {
            com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class).dispose();
            this.n5 = null;
         }

         this.u9 = true;
      }
   }
}
