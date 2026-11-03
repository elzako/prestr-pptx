package com.aspose.slides;

abstract class x2k extends v6g {
   private l1z n5;

   protected abstract boolean c8();

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      this.k5(var1);
   }

   protected final void k5(z5 var1) {
      if (this.n5 != null) {
         float var2 = var1.n5();
         float var3 = var1.l6();
         if (!this.n5.u3()) {
            var2 = com.aspose.slides.ms.System.q1.l6(var2, this.n5.h0());
            var3 = com.aspose.slides.ms.System.q1.l6(var3, this.n5.h0());
         }

         this.n5.n3(new z5(var2, var3));
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.n5 != null) {
         this.n5.a6((this.d2() - this.n5.d2()) / 2.0F);
         this.n5.u9((this.d5() - this.n5.d5()) / 2.0F);
         this.n5.t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.s7 var1);

   protected final com.aspose.slides.internal.o9b.y1 t2() {
      return new com.aspose.slides.internal.o9b.y1(this.p8(), this.f2(), this.d2(), this.d5());
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.y2().u3());
      var2.n5(var1.y4());

      try {
         com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
         this.n5(var3);
      } finally {
         var2.n5();
      }
   }

   protected final float s7() {
      return this.d5() * 4.0F / 5.0F;
   }

   protected final void n5(LineFormat var1, n1g var2, com.aspose.slides.internal.o9b.c8 var3, float var4, com.aspose.slides.ms.System.o5<Float> var5) {
      com.aspose.slides.ms.System.o5 var6 = var5.k5();
      if (!var6.l6()) {
         var6 = new com.aspose.slides.ms.System.o5<>(1.0F);
      }

      l6v var7 = w5k.l6(var3.o8(), var1, var2, com.aspose.slides.internal.v6g.k5.l6(this, a1p.class) ? 0.75F : (Float)var6.n5());
      if (var7.n5() > var4) {
         var7.n5((double)var4);
      }

      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(this.p8(), this.i1().k5());
      com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.i1().k5());
      com.aspose.slides.internal.x4g.s7 var10 = new com.aspose.slides.internal.x4g.s7();
      var10.n5(var8.u3(), var9.u3());
      var7.u9 = w5k.n5(var3.o8(), (LineFillFormat)var1.getFillFormat(), var2, 1.0F, var10);
      var2.d2().n5(var10, var7, (a1v)null);
   }

   protected final void n5(IMarker var1, g3y var2) {
      if (this.c8() && var1.getSymbol() != 4) {
         l1z var3 = new l1z(var1, var2);
         this.n5(var3);
         this.n5 = var3;
      }
   }

   protected static boolean n5(g3y var0) {
      boolean var1 = ChartTypeCharacterizer.isChartTypeLine(var0.u9().getType())
         || var0.u9().getType() == 54
         || var0.u9().getType() == 55
         || var0.u9().getType() == 56
         || var0.u9().getType() == 57
         || var0.u9().getType() == 70
         || var0.u9().getType() == 71;
      return !var1 || var0.u9().getFormat().getLine().getFillFormat().getFillType() == 0;
   }

   protected final boolean x8() {
      byte var1 = this.h0().getDashStyle();
      return var1 != -1 && var1 != 0;
   }

   public abstract int u3();

   protected abstract LineFormat h0();
}
