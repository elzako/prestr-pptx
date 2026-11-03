package com.aspose.slides.internal.b8n;

import com.aspose.slides.internal.b5j.t9;
import com.aspose.slides.internal.e1.z1;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.q1;

public class s7 extends com.aspose.slides.internal.k2s.h0 {
   private final com.aspose.slides.internal.e1.t2 n5;
   private final t9 l6;

   public s7(com.aspose.slides.internal.e1.t2 var1, com.aspose.slides.internal.p1s.l6 var2, com.aspose.slides.internal.k2s.a6 var3, t9 var4) {
      super(var2, var3);
      this.n5 = var1;
      this.l6 = var4;
   }

   @Override
   public float n5(com.aspose.slides.internal.d0e.t2 var1, char var2, float var3, float var4, float var5, f2 var6) {
      z1 var7 = this.n5(com.aspose.slides.ms.System.t9.q0(var2), var3, var4);
      if (q1.n5(var5) > 0.0F) {
         if (var7.u3() == null) {
            var7.n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
         }

         m1 var8 = new m1();
         var8.n5(var5, new w1(var3, var4));
         var7.u3().n5(com.aspose.slides.internal.j7.c8.n5(var8), 1);
      }

      this.n5(var1, var6.a6(), var7);
      this.n5.n5(var7);
      return this.n5(var2);
   }

   private z1 n5(String var1, float var2, float var3) {
      f2 var4 = this.n5().l6(var1).a6();
      com.aspose.slides.internal.p1s.l6 var5 = new com.aspose.slides.internal.p1s.l6(this.n5().c8(), this.n5().l6(), this.n5().n5());
      switch (this.l6().n5) {
         case 1:
            return new z1(
               var5,
               com.aspose.slides.internal.t6j.k5.n5(this.l6().y4.o8()),
               com.aspose.slides.internal.t6j.k5.n5(com.aspose.slides.internal.o9b.c8.u3.o8()),
               new w1(var2, var3),
               var1,
               var4.a6(),
               0.0F
            );
         case 2:
            return new z1(
               var5,
               com.aspose.slides.internal.t6j.k5.n5(com.aspose.slides.internal.o9b.c8.u3.o8()),
               com.aspose.slides.internal.t6j.k5.n5(this.l6().y4.o8()),
               new w1(var2, var3),
               var1,
               var4.a6(),
               0.0F
            );
         default:
            return new z1(
               var5,
               com.aspose.slides.internal.t6j.k5.n5(this.l6().y4.o8()),
               com.aspose.slides.internal.t6j.k5.n5(this.l6().y4.o8()),
               new w1(var2, var3),
               var1,
               var4.a6(),
               0.0F
            );
      }
   }

   private void n5(com.aspose.slides.internal.d0e.t2 var1, f2 var2, z1 var3) {
      if (var1.l6.n5("transform")) {
         if (var3.u3() == null) {
            var3.n5(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F));
         }

         com.aspose.slides.internal.w0.c8 var4 = com.aspose.slides.internal.j7.c8.n5(this.l6.n5(var1.l6.k5("transform"), var2.a6()));
         var3.u3().n5(var4, 1);
      }
   }
}
