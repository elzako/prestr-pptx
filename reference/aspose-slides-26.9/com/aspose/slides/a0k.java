package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class a0k extends u7 {
   private boolean t2;
   protected boolean h0 = false;
   float c8 = 0.0F;

   a0k(l5 var1) {
      super(var1);
   }

   @Override
   protected void n5(z5 var1) {
      this.u6();
      this.t2 = false;
      if (this.k5(var1)) {
         this.u3(0.0F);
         this.k5(0.0F);
         this.s7(var1);
         this.h0();
         if (this.v0() && this.n5().y4() == 0) {
            this.l6(false);
         }

         this.k5(var1.n5());
         if (!this.l6.isEmpty() && !ChartTypeCharacterizer.u3(this.l6.get_Item(0).u9().getType())) {
            this.e2(var1);
         }

         com.aspose.slides.internal.o9b.f2 var2 = this.x8(var1).a6();
         this.j5();
         this.c8 = this.d5();
         this.u3(this.d5() + (this.t2 ? var2.k5() + this.q0() - this.n5("...").k5() : var2.k5() + this.q0()));
         this.n5(var2.a6());
         this.a6(var1);
      }
   }

   private void e2(z5 var1) {
      if (this.n5().d2().u3() != null) {
         if (!this.n5().c8().n5().u9()) {
            this.w1().clear();

            for (int var2 = 0; var2 < this.n5().d2().u3().length; var2++) {
               List var3 = new List();
               this.w1().addItem(var3);
               float var4 = 0.0F;

               for (int var5 = 0; var5 < this.n5().d2().u3()[var2].size(); var5++) {
                  g8t var6 = new g8t(this.n5().d2().u3()[var2].get_Item(var5).l6(), this);
                  var6.n5(0.0F);
                  var6.n5(p4.n5(this.n5().d2().u3()[var2].get_Item(var5)));
                  this.n5((v6g)var6);
                  var3.addItem(var6);
                  d2k var7 = var6.k5(new z5(com.aspose.slides.ms.System.q1.n5((float)(var6.a6(var1).l6()), (float)(this.a5() * var6.y4())), var1.l6())).u3();
                  if (var7.l6 > var4) {
                     var4 = var7.l6;
                  }

                  var6.n3(new z5(var7.n5, var7.l6));
               }

               if (this.n5().c8().isPlotOrderReversed()) {
                  var3.reverse();
               }

               this.u3(this.d5() + var4 + this.q0());
            }
         }
      }
   }

   final float a5() {
      return this.n5().a0() ? this.d2() / this.n5.size() : this.d2() / (this.n5.size() - 1);
   }

   @Override
   protected void l6(z5 var1) {
      int var2 = 0;
      if (this.n5().c8().isPlotOrderReversed() || this.n5(80)) {
         var2 = this.n5().r4() - 1;
         this.n5.reverse();
      }

      for (; var2 < this.n5.size(); var2 += this.n5().r4()) {
         g8t var3 = this.n5.get_Item(var2);
         float var4 = this.n5().a0() ? this.a5() * var2 + this.a5() / 2.0F : this.a5() * var2;
         if (this.n5().u9() != 0 && this.n5().u9() % 90 != 0) {
            if (this.n5().u9() < 0) {
               if (this.n3().n5().c8().isPlotOrderReversed()) {
                  var3.a6(var4 - var3.d2() + this.x8());
               } else {
                  var3.a6(var4 - this.x8());
               }
            } else if (this.n3().n5().c8().isPlotOrderReversed()) {
               var3.a6(var4 - this.x8());
            } else {
               var3.a6(var4 - var3.d2() + this.x8());
            }

            switch (this.n5().c8().n5().a6()) {
               case 1:
                  var3.a6(var3.b3() - this.a5() / 2.0F + var3.d2() / 2.0F);
                  break;
               case 2:
                  var3.a6(var3.b3() + this.a5() / 2.0F - var3.d2() / 2.0F);
            }
         } else {
            switch (this.n5().c8().n5().a6()) {
               case 1:
                  var3.a6(var4 - this.a5() / 2.0F);
                  break;
               case 2:
                  var3.a6(var4 + this.a5() / 2.0F - var3.d2() / 2.0F);
                  break;
               default:
                  var3.a6(var4 - var3.d2() / 2.0F);
            }
         }

         float var5 = this.n5("...").k5();
         float var6 = var3.t2() && this.n5().u9() % 90 == 0 ? this.q0() - var5 : this.q0();
         if (this.h0) {
            if (var2 % 2 == 0) {
               var3.u9(var6 + var3.d5());
            } else {
               var3.u9(var6);
            }
         } else {
            var3.u9(this.z3() == 3 ? this.d5() - var6 - var3.d5() : var6);
         }
      }

      this.h2();

      for (v6g var10 : this.a0()) {
         var10.t1();
      }
   }

   private void h2() {
      if (this.w1().size() != 0) {
         float var1 = this.a5();
         float var2 = this.z3() == 3 ? 0.0F : this.d5();
         List$Enumerator var3 = this.w1().iterator();

         try {
            while (var3.hasNext()) {
               List var4 = (List)var3.next();
               float var5 = 0.0F;
               float var6 = 0.0F;

               for (int var7 = 0; var7 < var4.size(); var7++) {
                  var6 = com.aspose.slides.ms.System.q1.n5((float)(((g8t)var4.get_Item(var7)).d5()), (float)(var6));
               }

               for (int var14 = 0; var14 < var4.size(); var14++) {
                  g8t var8 = (g8t)var4.get_Item(var14);
                  float var9 = var1 * var8.y4();
                  float var10 = var5 + var9 / 2.0F;
                  var5 += var9;
                  var8.a6(var10 - var8.d2() / 2.0F);
                  var8.u9(this.z3() == 3 ? var2 : var2 - var6);
               }

               var2 = this.z3() == 3 ? var6 + this.q0() : var2 - var6 - this.q0();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   protected com.aspose.slides.internal.o9b.f2 x8(z5 var1) {
      if (!this.n5().c8().isVisible() || this.n5().c8().getTickLabelPosition() == 3) {
         return new com.aspose.slides.internal.o9b.f2(0.0F, 0.0F);
      } else if (this.n5().t2()) {
         this.t9(var1);
         this.z1(var1);
         return this.t4(var1);
      } else {
         this.t9(var1);
         return this.y4(var1);
      }
   }

   private void t9(z5 var1) {
      int var2 = this.m3();
      if (this.n5().c4() && this.d2() / var2 < 1.0F) {
         g8t var3 = this.n5((Object)"x");
         float var4 = var3.k5(var1).n5;

         while (this.d2() / ((double)var2 / this.n5().r4()) < var4) {
            this.n5().u9(this.n5().r4() + 10);
         }

         this.n5(var3);
      }
   }

   private boolean v0() {
      return this.n5().d2().n3().hasDataTable();
   }

   @Override
   protected void c8() {
      this.s7();
   }

   @Override
   protected z5 t2(z5 var1) {
      int var2 = this.m3();
      float var3 = var2 == 0 ? var1.n5() : var1.n5() / var2;
      float var4 = var1.l6() - this.q0();
      return new z5(var3, var4);
   }

   protected final com.aspose.slides.internal.o9b.f2 y4(z5 var1) {
      z5 var2 = this.t2(var1);
      z5 var3 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      if (this.n5().n5()) {
         com.aspose.slides.internal.o9b.f2 var4 = this.u9(var3).a6();
         if (var4.k5() > var2.l6() && var4.l6() > var2.n5()) {
            float var5 = this.d2() / var2.n5();
            this.n5().u9(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(this.n5.size() / var5)), 14));
            return this.y4(var1);
         }
      } else {
         if (this.n5().u9() == 0) {
            com.aspose.slides.internal.o9b.f2 var15 = new com.aspose.slides.internal.o9b.f2();
            if (this.n5().r4() >= this.n5.size()) {
               this.u9(var2).l6(var15);
               if (var15.k5() > var1.l6()) {
                  return this.u9(this.k5);
               }
            }

            float var18 = this.h0(var3);
            if (var18 > var2.n5()) {
               if (this.n5().c4()) {
                  double var6 = com.aspose.slides.ms.System.q1.k5(this.d2() / var18);
                  this.n5().u9(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(this.n5.size() / var6), 14));
                  return this.y4(var1);
               }

               return this.u9(var3);
            }

            this.n5(var1, var2, var18).l6(var15);
            if (var15.k5() > var1.l6()) {
               this.n5(this.k5, this.k5, var18).l6(var15);
            }

            return var15;
         }

         if (this.n5().u9() % 90 != 0) {
            com.aspose.slides.internal.o9b.f2 var14 = this.u9(var3).a6();
            if (this.n5().r4() >= this.n5.size()) {
               return var14;
            }

            if (this.n5().c4() && var14.l6() > var2.n5() && !this.n5(var2.n5(), this.n5().u9())) {
               this.n5().u9(this.n5().r4() + 1);
               return this.y4(var1);
            }

            return var14;
         }

         if (this.n5().r4() >= this.n5.size()) {
            return this.u9(var2);
         }

         com.aspose.slides.internal.o9b.f2 var12 = this.u9(var2).a6();
         if (!(var12.l6() > var2.n5())) {
            return var12;
         }

         if (this.k5() / var2.n5() > 1.09F) {
            float var17 = this.d2() / this.k5();
            this.n5().u9(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(this.n5.size() / var17)), 14));
            return this.y4(var1);
         }
      }

      float var13 = this.u9(var3).k5();
      if (this.n5().u9() != 0 && var13 > var2.l6()) {
         List$Enumerator var16 = this.n5.iterator();

         try {
            while (var16.hasNext()) {
               g8t var8 = (g8t)var16.next();
               this.n5(var8, var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }

         this.t2 = true;
         return this.u9(var3);
      } else {
         return this.u9(var2);
      }
   }

   private boolean n5(z5 var1, com.aspose.slides.internal.o9b.f2 var2) {
      if (this.n5().u9() != 0 && var2.k5() > var1.l6()) {
         List$Enumerator var3 = this.n5.iterator();

         try {
            while (var3.hasNext()) {
               g8t var4 = (g8t)var3.next();
               this.n5(var4, var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         this.t2 = true;
         return true;
      } else {
         return false;
      }
   }

   private void z1(z5 var1) {
      z5 var2 = this.t2(new z5(var1.n5() + 3.0F, var1.l6()));
      this.n5().n5(0);
      float var3 = 1.0F;
      boolean var4 = this.m3() <= var3 || this.c8(var2);
      boolean var5 = this.w1().size() == 0 && this.n5(var2.n5(), 45);
      boolean var6 = this.f0();
      boolean var7 = !this.n5().c4() || this.k5() < var2.n5() || var6 && n5(this.k5(), var2.n5());
      if (var4) {
         this.n5().n5(0);
      } else if (var6 && var7) {
         this.n5().n5(90);
      } else if (var5) {
         this.n5().n5(45);
      } else if (var7) {
         this.n5().n5(90);
      } else {
         this.n5().u9(this.n5().r4() + 1);
         this.z1(var1);
      }
   }

   private boolean f0() {
      ChartPlotArea var1 = com.aspose.slides.internal.v6g.k5.n5(this.n5().d2().n3().getPlotArea(), ChartPlotArea.class);
      return this.w1().isEmpty()
         && n5(
            var1,
            this.n5().d2().y2(),
            this.n5().c4(),
            this.n5().t2(),
            this.k5() + this.q0(),
            com.aspose.slides.ms.System.q1.n5((float)(1.0F), (float)(this.q0())),
            this.n5.size(),
            this.d2(),
            this.k5()
         );
   }

   static boolean n5(ChartPlotArea var0, float var1, boolean var2, boolean var3, float var4, float var5, int var6, float var7, float var8) {
      return var2 && var3 && n5(var0) && n5(var0, var1, var4) && l6(var0, var1, var5) && n5(var6, var7, var8);
   }

   static boolean n5(float var0, float var1) {
      return var0 < var1 * 1.18F;
   }

   private static boolean n5(ChartPlotArea var0) {
      return var0 != null && !var0.isLocationAutocalculated() && var0.getLayoutTargetType() == 0;
   }

   private static boolean n5(ChartPlotArea var0, float var1, float var2) {
      return n5(var0, var1) < var2;
   }

   private static boolean l6(ChartPlotArea var0, float var1, float var2) {
      return n5(var0, var1) <= var2;
   }

   private static boolean n5(int var0, float var1, float var2) {
      if (var0 != 0 && !(var1 <= 0.0F)) {
         float var3 = var1 / var0;
         return var3 < var2;
      } else {
         return false;
      }
   }

   private static float n5(ChartPlotArea var0, float var1) {
      return var1 * (1.0F - var0.l6() - var0.k5());
   }

   private com.aspose.slides.internal.o9b.f2 t4(z5 var1) {
      z5 var2 = this.t2(var1);
      com.aspose.slides.internal.o9b.f2 var3 = new com.aspose.slides.internal.o9b.f2();
      if (this.n5().u9() == 0) {
         return this.n5(var1, var2, this.h0(this.k5));
      }

      if (this.n5().u9() % 90 != 0) {
         this.u9(this.k5).l6(var3);
      } else {
         this.u9(var2).l6(var3);
      }

      return this.n5(var2, var3.a6()) ? this.t4(this.k5) : var3;
   }

   protected final com.aspose.slides.internal.o9b.f2 n5(z5 var1, z5 var2, float var3) {
      float var4 = var1.n5() / this.n5.size();
      return !(var3 > var4) && this.n5().r4() <= 1 ? this.u9(new z5(var4, var2.l6())) : this.u9(var2);
   }

   protected final void n5(g8t var1, z5 var2) {
      z5 var3 = new z5(this.n5().d2().c4(), this.n5().d2().y2());
      String var4 = var1.s7();
      g8t var5 = new g8t(var4, this);
      this.n5((v6g)var5);
      d2k var6 = var5.k5(var3).u3();
      this.l6(var5);
      if (!(var6.l6 <= var2.l6())) {
         while (var6.l6 > var2.l6() && var4.length() > 1) {
            if (com.aspose.slides.ms.System.d1.u9(var4, ' ', '-').length > 1) {
               if (com.aspose.slides.ms.System.d1.k5(var4, ' ') > com.aspose.slides.ms.System.d1.k5(var4, '-')) {
                  var4 = com.aspose.slides.ms.System.d1.l6(var4, 0, com.aspose.slides.ms.System.d1.k5(var4, ' '));
               } else {
                  var4 = com.aspose.slides.ms.System.d1.l6(var4, 0, com.aspose.slides.ms.System.d1.k5(var4, '-'));
               }
            } else {
               var4 = com.aspose.slides.ms.System.d1.l6(var4, 0, var4.length() - 1);
            }

            var5 = new g8t(com.aspose.slides.ms.System.d1.n5(new Object[]{var4, '…'}), this);
            this.n5((v6g)var5);
            var5.k5(var3).n5(var6);
            this.l6(var5);
         }

         var1.n5(true);
         var1.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var4, '…'}));
      }
   }

   @Override
   public com.aspose.slides.internal.o9b.f2 t9() {
      return this.z1();
   }

   @Override
   float n5(double var1) {
      byte var3 = 1;
      float var4;
      if (this.n5().c8().isPlotOrderReversed()) {
         var4 = (float)((this.r4() - var1) / (this.r4() - var3) * this.d2());
      } else {
         var4 = (float)((var1 - var3) / (this.r4() - var3) * this.d2());
      }

      return var4;
   }

   private boolean n5(float var1, int var2) {
      double var3 = com.aspose.slides.ms.System.q1.n5(var2);
      var3 = (float)(var3 * (Math.PI / 180.0));
      float var5 = var1;
      double var6 = var5 * com.aspose.slides.ms.System.q1.h0(var3);
      return var6 >= this.k5();
   }

   @Override
   protected void a6(z5 var1) {
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      if (this.T_()) {
         g8t var2 = null;
         g8t var3 = null;
         float var4 = Float.NaN;
         float var5 = Float.NaN;
         float var6 = this.a5();

         for (int var7 = 0; var7 < this.n5.size(); var7++) {
            if (this.n5.get_Item(var7).T_() && !com.aspose.slides.ms.System.d1.n5(this.n5.get_Item(var7).s7())) {
               var2 = this.n5.get_Item(var7);
               var4 = this.n5().a0() ? var6 / 2.0F : 0.0F;
               break;
            }
         }

         for (int var11 = this.n5.size() - 1; var11 >= 0; var11--) {
            if (this.n5.get_Item(var11).T_() && !com.aspose.slides.ms.System.d1.n5(this.n5.get_Item(var11).s7())) {
               var3 = this.n5.get_Item(var11);
               var5 = this.n5().a0() ? var1.n5() - var6 / 2.0F : var1.n5();
               break;
            }
         }

         if (var2 != null && var3 != null) {
            float var12 = 0.0F;
            float var8 = 0.0F;
            if (this.n5().u9() == 0) {
               var12 = var4 - var2.d2() / 2.0F;
               var8 = var5 + var3.d2() / 2.0F;
            } else if (this.n5().u9() % 90 != 0) {
               float var9 = this.n5().k5().a6();
               float var10 = com.aspose.slides.ms.System.q1.n5(this.n5().u9() / 90.0F * var9);
               if (this.n5().u9() > 0) {
                  var12 = var4 + this.x8() - var2.d2();
                  var8 = var5 + this.x8() + var10;
                  var12 += var10;
               } else {
                  var12 = var4 + this.x8() * -1.0F - var10;
                  var8 = var5 - this.x8() + var3.d2();
                  var8 -= var10;
               }
            }

            if (var12 < 0.0F) {
               this.u3 = var12 * -1.0F;
            }

            if (var8 > var1.n5()) {
               this.a6 = var8 - var1.n5();
            }
         }
      }
   }

   @Override
   protected void l6() {
      super.l6();
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y2().p8(), this.y2().f2(), this.y2().d2(), this.y2().d5());
      f9 var2 = new f9(this.n5().d2());
      var2.n5(var1.y4());

      try {
         if (this.w1().size() > 0) {
            float var3 = 0.0F;
            List$Enumerator var4 = this.n5.iterator();

            try {
               while (var4.hasNext()) {
                  g8t var5 = (g8t)var4.next();
                  if (var5.T_()) {
                     var3 = com.aspose.slides.ms.System.q1.n5((float)(var3), (float)(var5.d5()));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }

            if (this.n5().c8().getMajorTickMark() != 2) {
               for (int var27 = 0; var27 <= this.n5.size(); var27++) {
                  if (this.z3() == 3) {
                     this.n5()
                        .n5(this.p8() + this.a5() * var27, this.f2() + this.d5(), this.p8() + this.a5() * var27, this.f2() + this.d5() - this.q0() - var3);
                  } else {
                     this.n5().n5(this.p8() + this.a5() * var27, this.f2(), this.p8() + this.a5() * var27, this.f2() + this.q0() + var3);
                  }
               }
            }

            float var28 = this.z3() == 3 ? 0.0F : this.d5();
            this.n5().n5(this.p8(), this.f2(), this.p8(), this.f2() + this.d5());
            List$Enumerator var6 = this.w1().iterator();

            try {
               while (var6.hasNext()) {
                  List var7 = (List)var6.next();
                  float var8 = 0.0F;
                  float var9 = 0.0F;

                  for (int var10 = 0; var10 < var7.size(); var10++) {
                     var9 = com.aspose.slides.ms.System.q1.n5((float)(((g8t)var7.get_Item(var10)).d5()), (float)(var9));
                  }

                  for (int var29 = 0; var29 < var7.size(); var29++) {
                     g8t var11 = (g8t)var7.get_Item(var29);
                     float var12 = this.a5() * var11.y4();
                     var8 += var12;
                     this.n5()
                        .n5(
                           this.p8() + var8,
                           this.z3() == 3 ? this.f2() + var28 : this.f2() + this.d5() - var28,
                           this.p8() + var8,
                           this.z3() == 3 ? this.f2() + this.d5() - var28 : this.f2() + var28
                        );
                  }

                  var28 = this.z3() == 3 ? var28 + var9 + this.q0() : var28 - var9 - this.q0();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         var2.n5();
      }
   }
}
