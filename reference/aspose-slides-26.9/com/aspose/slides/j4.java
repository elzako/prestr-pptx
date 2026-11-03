package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class j4 extends f7c {
   private List<h2v> n5 = new List<>();

   j4(p7m var1, g3y var2) {
      super(var1, var2);
      boolean var3 = this.n5(this.e2());

      for (int var4 = 0; var4 < this.e2().c8().size(); var4++) {
         t9z var5 = this.e2().c8().get_Item(var4);
         g7 var6 = new g7(var5);
         this.l6.addItem(var6);
         this.n5(var6);
         if ((!var3 || var4 <= 0) && var5.t9() != null && var5.t9().y4()) {
            t3h var7 = new t3h(var6);
            var6.l6(var7);
            this.k5.addItem(var7);
            this.n5(var7);
            if (var5.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
               a6y var8 = new a6y(var5);
               var6.n5(var8);
               this.u3.addItem(var8);
               this.n5(var8);
            }
         }
      }

      List$Enumerator var12 = this.e2().c8().iterator();

      try {
         while (var12.hasNext()) {
            t9z var13 = (t9z)var12.next();
            g7 var14 = new g7(var13);
            this.n5.addItem(var14);
            this.n5(var14);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }
   }

   private boolean n5(g3y var1) {
      if (var1.u9().getLabels().getDefaultDataLabelFormat().getShowSeriesName()
         && !var1.u9().getLabels().getDefaultDataLabelFormat().getShowCategoryName()
         && !var1.u9().getLabels().getDefaultDataLabelFormat().getShowLabelValueFromCell()
         && !var1.u9().getLabels().getDefaultDataLabelFormat().getShowValue()) {
         if (this.e2().c8().size() > 1) {
            for (int var2 = 1; var2 < this.e2().c8().size(); var2++) {
               DataLabel var3 = this.e2().c8().get_Item(var2).t9().l6();
               if (!this.e2().c8().get_Item(var2).t9().y4()
                  || !var3.getDataLabelFormat().getShowSeriesName()
                  || var3.getDataLabelFormat().getShowCategoryName()
                  || var3.getDataLabelFormat().getShowLabelValueFromCell()
                  || var3.getDataLabelFormat().getShowValue()) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void n5(z5 var1) {
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            h2v var3 = (h2v)var2.next();
            var3.n3(new z5(0.0F, 0.0F));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var28 = this.n5.iterator();

      try {
         while (var28.hasNext()) {
            h2v var4 = (h2v)var28.next();
            var4.n3(new z5(0.0F, 0.0F));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }

      List$Enumerator var29 = this.k5.iterator();

      try {
         while (var29.hasNext()) {
            q8o var5 = (q8o)var29.next();
            var5.n3(var5.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var29, IDisposable.class)) {
            var29.dispose();
         }
      }

      List$Enumerator var30 = this.u3.iterator();

      try {
         while (var30.hasNext()) {
            a6y var6 = (a6y)var30.next();
            var6.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
            var30.dispose();
         }
      }

      this.u9(var1);
   }

   @Override
   protected void l6(z5 var1) {
      this.n5();
      this.k5(var1);
      this.u3();
      this.n3();

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   private static void n5(List<h2v> var0) {
      if (var0 != null && var0.size() > 1) {
         List var1 = new List(var0);
         n5(var0, var1, 0, var0.size() - 1);
      }
   }

   private static void n5(List<h2v> var0, List<h2v> var1, int var2, int var3) {
      if (var2 < var3) {
         int var4 = (var2 + var3) / 2;
         n5(var1, var0, var2, var4);
         n5(var1, var0, var4 + 1, var3);
         int var5 = var2;
         int var6 = var4 + 1;
         int var7 = var2;

         while (var5 <= var4 && var6 <= var3) {
            if (n5(((h2v)var1.get_Item(var5)).e2().l6(), ((h2v)var1.get_Item(var6)).e2().l6())) {
               var0.set_Item(var7++, var1.get_Item(var5++));
            } else {
               var0.set_Item(var7++, var1.get_Item(var6++));
            }
         }

         while (var5 <= var4) {
            var0.set_Item(var7++, var1.get_Item(var5++));
         }

         while (var6 <= var3) {
            var0.set_Item(var7++, var1.get_Item(var6++));
         }
      }
   }

   private static boolean n5(double var0, double var2) {
      return com.aspose.slides.ms.System.d2.k5(var0) || !com.aspose.slides.ms.System.d2.k5(var0) && !com.aspose.slides.ms.System.d2.k5(var2) && var0 <= var2;
   }

   protected final void n5() {
      boolean var1 = this.t9().k5.n5().a0();
      double var2 = this.t9().k5.d2() / (var1 ? this.t9().k5.n5.size() : this.t9().k5.n5.size() - 1);
      ValueAxisBase var4 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);
      if (this.t9().k5.n5().c8().getCategoryAxisType() == 1) {
         n5(this.l6);
      }

      if (this.t9().k5.n5().c8().getCategoryAxisType() == 1) {
         n5(this.n5);
      }

      int var5 = this.t9().n5.indexOf(this);
      float var6 = 0.0F;

      for (int var7 = 0; var7 < this.l6.size(); var7++) {
         if (var7 > 0) {
            var6 = this.l6.get_Item(var7 - 1).b3();
         }

         if (var4.n5().c8().isLogarithmic() && com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var7).n3())) {
            this.l6.get_Item(var7).n5(0.0);
         }

         this.l6.get_Item(var7).a6((float)var2 * var7);
         if (var1 || this.e2().t2().n3().hasDataTable()) {
            this.l6.get_Item(var7).a6(this.l6.get_Item(var7).b3() + (float)(var2 / 2.0));
         }

         if (this.t9().k5.n5().c8().isPlotOrderReversed()) {
            this.l6.get_Item(var7).a6(this.t9().k5.d2() - this.l6.get_Item(var7).b3());
         }

         if (com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
            if (com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var7).e2().l6())) {
               this.l6.get_Item(var7).a6(var6);
               continue;
            }

            this.l6.get_Item(var7).a6(this.t9().k5.n5(this.l6.get_Item(var7).e2().l6()));
            if (var1) {
               this.l6.get_Item(var7).a6(this.l6.get_Item(var7).b3() + com.aspose.slides.internal.v6g.k5.n5(this.t9().k5, m3o.class).w1() / 2.0F);
            } else if (com.aspose.slides.internal.v6g.k5.n5(this.y1().y1(), p0z.class).a0().length > 1 && var7 < this.l6.size() - 1) {
               this.l6.get_Item(var7).a6(this.t9().k5.n5(this.l6.get_Item(var7 + 1).e2().l6()));
            }
         }

         this.l6.get_Item(var7).u9(this.t9().l6.n5(this.l6.get_Item(var7).n3()));
         this.n5.get_Item(this.l6.size() - 1 - var7).a6(this.l6.get_Item(var7).b3());
         this.n5.get_Item(this.l6.size() - 1 - var7).l6(this.l6.get_Item(var7).T_());
         if (var5 <= 0
            || var7 >= this.t9().n5.get_Item(var5 - 1).l6.size()
            || !ChartTypeCharacterizer.c8(this.e2().u9().getType()) && !ChartTypeCharacterizer.s7(this.e2().u9().getType())) {
            this.n5.get_Item(this.l6.size() - 1 - var7).u9(this.t9().l6.y4());
         } else {
            this.n5.get_Item(this.l6.size() - 1 - var7).u9(this.t9().n5.get_Item(var5 - 1).l6.get_Item(var7).o0());
         }
      }
   }

   private void k5(z5 var1) {
      for (int var2 = 0; var2 < this.k5.size(); var2++) {
         g7 var3 = (g7)com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var2), t3h.class).u3();
         q8o var4 = this.k5.get_Item(var2);
         new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.w1 var5;
         if (this.n5(this.e2())) {
            if (this.e2().c8().size() % 2 > 0) {
               double var6 = this.l6.get_Item(this.l6.size() / 2).n3();
               double var8 = this.n5.get_Item(this.l6.size() / 2).n3();
               var5 = new com.aspose.slides.internal.o9b.w1(var1.n5() / 2.0F, this.t9().l6.n5(var6 / 2.0 + (var6 - var8) / 2.0));
            } else {
               double var22 = this.l6.get_Item(this.l6.size() / 2 - 1).n3();
               double var23 = this.n5.get_Item(this.l6.size() / 2 - 1).n3();
               double var10 = this.l6.get_Item(this.l6.size() / 2).n3();
               double var12 = this.n5.get_Item(this.l6.size() / 2).n3();
               double var14 = (var22 + var10) / 4.0 + (var22 - var23 + var10 - var12) / 4.0;
               var5 = new com.aspose.slides.internal.o9b.w1(var1.n5() / 2.0F, this.t9().l6.n5(var14));
            }
         } else if (!ChartTypeCharacterizer.c8(this.e2().u9().getType()) && !ChartTypeCharacterizer.s7(this.e2().u9().getType())) {
            var5 = new com.aspose.slides.internal.o9b.w1(var3.b3(), (this.t9().l6.y4() + var3.o0()) / 2.0F);
         } else {
            var5 = new com.aspose.slides.internal.o9b.w1(var3.b3(), (this.n5.get_Item(this.l6.size() - 1 - var2).o0() + var3.o0()) / 2.0F);
         }

         var5.n5(var5.l6() - var4.d2() / 2.0F);
         var5.l6(var5.k5() - var4.d5() / 2.0F);
         a9v var16 = (a9v)var1;
         com.aspose.slides.internal.o9b.y1 var17 = new com.aspose.slides.internal.o9b.y1(-var16.u3(), -var16.a6(), this.y2().d2(), this.y2().d5());
         com.aspose.slides.internal.o9b.w1 var18 = var4.l6(var5.u3(), var17.y4()).u3();
         if (this.u3.size() > 0) {
            this.u3.get_Item(var2).n5(com.aspose.slides.internal.o9b.w1.l6(var18, var5));
         }

         var4.a6(var18.l6());
         var4.u9(var18.k5());
         var4.t1();
         float var20;
         float var21;
         if (this.e2().u9().getType() != 48 && this.e2().u9().getType() != 49) {
            var20 = var3.b3() - var4.b3();
            var21 = var3.o0() - var4.o0();
         } else {
            com.aspose.slides.internal.o9b.w1 var19 = new com.aspose.slides.internal.o9b.w1(
               var3.b3(), (this.n5.get_Item(this.l6.size() - 1 - var2).o0() + var3.o0()) / 2.0F
            );
            var20 = var19.l6() - var4.b3();
            var21 = var19.k5() - var4.o0();
         }

         var4.n5(new com.aspose.slides.internal.o9b.w1(var20, var21));
      }
   }

   private void u3() {
      for (int var1 = 0; var1 < this.u3.size(); var1++) {
         a6y var2 = this.u3.get_Item(var1);
         t3h var3 = (t3h)this.k5.get_Item(var1);
         g7 var4 = (g7)var3.u3();
         com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1();
         if (!ChartTypeCharacterizer.c8(this.e2().u9().getType()) && !ChartTypeCharacterizer.s7(this.e2().u9().getType())) {
            var4.n5(var3).n5(var5);
         } else {
            var5 = new com.aspose.slides.internal.o9b.w1(var4.b3(), (this.n5.get_Item(this.l6.size() - 1 - var1).o0() + var4.o0()) / 2.0F);
         }

         com.aspose.slides.internal.o9b.w1[] var6;
         if (!(var3.p8() > var5.l6()) && !(var3.p8() + var3.d2() < var5.l6())) {
            var6 = var3.z3();
         } else {
            var6 = var3.q0();
         }

         var2.n5(var2.n5(var3.e5().y4(), new com.aspose.slides.internal.o9b.w1[]{var5}, var6) && !var3.e5().k5(var4.e5().y4()) && var2.T_());
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.w1[] var1 = this.h0();
      var1 = this.n5(var1, this.y1().y2().e5().y4());
      f9 var2 = new f9(this.e2().t2());
      com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
      var2.n5(var3.y4());

      try {
         com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
         if (var1.length > 3) {
            var4.k5(var1);
         } else if (var1.length == 2) {
            var4.n5(var1[0].u3(), var1[1].u3());
         }

         boolean var5 = this.e2().a6(var4);
         if (!var5 && var1.length > 0) {
            this.e2().k5(var4);
            this.e2().n5(var4);
         }
      } finally {
         var2.n5();
      }
   }

   private com.aspose.slides.internal.o9b.w1[] h0() {
      List var1 = new List();
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            h2v var3 = (h2v)var2.next();
            com.aspose.slides.internal.o9b.w1 var4 = var3.i1().u3();
            if (var3.T_() || com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
               if (var4.k5() < -1000000.0F) {
                  var4.l6(-1000000.0F);
               }

               if (var4.k5() > 1000000.0F) {
                  var4.l6(1000000.0F);
               }

               var1.addItem(var4.u3());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      List$Enumerator var13 = this.n5.iterator();

      try {
         while (var13.hasNext()) {
            h2v var14 = (h2v)var13.next();
            com.aspose.slides.internal.o9b.w1 var5 = var14.i1().u3();
            if (var14.T_() || com.aspose.slides.internal.v6g.k5.l6(this.t9().k5, o8r.class)) {
               if (var5.k5() < -1000000.0F) {
                  var5.l6(-1000000.0F);
               }

               if (var5.k5() > 1000000.0F) {
                  var5.l6(1000000.0F);
               }

               var1.addItem(var5.u3());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      return (com.aspose.slides.internal.o9b.w1[])var1.toArray(new com.aspose.slides.internal.o9b.w1[0]);
   }

   private com.aspose.slides.internal.o9b.w1[] n5(com.aspose.slides.internal.o9b.w1[] var1, com.aspose.slides.internal.o9b.y1 var2) {
      List var3 = new List<>(com.aspose.slides.ms.System.u3.n5(var1));
      if (var3.size() > 2) {
         com.aspose.slides.internal.o9b.w1[] var4 = new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(var2.a6(), var2.t2()),
            new com.aspose.slides.internal.o9b.w1(var2.h0(), var2.t2()),
            new com.aspose.slides.internal.o9b.w1(var2.h0(), var2.l6()),
            new com.aspose.slides.internal.o9b.w1(var2.a6(), var2.l6())
         };

         for (int var5 = 0; var5 < var4.length; var5++) {
            int var6 = (var5 + 1) % var4.length;
            var3 = this.n5(var3, var4[var5].u3(), var4[var6].u3());
         }
      }

      return (com.aspose.slides.internal.o9b.w1[])var3.toArray(new com.aspose.slides.internal.o9b.w1[0]);
   }

   private List<com.aspose.slides.internal.o9b.w1> n5(
      List<com.aspose.slides.internal.o9b.w1> var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3
   ) {
      List var4 = new List();

      for (int var5 = 0; var5 < var1.size(); var5++) {
         int var6 = (var5 + 1) % var1.size();
         com.aspose.slides.internal.o9b.w1 var7 = ((com.aspose.slides.internal.o9b.w1)var1.get_Item(var5)).u3();
         com.aspose.slides.internal.o9b.w1 var8 = ((com.aspose.slides.internal.o9b.w1)var1.get_Item(var6)).u3();
         boolean var9 = this.n5(var2.u3(), var3.u3(), var7.u3());
         boolean var10 = this.n5(var2.u3(), var3.u3(), var8.u3());
         if (var9 && var10) {
            var4.addItem(var8.u3());
         } else if (var9 || var10) {
            com.aspose.slides.internal.o9b.w1 var11 = this.n5(var2.u3(), var3.u3(), var7.u3(), var8.u3()).u3();
            var4.addItem(var11.u3());
            if (var10) {
               var4.addItem(var8.u3());
            }
         }
      }

      return var4;
   }

   private boolean n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3) {
      return (var2.l6() - var1.l6()) * (var3.k5() - var1.k5()) - (var2.k5() - var1.k5()) * (var3.l6() - var1.l6()) >= 0.0F;
   }

   private com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      float var5 = var2.l6() - var1.l6();
      float var6 = var2.k5() - var1.k5();
      float var7 = var4.l6() - var3.l6();
      float var8 = var4.k5() - var3.k5();
      float var9 = var5 * var8 - var6 * var7;
      if (var9 == 0.0F) {
         return var3;
      }

      float var10 = ((var3.l6() - var1.l6()) * var6 - (var3.k5() - var1.k5()) * var5) / var9;
      return new com.aspose.slides.internal.o9b.w1(var3.l6() + var10 * var7, var3.k5() + var10 * var8);
   }
}
