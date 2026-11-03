package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class p7m extends v6g {
   private List<v6g> u3 = new List<>();
   List<f7c> n5 = new List<>();
   w3 l6;
   w3 k5;

   public p7m(w3 var1, w3 var2) {
      this.k5 = var2;
      this.l6 = var1;
   }

   protected final void h0() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            f7c var2 = (f7c)var1.next();
            var2.s7();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   protected final void n5(ChartSeries var1) {
      for (int var2 = 0; var2 < this.n5.get_Item(0).l6.size(); var2++) {
         if (var1.e2()) {
            n8e var3 = new n8e(this.n5.get_Item(0).e2(), this.n5(var2), this.l6);
            this.u3.addItem(var3);
            this.n5(var3);
         }

         if (var1.t9()) {
            m6c var4 = new m6c(this.n5.get_Item(0).e2(), this.n5(var2));
            this.u3.addItem(var4);
            this.n5(var4);
         }

         if (var1.hasUpDownBars()) {
            i1l var5 = new i1l(this.n5.get_Item(0).e2(), this.n5(var2), this.k5);
            this.u3.addItem(var5);
            this.n5(var5);
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            f7c var3 = (f7c)var2.next();
            var3.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var12 = this.u3.iterator();

      try {
         while (var12.hasNext()) {
            v6g var4 = (v6g)var12.next();
            var4.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   final h2v[] n5(int var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < this.n5.size(); var3++) {
         if (var1 < this.n5.get_Item(var3).l6.size()) {
            var2.addItem(this.n5.get_Item(var3).l6.get_Item(var1));
         }
      }

      return (h2v[])var2.toArray(new h2v[0]);
   }

   final void n5(double[] var1, double[] var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      if (!ChartTypeCharacterizer.e2(this.n5.get_Item(0).e2().u9().getType()) && this.n5.get_Item(0).l6.size() == 0) {
         var1[0] = 0.0;
         var2[0] = 0.0;
      } else {
         this.n5.get_Item(0).l6(var1, var2);
      }

      if (this.n5.size() > 1) {
         for (int var7 = 1; var7 < this.n5.size(); var7++) {
            if (ChartTypeCharacterizer.e2(this.n5.get_Item(var7).e2().u9().getType())
               ? this.n5.get_Item(var7).e2().u9().s7().n5() != 0
               : this.n5.get_Item(var7).l6.size() != 0 && !this.n5.get_Item(var7).y4()) {
               double[] var8 = new double[]{var3};
               double[] var9 = new double[]{var5};
               this.n5.get_Item(var7).l6(var8, var9);
               var3 = var8[0];
               var5 = var9[0];
               if (var3 < var1[0]) {
                  var1[0] = var3;
               }

               if (var5 > var2[0]) {
                  var2[0] = var5;
               }
            }
         }
      }
   }

   final void l6(double[] var1, double[] var2) {
      double var3 = 0.0;
      double var5 = 0.0;
      if (this.n5.get_Item(0).l6.size() == 0) {
         var1[0] = 0.0;
         var2[0] = 0.0;
      } else {
         this.n5.get_Item(0).k5(var1, var2);
      }

      if (this.n5.size() > 1) {
         for (int var7 = 1; var7 < this.n5.size(); var7++) {
            if (this.n5.get_Item(var7).l6.size() != 0) {
               double[] var8 = new double[]{var3};
               double[] var9 = new double[]{var5};
               this.n5.get_Item(var7).k5(var8, var9);
               var3 = var8[0];
               var5 = var9[0];
               if (var3 < var1[0]) {
                  var1[0] = var3;
               }

               if (var5 > var2[0]) {
                  var2[0] = var5;
               }
            }
         }
      }
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
