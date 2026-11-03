package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class m1r extends a0k {
   m1r(l5 var1) {
      super(var1);
   }

   @Override
   public void s7(z5 var1) {
      this.n5.clear();
      if (this.n5().d2().n3().getChartData().getSeries().get_Item(0).getType() == 76) {
         ChartSeries var2 = (ChartSeries)this.n5().d2().n3().getChartData().getSeries().get_Item(0);
         IGenericEnumerator var3 = var2.s7().iterator();

         try {
            while (var3.hasNext()) {
               a0 var4 = (a0)var3.next();
               this.n5((Object)var4.t2());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } else if (this.n5().d2().n3().getChartData().getSeries().get_Item(0).getType() == 79) {
         IChartCategoryCollection var15 = this.n5().d2().n3().getChartData().getCategories();
         if (var15.size() > 0) {
            for (int var17 = 0; var17 < var15.size(); var17++) {
               ChartCategory var19 = (ChartCategory)var15.get_Item(var17);
               Object var5 = var19.u3();
               if (var5 == null) {
                  var5 = com.aspose.slides.ms.System.a3.l6(var17);
               }

               this.n5(var5);
            }
         } else {
            super.s7(var1);
         }
      } else {
         IChartCategoryCollection var16 = this.n5().d2().n3().getChartData().getCategories();
         int var18 = 1;
         if (var16.size() > 0) {
            List var20 = new List();
            IGenericEnumerator var21 = var16.iterator();

            try {
               for (; var21.hasNext(); var18++) {
                  ChartCategory var6 = (ChartCategory)var21.next();
                  String var7 = "";
                  if (var6.u3() != null) {
                     var7 = var6.u3().toString();
                  } else {
                     var7 = com.aspose.slides.ms.System.a3.l6(var18);
                  }

                  if (!var20.containsItem(var7)) {
                     var20.addItem(var7);
                     this.n5((Object)var7);
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                  var21.dispose();
               }
            }
         } else {
            super.s7(var1);
         }
      }
   }

   @Override
   protected com.aspose.slides.internal.o9b.f2 x8(z5 var1) {
      z5 var2 = this.t2(var1);
      z5 var3 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      com.aspose.slides.internal.o9b.f2 var4 = this.u9(new z5(1000.0F, 1000.0F)).a6();
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2();
      if (this.n5().u9() == 0) {
         if (this.h0) {
            if (var4.l6() * 0.73F > var2.n5()) {
               this.h0 = false;
               this.n5().n5(30);
               return this.x8(var1);
            }

            var5 = new com.aspose.slides.internal.o9b.f2(var4.l6(), var4.k5() * 2.0F);
         } else {
            if (var4.l6() > var2.n5()) {
               this.h0 = true;
               return this.x8(var1);
            }

            var4.l6(var5);
         }
      } else if (this.n5().u9() == 30) {
         if (var4.l6() * 0.65 > var2.n5() * 1.5F) {
            this.n5().n5(60);
            return this.x8(var1);
         }

         this.u9(new z5(1000.0F, 1000.0F)).l6(var5);
      } else if (this.n5().u9() == 60) {
         if (var4.l6() > var2.n5() * 1.71F) {
            this.n5().n5(90);
         }

         this.u9(new z5(1000.0F, 1000.0F)).l6(var5);
      } else {
         if (var4.l6() > var2.n5() * 2.0F && this.n5().r4() + 1 < this.n5.size()) {
            this.n5().u9(this.n5().r4() + 1);
            return this.x8(var1);
         }

         this.u9(var3).l6(var5);
      }

      if (this.n5().u9() != 0 && var5.k5() > var2.l6()) {
         List$Enumerator var6 = this.n5.iterator();

         try {
            while (var6.hasNext()) {
               g8t var7 = (g8t)var6.next();
               this.n5(var7, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         this.u9(var3).l6(var5);
      }

      return var5;
   }

   @Override
   protected z5 t2(z5 var1) {
      float var2 = var1.n5() / this.n5.size();
      float var3 = var1.l6() - this.q0();
      return new z5(var2, var3);
   }
}
