package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class z1n {
   private final Chart n5;
   private final c4t l6;
   private final c4t k5;
   private final c4t u3;
   private final c4t a6;
   private final c4t u9;
   private final c9b h0;
   private final c4t c8;
   private final c4t t2;
   private final c4t s7;
   private final c4t x8;
   private final c4t n3;
   private final c4t y4;
   private final c4t e2;
   private final c4t t9;
   private final c4t z1;
   private final c4t t4;
   private final c4t q0;
   private final c4t z3;
   private final c4t m1;
   private final c4t k7;
   private final c4t m3;
   private final c4t z8;
   private final c4t j5;
   private final c4t w1;
   private final c4t r4;
   private final c4t c4;
   private final c4t y2;
   private final c4t y1;
   private final c4t a0;
   private final c4t d2;
   private com.aspose.slides.internal.k4y.e5m d5;
   private com.aspose.slides.internal.k4y.k4d s3;

   public z1n(Chart var1) {
      this.n5 = var1;
      this.l6 = new c4t(this);
      this.k5 = new c4t(this);
      this.u3 = new c4t(this);
      this.a6 = new c4t(this);
      this.u9 = new c4t(this);
      this.h0 = new c9b(this);
      this.c8 = new c4t(this);
      this.t2 = new c4t(this);
      this.s7 = new c4t(this);
      this.x8 = new c4t(this);
      this.n3 = new c4t(this);
      this.y4 = new c4t(this);
      this.e2 = new c4t(this);
      this.t9 = new c4t(this);
      this.z1 = new c4t(this);
      this.t4 = new c4t(this);
      this.q0 = new c4t(this);
      this.z3 = new c4t(this);
      this.m1 = new c4t(this);
      this.k7 = new c4t(this);
      this.m3 = new c4t(this);
      this.z8 = new c4t(this);
      this.j5 = new c4t(this);
      this.w1 = new c4t(this);
      this.r4 = new c4t(this);
      this.c4 = new c4t(this);
      this.y2 = new c4t(this);
      this.y1 = new c4t(this);
      this.a0 = new c4t(this);
      this.d2 = new c4t(this);
   }

   public final com.aspose.slides.internal.k4y.e5m n5() {
      return this.d5;
   }

   public final void n5(com.aspose.slides.internal.k4y.e5m var1) {
      this.d5 = var1;
   }

   public final com.aspose.slides.internal.k4y.k4d l6() {
      return this.s3;
   }

   public final void n5(com.aspose.slides.internal.k4y.k4d var1) {
      this.s3 = var1;
   }

   public final boolean k5() {
      return this.d5 != null && this.s3 != null;
   }

   public final Chart u3() {
      return this.n5;
   }

   public final c4t a6() {
      return this.l6;
   }

   public final c9b u9() {
      return this.h0;
   }

   public final c4t h0() {
      return this.k5;
   }

   public final c4t c8() {
      return this.u3;
   }

   public final c4t t2() {
      return this.a6;
   }

   public final c4t s7() {
      return this.u9;
   }

   public final c4t x8() {
      return this.c8;
   }

   public final c4t n3() {
      return this.t2;
   }

   public final c4t y4() {
      return this.s7;
   }

   public final c4t e2() {
      return this.x8;
   }

   public final c4t t9() {
      return this.n3;
   }

   public final c4t z1() {
      return this.y4;
   }

   public final c4t t4() {
      return this.e2;
   }

   public final c4t q0() {
      return this.t9;
   }

   public final c4t z3() {
      return this.z1;
   }

   public final c4t m1() {
      return this.t4;
   }

   public final c4t k7() {
      return this.q0;
   }

   public final c4t m3() {
      return this.z3;
   }

   public final c4t z8() {
      return this.m1;
   }

   public final c4t j5() {
      return this.k7;
   }

   public final c4t w1() {
      return this.m3;
   }

   public final c4t r4() {
      return this.z8;
   }

   public final c4t c4() {
      return this.j5;
   }

   public final c4t y2() {
      return this.w1;
   }

   public final c4t y1() {
      return this.r4;
   }

   public final c4t a0() {
      return this.c4;
   }

   public final c4t d2() {
      return this.y2;
   }

   public final c4t d5() {
      return this.y1;
   }

   public final c4t s3() {
      return this.a0;
   }

   public final c4t p8() {
      return this.d2;
   }

   public final ColorFormat n5(r0g var1, int var2, int var3) {
      ColorFormat var4 = new ColorFormat(var1);
      switch (this.s3.n5()) {
         case 0:
            this.n5(var4, var2, var3);
            break;
         case 1:
         case 2:
            this.n5(var4, var2, var3, false);
            break;
         case 3:
         case 4:
            this.n5(var4, var2, var3, true);
      }

      return var4;
   }

   private void n5(ColorFormat var1, int var2, int var3) {
      List var4 = this.s3.l6();
      com.aspose.slides.internal.k4y.t6j[] var5 = this.s3.k5();
      int var6 = var5.length > 0 ? var2 / var4.size() % var5.length : 0;
      int var7 = (var2 - var6 * var4.size()) % var4.size();
      c4i.n5(var1, (com.aspose.slides.internal.k4y.g7)var4.get_Item(var7));
      if (var5.length > 0) {
         c4i.n5(var1, var5[var6].n5());
      }
   }

   private void n5(ColorFormat var1, int var2, int var3, boolean var4) {
      List var5 = this.s3.l6();
      if (var5.size() > 0) {
         c4i.n5(var1, (com.aspose.slides.internal.k4y.g7)var5.get_Item(0));
         double var6 = var3 / 2.0 + 0.5;
         byte var8 = 30;
         int var9 = com.aspose.slides.internal.v6g.k5.u3(70.0 / var6, 14);
         if (++var2 <= var6) {
            n5(var1, var4 ? 0 : 1, (double)var9 * var2 + 30.0);
         } else {
            n5(var1, var4 ? 1 : 0, 100.0 - var9 * (var2 - var6));
         }
      }
   }

   private static void n5(ColorFormat var0, int var1, double var2) {
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var2), 14);
      if (var4 != 100) {
         var0.getColorTransform().add(var1, var4 / 100.0F);
      }
   }

   final void n5(int var1) {
      c5q var2 = new c5q(this.n5.getType());
      this.n5(var2.n5(var1));
      p6r.n5(this, new t5w(this.n5.getPresentation(), InterruptionToken.getNone()));
   }

   final void l6(int var1) {
      s2b var2 = new s2b();
      com.aspose.slides.ms.System.Xml.c7 var3 = com.aspose.slides.ms.System.Xml.c7.n5(new com.aspose.slides.internal.z0k.w1(var2.n5(0)));

      try {
         var3.u9();
         this.n5(new com.aspose.slides.internal.k4y.k4d(var3));
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
