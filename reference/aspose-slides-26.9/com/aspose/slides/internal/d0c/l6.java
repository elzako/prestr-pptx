package com.aspose.slides.internal.d0c;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.h0;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.r1x.f0;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.internal.u2w.s7;
import com.aspose.slides.internal.v6s.a6;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.IDisposable;

public final class l6 extends n5 {
   private f0 n5;

   public final void n5(String var1) {
      this.n5(306, var1, -1);
   }

   public final int u3() {
      return this.n5(296, 2) & 65535;
   }

   public final void n5(int var1) {
      this.n5(296, var1 & 65535, -1);
   }

   public final f0 a6() {
      return this.n5;
   }

   public final void n5(f0 var1) {
      IDisposable var2 = com.aspose.slides.internal.v6g.k5.n5(this.n5, IDisposable.class);
      if (var2 != null) {
         var2.dispose();
      }

      this.n5 = var1;
   }

   public final c8 u9() {
      return this.u3(282);
   }

   public final void n5(c8 var1) {
      this.n5(282, var1, -1);
   }

   public final c8 h0() {
      return this.u3(283);
   }

   public final void l6(c8 var1) {
      this.n5(283, var1, -1);
   }

   public final byte[] c8() {
      v3 var1 = new v3(new e2(), true);

      byte[] var27;
      try {
         a6 var2 = new a6(var1);
         List var3 = new List<>(com.aspose.slides.ms.System.u3.n5(this.n5()));
         List var4 = new List<>(com.aspose.slides.ms.System.u3.n5(this.l6()));
         com.aspose.slides.internal.u2w.a6[] var5 = this.k5();
         this.n5(var3, var4);
         s7 var6 = new s7((com.aspose.slides.internal.u2w.a6[])var3.toArray(new com.aspose.slides.internal.u2w.a6[0]), (com.aspose.slides.internal.u2w.a6[])var4.toArray(new com.aspose.slides.internal.u2w.a6[0]), var5, null);
         s7.n5(var2);
         long var7 = var6.l6();
         long var9 = var2.l6() + var7;
         var6.n5(var2, var9, this.n5 == null);
         if (this.n5 != null) {
            com.aspose.slides.internal.u2w.a6[] var11 = new com.aspose.slides.internal.u2w.a6[6];
            y4 var12 = new y4(259);
            var12.n5(new int[]{6});
            com.aspose.slides.internal.a3p.c8 var13 = new com.aspose.slides.internal.a3p.c8(282);
            var13.n5(new c8[]{new c8(72L, 1L)});
            com.aspose.slides.internal.a3p.c8 var14 = new com.aspose.slides.internal.a3p.c8(283);
            var14.n5(new c8[]{new c8(72L, 1L)});
            y4 var15 = new y4(296);
            var15.n5(new int[]{2});
            h0 var16 = new h0(513);
            var16.n5(new long[]{0L});
            h0 var17 = new h0(514);
            var17.n5(new long[]{0L});
            var11[0] = var12;
            var11[1] = var13;
            var11[2] = var14;
            var11[3] = var15;
            var11[4] = var16;
            var11[5] = var17;
            s7 var18 = new s7(var11, null, null, null);
            long var19 = var18.l6();
            long var21 = var2.l6();
            var9 = var21 + var19;
            long var23 = 4L - var9 % 4L;
            if (var23 != 4L) {
               var9 += var23;
            }

            var1.n5(var9);
            this.n5.n5(var1.k5());
            long var25 = var1.l6() - var9;
            var16.n5(new long[]{var9 & 4294967295L});
            var17.n5(new long[]{var25 & 4294967295L});
            var9 += var25;
            var2.n5(var21);
            var18.n5(var2, var9, true);
         }

         var27 = var1.h0();
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }

      return var27;
   }

   private void n5(List<com.aspose.slides.internal.u2w.a6> var1, List<com.aspose.slides.internal.u2w.a6> var2) {
      if (!this.l6(282)) {
         com.aspose.slides.internal.a3p.c8 var3 = new com.aspose.slides.internal.a3p.c8(282);
         var3.n5(new c8[]{new c8(96L)});
         var1.addItem(var3);
      }

      if (!this.l6(283)) {
         com.aspose.slides.internal.a3p.c8 var4 = new com.aspose.slides.internal.a3p.c8(283);
         var4.n5(new c8[]{new c8(96L)});
         var1.addItem(var4);
      }

      if (!this.l6(296)) {
         y4 var5 = new y4(296);
         var5.n5(new int[]{2});
         var1.addItem(var5);
      }

      if (!this.l6(531)) {
         y4 var6 = new y4(531);
         var6.n5(new int[]{1});
         var1.addItem(var6);
      }

      if (!this.l6(36864)) {
         com.aspose.slides.internal.a3p.e2 var7 = new com.aspose.slides.internal.a3p.e2(36864);
         var7.n5(new byte[]{0, 2, 3, 0});
         var2.addItem(var7);
      }

      if (!this.l6(37121)) {
         com.aspose.slides.internal.a3p.e2 var8 = new com.aspose.slides.internal.a3p.e2(37121);
         var8.n5(new byte[]{1, 2, 3, 0});
         var2.addItem(var8);
      }

      if (!this.l6(40961)) {
         y4 var9 = new y4(40961);
         var9.n5(new int[]{1});
         var2.addItem(var9);
      }
   }
}
