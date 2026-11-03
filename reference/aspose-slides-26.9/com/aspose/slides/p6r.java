package com.aspose.slides;

class p6r extends x0q {
   final void n5(z1n var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "chartStyle".equals(this.s7().n3())) {
            var1.n5(new com.aspose.slides.internal.k4y.e5m(this.s7()));
            n5(var1, this.k5());
         }
      }

      this.n3();
   }

   static void n5(z1n var0, t5w var1) {
      com.aspose.slides.internal.k4y.e5m var2 = var0.n5();
      n5(var0.a6(), var2.n5(), var1);
      n5(var0.u9(), var2.u9(), var1);
      n5(var0.h0(), var2.l6(), var1);
      n5(var0.c8(), var2.k5(), var1);
      n5(var0.t2(), var2.u3(), var1);
      if (var2.a6() != null) {
         n5(var0.s7(), var2.a6(), var1);
      }

      n5(var0.x8(), var2.h0(), var1);
      n5(var0.n3(), var2.c8(), var1);
      n5(var0.y4(), var2.t2(), var1);
      n5(var0.e2(), var2.s7(), var1);
      n5(var0.t9(), var2.x8(), var1);
      n5(var0.z1(), var2.n3(), var1);
      n5(var0.t4(), var2.y4(), var1);
      n5(var0.q0(), var2.e2(), var1);
      n5(var0.z3(), var2.t9(), var1);
      n5(var0.m1(), var2.z1(), var1);
      n5(var0.k7(), var2.t4(), var1);
      n5(var0.m3(), var2.q0(), var1);
      n5(var0.z8(), var2.z3(), var1);
      n5(var0.j5(), var2.m1(), var1);
      n5(var0.w1(), var2.k7(), var1);
      n5(var0.r4(), var2.m3(), var1);
      n5(var0.c4(), var2.z8(), var1);
      n5(var0.y2(), var2.j5(), var1);
      n5(var0.y1(), var2.w1(), var1);
      n5(var0.a0(), var2.r4(), var1);
      n5(var0.d2(), var2.c4(), var1);
      n5(var0.d5(), var2.y2(), var1);
      n5(var0.s3(), var2.y1(), var1);
      n5(var0.p8(), var2.a0(), var1);
   }

   private static void n5(c4t var0, com.aspose.slides.internal.k4y.w4s var1, t5w var2) {
      if (var1.u9() != null) {
         y4k.n5(var0.k5().getPortionFormat(), var1.u9(), null);
      }

      if (var1.h0() != null) {
         y4k.n5(var0.k5().getTextBlockFormat(), var1.h0());
      }

      com.aspose.slides.internal.k4y.b9y var3 = var1.a6();
      if (var3 != null) {
         k5r.n5(var0.l6(), var3, var2);
      }

      c4i.n5(var0.n5().getLineColor(), var1.n5().l6());
      var0.n5().setLineStyleIndex((int)(var1.n5().n5() & 65535L));
      var0.u3().n5(n5(var1.n5().k5()));
      c4i.n5(var0.n5().getFillColor(), var1.l6().l6());
      var0.n5().setFillStyleIndex((short)var1.l6().n5());
      var0.a6().n5(n5(var1.l6().k5()));
      c4i.n5(var0.n5().getEffectColor(), var1.k5().l6());
      var0.n5().setEffectStyleIndex(var1.k5().n5());
      var0.u9().n5(n5(var1.k5().k5()));
      if (var1.u3().l6() != null) {
         var0.k5().getPortionFormat().getFillFormat().setFillType((byte)1);
         c4i.n5(var0.k5().getPortionFormat().getFillFormat().getSolidFillColor(), var1.u3().l6());
         var0.n5().setFontCollectionIndex(var1.u3().n5());
         var0.h0().n5(n5(var1.u3().k5()));
      }
   }

   private static int n5(com.aspose.slides.internal.k4y.c4y var0) {
      if (var0 == null) {
         return -2;
      }

      if ("auto".equals(var0.n5())) {
         return -1;
      }

      int var1 = 0;
      int[] var2 = new int[]{0};
      boolean var3 = com.aspose.slides.ms.System.a3.n5(var0.n5(), var2);
      var1 = var2[0];
      return var3 ? var1 : -1;
   }

   final void l6(z1n var1) {
      this.y4();
      com.aspose.slides.internal.k4y.e5m var2 = var1.n5();
      if (var2 != null) {
         var2.n5(null, this.x8(), "chartStyle");
      }

      this.e2();
   }

   public p6r(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public p6r(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
