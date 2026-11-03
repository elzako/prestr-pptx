package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d4i extends v6g {
   private List<p7e> n5;
   private List<p7e> l6;
   private w3 k5;

   d4i(w3 var1) {
      this.k5 = var1;
      this.l6 = new List<>();
      this.n5 = new List<>();
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      if (this.k5.n5().c8().getShowMinorGridLines()) {
         float[] var2 = com.aspose.slides.internal.n8e.v4.a6(this.k5.k7());

         for (int var3 = 0; var3 < var2.length; var3++) {
            p7e var4 = new p7e(this.k5, false, var2[var3]);
            this.l6.addItem(var4);
            this.n5((com.aspose.slides.v6g)var4);
            var4.n3(var1);
         }
      }

      if (this.k5.n5().c8().getShowMajorGridLines()) {
         float[] var5 = com.aspose.slides.internal.n8e.v4.a6(this.k5.m1());

         for (int var6 = 0; var6 < var5.length; var6++) {
            p7e var7 = new p7e(this.k5, true, var5[var6]);
            this.n5.addItem(var7);
            this.n5((com.aspose.slides.v6g)var7);
            var7.n3(var1);
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (!this.k5.l6.isEmpty() && ChartTypeCharacterizer.isChartTypeRadar(this.k5.l6.get_Item(0).u9().getType())) {
         this.u3();
      } else {
         this.h0();
      }
   }

   private void u3() {
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            p7e var2 = (p7e)var1.next();
            var2.a6(this.d2() / 2.0F - var2.d2() / 2.0F);
            var2.u9(this.d5() / 2.0F - var2.d5() / 2.0F);
            var2.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var11 = this.n5.iterator();

      try {
         while (var11.hasNext()) {
            p7e var3 = (p7e)var11.next();
            var3.a6(this.d2() / 2.0F - var3.d2() / 2.0F);
            var3.u9(this.d5() / 2.0F - var3.d5() / 2.0F);
            var3.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   private void h0() {
      List$Enumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            p7e var2 = (p7e)var1.next();
            var2.a6(this.c8() ? 0.0F : var2.u3());
            var2.u9(this.c8() ? var2.u3() : 0.0F);
            var2.t1();
            this.n5(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      List$Enumerator var11 = this.n5.iterator();

      try {
         while (var11.hasNext()) {
            p7e var3 = (p7e)var11.next();
            var3.a6(this.c8() ? 0.0F : var3.u3());
            var3.u9(this.c8() ? var3.u3() : 0.0F);
            var3.t1();
            this.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
            var11.dispose();
         }
      }
   }

   private void n5(p7e var1) {
      boolean var2 = this.k5.n3().T_() && this.k5.n3().n5().c8().getFormat().getLine().getFillFormat().getFillType() != 0;
      if (var2) {
         if (this.c8() && var1.o0() == this.k5.y4()) {
            var1.l6(false);
         }

         if (!this.c8() && var1.b3() == this.k5.y4()) {
            var1.l6(false);
         }
      }
   }

   private boolean c8() {
      return com.aspose.slides.internal.v6g.k5.l6(this.k5, l5n.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.k5, i2z.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.k5, v3o.class)
         || com.aspose.slides.internal.v6g.k5.l6(this.k5, i2t.class);
   }

   @Override
   public int O_() {
      return 2;
   }

   @Override
   void U_() {
      if (this.T_()) {
         for (v6g var4 : this.a0()) {
            var4.U_();
         }
      }
   }
}
