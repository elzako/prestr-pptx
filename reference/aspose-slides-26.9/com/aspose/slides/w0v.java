package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class w0v extends v6g {
   private final g3y n5;
   private final List<t9z> l6;
   private final List<t9z> k5;
   private double u3;
   private final double a6;
   private final double u9;

   protected final t9z[] u3() {
      return this.l6.toArray(new t9z[0]);
   }

   protected final t9z[] h0() {
      return this.k5.toArray(new t9z[0]);
   }

   protected final double c8() {
      return this.u3;
   }

   protected final double t2() {
      return this.a6;
   }

   protected final double s7() {
      return this.u9;
   }

   protected final g3y x8() {
      return this.n5;
   }

   protected w0v(g3y var1) {
      this.n5 = var1;
      this.l6 = new List<>();
      this.k5 = new List<>();
      switch (var1.u9().getPieSplitBy()) {
         case 0:
         default:
            this.n5(var1.c8());
            break;
         case 1:
            this.n5(var1.c8(), var1.u9().getParentSeriesGroup().getPieSplitCustomPoints());
            break;
         case 2:
            this.n5(var1.c8(), var1.u9().getPieSplitPosition());
            break;
         case 3:
            this.n5(var1.c8(), com.aspose.slides.internal.v6g.k5.u3(var1.u9().getPieSplitPosition(), 14));
            break;
         case 4:
            this.l6(var1.c8(), var1.u9().getPieSplitPosition());
      }

      t9z var2 = n5(var1, g2l.n5(this.k5));
      this.l6.insertItem(0, var2);
      this.u9 = g2l.n5(this.l6);
      double var3 = this.l6.size() == 1 ? 0.0 : this.l6.get_Item(0).n5() / this.u9 * 180.0;
      this.u3 = 90.0 - var3;
      if (this.u3 < 0.0) {
         this.u3 += 360.0;
      }

      this.a6 = (90.0 + var3) % 360.0;
   }

   protected final void n5(g4j var1, com.aspose.slides.internal.o9b.w1[] var2, com.aspose.slides.internal.o9b.w1[] var3) {
      com.aspose.slides.internal.o9b.w1 var4 = com.aspose.slides.internal.o9b.w1.n5.u3();
      var4.n5(var3[0]);
      var4.n5(var2[0]);
      z3y var5 = var1.n5(1.0, 1.0, 5);
      float var6 = Float.MAX_VALUE;
      float var7 = -Float.MAX_VALUE;

      for (com.aspose.slides.internal.o9b.w1 var11 : var5.n5()) {
         if (var11.k5() < var6) {
            var6 = var11.k5();
            var11.n5(var2[0]);
         }

         if (var11.k5() > var7) {
            var7 = var11.k5();
            var11.n5(var3[0]);
         }
      }
   }

   private static t9z n5(g3y var0, double var1) {
      int var3 = var0.c8().size();
      t9z var4 = null;
      if (var3 >= var0.u9().getDataPoints().size()) {
         var4 = new t9z(null, var0);
      } else {
         var4 = new t9z((ChartDataPoint)var0.u9().getDataPoints().get_Item(var3), var0);
      }

      var0.c8().addItem(var4);
      var4.n5(var1);
      return var4;
   }

   private void n5(List<t9z> var1, double var2) {
      double var4 = g2l.n5(var1);
      var2 /= 100.0;
      List$Enumerator var6 = var1.iterator();

      try {
         while (var6.hasNext()) {
            t9z var7 = (t9z)var6.next();
            if (var7.n5() / var4 < var2) {
               this.k5.addItem(var7);
            } else {
               this.l6.addItem(var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private void l6(List<t9z> var1, double var2) {
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            t9z var5 = (t9z)var4.next();
            if (var5.n5() < var2) {
               this.k5.addItem(var5);
            } else {
               this.l6.addItem(var5);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   private void n5(List<t9z> var1) {
      int var2 = var1.size();
      int var3 = var2 / 3 + (var2 % 3 > 0 ? 1 : 0);
      this.n5(var1, var3);
   }

   private void n5(List<t9z> var1, int var2) {
      int var3 = com.aspose.slides.ms.System.q1.n5(0, var1.size() - var2);

      for (int var4 = 0; var4 < var1.size(); var4++) {
         if (var4 < var3) {
            this.l6.addItem((t9z)var1.get_Item(var4));
         } else {
            this.k5.addItem((t9z)var1.get_Item(var4));
         }
      }
   }

   private void n5(IGenericEnumerable<t9z> var1, IPieSplitCustomPointCollection var2) {
      IGenericEnumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            if (!var2.containsItem(var4.s7())) {
               this.l6.addItem(var4);
            } else {
               this.k5.addItem(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }
}
