package com.aspose.slides.internal.p5k;

public class c4 extends d2 {
   public c4(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.e1.r4 var1, short var2) {
      com.aspose.slides.internal.o9b.y1 var3 = z3.k5(var1).y4();
      if (!(var3.a6() < -32768.0F)
         && !(var3.a6() > 32767.0F)
         && !(var3.h0() < -32768.0F)
         && !(var3.h0() > 32767.0F)
         && !(var3.t2() < -32768.0F)
         && !(var3.t2() > 32767.0F)
         && !(var3.l6() < -32768.0F)
         && !(var3.l6() > 32767.0F)) {
         y1 var4 = new y1(this.h0());
         var4.n5();
         this.u9().l6(var2);
         this.u9()
            .n5(
               com.aspose.slides.internal.n2d.t4.n5(var3.a6()),
               com.aspose.slides.internal.n2d.t4.n5(var3.h0()),
               com.aspose.slides.internal.n2d.t4.n5(var3.t2()),
               com.aspose.slides.internal.n2d.t4.n5(var3.l6())
            );
         this.u9()
            .n5(
               com.aspose.slides.internal.n2d.t4.n5(var3.a6()),
               com.aspose.slides.internal.n2d.t4.n5(var3.h0()),
               com.aspose.slides.internal.n2d.t4.n5(var3.t2()),
               com.aspose.slides.internal.n2d.t4.n5(var3.l6())
            );
         this.u9().l6(0, 5, false);
         this.u9().l6(0, 1, false);
         this.u9().l6(0, 1, false);
         this.u9().l6(0, 1, false);
         com.aspose.slides.internal.w0.l6 var5 = var1.k5() != null && m1.k5(var1)
            ? var1.k5()
            : new com.aspose.slides.internal.w0.n3(com.aspose.slides.internal.p1s.n5.x3);
         a6 var6 = new a6(this.h0());
         var6.n5(var5);
         com.aspose.slides.internal.w0.s7 var7 = var1.l6() != null
            ? var1.l6()
            : new com.aspose.slides.internal.w0.s7(com.aspose.slides.internal.p1s.n5.b2, 1.0F);
         y4 var8 = new y4(this.h0());
         var8.n5(var7);
         this.u9().l6(1, 4, false);
         this.u9().l6(1, 4, false);
         r4 var9 = new r4(this.h0());
         var9.l6();
         var9.k5();
         k7 var10 = new k7(this.h0());
         var10.k5(var1);
         var9.n5();
         var4.n5(83);
      }
   }
}
