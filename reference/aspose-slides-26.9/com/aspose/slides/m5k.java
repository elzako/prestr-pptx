package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class m5k extends v6g {
   private final w3 n5;
   private final a8e l6;
   private final List<x7u> k5;

   m5k(a8e var1, w3 var2) {
      this.l6 = var1;
      this.n5 = var2;
      this.k5 = new List<>();
   }

   @Override
   protected void n5(z5 var1) {
      this.h0();
      float var2 = var1.n5() / this.k5.size();
      if (com.aspose.slides.ms.System.n1.k5(var2) || var2 < 0.0F) {
         var2 = 0.0F;
      }

      float var3 = 0.0F;
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            x7u var5 = (x7u)var4.next();
            d2k var6 = var5.n5(var5.h0(), var2, var1.l6()).u3();
            var6.l6 = var6.l6 + 2.0F * this.u3();
            var5.n3(new z5(var6.n5, var6.l6));
            if (var6.l6 > var3) {
               var3 = var6.l6;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.n5(new d2k(var1.n5(), var3));
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = var1.n5() / this.k5.size();

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         float var4 = var2 * var3 + var2 / 2.0F;
         x7u var5 = this.k5.get_Item(var3);
         var5.a6(var4 - var5.d2() / 2.0F);
         var5.u9(this.d5() / 2.0F - var5.d5() / 2.0F + this.u3());
         var5.t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6() {
      super.l6();
      n1g var1 = this.l6.h0();
      DataTable var2 = (DataTable)this.l6.h0().n3().getChartDataTable();
      if (var2.hasBorderOutline()) {
         w5k.n5(
            new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()),
            this.l6.n5().o8(),
            (LineFormat)var2.getFormat().getLine(),
            var1
         );
         w5k.n5(
            new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
            new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
            this.l6.n5().o8(),
            (LineFormat)var2.getFormat().getLine(),
            var1
         );
         w5k.n5(
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()),
            new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5()),
            this.l6.n5().o8(),
            (LineFormat)var2.getFormat().getLine(),
            var1
         );
      }

      if (var2.hasBorderVertical()) {
         float var3 = this.d2() / this.k5.size();

         for (int var4 = 0; var4 < this.k5.size(); var4++) {
            float var5 = this.p8() + var3 * var4;
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(var5, this.f2()),
               new com.aspose.slides.internal.o9b.w1(var5, this.f2() + this.d5()),
               this.l6.n5().o8(),
               (LineFormat)var2.getFormat().getLine(),
               var1
            );
         }
      }
   }

   private float u3() {
      boolean var1 = com.aspose.slides.internal.v6g.k5.l6(this.n5, a0k.class);
      if (!var1) {
         return 0.0F;
      }

      com.aspose.slides.internal.o9b.n3 var2 = this.n5.n5().l6();
      int var3 = var2.l6().u9(var2.x8());
      int var4 = var2.l6().h0(var2.x8());
      float var5 = var2.t2() * var4 / var3;
      return 0.076F * var5 + 0.21F;
   }

   private void h0() {
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            x7u var2 = (x7u)var1.next();
            this.l6(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.k5.clear();
      if (this.n5 != null) {
         n1g var21 = this.l6.h0();
         List$Enumerator var3 = var21.l6().iterator();

         try {
            while (var3.hasNext()) {
               x4 var4 = (x4)var3.next();
               if (var4 != null) {
                  String var5 = p4.n5(var4.l6(), this.n5);
                  x7u var6 = new x7u(var5, this.l6);
                  this.k5.addItem(var6);
                  this.n5(var6);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         int var22 = 0;
         List$Enumerator var23 = this.l6.h0().y4().iterator();

         try {
            while (var23.hasNext()) {
               g3y var24 = (g3y)var23.next();
               if (var22 < var24.c8().size()) {
                  var22 = var24.c8().size();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
               var23.dispose();
            }
         }

         while (this.k5.size() < var22) {
            x7u var25 = new x7u(com.aspose.slides.ms.System.d1.n5, this.l6);
            var25.l6(false);
            this.k5.addItem(var25);
            this.n5(var25);
         }
      }
   }
}
