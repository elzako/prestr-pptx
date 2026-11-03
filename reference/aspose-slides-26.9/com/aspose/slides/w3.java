package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

abstract class w3 extends v6g {
   List<g8t> n5 = new List<>();
   List<g3y> l6 = new List<>();
   protected z5 k5 = new z5(1000.0F, 1000.0F);
   float u3 = 0.0F;
   float a6 = 0.0F;
   private w3 h0;
   private l5 c8;
   private int t2;
   protected double u9 = 0.0;
   private Dictionary<String, com.aspose.slides.internal.o9b.f2> s7 = new Dictionary<>();

   protected w3(l5 var1) {
      this.c8 = var1;
      if (this.n5().c8().getTickLabelPosition() == 3 || !this.n5().c8().isVisible()) {
         this.l6(false);
      }
   }

   final boolean n5(int var1) {
      return !this.l6.isEmpty() && this.l6.get_Item(0).u9().getType() == var1;
   }

   final l5 n5() {
      return this.c8;
   }

   protected final g8t n5(Object var1) {
      g8t var2 = new g8t(var1, this);
      this.n5.addItem(var2);
      this.n5((v6g)var2);
      return var2;
   }

   protected final void n5(g8t var1) {
      this.n5.removeItem(var1);
      this.l6(var1);
   }

   protected final boolean k5(z5 var1) {
      if (var1.n5() != 0.0F && var1.l6() != 0.0F) {
         com.aspose.slides.internal.o9b.f2 var2 = this.n5("0").a6();
         float var3 = this.n5().u9() == 0 ? var2.l6() : var2.k5();
         float var4 = this.n5().u9() == 0 ? var2.k5() : var2.l6();
         return !(var1.l6() < var4) && !(var1.n5() < var3);
      } else {
         return false;
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   protected final float k5() {
      float var1 = this.n5().l6().l6().h0(0);
      float var2 = this.n5().l6().l6().u9(0);
      return this.n5().l6().c8() * var1 / var2;
   }

   final int u3() {
      return this.c8.c8().getPosition();
   }

   final boolean a6() {
      return com.aspose.slides.internal.v6g.k5.l6(this, l5n.class)
         || com.aspose.slides.internal.v6g.k5.l6(this, i2z.class)
         || com.aspose.slides.internal.v6g.k5.l6(this, v3o.class)
         || com.aspose.slides.internal.v6g.k5.l6(this, i2t.class);
   }

   String u9() {
      return this.n5().c8().getNumberFormat();
   }

   protected final void h0() {
      switch (this.n5().c8().getTickLabelPosition()) {
         case 0:
            this.t2 = this.a6() ? 2 : 3;
            if (this.n3().n5().c8().isPlotOrderReversed()) {
               this.t2 = this.a6() ? 1 : 0;
            }
            break;
         case 1:
            this.t2 = this.a6() ? 1 : 0;
            if (this.n3().n5().c8().isPlotOrderReversed()) {
               this.t2 = this.a6() ? 2 : 3;
            }
            break;
         case 2:
            if (this.n3() == null) {
               this.t2 = 1;
            } else if (this.n3().n5().c8().getCrossType() == 0) {
               if (this.n3().n5().c8().isPlotOrderReversed()) {
                  this.t2 = this.a6() ? 2 : 3;
               } else if (this.u3() == 2 && this.n3().u3() == 0) {
                  this.t2 = this.a6() ? 2 : 3;
               } else {
                  this.t2 = this.a6() ? 1 : 0;
               }
            } else if (this.n3().n5().c8().getCrossType() == 1) {
               if (this.n3().n5().c8().isPlotOrderReversed()) {
                  this.t2 = this.a6() ? 1 : 0;
               } else if (this.u3() == 1 && this.n3().u3() == 3) {
                  this.t2 = this.a6() ? 1 : 0;
               } else {
                  this.t2 = this.a6() ? 2 : 3;
               }
            } else {
               this.t2 = this.a6() ? 1 : 0;
            }

            this.c8();
            break;
         case 3:
            this.t2 = this.a6() ? 1 : 0;
      }
   }

   protected abstract void c8();

   protected final void t2() {
      if (this.n3() != null) {
         if (this.n5(77)) {
            this.t2 = 2;
         } else {
            boolean var1 = false;
            if (this.n3().n5().c8().getCrossType() == 0) {
               this.n3().u9 = 0.0;
            } else if (this.n3().n5().c8().getCrossType() == 2 || var1) {
               double var2 = this.n3().n5().q0();
               if (this.n3().u9 <= var2) {
                  if (!this.n3().n5().c8().isPlotOrderReversed()) {
                     this.t2 = 1;
                  } else {
                     this.t2 = 2;
                  }
               }
            }
         }
      }
   }

   protected final void s7() {
      boolean var1 = false;
      if (this.n3().n5().c8().getCrossType() == 0) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.n3(), ValueAxisBase.class)) {
            this.n3().u9 = 0.0;
         } else {
            this.n3().u9 = this.n3().n5().q0();
         }

         var1 = true;
      }

      if (this.n3().n5().c8().getCrossType() == 2 || var1) {
         int var2 = n1g.u3(this.l6);
         if (this.n3().n5().a0() || this.n3().n5().d2().n3().hasDataTable()) {
            var2++;
         }

         byte var3 = 1;
         if (var2 <= var3) {
            var2 = 2;
         }

         double var4 = this.n3().u9;
         if (this.n3().n5().c8().getCrossType() == 1) {
            var4 = var2;
         }

         if (var4 > var2) {
            var4 = var2;
         } else if (var4 < var3) {
            var4 = var3;
         }

         if (!this.n3().n5().c8().isPlotOrderReversed()) {
            if (var4 == var3) {
               this.t2 = 0;
            }
         } else if (var4 == var3) {
            this.t2 = 3;
         }
      }
   }

   protected final float x8() {
      int var1 = this.n5().u9();
      float var2 = this.n5().k5().a6() / 2.0F;
      return com.aspose.slides.ms.System.q1.n5(var1 / 90.0F * var2);
   }

   final w3 n3() {
      return this.h0;
   }

   final void n5(w3 var1) {
      this.h0 = var1;
   }

   protected abstract void a6(z5 var1);

   public abstract float y4();

   public abstract double e2();

   public abstract com.aspose.slides.internal.o9b.f2 t9();

   protected final com.aspose.slides.internal.o9b.f2 z1() {
      if (!this.T_()) {
         return new com.aspose.slides.internal.o9b.f2(this.d2(), 0.0F);
      }

      if (this.n5().c8().getTickLabelPosition() == 2) {
         float var1 = this.n3().d5();
         float var2 = this.n3().y4();
         if (!this.n3().n5().c8().isPlotOrderReversed()) {
            if (this.n5().c8().getPosition() == 0) {
               float var5 = var2 + this.d5() - var1;
               if (var5 > 0.0F) {
                  return new com.aspose.slides.internal.o9b.f2(this.d2(), var5);
               }

               return new com.aspose.slides.internal.o9b.f2(this.d2(), 0.0F);
            }

            float var4 = var2 - this.d5();
            if (var4 < 0.0F) {
               return new com.aspose.slides.internal.o9b.f2(this.d2(), var4 * -1.0F);
            }

            return new com.aspose.slides.internal.o9b.f2(this.d2(), 0.0F);
         }

         if (this.n5().c8().getPosition() == 3) {
            float var3 = var2 - this.d5();
            if (var3 < 0.0F) {
               return new com.aspose.slides.internal.o9b.f2(this.d2(), -var3);
            }

            return new com.aspose.slides.internal.o9b.f2(this.d2(), 0.0F);
         }
      }

      return new com.aspose.slides.internal.o9b.f2(this.d2(), this.d5());
   }

   protected final com.aspose.slides.internal.o9b.f2 t4() {
      if (!this.T_()) {
         return new com.aspose.slides.internal.o9b.f2(0.0F, this.d5());
      }

      if (this.n3() == null) {
         return new com.aspose.slides.internal.o9b.f2(this.d2(), this.d5());
      }

      if (this.n5(77)) {
         return new com.aspose.slides.internal.o9b.f2(this.d2(), this.d5());
      }

      if (this.n5().c8().getTickLabelPosition() == 2) {
         float var1 = this.n3().d2();
         float var2 = this.n3().y4();
         if (this.n3().n5().c8().isPlotOrderReversed()) {
            if (this.n5().c8().getPosition() == 2) {
               float var3 = var2 + this.d2();
               if (var3 <= var1) {
                  return new com.aspose.slides.internal.o9b.f2(0.0F, this.d5());
               }

               return new com.aspose.slides.internal.o9b.f2(var3 - var1, this.d5());
            }
         } else {
            if (this.n5().c8().getPosition() == 1) {
               float var5 = var2 - this.d2();
               if (var5 >= 0.0F) {
                  return new com.aspose.slides.internal.o9b.f2(0.0F, this.d5());
               }

               return new com.aspose.slides.internal.o9b.f2(-var5, this.d5());
            }

            float var4 = var1 - var2 - this.d2();
            if (var4 < 0.0F) {
               return new com.aspose.slides.internal.o9b.f2(this.d2(), this.d5());
            }
         }
      }

      return new com.aspose.slides.internal.o9b.f2(this.d2(), this.d5());
   }

   final float q0() {
      if (!this.T_()) {
         return 0.0F;
      }

      float var1 = this.a6() ? 2.8F : 4.0F;
      float var2 = this.n5().k5().a6() / var1;
      float var3 = (float)((this.n5().c8().getLabelOffset() & 65535) / 100.0) * var2;
      return var2 + var3;
   }

   protected final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      int var2 = 0;

      while (var2 < this.n5.size()) {
         if (this.n5().u9() != 0 && this.n5().u9() % 90 != 0) {
            this.n5.get_Item(var2).n3(this.k5);
         } else if (com.aspose.slides.internal.v6g.k5.l6(this, m3o.class) && this.n5.get_Item(var2).s7().length() <= 2) {
            this.n5.get_Item(var2).n3(this.k5);
         } else {
            this.n5.get_Item(var2).n3(new z5(var1.l6(), var1.k5()));
         }

         var2 += this.n5().r4();
      }
   }

   protected abstract com.aspose.slides.internal.o9b.f2 u9(z5 var1);

   public final int z3() {
      return this.t2;
   }

   protected final com.aspose.slides.internal.o9b.f2 n5(String var1) {
      if (this.s7.containsKey(var1)) {
         return this.s7.get_Item(var1);
      }

      com.aspose.slides.internal.o9b.f2 var2 = this.n5(var1, false).a6();
      this.s7.addItem(var1, var2.a6());
      return var2;
   }

   final com.aspose.slides.internal.o9b.f2 l6(String var1) {
      return this.n5(var1, true);
   }

   final com.aspose.slides.internal.o9b.f2 k5(String var1) {
      int var2 = this.n5().u9();
      this.n5().n5(0);

      try {
         g8t var3 = this.n5((Object)var1);
         var3.n5(true);
         d2k var4 = var3.k5(new z5(500.0F, 500.0F)).u3();
         this.n5(var3);
         return new com.aspose.slides.internal.o9b.f2(var4.n5, var4.l6);
      } finally {
         this.n5().n5(var2);
      }
   }

   public abstract List<Float> m1();

   public abstract List<Float> k7();

   abstract float n5(double var1);

   private com.aspose.slides.internal.o9b.f2 n5(String var1, boolean var2) {
      g8t var3 = this.n5((Object)var1);
      var3.n5(var2);
      d2k var4 = var3.k5(new z5(500.0F, 500.0F)).u3();
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2(var4.n5, var4.l6);
      this.n5(var3);
      return var5;
   }
}
