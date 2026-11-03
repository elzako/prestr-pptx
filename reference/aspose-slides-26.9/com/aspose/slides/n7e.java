package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class n7e extends e8y {
   private List<List<h2v>> n5 = new List<>();

   @Override
   public int O_() {
      return 4;
   }

   n7e(p7m var1, g3y var2) {
      super(var1, var2);
      List$Enumerator var3 = this.e2().c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            g7k var5 = new g7k(var4);
            this.l6.addItem(var5);
            this.n5(var5);
            if (var5.T_()) {
               if (var4.s7().l6() != null && var4.s7().getMarker().getSymbol() != 4 || var2.u9().getMarker().getSymbol() != 4) {
                  IMarker var6 = var4.s7().l6();
                  if (var6 == null) {
                     var6 = var2.u9().getMarker();
                  }

                  l1z var7 = new l1z(var6, var4.y4());
                  var5.n5(var7);
                  this.u9.addItem(var7);
                  this.n5(var7);
               }

               if (var4.t9() != null && var4.t9().y4()) {
                  t3h var11 = new t3h(var5);
                  var5.l6(var11);
                  this.k5.addItem(var11);
                  this.n5(var11);
                  if (var4.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                     a6y var12 = new a6y(var4);
                     var5.n5(var12);
                     this.u3.addItem(var12);
                     this.n5(var12);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
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

      List$Enumerator var19 = this.k5.iterator();

      try {
         while (var19.hasNext()) {
            q8o var4 = (q8o)var19.next();
            var4.n3(var4.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      List$Enumerator var20 = this.u3.iterator();

      try {
         while (var20.hasNext()) {
            a6y var5 = (a6y)var20.next();
            var5.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      this.u9(var1);
      this.a6(var1);
      this.k5(var1);
   }

   @Override
   protected void l6(z5 var1) {
      this.u3();
      this.n3();
      this.t2();
      this.x8();
      this.h0(var1);
      this.c8();

      for (v6g var5 : this.a0()) {
         var5.t1();
      }
   }

   private void u3() {
      boolean var1 = this.t9().k5.n5().a0();
      ValueAxisBase var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9().l6, ValueAxisBase.class);
      if (this.t9().k5.n5().c8().getCategoryAxisType() == 1) {
         this.l6.sort(new n7e$1(this));
      }

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         if ((!var2.n5().c8().isLogarithmic() || !com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var3).n3()))
            && (this.t9().k5.n5().c8().getCategoryAxisType() != 1 || !com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var3).e2().l6()))) {
            double var4 = this.h0() * var3;
            if (!com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var3).e2().l6())) {
               var4 = this.t9().k5.n5(this.l6.get_Item(var3).e2().l6());
            }

            if (var1 || this.e2().t2().n3().hasDataTable()) {
               var4 += this.h0() / 2.0F;
            }

            if (this.t9().k5.n5().c8().isPlotOrderReversed() && com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var3).e2().l6())) {
               var4 = this.t9().k5.d2() - var4;
            }

            double var6 = this.t9().l6.n5(this.l6.get_Item(var3).n3());
            this.l6.get_Item(var3).a6((float)var4);
            this.l6.get_Item(var3).u9((float)var6);
         } else {
            this.l6.get_Item(var3).l6(false);
         }
      }
   }

   private void h0(z5 var1) {
      float var2 = 6.0F;

      for (int var3 = 0; var3 < this.k5.size(); var3++) {
         float var4 = var2;
         float var5 = var2;
         g7k var6 = (g7k)com.aspose.slides.internal.v6g.k5.n5(this.k5.get_Item(var3), t3h.class).u3();
         q8o var7 = this.k5.get_Item(var3);
         if (var6.u3() != null) {
            var5 = (var6.u3().d2() + var2) / 2.0F;
            var4 = (var6.u3().d5() + var2) / 2.0F;
         }

         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var6.b3(), var6.o0());
         switch (var7.c8()) {
            case 0:
               var8.n5(var8.l6() - var7.d2() / 2.0F);
               var8.l6(var8.k5() + var4);
            case 1:
            case 3:
            case 4:
            case 6:
            default:
               break;
            case 2:
               var8.n5(var8.l6() - var7.d2() / 2.0F);
               var8.l6(var8.k5() - var7.d5() / 2.0F);
               break;
            case 5:
               var8.n5(var8.l6() - (var7.d2() + var5));
               var8.l6(var8.k5() - var7.d5() / 2.0F);
               break;
            case 7:
               var8.n5(var8.l6() + var5);
               var8.l6(var8.k5() - var7.d5() / 2.0F);
               break;
            case 8:
               var8.n5(var8.l6() - var7.d2() / 2.0F);
               var8.l6(var8.k5() - (var7.d5() + var4));
         }

         a9v var9 = (a9v)var1;
         com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(-var9.u3(), -var9.a6(), this.y2().d2(), this.y2().d5());
         com.aspose.slides.internal.o9b.w1 var11 = var7.l6(var8.u3(), var10.y4()).u3();
         var7.a6(var11.l6());
         var7.u9(var11.k5());
         var7.t1();
         float var12 = var6.b3() - var7.b3();
         float var13 = var6.o0() - var7.o0();
         var7.n5(new com.aspose.slides.internal.o9b.w1(var12, var13));
      }
   }

   private void c8() {
      for (int var1 = 0; var1 < this.u3.size(); var1++) {
         a6y var2 = this.u3.get_Item(var1);
         t3h var3 = (t3h)this.k5.get_Item(var1);
         g7k var4 = (g7k)var3.u3();
         com.aspose.slides.internal.o9b.w1 var5 = var4.n5(var3).u3();
         com.aspose.slides.internal.o9b.w1[] var6;
         if (!(var3.p8() > var5.l6()) && !(var3.p8() + var3.d2() < var5.l6())) {
            var6 = var3.z3();
         } else {
            var6 = var3.q0();
         }

         boolean var7 = var2.n5(var3.e5().y4(), new com.aspose.slides.internal.o9b.w1[]{var5}, var6);
         float var8 = 0.0F;
         boolean var9 = false;
         float[] var10 = new float[]{0.0F};
         boolean[] var11 = new boolean[]{false};
         w8d.n5(var2.h0().u3(), var2.c8().u3(), var3.e5().y4(), var10, var11);
         var8 = var10[0];
         var9 = var11[0];
         boolean var12 = var8 >= 5.0F;
         var2.n5(var7 && (var3.t2() != 0.0F || var3.s7() != 0.0F) && (!var9 || var12));
         var2.t1();
      }
   }

   private void t2() {
      for (int var1 = 0; var1 < this.l6.size(); var1++) {
         l1z var2 = ((g7k)this.l6.get_Item(var1)).u3();
         if (var2 != null && var2.T_()) {
            var2.a6(this.l6.get_Item(var1).p8() - var2.d2() / 2.0F);
            var2.u9(this.l6.get_Item(var1).f2() - var2.d5() / 2.0F);
            var2.t1();
         }
      }
   }

   protected final void k5(z5 var1) {
      List$Enumerator var2 = this.u9.iterator();

      try {
         while (var2.hasNext()) {
            l1z var3 = (l1z)var2.next();
            var3.n3(new z5(100.0F, 100.0F));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   protected final void a6(z5 var1) {
      List$Enumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            e1o var3 = (e1o)var2.next();
            var3.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
      f9 var2 = new f9(this.e2().t2());
      var2.n5(var1.y4());

      try {
         this.z1();
         List$Enumerator var3 = this.n5.iterator();

         try {
            while (var3.hasNext()) {
               List var4 = (List)var3.next();
               this.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      } finally {
         var2.n5();
      }
   }

   private void z1() {
      List var1 = new List();
      this.n5.addItem(var1);
      List$Enumerator var2 = this.l6.iterator();

      try {
         while (var2.hasNext()) {
            h2v var3 = (h2v)var2.next();
            if (!var3.T_()) {
               if (this.e2().t2().n3().getDisplayBlanksAs() == 0) {
                  if (!ChartTypeCharacterizer.c8(this.e2().u9().getType())
                     && !ChartTypeCharacterizer.s7(this.e2().u9().getType())
                     && (!var3.e2().t2() || this.y2().u3().n3().l6().e2())) {
                     var1 = new List();
                     this.n5.addItem(var1);
                  }
                  continue;
               }

               if (this.e2().t2().n3().getDisplayBlanksAs() == 1) {
                  continue;
               }
            }

            if (var3.e2().t2()) {
               var3.l6(false);
            } else {
               var1.addItem(var3);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      for (int var7 = 0; var7 < this.n5.size(); var7++) {
         if (this.n5.get_Item(var7).size() == 0) {
            this.n5.removeAt(var7--);
         }
      }
   }
}
