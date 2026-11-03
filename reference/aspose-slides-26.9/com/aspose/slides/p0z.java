package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class p0z extends v6g {
   private final n1g n5;
   private final c9v l6;
   private final List<v6g> k5;

   public p0z(n1g var1, c9v var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new List<>();
      this.n5(l6(var1.y4()));
   }

   @Override
   public int O_() {
      return 0;
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = (a9v)var1;
      var2 = this.n5(var2);
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            v6g var4 = (v6g)var3.next();
            var4.n3(var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      a9v var3 = this.n5(var2);
      float var4 = var3.u3() - var2.u3();
      float var5 = var3.a6() - var2.a6();
      List$Enumerator var6 = this.k5.iterator();

      try {
         while (var6.hasNext()) {
            v6g var7 = (v6g)var6.next();
            var7.a6(var4);
            var7.u9(var5);
            var7.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      for (v6g var10 : this.a0()) {
         var10.t1();
      }
   }

   @Override
   protected void l6() {
      if (this.k5.size() > 0) {
         v6g var1 = this.k5.get_Item(0);
         if (var1.d2() == 0.0F && var1.d5() == 0.0F) {
            return;
         }

         if (!ChartTypeCharacterizer.isChartTypePie(this.n5.n3().getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(this.n5.n3().getType())) {
            this.n5.n5.l6 = new com.aspose.slides.internal.o9b.y1(var1.p8(), var1.f2(), var1.d2(), var1.d5());
            this.n5.n5.n5();
         } else {
            com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1(var1.p8(), var1.f2(), var1.d2(), var1.d5());
            ChartPlotArea var3 = (ChartPlotArea)this.n5.n3().getPlotArea();
            boolean var4 = w5k.n5(
               var2.y4(),
               var2.y4(),
               this.n5,
               var3.getFormat().getEffect3D(),
               (FillFormat)var3.getFormat().getFill(),
               (LineFormat)var3.getFormat().getLine(),
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               com.aspose.slides.internal.o9b.c8.u3.o8()
            );
            if (!var4) {
               w5k.l6(
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  this.n5,
                  var2.y4(),
                  (LineFormat)var3.getFormat().getLine(),
                  (FillFormat)var3.getFormat().getFill(),
                  var3.getFormat().getEffect()
               );
               w5k.n5(
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  com.aspose.slides.internal.o9b.c8.u3.o8(),
                  this.n5,
                  var2.y4(),
                  (LineFormat)var3.getFormat().getLine(),
                  (FillFormat)var3.getFormat().getFill(),
                  var3.getFormat().getEffect()
               );
            }
         }
      }
   }

   private void n5(List<KeyValuePair<p0z$n5, List<g3y>>> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            v6g var4 = this.n5(((p0z$n5)var3.getKey()).n5, (g3y[])((List)var3.getValue()).toArray(new g3y[0]));
            if (var4 != null) {
               this.k5.addItem(var4);
               this.n5(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static List<KeyValuePair<p0z$n5, List<g3y>>> l6(List<g3y> var0) {
      Dictionary var1 = new Dictionary();
      List var2 = new List();
      List$Enumerator var3 = var0.iterator();

      try {
         while (var3.hasNext()) {
            g3y var4 = (g3y)var3.next();
            p0z$n5 var5 = new p0z$n5(n5(var4.u9().getType()), var4.u9().getPlotOnSecondAxis());
            List var6;
            if (var1.containsKey(var5.n5())) {
               var6 = (List)((KeyValuePair)var2.get_Item((Integer)var1.get_Item(var5.n5()))).getValue();
            } else {
               var1.addItem(var5.n5(), var2.size());
               var6 = new List();
               var2.addItem(new KeyValuePair<>(var5.n5(), var6));
            }

            var6.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      List$Enumerator var15 = var2.iterator();

      try {
         while (var15.hasNext()) {
            KeyValuePair var16 = (KeyValuePair)var15.next();
            ((List)var16.getValue()).sort(new d2a());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }

      return var2;
   }

   private static int n5(int var0) {
      switch (var0) {
         case 22:
            return 19;
         case 23:
            return 20;
         case 24:
            return 21;
         case 29:
            return 26;
         case 67:
            return 66;
         default:
            return var0;
      }
   }

   private v6g n5(int var1, g3y[] var2) {
      boolean var3 = ChartTypeCharacterizer.isChartTypeRadar(var2[0].u9().getType());
      w3 var4;
      w3 var5;
      if (var2[0].u9().getPlotOnSecondAxis()) {
         var4 = this.c8();
         var5 = this.s7();
         if (var3) {
            var4 = this.u3().c8();
            var5 = this.u3().s7();
         }
      } else {
         var4 = this.h0();
         var5 = this.t2();
         if (var3) {
            var4 = this.u3().c8();
            var5 = this.u3().t2();
         }
      }

      switch (var1) {
         case 0:
         case 1:
         case 2:
            return new z8m(var2, var5, var4);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 25:
         case 27:
         case 30:
         case 33:
         case 36:
         case 37:
         case 38:
         case 39:
         case 40:
         case 41:
         case 42:
         case 43:
         case 44:
         case 45:
         case 46:
         case 50:
         case 51:
         case 52:
         case 62:
         case 63:
         case 64:
         case 65:
         case 73:
         default:
            return null;
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
            return new f9e(var2, var5, var4);
         case 26:
         case 29:
            return new k4w(var2[0]);
         case 28:
            return new r5l(var2[0]);
         case 31:
            return new x7(var2[0]);
         case 32:
         case 34:
         case 35:
            return new s2(var2, var5, var4);
         case 47:
         case 48:
         case 49:
            return new i9(var2, var5, var4);
         case 53:
         case 54:
         case 55:
         case 56:
         case 57:
            return new q5c(var2, var5, var4);
         case 58:
         case 59:
         case 60:
         case 61:
            return new x3l(var2, var5, var4);
         case 66:
         case 67:
            return new l6j(var2);
         case 68:
         case 69:
            return new j0(var2, var5, var4);
         case 70:
         case 71:
         case 72:
            return new s2u(var2, var5, var4);
         case 74:
            return new l6p(var2[0]);
         case 75:
            return new p8e(var2[0]);
         case 76:
            return new y5n(var2, var5, var4);
         case 77:
            return new t4g(var2, var5, var4);
         case 78:
            return new q4(var2, var5, var4);
         case 79:
            return new o3a(var2, var5, var4);
         case 80:
            return new f2q(var2[0], var5);
      }
   }

   private a9v n5(a9v var1) {
      ChartPlotArea var2 = (ChartPlotArea)this.n5.n3().getPlotArea();
      if (!var2.isLocationAutocalculated()) {
         return var1;
      }

      float var3 = var1.n5();
      float var4 = var1.l6();
      List$Enumerator var5 = this.n5.y4().iterator();

      try {
         while (var5.hasNext()) {
            g3y var6 = (g3y)var5.next();
            a9v var7 = this.n5(var6.u9(), var1);
            var3 = com.aspose.slides.ms.System.q1.l6(var3, var7.n5());
            var4 = com.aspose.slides.ms.System.q1.l6(var4, var7.l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var1.n5(var3, var4);
   }

   private a9v n5(ChartSeries var1, a9v var2) {
      return !ChartTypeCharacterizer.isChartTypePie(var1.getType()) && !ChartTypeCharacterizer.isChartTypeDoughnut(var1.getType()) ? var2 : this.l6(var1, var2);
   }

   private a9v l6(ChartSeries var1, a9v var2) {
      float var3 = var2.n5();
      float var4 = var2.l6();
      if (n5(var1)) {
         float var5 = 0.064F;
         var4 -= 0.128F * var4;
         var3 -= 0.128F * var3;
      }

      byte var7 = 4;
      if (var3 < 4.0F) {
         var3 = 4.0F;
      }

      if (var4 < 4.0F) {
         var4 = 4.0F;
      }

      a9v var6 = var2.n5(var3, var4);
      return var1.getType() != 28 && var1.getType() != 31 ? var6.u9() : var6;
   }

   final c9v u3() {
      return this.l6;
   }

   private List<p7m> n5(w3 var1) {
      List var2 = new List();
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            v6g var4 = (v6g)var3.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var4, p7m.class)) {
               p7m var5 = (p7m)var4;
               if (var5.l6 == var1 || var5.k5 == var1) {
                  var2.addItem(var5);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   final void n5(w3 var1, double[] var2, double[] var3) {
      List var4 = this.n5(var1);
      if (var4.size() == 0) {
         var2[0] = 0.0;
         var3[0] = 0.0;
      } else {
         if (((p7m)var4.get_Item(0)).l6 == var1) {
            ((p7m)var4.get_Item(0)).n5(var2, var3);
         } else {
            ((p7m)var4.get_Item(0)).l6(var2, var3);
         }

         if (var4.size() > 1) {
            double var5 = 0.0;
            double var7 = 0.0;

            for (int var9 = 1; var9 < var4.size(); var9++) {
               if (((p7m)var4.get_Item(var9)).l6 == var1) {
                  double[] var10 = new double[]{var5};
                  double[] var11 = new double[]{var7};
                  ((p7m)var4.get_Item(var9)).n5(var10, var11);
                  var5 = var10[0];
                  var7 = var11[0];
               } else {
                  double[] var12 = new double[]{var5};
                  double[] var13 = new double[]{var7};
                  ((p7m)var4.get_Item(var9)).l6(var12, var13);
                  var5 = var12[0];
                  var7 = var13[0];
               }

               if (var5 < var2[0]) {
                  var2[0] = var5;
               }

               if (var7 > var3[0]) {
                  var3[0] = var7;
               }
            }
         }
      }
   }

   @Override
   protected void V_() {
      com.aspose.slides.internal.v6g.k5.n5(this.n5.n3().getPlotArea(), ChartPlotArea.class).n5(this.p8() - this.y1().p8());
      com.aspose.slides.internal.v6g.k5.n5(this.n5.n3().getPlotArea(), ChartPlotArea.class).l6(this.f2() - this.y1().f2());
      com.aspose.slides.internal.v6g.k5.n5(this.n5.n3().getPlotArea(), ChartPlotArea.class).k5(this.d2());
      com.aspose.slides.internal.v6g.k5.n5(this.n5.n3().getPlotArea(), ChartPlotArea.class).u3(this.d5());
   }

   private static boolean n5(ChartSeries var0) {
      if (var0 == null) {
         throw new ArgumentNullException("series");
      } else {
         IDataLabelCollection var1 = var0.getLabels();
         if (!var1.isVisible()) {
            return false;
         } else if (var1.getCount() == 0) {
            return false;
         } else if (var0.getType() != 66 && var0.getType() != 67) {
            int var2 = var1.getDefaultDataLabelFormat().getPosition();
            return var2 == 6 || var2 == 1 || var2 == -1;
         } else {
            return true;
         }
      }
   }

   private w3 h0() {
      if (this.u3().u9() == null) {
         return this.u3().u3();
      } else if (!this.u3().u9().n5().c8().isVisible()) {
         return this.u3().u3();
      } else if (this.u3().u3() == null) {
         return this.u3().u9();
      } else if (!this.u3().u3().n5().c8().isVisible()) {
         return this.u3().u9();
      } else if (this.u3().u3().z3() != this.u3().u9().z3()) {
         return this.u3().u3();
      } else {
         return this.u3().u3().n5().c8().isPlotOrderReversed() != this.u3().u9().n5().c8().isPlotOrderReversed() ? this.u3().u3() : this.u3().u3();
      }
   }

   private w3 c8() {
      if (this.u3().u3() == null) {
         return this.u3().u9();
      } else if (this.u3().u9() == null) {
         return this.u3().u3();
      } else if (this.u3().u9().n5().c8().isVisible()) {
         return this.u3().u9();
      } else {
         ValueAxisBase var1 = com.aspose.slides.internal.v6g.k5.n5(this.u3().u9(), ValueAxisBase.class);
         if (var1 != null && com.aspose.slides.ms.System.j8.n5(this.u3().u9()) != com.aspose.slides.ms.System.j8.n5(this.u3().u3())) {
            return this.u3().u9();
         } else if (this.u3().u9().z3() != this.u3().u3().z3()) {
            return this.u3().u9();
         } else {
            return this.u3().u9().n5().c8().isPlotOrderReversed() != this.u3().u3().n5().c8().isPlotOrderReversed() ? this.u3().u9() : this.u3().u3();
         }
      }
   }

   private w3 t2() {
      if (this.u3().h0() == null) {
         return this.u3().a6();
      } else if (!this.u3().h0().n5().c8().isVisible()) {
         return this.u3().a6();
      } else if (this.u3().a6() == null) {
         return this.u3().h0();
      } else if (com.aspose.slides.ms.System.j8.n5(this.u3().a6()) != com.aspose.slides.ms.System.j8.n5(this.u3().h0())) {
         return this.u3().a6();
      } else if (!this.u3().a6().n5().c8().isVisible()) {
         return this.u3().h0();
      } else if (this.u3().a6().z3() != this.u3().h0().z3()) {
         return this.u3().a6();
      } else {
         return this.u3().a6().n5().c8().isPlotOrderReversed() != this.u3().h0().n5().c8().isPlotOrderReversed() ? this.u3().a6() : this.u3().a6();
      }
   }

   private w3 s7() {
      if (this.u3().a6() == null) {
         return this.u3().h0();
      } else if (this.u3().h0() == null) {
         return this.u3().a6();
      } else if (this.u3().h0().n5().c8().isVisible()) {
         return this.u3().h0();
      } else if (com.aspose.slides.ms.System.j8.n5(this.u3().h0()) != com.aspose.slides.ms.System.j8.n5(this.u3().a6())) {
         return this.u3().h0();
      } else if (this.u3().h0().z3() != this.u3().a6().z3()) {
         return this.u3().h0();
      } else {
         return this.u3().h0().n5().c8().isPlotOrderReversed() != this.u3().a6().n5().c8().isPlotOrderReversed() ? this.u3().h0() : this.u3().a6();
      }
   }
}
