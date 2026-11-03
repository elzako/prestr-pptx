package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class s1z extends v6g {
   private List<List<x7u>> n5 = new List<>();
   private a8e l6;
   private d1x k5;

   s1z(a8e var1, d1x var2) {
      n1g var3 = var1.h0();
      this.l6 = var1;
      this.k5 = var2;
      List$Enumerator var4 = var3.y4().iterator();

      try {
         while (var4.hasNext()) {
            g3y var5 = (g3y)var4.next();
            List var6 = new List();
            this.n5.addItem(var6);
            List$Enumerator var7 = var5.c8().iterator();

            try {
               while (var7.hasNext()) {
                  t9z var8 = (t9z)var7.next();
                  String var9 = t7k.n5(var8.n5(), var8.u3(), false);
                  x7u var10 = new x7u(var9, var1);
                  var10.l6(!var8.c8());
                  var6.addItem(var10);
                  this.n5(var10);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
                  var7.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      int var19 = -1;
      int var20 = 0;

      for (int var21 = 0; var21 < this.l6.h0().y4().size(); var21++) {
         if (ChartTypeCharacterizer.isChartTypeColumn(this.l6.h0().y4().get_Item(var21).u9().getType())
            && (
               ChartTypeCharacterizer.c8(this.l6.h0().y4().get_Item(var21).u9().getType())
                  || ChartTypeCharacterizer.s7(this.l6.h0().y4().get_Item(var21).u9().getType())
            )) {
            if (var19 == -1) {
               var19 = var21;
            }

            if (var21 == this.l6.h0().y4().size() - 1 && ++var20 > 1) {
               this.n5.reverse(var19, var20);
            }
         } else if (var19 != -1) {
            this.n5.reverse(var19, var20);
            var20 = 0;
            var19 = -1;
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      float var2 = var1.l6() / this.n5.size();
      if (com.aspose.slides.ms.System.n1.k5(var2)) {
         var2 = var1.l6();
      }

      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            List var4 = (List)var3.next();
            float var5 = var1.n5() / var4.size();
            if (com.aspose.slides.ms.System.n1.k5(var5) || var5 < 0.0F) {
               var5 = 0.0F;
            }

            List$Enumerator var6 = var4.iterator();

            try {
               while (var6.hasNext()) {
                  x7u var7 = (x7u)var6.next();
                  d2k var8 = var7.n5(var7.h0(), var5, var2).u3();
                  var8.l6 = var8.l6 + 2.0F * this.u3();
                  var7.n3(new z5(var8.n5, var8.l6));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.k5(var1.n5());
      this.u3(var1.l6());
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = 0.0F;

      for (int var3 = 0; var3 < this.k5.h0().size(); var3++) {
         float var4 = var2 + this.k5.h0().get_Item(var3).d5() / 2.0F;
         float var5 = var1.n5() / this.n5.get_Item(var3).size();

         for (int var6 = 0; var6 < this.n5.get_Item(var3).size(); var6++) {
            float var7 = var6 * var5 + var5 / 2.0F;
            x7u var8 = this.n5.get_Item(var3).get_Item(var6);
            var8.a6(var7 - var8.d2() / 2.0F);
            var8.u9(var4 - var8.d5() / 2.0F + this.u3());
            var8.t1();
         }

         var2 += this.k5.h0().get_Item(var3).d5();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.l6.h0());
      var2.n5(var1.y4());

      try {
         super.l6();
         n1g var3 = this.l6.h0();
         DataTable var4 = (DataTable)this.l6.h0().n3().getChartDataTable();
         if (var4.hasBorderOutline()) {
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()),
               this.l6.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
               this.l6.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5()),
               this.l6.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5()),
               this.l6.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
         }

         if (var4.hasBorderHorizontal()) {
            float var5 = 0.0F;

            for (int var6 = 0; var6 < this.k5.h0().size() - 1; var6++) {
               var5 += this.k5.h0().get_Item(var6).d5();
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + var5),
                  new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + var5),
                  this.l6.n5().o8(),
                  (LineFormat)var4.getFormat().getLine(),
                  var3
               );
            }
         }

         if (var4.hasBorderVertical()) {
            float var11 = this.d2() / this.n5.get_Item(0).size();

            for (int var12 = 0; var12 < this.n5.get_Item(0).size(); var12++) {
               float var7 = this.p8() + var11 * var12;
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(var7, this.f2()),
                  new com.aspose.slides.internal.o9b.w1(var7, this.f2() + this.d5()),
                  this.l6.n5().o8(),
                  (LineFormat)var4.getFormat().getLine(),
                  var3
               );
            }
         }
      } finally {
         var2.n5();
      }
   }

   private float u3() {
      return 1.5F;
   }
}
