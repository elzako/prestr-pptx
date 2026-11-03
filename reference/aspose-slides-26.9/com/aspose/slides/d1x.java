package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d1x extends v6g {
   private a8e n5;
   private List<g5l> l6 = new List<>();

   d1x(a8e var1) {
      n1g var2 = var1.h0();
      this.n5 = var1;
      List$Enumerator var3 = var2.y4().iterator();

      try {
         while (var3.hasNext()) {
            g3y var4 = (g3y)var3.next();
            g5l var5 = new g5l(var4);
            this.n5(var5);
            this.l6.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      int var9 = -1;
      int var10 = 0;

      for (int var6 = 0; var6 < this.n5.h0().y4().size(); var6++) {
         if (ChartTypeCharacterizer.isChartTypeColumn(this.n5.h0().y4().get_Item(var6).u9().getType())
            && (
               ChartTypeCharacterizer.c8(this.n5.h0().y4().get_Item(var6).u9().getType())
                  || ChartTypeCharacterizer.s7(this.n5.h0().y4().get_Item(var6).u9().getType())
            )) {
            if (var9 == -1) {
               var9 = var6;
            }

            if (var6 == this.n5.h0().y4().size() - 1 && ++var10 > 1) {
               this.l6.reverse(var9, var10);
            }
         } else if (var9 != -1) {
            this.l6.reverse(var9, var10);
            var10 = 0;
            var9 = -1;
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g5l var5 = (g5l)var4.next();
            var5.n3(new z5(var1.n5() * 0.35F, var1.l6()));
            var2 += var5.d5();
            if (var5.d2() > var3) {
               var3 = var5.d2();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.u3(var2);
      this.k5(var3);
   }

   @Override
   protected void l6(z5 var1) {
      float var2 = 0.0F;

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         this.l6.get_Item(var3).u9(var2);
         var2 += this.l6.get_Item(var3).d5();
         this.l6.get_Item(var3).t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   final int u3() {
      byte var1 = 0;
      List$Enumerator var2 = this.h0().iterator();

      try {
         while (var2.hasNext()) {
            g5l var3 = (g5l)var2.next();
            int var4 = var3.u3().u3();
            if (var4 == 2) {
               return 2;
            }

            if (var4 == 1 && var1 != 1) {
               var1 = 1;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.n5.h0());
      var2.n5(var1.y4());

      try {
         super.l6();
         n1g var3 = this.n5.h0();
         DataTable var4 = (DataTable)this.n5.h0().n3().getChartDataTable();
         if (var4.hasBorderOutline()) {
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2()),
               this.n5.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2()),
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
               this.n5.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
            w5k.n5(
               new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + this.d5()),
               new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + this.d5()),
               this.n5.n5().o8(),
               (LineFormat)var4.getFormat().getLine(),
               var3
            );
         }

         if (var4.hasBorderHorizontal()) {
            float var5 = 0.0F;

            for (int var6 = 0; var6 < this.l6.size() - 1; var6++) {
               var5 += this.l6.get_Item(var6).d5();
               w5k.n5(
                  new com.aspose.slides.internal.o9b.w1(this.p8(), this.f2() + var5),
                  new com.aspose.slides.internal.o9b.w1(this.p8() + this.d2(), this.f2() + var5),
                  this.n5.n5().o8(),
                  (LineFormat)var4.getFormat().getLine(),
                  var3
               );
            }
         }
      } finally {
         var2.n5();
      }
   }

   public final List<g5l> h0() {
      return this.l6;
   }
}
