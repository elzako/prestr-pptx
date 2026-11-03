package com.aspose.slides.internal.e3;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.ms.System.d1;

public class h0 extends com.aspose.slides.internal.k6.c8 {
   private final com.aspose.slides.internal.k6.n5 n5 = new n5(this);
   private boolean l6;

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.x8 var1, com.aspose.slides.internal.x3.a6 var2) {
      String var3 = "";
      short[] var4 = var1.x8();
      long var5 = var1.c8();
      if ((var5 & 1L) == 1L) {
         var3 = com.aspose.slides.internal.o6.n5.n5(var4);
      } else {
         i1 var7 = com.aspose.slides.internal.e1x.x8.u3().n5(var2.t2().l6().a6(), var2.t2().x8(), null);
         char[] var8 = new char[var4.length];

         for (int var9 = 0; var9 < var4.length; var9++) {
            u6 var10 = var7.h0().k5(var4[var9]);
            var8[var9] = (char)var10.n5();
         }

         var3 = d1.n5(var8);
      }

      com.aspose.slides.internal.o9b.n3 var14 = var2.t2();
      com.aspose.slides.internal.p1s.l6 var15 = com.aspose.slides.internal.e1x.x8.u3().n5(var14.h0(), var14.c8(), var14.x8());
      com.aspose.slides.internal.w0.l6 var16 = com.aspose.slides.internal.p1.n5.n5(var2.t9());
      float var17 = this.n5(var2.t2());
      if (this.l6) {
         w1 var11 = var1.s7()[0].n5().u3();
         var11.l6(var11.k5() - var17);
         this.n5(var15, var16, var11.u3(), var3, var1.c8(), var2);
      } else {
         for (int var18 = 0; var18 < var1.t2(); var18++) {
            w1 var12 = var1.s7()[var18].n5().u3();
            var12.l6(var12.k5() - var17);
            this.n5(var15, var16, var12.u3(), com.aspose.slides.ms.System.t9.q0(var3.charAt(var18)), var1.c8(), var2);
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.p1s.l6 var1, com.aspose.slides.internal.w0.l6 var2, w1 var3, String var4, long var5, com.aspose.slides.internal.x3.a6 var7
   ) {
      com.aspose.slides.internal.x4g.m1 var8 = var7.z1().u9();
      f2 var9 = new f2();
      com.aspose.slides.internal.e1.z1 var10 = new com.aspose.slides.internal.e1.z1(var1, var2, null, var3.u3(), var4, var9.a6(), 0.0F);
      var10.n5(new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.b2));
      var10.l6(4);
      com.aspose.slides.internal.w0.c8 var11 = com.aspose.slides.internal.p1.l6.n5(
         j5.n5(new j5(com.aspose.slides.internal.v6g.k5.u3(var3.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var3.k5(), 13))).u3(),
         new com.aspose.slides.internal.w0.c8(),
         var9.a6(),
         var1,
         6,
         0.0F
      );
      var8.l6(com.aspose.slides.internal.p1.n5.n5(var11));
      var10.n5(com.aspose.slides.internal.p1.n5.n5(var8));
      com.aspose.slides.internal.e1.t2 var12 = new com.aspose.slides.internal.e1.t2();
      var12.n5(var10);
      var7.<com.aspose.slides.internal.e1.n3>n5().n5(var12);
   }
}
