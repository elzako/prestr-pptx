package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class b3u extends b3r {
   b3u(h2v var1) {
      this.n5(var1);
   }

   @Override
   protected void l6(h2v var1) {
      double var2 = this.x8().n3();
      double var4 = ((ErrorBarsCustomValues)var1.e2().s7().getErrorBarsCustomValues()).k5();
      double var6 = ((ErrorBarsCustomValues)var1.e2().s7().getErrorBarsCustomValues()).u3();
      this.a6(var2 - var4);
      this.u9(var2 + var6);
   }

   @Override
   protected void u3() {
      switch (this.c8().n5().getValueType()) {
         case 0:
            this.l6(this.x8());
            break;
         case 1:
            this.n5(this.x8().n3());
            break;
         case 2:
            this.l6(this.x8().n3());
            break;
         case 3:
            this.k5(this.x8().n3());
            break;
         case 4:
            this.u3(this.x8().n3());
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
            var2 += var5.n3();
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
      double var2 = this.y4();
      double var4 = 0.0;

      for (int var6 = 0; var6 < var1.size(); var6++) {
         var4 += com.aspose.slides.ms.System.q1.a6(((h2v)var1.get_Item(var6)).n3() - var2, 2.0);
      }

      return com.aspose.slides.ms.System.q1.z3(var4 / (var1.size() - 1));
   }

   final void e2() {
      ValueAxisBase var1 = com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.v6g.k5.n5(this.y1(), f7c.class).t9().l6, ValueAxisBase.class);
      com.aspose.slides.internal.o9b.w1 var2 = this.x8().n5().u3();
      if (this.c8().n5().getValueType() == 3) {
         this.k5.u9(var1.n5(this.y4()));
         this.k5.a6(var2.l6());
      } else {
         this.k5.a6(var2.l6());
         this.k5.u9(var2.k5());
      }

      if (this.c8().n5().getType() == 1 || this.c8().n5().getType() == 0) {
         this.n5.u9(var1.n5(this.t2()));
         this.n5.a6(this.k5.b3());
      }

      if (this.c8().n5().getType() == 2 || this.c8().n5().getType() == 0) {
         this.l6.u9(var1.n5(this.s7()));
         this.l6.a6(this.k5.b3());
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
            this.c8().n5(this.n5.p8() - 3.0F, this.n5.f2(), this.n5.p8() + 3.0F, this.n5.f2());
         }
      }

      if (this.c8().n5().getType() == 2 || this.c8().n5().getType() == 0) {
         this.c8().n5(this.l6.i1().u3(), new com.aspose.slides.internal.o9b.w1(this.k5.p8(), this.k5.f2()));
         if (this.c8().n5().hasEndCap()) {
            this.c8().n5(this.l6.p8() - 3.0F, this.l6.f2(), this.l6.p8() + 3.0F, this.l6.f2());
         }
      }
   }

   @Override
   protected s7m c8() {
      return this.x8().e2().n3();
   }
}
