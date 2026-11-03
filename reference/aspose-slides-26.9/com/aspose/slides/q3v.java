package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class q3v extends b3r {
   q3v(h2v var1) {
      this.n5(var1);
   }

   @Override
   protected void l6(h2v var1) {
      double var2 = this.t9() ? this.x8().n3() : this.x8().y4();
      double var4 = ((ErrorBarsCustomValues)var1.e2().s7().getErrorBarsCustomValues()).n5();
      double var6 = ((ErrorBarsCustomValues)var1.e2().s7().getErrorBarsCustomValues()).l6();
      this.a6(var2 - var4);
      this.u9(var2 + var6);
   }

   @Override
   protected void u3() {
      double var1 = this.t9() ? this.x8().n3() : this.x8().y4();
      switch (this.c8().n5().getValueType()) {
         case 0:
            this.l6(this.x8());
            break;
         case 1:
            this.n5(var1);
            break;
         case 2:
            this.l6(var1);
            break;
         case 3:
            this.k5(var1);
            break;
         case 4:
            this.u3(var1);
      }
   }

   @Override
   protected double y4() {
      List var1 = com.aspose.slides.internal.v6g.k5.n5(this.x8().y1(), f7c.class).l6;
      double var2 = 0.0;
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            h2v var5 = (h2v)var4.next();
            var2 += this.t9() ? var5.n3() : var5.y4();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var2 / var1.size();
   }

   @Override
   protected double h0() {
      List var1 = com.aspose.slides.internal.v6g.k5.n5(this.x8().y1(), f7c.class).l6;
      if (var1.size() <= 1) {
         return 0.0;
      }

      double var2 = this.y4();
      double var4 = 0.0;

      for (int var6 = 0; var6 < var1.size(); var6++) {
         double var7 = this.t9() ? ((h2v)var1.get_Item(var6)).n3() : ((h2v)var1.get_Item(var6)).y4();
         var4 += com.aspose.slides.ms.System.q1.a6(var7 - var2, 2.0);
      }

      return com.aspose.slides.ms.System.q1.z3(var4 / (var1.size() - 1));
   }

   final void e2() {
      w3 var1 = com.aspose.slides.internal.v6g.k5.n5(this.y1(), f7c.class).t9().k5;
      com.aspose.slides.internal.o9b.w1 var2 = this.x8().n5().u3();
      if (this.c8().n5().getValueType() == 3) {
         this.k5.a6(var1.n5(this.y4()));
         this.k5.u9(var2.k5());
      } else {
         this.k5.a6(var2.l6());
         this.k5.u9(var2.k5());
      }

      if (this.c8().n5().getType() == 1 || this.c8().n5().getType() == 0) {
         this.n5.a6(var1.n5(com.aspose.slides.internal.v6g.k5.l6(var1, u7.class) ? this.t2() + 0.5 : this.t2()));
         this.n5.u9(this.k5.o0());
      }

      if (this.c8().n5().getType() == 2 || this.c8().n5().getType() == 0) {
         this.l6.a6(var1.n5(com.aspose.slides.internal.v6g.k5.l6(var1, u7.class) ? this.s7() + 0.5 : this.s7()));
         this.l6.u9(this.k5.o0());
      }

      this.k5.t1();
      this.l6.t1();
      this.n5.t1();
   }

   @Override
   protected void n3() {
      if (this.c8().n5().getType() == 1 || this.c8().n5().getType() == 0) {
         this.c8().n5(this.n5.i1().u3(), new com.aspose.slides.internal.o9b.w1(this.k5.p8(), this.k5.f2()));
         if (this.c8().n5().hasEndCap()) {
            this.c8().n5(this.n5.p8(), this.n5.f2() - 3.0F, this.n5.p8(), this.n5.f2() + 3.0F);
         }
      }

      if (this.c8().n5().getType() == 2 || this.c8().n5().getType() == 0) {
         this.c8().n5(this.l6.i1().u3(), new com.aspose.slides.internal.o9b.w1(this.k5.p8(), this.k5.f2()));
         if (this.c8().n5().hasEndCap()) {
            this.c8().n5(this.l6.p8(), this.l6.f2() - 3.0F, this.l6.p8(), this.l6.f2() + 3.0F);
         }
      }
   }

   private boolean t9() {
      return ChartTypeCharacterizer.isChartTypeBar(this.x8().e2().y4().u9().getType());
   }

   @Override
   protected s7m c8() {
      return this.x8().e2().x8();
   }
}
