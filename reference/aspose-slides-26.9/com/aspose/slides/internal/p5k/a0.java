package com.aspose.slides.internal.p5k;

import com.aspose.slides.internal.e1x.i1;

public class a0 extends d2 {
   public a0(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.e1.z1 var1, short var2) {
      y1 var3 = new y1(this.h0());
      var3.n5();
      this.u9().l6(var2);
      this.u9()
         .n5(
            com.aspose.slides.internal.n2d.t2.t2(var1.q0().a6()),
            com.aspose.slides.internal.n2d.t2.t2(var1.q0().h0()),
            com.aspose.slides.internal.n2d.t2.t2(var1.q0().t2()),
            com.aspose.slides.internal.n2d.t2.t2(var1.q0().l6())
         );
      com.aspose.slides.internal.w0.c8 var4 = new com.aspose.slides.internal.w0.c8();
      var4.l6(com.aspose.slides.internal.n2d.t2.t2(var1.s7().l6()), com.aspose.slides.internal.n2d.t2.t2(var1.s7().k5()), 0);
      this.u9().n5(var4);
      i1 var5 = var1.l6().n5();
      u9 var6 = this.h0().k5(var5);
      int[] var7 = new int[var1.x8().length()];
      int[] var8 = new int[var1.x8().length()];

      for (int var9 = 0; var9 < var1.x8().length(); var9++) {
         boolean var10 = com.aspose.slides.ms.System.t9.a6(var1.x8().charAt(0));
         int var11 = var1.x8().charAt(var9);
         if (var9 < var1.x8().length() - 1 && var10) {
            var11 = com.aspose.slides.ms.System.t9.n5(var1.x8().charAt(var9), var1.x8().charAt(var9 + 1));
         }

         int var12 = var6.n5(var11);
         var7[var9] = var12;
         var8[var9] = var6.n5(var11, var1.l6().c8());
         if (var10) {
            var9++;
         }
      }

      int var13 = com.aspose.slides.internal.p5k.n5.n5(var7);
      int var14 = com.aspose.slides.internal.p5k.n5.n5(var8);
      this.u9().n5((byte)var13 & 255);
      this.u9().n5((byte)var14 & 255);
      this.u9().l6(1, 1, false);
      this.u9().l6(0, 3, false);
      this.u9().l6(1, 1, false);
      this.u9().l6(1, 1, false);
      this.u9().l6(0, 1, false);
      this.u9().l6(0, 1, false);
      this.u9().l6(this.h0().l6(var5));
      this.u9().n5(var1.k5());
      this.u9().l6((short)com.aspose.slides.internal.n2d.t2.t2(var1.l6().c8()));
      this.u9().n5((byte)var7.length & 255);

      for (int var15 = 0; var15 < var7.length; var15++) {
         this.u9().l6(var7[var15], var13, false);
         this.u9().n5(var8[var15], var14, false);
      }

      this.u9().l6(0, 8, false);
      this.u9().n5();
      var3.n5(11);
   }
}
