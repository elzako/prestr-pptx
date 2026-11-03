package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

abstract class e1o extends v6g {
   private double[] l6;
   private double k5;
   private double u3;
   List<z4d> n5 = new List<>();
   private f7c a6;
   private w3q u9;
   private d0n h0;

   e1o(w3q var1, f7c var2) {
      this.u9 = var1;
      this.a6 = var2;
      if (var1.k5().getDisplayEquation() || var1.k5().getDisplayRSquaredValue()) {
         this.h0 = new d0n(this);
         this.n5(this.h0);
      }

      if (this.n3()) {
         this.l6(var1.k5().getIntercept());
      }
   }

   protected final void u3() {
      double[] var1 = null;
      double[] var2 = null;
      double[][] var3 = new double[][]{var1};
      double[][] var4 = new double[][]{var2};
      this.n5(var3, var4);
      var1 = var3[0];
      var2 = var4[0];
      this.n5(var1, var2);
   }

   @Override
   protected void n5(z5 var1) {
      if (this.h0 != null) {
         this.h0.n3(var1);
      }

      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            z4d var3 = (z4d)var2.next();
            var3.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void l6(z5 var1) {
      z4d var2 = this.n5.get_Item(0);
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            z4d var4 = (z4d)var3.next();
            if (ChartTypeCharacterizer.isChartTypeBar(this.x8().e2().u9().getType())) {
               var4.a6(this.x8().t9().k5.n5(var4.h0()));
               var4.u9(this.x8().t9().l6.n5(var4.u3()));
               if (var4.o0() < var2.o0()) {
                  var2 = var4;
               }
            } else {
               var4.u9(this.x8().t9().l6.n5(var4.h0()));
               var4.a6(this.x8().t9().k5.n5(var4.u3()));
               if (com.aspose.slides.internal.v6g.k5.l6(this.x8().t9().k5, m3o.class)
                  && (this.x8().t9().k5.n5().a0() || this.x8().e2().t2().n3().hasDataTable())) {
                  var4.a6(var4.b3() + com.aspose.slides.internal.v6g.k5.n5(this.x8().t9().k5, m3o.class).w1() / 2.0F);
               }

               if (var4.b3() > var2.b3()) {
                  var2 = var4;
               }
            }

            var4.t1();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (this.h0 != null) {
         this.h0.a6(var2.b3() - this.h0.d2() - 4.0F);
         this.h0.u9(var2.o0() - this.h0.d5() / 2.0F);
         com.aspose.slides.internal.k4y.v2o var14 = this.h0().k5().n5().n5();
         if (var14 != null && var14.l6() != null && var14.l6().x8() != null && var14.l6().n3() != null) {
            double var6 = var14.l6().x8().n5();
            double var8 = var14.l6().n3().n5();
            float var10 = this.h0().n5().t2().c4();
            float var11 = this.h0().n5().t2().y2();
            this.h0.a6(this.h0.b3() + (float)(var10 * var6));
            this.h0.u9(this.h0.o0() + (float)(var11 * var8));
         }

         this.h0.t1();
      }
   }

   @Override
   public int O_() {
      return 4;
   }

   final w3q h0() {
      return this.u9;
   }

   final void l6(double[] var1, double[] var2) {
      if (ChartTypeCharacterizer.isChartTypeBar(this.x8().e2().u9().getType())) {
         this.k5(var1, var2);
      } else {
         List$Enumerator var3 = this.n5.iterator();

         try {
            while (var3.hasNext()) {
               z4d var4 = (z4d)var3.next();
               if (!com.aspose.slides.ms.System.d2.k5(var4.u3())) {
                  if (var4.u3() > var2[0]) {
                     var2[0] = var4.u3();
                  }

                  if (var4.u3() < var1[0]) {
                     var1[0] = var4.u3();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   final void k5(double[] var1, double[] var2) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            z4d var4 = (z4d)var3.next();
            if (!com.aspose.slides.ms.System.d2.k5(var4.h0())) {
               if (var4.h0() > var2[0]) {
                  var2[0] = var4.h0();
               }

               if (var4.h0() < var1[0]) {
                  var1[0] = var4.h0();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   protected void n5(double[] var1, double[] var2) {
      double[][] var3 = new double[var2.length][];

      for (int var4 = 0; var4 < var2.length; var4++) {
         var3[var4] = new double[]{var1[var4]};
      }

      double[][] var7 = (double[][])null;
      if (this.n3()) {
         for (int var5 = 0; var5 < var2.length; var5++) {
            var2[var5] -= this.y4();
         }

         var7 = j8d.l6(var2, var3);
      } else {
         var7 = j8d.n5(var2, var3);
      }

      double[] var9 = new double[var7[0].length];

      for (int var6 = 0; var6 < var9.length; var6++) {
         var9[var6] = var7[0][var6];
         if (var6 == var9.length - 1 && this.n3()) {
            var9[var6] = this.y4();
         }
      }

      this.n5(var7[2][0]);
      this.n5(var9);
   }

   protected final void n5(double[][] var1, double[][] var2) {
      List var3 = new List();
      List var4 = new List();
      List$Enumerator var5 = this.x8().l6.iterator();

      try {
         while (var5.hasNext()) {
            h2v var6 = (h2v)var5.next();
            if (!var6.e2().c8()) {
               var3.addItem(var6.y4());
               var4.addItem(var6.n3());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      var1[0] = com.aspose.slides.internal.n8e.v4.u3(var3);
      var2[0] = com.aspose.slides.internal.n8e.v4.u3(var4);
   }

   final void c8() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            z4d var2 = (z4d)var1.next();
            if (this.x8().t9().l6.n5().c8().isLogarithmic()) {
               var2.l6(this.x8().t9().l6.n5().n5(var2.h0()));
            }

            if (this.x8().t9().k5.n5().c8().isLogarithmic()) {
               var2.n5(this.x8().t9().l6.n5().n5(var2.u3()));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final double[] t2() {
      return this.l6;
   }

   final void n5(double[] var1) {
      this.l6 = var1;
   }

   final double s7() {
      return this.k5;
   }

   final void n5(double var1) {
      this.k5 = var1;
   }

   protected final f7c x8() {
      return this.a6;
   }

   protected final boolean n3() {
      return !com.aspose.slides.ms.System.d2.k5(this.h0().k5().getIntercept());
   }

   final double y4() {
      return this.u3;
   }

   final void l6(double var1) {
      this.u3 = var1;
   }

   @Override
   protected void l6() {
      List var1 = new List();
      List$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            z4d var3 = (z4d)var2.next();
            var1.addItem(var3.i1().u3());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.sort(new e1o$1(this));
      com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
      f9 var4 = new f9(this.h0().n5().t2());
      var4.n5(var12.y4());

      try {
         this.n5(var1, this.h0(), this.h0().k5().getTrendlineType() != 3, this.h0().n5().t2());
      } finally {
         var4.n5();
      }
   }

   private void n5(List<com.aspose.slides.internal.o9b.w1> var1, w3q var2, boolean var3, n1g var4) {
      com.aspose.slides.internal.o9b.w1[] var5 = var1.toArray(new com.aspose.slides.internal.o9b.w1[0]);
      if (var5.length > 1) {
         com.aspose.slides.internal.x4g.s7 var6 = new com.aspose.slides.internal.x4g.s7();
         if (var3) {
            var6.u3(var5);
         } else {
            var6.l6(var5);
         }

         w5k.n5(var2.l6().o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var4, var6, (Format)var2.k5().getFormat());
      }
   }
}
