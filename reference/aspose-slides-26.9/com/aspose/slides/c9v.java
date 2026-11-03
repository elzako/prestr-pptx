package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class c9v extends v6g {
   private w3 n5;
   private w3 l6;
   private w3 k5;
   private w3 u3;
   private w3 a6;
   private w3 u9;
   private w3 h0;
   private d6 c8;
   private d6 t2;
   private d6 s7;
   private d6 x8;
   private d6 n3;
   private d6 y4;
   private d4i e2;
   private d4i t9;
   private d4i z1;
   private d4i t4;
   private d4i q0;
   private d4i z3;
   private u2 m1;
   private u2 k7;
   private u2 m3;
   private u2 z8;
   private p5x j5;
   private p5x w1;
   private p5x r4;
   private p5x c4;
   private u2w y2;
   private t4p y1;
   private float a0 = 2.0F;
   private float d2 = 8.0F;
   private k0w d5;

   final w3 u3() {
      return this.n5;
   }

   final w3 a6() {
      return this.l6;
   }

   final w3 u9() {
      return this.k5;
   }

   final w3 h0() {
      return this.u3;
   }

   final w3 c8() {
      return this.a6;
   }

   final w3 t2() {
      return this.u9;
   }

   final w3 s7() {
      return this.h0;
   }

   final t4p x8() {
      return this.y1;
   }

   final k0w n3() {
      return this.d5;
   }

   public c9v(u2w var1) {
      this.y2 = var1;
      this.n5(this.y2.u3());
      this.e2();
      this.z1();
      this.t9();
      if (!com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()
         && this.y2.u3().n3().getPlotArea().getLayoutTargetType() == 0) {
         this.d5 = new k0w(this, var1);
      }

      if (this.y2.u3().n3().hasDataTable() && (this.l6 != null || this.n5 != null)) {
         if (ChartTypeCharacterizer.n5(this.y2.u3().y4().get_Item(0).u9().getType()) == 4) {
            this.y1 = new t4p(this.y2.u3().s7(), this.l6);
         } else {
            this.y1 = new t4p(this.y2.u3().s7(), this.n5);
         }

         this.n5(this.y1);
      }
   }

   final a9v n5(a9v var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      float var6 = var1.n5();
      float var7 = var1.l6();
      float var8 = var1.u3();
      float var9 = var1.a6();
      float var10 = 6.0F;
      if (this.l6 != null && !this.l6.n5().c8().hasTitle() && this.j5 == null && this.l6.t9().l6() > 0.0F) {
         if (this.l6.z3() == 1) {
            var2 = true;
            if (this.y1 != null && this.y1.c8() + var10 > this.l6.d2()) {
               var2 = false;
            }
         }

         if (this.l6.z3() == 2) {
            var3 = true;
         }
      }

      if (this.u3 != null && !this.u3.n5().c8().hasTitle() && this.w1 == null && this.u3.t9().l6() > 0.0F) {
         if (this.u3.z3() == 1) {
            var2 = true;
            if (this.y1 != null && this.y1.c8() + var10 > this.u3.d2()) {
               var2 = false;
            }
         }

         if (this.u3.z3() == 2) {
            var3 = true;
         }
      }

      if (this.n5 != null && !this.n5.n5().c8().hasTitle() && this.r4 == null && this.n5.t9().k5() > 0.0F) {
         if (this.n5.z3() == 3) {
            var4 = true;
         }

         if (this.n5.z3() == 0) {
            var5 = true;
         }
      }

      if (this.k5 != null && !this.k5.n5().c8().hasTitle() && this.c4 == null && this.k5.t9().k5() > 0.0F) {
         if (this.k5.z3() == 3) {
            var4 = true;
         }

         if (this.k5.z3() == 0) {
            var5 = true;
         }
      }

      if (this.y2.u3().n3().hasDataTable() && this.y1 != null) {
         var5 = true;
      }

      if (var4) {
         var7 += var10;
         var9 -= var10;
      }

      if (var5) {
         var7 += var10;
      }

      if (var2) {
         var6 += var10;
         var8 -= var10;
      }

      if (var3) {
         var6 += var10;
      }

      if (!var2 && this.y2.u3().n3().hasDataTable() && this.y1 != null) {
         var6 -= var10;
         var8 += var10;
      }

      return new a9v(var6, var7, var8, var9);
   }

   @Override
   protected void n5(z5 var1) {
      boolean var2 = com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated();
      a9v var3 = (a9v)var1;
      this.t9(var3);
      this.z1(var1);
      if (!var2 && this.y2.u3().n3().getPlotArea().getLayoutTargetType() != 1) {
         if (this.y1 != null) {
            this.y1.n3(var1);
         }

         this.d5.n5(var1);
         this.u9(var1);
      } else {
         this.l6(var3);
      }

      if (this.y1 != null) {
         this.y1.n3(var1);
      }

      if (var2) {
         a9v var4 = this.n5((a9v)var1);
         this.h0(var4);
         this.h0(var4);
         this.k5(var4.n5());
         this.u3(var4.l6());
      } else if (this.y2.u3().n3().getPlotArea().getLayoutTargetType() == 1) {
         this.h0(var1);
         this.k5(var1.n5() + this.l6(1) + this.l6(2));
         this.u3(var1.l6() + this.l6(3) + this.l6(0));
      } else {
         com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
         com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2();
         com.aspose.slides.internal.o9b.w1[] var6 = new com.aspose.slides.internal.o9b.w1[]{var8};
         com.aspose.slides.internal.o9b.f2[] var7 = new com.aspose.slides.internal.o9b.f2[]{var5};
         this.y2.n5(this.y2.u3().n3().getPlotArea(), var6, var7);
         var6[0].n5(var8);
         var7[0].l6(var5);
         this.k5(var5.l6() + this.u3(1) + this.u3(2));
         this.u3(var5.k5() + this.u3(3) + this.u3(0));
      }

      this.k5(var1);
   }

   private void k5(z5 var1) {
      if (this.e2 != null) {
         this.e2.n3(new z5(this.l6.n3().d2(), this.l6.d5()));
      }

      if (this.z1 != null) {
         this.z1.n3(new z5(this.n5.d2(), this.n5.n3().d5()));
      }

      if (this.t4 != null) {
         this.t4.n3(new z5(this.k5.d2(), this.k5.n3().d5()));
      }

      if (this.t9 != null) {
         this.t9.n3(new z5(this.u3.n3().d2(), this.u3.d5()));
      }

      if (this.a6 != null) {
         z5 var2 = new z5(this.a6.d2(), this.a6.d5());
         if (this.q0 != null) {
            this.q0.n3(var2);
         }

         if (this.z3 != null) {
            this.z3.n3(var2);
         }
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   final z5 y4() {
      float var1 = this.d2() - this.u3(1) - this.u3(2);
      float var2 = this.d5() - this.u3(3) - this.u3(0);
      if (this.y1 != null) {
         var2 -= this.t4();
      }

      return this.a6 != null ? new z5(this.a6.d2(), this.a6.d5()) : new z5(var1, var2);
   }

   private float n5(w3 var1, d6 var2, float var3, float var4) {
      var1.n3(new z5(var3, var4));
      var2.n3(new z5(var3, var4));
      return var3 - var1.d2();
   }

   private float l6(w3 var1, d6 var2, float var3, float var4) {
      var1.n3(new z5(var3, var4));
      var2.n3(new z5(var3, var4));
      return var4 - var1.d5();
   }

   private void a6(z5 var1) {
      if (this.a6 != null) {
         this.a6.n3(var1);
      }

      if (this.u9 != null && this.a6 != null) {
         this.u9.n3(new z5(this.a6.d2(), this.a6.d5() / 2.0F));
         this.c8.n3(new z5(this.a6.d2(), this.a6.d5()));
      }

      if (this.h0 != null && this.a6 != null) {
         this.h0.n3(new z5(this.a6.d2(), this.a6.d5() / 2.0F));
         this.t2.n3(new z5(this.a6.d2(), this.a6.d5()));
      }
   }

   private void u9(z5 var1) {
      if (this.l6 != null) {
         this.x8.n3(new z5(var1.n5(), this.l6.d5()));
      }

      if (this.s7 != null) {
         this.s7.n3(new z5(this.n5.d2(), var1.l6()));
      }

      if (this.u3 != null) {
         this.y4.n3(new z5(var1.n5(), this.u3.d5()));
      }

      if (this.n3 != null) {
         this.n3.n3(new z5(this.k5.d2(), var1.l6()));
      }

      if (this.u9 != null) {
         this.c8.n3(new z5(this.a6.d2(), this.a6.d5()));
      }

      if (this.h0 != null) {
         this.t2.n3(new z5(this.a6.d2(), this.a6.d5()));
      }
   }

   private void l6(a9v var1) {
      float var2 = var1.n5() - this.l6(1) - this.l6(2);
      float var3 = var1.l6() - this.l6(3) - this.l6(0);
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, h7x.class)) {
         var2 = this.n5(this.l6, this.x8, var2, var3);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, h7x.class)) {
         var2 = this.n5(this.u3, this.y4, var2, var3);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, h7x.class)) {
         var3 = this.l6(this.n5, this.s7, var2, var3);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, h7x.class)) {
         var3 = this.l6(this.k5, this.n3, var2, var3);
      }

      if (this.l6 != null && !com.aspose.slides.internal.v6g.k5.l6(this.l6, h7x.class)) {
         var2 = this.n5(this.l6, this.x8, var2, var3);
      }

      if (this.u3 != null && !com.aspose.slides.internal.v6g.k5.l6(this.u3, h7x.class)) {
         var2 = this.n5(this.u3, this.y4, var2, var3);
      }

      if (this.n5 != null && !com.aspose.slides.internal.v6g.k5.l6(this.n5, h7x.class)) {
         var3 = this.l6(this.n5, this.s7, var2, var3 / 2.0F);
      }

      if (this.k5 != null && !com.aspose.slides.internal.v6g.k5.l6(this.k5, h7x.class)) {
         this.l6(this.k5, this.n3, var2, var3 / 2.0F);
      }

      this.a6((z5)var1);
   }

   final float n5(int var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      switch (var1) {
         case 0:
            var2 = this.l6 != null && this.y1 == null ? this.l6.u3 : 0.0F;
            var3 = this.u3 != null && this.y1 == null ? this.u3.u3 : 0.0F;
            break;
         case 1:
            var2 = this.n5 != null ? this.n5.u3 : 0.0F;
            var3 = this.k5 != null ? this.k5.u3 : 0.0F;
            break;
         case 2:
            var2 = this.n5 != null ? this.n5.a6 : 0.0F;
            var3 = this.k5 != null ? this.k5.a6 : 0.0F;
            break;
         case 3:
            var2 = this.l6 != null ? this.l6.a6 : 0.0F;
            var3 = this.u3 != null ? this.u3.a6 : 0.0F;
      }

      return com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(var3));
   }

   final float l6(int var1) {
      float var2 = 0.0F;
      if (this.k7 != null && this.l6.z3() == var1) {
         var2 += this.k7.d2() + this.a0;
      }

      if (this.z8 != null && this.u3.z3() == var1) {
         var2 += this.z8.d2() + this.a0;
      }

      if (this.z8 != null && this.k7 != null && this.l6.z3() == var1 && this.z8.k5() == this.k7.k5()) {
         var2 += this.d2 - this.a0;
      }

      if (this.m1 != null && this.n5.z3() == var1) {
         var2 += this.m1.d5() + this.a0;
      }

      if (this.m3 != null && this.k5.z3() == var1) {
         var2 += this.m3.d5() + this.a0;
      }

      if (this.m1 != null && this.m3 != null && this.n5.z3() == var1 && this.m1.k5() == this.m3.k5()) {
         var2 += this.d2 - this.a0;
      }

      return var2;
   }

   private float u9(int var1) {
      float var2 = 0.0F;
      if (this.j5 != null && this.j5.h0() == var1) {
         var2 += this.j5.d2();
      }

      if (this.w1 != null && this.w1.h0() == var1) {
         var2 += this.w1.d2();
      }

      if (this.r4 != null && this.r4.h0() == var1) {
         var2 += this.r4.d5();
      }

      if (this.c4 != null && this.c4.h0() == var1) {
         var2 += this.c4.d5();
      }

      return var2;
   }

   final float k5(int var1) {
      float var2 = 0.0F;
      if (this.l6 != null && this.l6.z3() == var1) {
         var2 += this.l6.t9().l6();
      }

      if (this.u3 != null && this.u3.z3() == var1) {
         var2 += this.u3.t9().l6();
      }

      if (this.n5 != null && this.n5.z3() == var1) {
         var2 += this.n5.t9().k5();
      }

      if (this.k5 != null && this.k5.z3() == var1) {
         var2 += this.k5.t9().k5();
      }

      return var2;
   }

   final float u3(int var1) {
      float var2 = this.n5(var1);
      float var3 = this.l6(var1);
      float var4 = this.k5(var1);
      float var5 = this.u9(var1);
      float var6 = com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(var3 + var4 + var5));
      if (var1 == 1 && this.y1 != null) {
         var6 = com.aspose.slides.ms.System.q1.n5((float)(var6), (float)(this.y1.c8()));
      }

      return var6;
   }

   final float a6(int var1) {
      float var2 = com.aspose.slides.ms.System.q1.n5((float)(this.n5(var1)), (float)(this.k5(var1)));
      if (var1 == 1 && this.y1 != null) {
         var2 = com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(this.y1.c8()));
      }

      return var2;
   }

   private void h0(z5 var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      if (com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
         var2 = var1.n5() - this.u3(1) - this.u3(2);
         var3 = var1.l6() - this.u3(0) - this.u3(3);
      } else {
         var2 = var1.n5() - this.a6(1) - this.a6(2);
         var3 = var1.l6() - this.a6(0) - this.a6(3);
      }

      if (this.y1 != null) {
         var3 -= this.t4();
      }

      if (this.l6 != null && !com.aspose.slides.internal.v6g.k5.l6(this.l6, h7x.class)) {
         this.n5(this.l6, this.x8, var1.n5(), var3);
      }

      if (this.u3 != null && !com.aspose.slides.internal.v6g.k5.l6(this.u3, h7x.class)) {
         this.n5(this.u3, this.y4, var1.n5(), var3);
      }

      if (this.n5 != null && !com.aspose.slides.internal.v6g.k5.l6(this.n5, h7x.class)) {
         this.l6(this.n5, this.s7, var2, var1.l6() / 2.0F);
      }

      if (this.k5 != null && !com.aspose.slides.internal.v6g.k5.l6(this.k5, h7x.class)) {
         this.l6(this.k5, this.n3, var2, var1.l6() / 2.0F);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.l6, h7x.class)) {
         this.n5(this.l6, this.x8, var1.n5(), var3);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.u3, h7x.class)) {
         this.n5(this.u3, this.y4, var1.n5(), var3);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.n5, h7x.class)) {
         this.l6(this.n5, this.s7, var2, var1.l6());
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.k5, h7x.class)) {
         this.l6(this.k5, this.n3, var2, var1.l6());
      }

      if (this.y1 != null && this.y1.u3()) {
         this.y1.n3(var1);
      }
   }

   private void c8(z5 var1) {
      if (this.a6 != null) {
         if (com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            this.a6.a6(var1.n5() / 2.0F - this.a6.d2() / 2.0F);
            this.a6.u9(var1.l6() / 2.0F - this.a6.d5() / 2.0F);
         } else {
            this.a6.a6(0.0F);
            this.a6.u9(0.0F);
         }
      }

      if (this.u9 != null && this.a6 != null) {
         this.u9.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.u9.d2());
         this.u9.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.u9.d5());
         this.c8.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.c8.d2() / 2.0F);
         this.c8.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.c8.d5() / 2.0F);
      }

      if (this.h0 != null && this.a6 != null) {
         this.h0.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.h0.d2());
         this.h0.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.h0.d5());
         this.t2.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.t2.d2() / 2.0F);
         this.t2.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.t2.d5() / 2.0F);
      }

      if (this.l6 != null) {
         this.y4(var1);
      }

      if (this.n5 != null) {
         this.x8(var1);
      }

      if (this.k5 != null) {
         this.t2(var1);
      }

      if (this.u3 != null) {
         this.s7(var1);
      }
   }

   private void t2(z5 var1) {
      switch (this.k5.z3()) {
         case 0:
            if (this.k5.n3().y4() == this.k5.n3().d5()) {
               this.k5.u9(this.d5() - this.l6(0) - this.k5.d5());
               this.n3.u9(this.k5.o0());
            } else {
               if (this.k5.n5().c8().getTickLabelPosition() == 2) {
                  this.k5.u9(this.u3(3) + this.k5.n3().y4());
               } else {
                  this.k5.u9(this.d5() - this.l6(0) - this.k5.d5());
                  if (this.y1 != null && !this.y1.u3()) {
                     this.k5.u9(this.k5.o0() - this.y1.d5());
                  }
               }

               this.n3.u9(this.u3(3) + this.k5.n3().y4());
            }
            break;
         case 3:
            if (this.k5.n3().y4() == 0.0F) {
               this.k5.u9(this.l6(3));
               this.n3.u9(this.k5.o0() + this.k5.d5());
            } else {
               if (this.k5.n5().c8().getTickLabelPosition() == 2) {
                  this.k5.u9(this.u3(3) + this.k5.n3().y4() - this.k5.d5());
               } else {
                  this.k5.u9(this.l6(3));
               }

               this.n3.u9(this.u3(3) + this.k5.n3().y4());
            }
      }

      if (this.u3(1) > this.n5(1)) {
         this.k5.a6(this.u3(1));
         this.n3.a6(this.u3(1));
      } else {
         this.k5.a6(this.n5(1));
         this.n3.a6(this.n5(1));
      }
   }

   private void s7(z5 var1) {
      if (this.u3.n5(77)) {
         this.u3.a6(this.d2() - this.l6(2) - this.u9(2) - this.u3.d2());
         this.y4.a6(this.u3.b3());
      } else {
         switch (this.u3.z3()) {
            case 1:
               if (this.u3.n3().y4() == 0.0F) {
                  this.u3.a6(this.l6(1) + this.u9(1));
                  this.y4.a6(this.u3.b3() + this.u3.d2());
               } else {
                  if (this.u3.n5().c8().getTickLabelPosition() == 2) {
                     this.u3.a6(this.u3(1) + this.u3.n3().y4() - this.u3.d2());
                  } else {
                     this.u3.a6(this.l6(1));
                  }

                  this.y4.a6(this.u3(1) + this.u3.n3().y4());
               }
               break;
            case 2:
               if (this.u3.n3().y4() == this.u3.n3().d2()) {
                  this.u3.a6(this.d2() - this.l6(2) - this.u9(2) - this.u3.d2());
                  this.y4.a6(this.u3.b3());
               } else {
                  if (this.u3.n5().c8().getTickLabelPosition() == 2) {
                     this.u3.a6(this.u3(1) + this.u3.n3().y4());
                  } else {
                     this.u3.a6(this.d2() - this.l6(2) - this.u3.d2());
                  }

                  this.y4.a6(this.u3(1) + this.u3.n3().y4());
               }
         }

         if (this.u3(3) > this.n5(3)) {
            this.u3.u9(this.u3(3));
            this.y4.u9(this.u3(3));
         } else {
            this.u3.u9(this.n5(3));
            this.y4.u9(this.n5(3));
         }
      }
   }

   private void x8(z5 var1) {
      switch (this.n5.z3()) {
         case 0:
            if (this.n5.n5().c8().getTickLabelPosition() == 2) {
               this.n5.u9(this.u3(3) + this.n5.n3().y4());
            } else {
               this.n5.u9(this.d5() - this.u3(0));
            }

            this.s7.u9(this.u3(3) + this.n5.n3().y4());
            break;
         case 3:
            if (this.n5.n5().c8().getTickLabelPosition() == 2) {
               this.n5.u9(this.u3(3) + this.n5.n3().y4() - this.n5.d5());
            } else {
               this.n5.u9(this.u3(3) - this.n5.d5());
            }

            this.s7.u9(this.u3(3) + this.n5.n3().y4());
      }

      if (this.u3(1) > this.n5(1)) {
         this.n5.a6(this.u3(1));
         this.s7.a6(this.u3(1));
      } else {
         this.n5.a6(this.n5(1));
         this.s7.a6(this.n5(1));
      }
   }

   private void y4(z5 var1) {
      float var2 = this.l6.n3() == null ? 0.0F : this.l6.n3().y4();
      float var3 = this.l6.n3() == null ? 0.0F : this.l6.n3().d2();
      switch (this.l6.z3()) {
         case 1:
            if (this.l6.n5().c8().getTickLabelPosition() == 2) {
               this.l6.a6(this.u3(1) + var2 - this.l6.d2());
            } else {
               this.l6.a6(this.u3(1) - this.l6.d2());
            }

            this.x8.a6(this.u3(1) + var2);
            if (this.u3() != null && this.u3().n5().c8().isPlotOrderReversed() && com.aspose.slides.internal.v6g.k5.l6(this.u3(), m3o.class)) {
               this.x8.a6(this.x8.b3() + com.aspose.slides.internal.v6g.k5.n5(this.u3(), m3o.class).w1());
            }
            break;
         case 2:
            if (var2 == 0.0F) {
               this.l6.a6(this.d2() - this.l6(2) - this.u9(2) - this.l6.d2());
               this.x8.a6(this.l6.b3());
            } else {
               if (this.l6.n5().c8().getTickLabelPosition() == 2) {
                  this.l6.a6(this.u3(1) + var2);
               } else {
                  this.l6.a6(this.u3(1) + var3);
               }

               this.x8.a6(this.u3(1) + var2);
               if (com.aspose.slides.internal.v6g.k5.l6(this.u3(), m3o.class)) {
                  this.x8.a6(this.x8.b3() - ((m3o)this.u3()).w1());
               }
            }
      }

      if (this.u3(3) > this.n5(3)) {
         this.l6.u9(this.u3(3));
         this.x8.u9(this.u3(3));
      } else {
         this.l6.u9(this.n5(3));
         this.x8.u9(this.n5(3));
      }
   }

   @Override
   protected void l6(z5 var1) {
      a9v var2 = (a9v)var1;
      if (com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()
         || this.y2.u3().n3().getPlotArea().getLayoutTargetType() == 1) {
         var2 = this.n5((a9v)var1);
      }

      this.c8(var1);
      this.u3(var2);
      this.a6(var2);
      this.k5(var2);
      this.e2(var1);

      for (v6g var6 : this.a0()) {
         var6.t1();
      }
   }

   private void k5(a9v var1) {
      if (this.y1 != null) {
         int var2 = ChartTypeCharacterizer.n5(this.y2.u3().y4().get_Item(0).u9().getType());
         boolean var3 = var2 == 4;
         if (var3) {
            this.y1.u9(this.n5.o0() + this.n5.d5());
         } else {
            this.y1.u9(this.l6.o0() + this.l6.d5());
         }

         float var4 = this.u3(1);
         if (var4 > this.y1.c8() && !var3) {
            this.y1.a6(var4 - this.y1.c8());
         }

         if (!var3
            && com.aspose.slides.internal.v6g.k5.l6(this.u3(), o8r.class)
            && this.u3().d2() > 0.0F
            && this.y1.b3() + this.y1.d2() > var4 + this.u3().d2()) {
            this.y1.a6(this.y1.b3() - (this.y1.b3() + this.y1.d2() - (var4 + this.u3().d2())));
         }

         if (this.y1.u3() && this.k5 != null && this.k5.z3() == 0) {
            this.y1.u9(this.y1.o0() - this.k5.t9().k5());
         }
      }
   }

   private void e2(z5 var1) {
      float var2 = com.aspose.slides.ms.System.q1.n5((float)(this.n5(1)), (float)(this.u3(1)));
      float var3 = com.aspose.slides.ms.System.q1.n5((float)(this.n5(3)), (float)(this.u3(3)));
      if (this.e2 != null) {
         this.e2.a6(var2);
         this.e2.u9(var3);
      }

      if (this.z1 != null) {
         this.z1.a6(var2);
         this.z1.u9(var3);
      }

      if (this.t4 != null) {
         this.t4.a6(var2);
         this.t4.u9(var3);
      }

      if (this.t9 != null) {
         this.t9.a6(var2);
         this.t9.u9(var3);
      }

      if (this.q0 != null) {
         this.q0.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.q0.d2() / 2.0F);
         this.q0.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.q0.d5() / 2.0F);
      }

      if (this.z3 != null) {
         this.z3.a6(this.a6.b3() + this.a6.d2() / 2.0F - this.z3.d2() / 2.0F);
         this.z3.u9(this.a6.o0() + this.a6.d5() / 2.0F - this.z3.d5() / 2.0F);
      }
   }

   private void t9(z5 var1) {
      float var2 = var1.n5();
      float var3 = var1.l6();
      if (this.m1 != null) {
         this.m1.n3(new z5(var2, var3));
      }

      if (this.k7 != null) {
         this.k7.n3(new z5(var2, var3));
      }

      if (this.z8 != null) {
         this.z8.n3(new z5(var2, var3));
      }

      if (this.m3 != null) {
         this.m3.n3(new z5(var2, var3));
      }
   }

   private void z1(z5 var1) {
      if (this.r4 != null) {
         this.r4.n3(var1);
      }

      if (this.j5 != null) {
         this.j5.n3(var1);
      }

      if (this.w1 != null) {
         this.w1.n3(var1);
      }

      if (this.c4 != null) {
         this.c4.n3(var1);
      }
   }

   private void u3(a9v var1) {
      if (this.m1 != null) {
         if (this.n5.z3() == 3) {
            this.m1.u9(this.l6(3) - this.n5.d5());
         } else {
            this.m1.u9(this.d5() - this.l6(0));
         }

         this.m1.a6(this.n5.b3() + this.n5.d2() / 2.0F - this.m1.d2() / 2.0F);
         this.n5(this.n5.n5().c8().getTitle(), this.m1, var1);
      }

      if (this.m3 != null) {
         if (this.k5.z3() == 3) {
            this.m3.u9(0.0F);
         } else {
            this.m3.u9(this.d5() - this.m3.d5());
         }

         this.m3.a6(this.k5.b3() + this.k5.d2() / 2.0F - this.m3.d2() / 2.0F);
         this.n5(this.k5.n5().c8().getTitle(), this.m3, var1);
      }

      if (this.k7 != null) {
         if (this.l6.z3() == 1) {
            this.k7.a6(this.l6(1) - this.k7.d2());
         } else {
            this.k7.a6(this.d2() - this.k7.d2());
         }

         if (this.l6.d5() > this.k7.d5()) {
            this.k7.u9(this.l6.o0() + this.l6.d5() / 2.0F - this.k7.d5() / 2.0F);
         } else {
            this.k7.u9(this.l6.o0() + this.e5().k5() / 2.0F - this.k7.d5() / 2.0F);
         }

         this.n5(this.l6.n5().c8().getTitle(), this.k7, var1);
      }

      if (this.z8 != null) {
         if (this.u3.z3() == 1) {
            this.z8.a6(0.0F);
         } else {
            this.z8.a6(this.d2() - this.z8.d2());
         }

         this.z8.u9(this.u3.o0() + this.u3.d5() / 2.0F - this.z8.d5() / 2.0F);
         this.n5(this.u3.n5().c8().getTitle(), this.z8, var1);
      }
   }

   private void n5(ILayoutable var1, v6g var2, a9v var3) {
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1(Float.NaN, Float.NaN);
      com.aspose.slides.internal.o9b.f2 var5 = new com.aspose.slides.internal.o9b.f2();
      com.aspose.slides.internal.o9b.w1[] var6 = new com.aspose.slides.internal.o9b.w1[]{var4};
      com.aspose.slides.internal.o9b.f2[] var7 = new com.aspose.slides.internal.o9b.f2[]{var5};
      this.y2.n5(var1, var6, var7);
      var6[0].n5(var4);
      var7[0].l6(var5);
      if (!com.aspose.slides.ms.System.n1.k5(var4.l6()) && !com.aspose.slides.ms.System.n1.k5(var4.k5())) {
         if (com.aspose.slides.internal.v6g.k5.n5(this.y2.u3().n3().getPlotArea(), ChartPlotArea.class).isLocationAutocalculated()) {
            var2.a6(var4.l6() - var3.u3());
            var2.u9(var4.k5() - var3.a6());
         } else {
            a9v var8 = this.y2.k5(var3);
            float var9 = var8.u3() - this.u3(1);
            float var10 = var8.a6() - this.u3(3);
            var2.a6(var4.l6() - var9);
            var2.u9(var4.k5() - var10);
         }
      }
   }

   private void a6(a9v var1) {
      if (this.j5 != null) {
         this.j5.u9(this.l6.o0());
         if (this.l6.z3() == 1) {
            this.j5.a6(this.l6.b3() - this.j5.d2());
         } else {
            this.j5.a6(this.l6.b3() + this.l6.d2());
         }

         this.n5(this.l6.n5().c8().k5(), this.j5, var1);
      }

      if (this.w1 != null) {
         this.w1.u9(this.u3.o0());
         if (this.u3.z3() == 1) {
            this.w1.a6(this.u3.b3() - this.w1.d2());
         } else {
            this.w1.a6(this.u3.b3() + this.u3.d2());
         }

         this.n5(this.u3.n5().c8().k5(), this.w1, var1);
      }

      if (this.r4 != null) {
         this.r4.a6(this.n5.b3() + this.n5.d2() - this.r4.d2());
         if (this.n5.z3() == 3) {
            this.r4.u9(this.n5.o0() - this.r4.d5());
         } else {
            this.r4.u9(this.n5.o0() + this.n5.d5());
         }

         this.n5(this.n5.n5().c8().k5(), this.r4, var1);
      }

      if (this.c4 != null && this.k5 != null && this.r4 != null) {
         this.r4.a6(this.k5.b3() + this.k5.d2() - this.c4.d2());
         if (this.k5.z3() == 3) {
            this.c4.u9(this.k5.o0() - this.r4.d5());
         } else {
            this.r4.u9(this.k5.o0() + this.k5.d5());
         }

         this.n5(this.k5.n5().c8().k5(), this.r4, var1);
      }
   }

   private w3 n5(l5 var1, boolean var2) {
      if (var2) {
         return var1.c8().isLogarithmic() ? new i2t(var1) : new i2z(var1);
      } else {
         return var1.c8().isLogarithmic() ? new g3p(var1) : new d4q(var1);
      }
   }

   private w3 l6(l5 var1, boolean var2) {
      if (var2) {
         return var1.c8().getCategoryAxisType() == 1 ? new v3o(var1) : new l5n(var1);
      } else {
         return var1.c8().getCategoryAxisType() == 1 ? new m3o(var1) : new a0k(var1);
      }
   }

   private void e2() {
      if (this.y2.u3().y4().get_Item(0).u9().getType() != 80) {
         if (this.l6 != null) {
            this.e2 = new d4i(this.l6);
            this.n5(this.e2);
         }

         if (this.u3 != null) {
            this.t9 = new d4i(this.u3);
            this.n5(this.t9);
         }

         if (this.n5 != null) {
            this.z1 = new d4i(this.n5);
            this.n5(this.z1);
         }

         if (this.k5 != null) {
            this.t4 = new d4i(this.k5);
            this.n5(this.t4);
         }

         if (this.u9 != null) {
            this.q0 = new d4i(this.u9);
            this.n5(this.q0);
         }

         if (this.h0 != null) {
            this.z3 = new d4i(this.h0);
            this.n5(this.z3);
         }
      }
   }

   private void n5(n1g var1) {
      List$Enumerator var2 = var1.y4().iterator();

      try {
         while (var2.hasNext()) {
            g3y var3 = (g3y)var2.next();
            switch (ChartTypeCharacterizer.n5(var3.u9().getType())) {
               case 1:
                  if (this.l6 == null) {
                     this.l6 = this.l6(var1.q0(), true);
                     this.x8 = new d6(this.l6);
                  }
                  break;
               case 2:
                  if (var3.u9().getPlotOnSecondAxis()) {
                     if (this.k5 == null) {
                        this.k5 = this.l6(var1.z3(), false);
                        this.n3 = new d6(this.k5);
                     }

                     if (this.u3 == null) {
                        this.u3 = this.n5(var1.k7(), true);
                        this.y4 = new d6(this.u3);
                     }
                  } else {
                     if (this.n5 == null) {
                        this.n5 = this.l6(var1.q0(), false);
                        this.s7 = new d6(this.n5);
                     }

                     if (this.l6 == null) {
                        this.l6 = this.n5(var1.m1(), true);
                        this.x8 = new d6(this.l6);
                     }
                  }
                  break;
               case 3:
                  if (this.a6 == null) {
                     this.a6 = new v2m(var1.q0());
                  }

                  if (var3.u9().getPlotOnSecondAxis()) {
                     if (this.h0 == null) {
                        this.h0 = this.n5(var1.k7(), true);
                        this.t2 = new p1w(this.h0);
                     }

                     this.h0.l6.addItem(var3);
                  } else {
                     if (this.u9 == null) {
                        this.u9 = this.n5(var1.m1(), true);
                        this.c8 = new p1w(this.u9);
                     }

                     this.u9.l6.addItem(var3);
                  }

                  this.a6.l6.addItem(var3);
                  break;
               case 4:
                  if (var3.u9().getPlotOnSecondAxis()) {
                     if (this.k5 == null) {
                        this.k5 = this.n5(var1.k7(), false);
                        this.n3 = new d6(this.k5);
                     }

                     if (this.u3 == null) {
                        this.u3 = this.l6(var1.z3(), true);
                        this.y4 = new d6(this.u3);
                     }
                  } else {
                     if (this.n5 == null) {
                        this.n5 = this.n5(var1.m1(), false);
                        this.s7 = new d6(this.n5);
                     }

                     if (this.l6 == null) {
                        this.l6 = this.l6(var1.q0(), true);
                        this.x8 = new d6(this.l6);
                     }
                  }
                  break;
               case 5:
                  if (var3.u9().getPlotOnSecondAxis()) {
                     if (this.k5 == null) {
                        this.k5 = this.n5(var1.z3(), false);
                        this.n3 = new d6(this.k5);
                     }

                     if (this.u3 == null) {
                        this.u3 = this.n5(var1.k7(), true);
                        this.y4 = new d6(this.u3);
                     }
                  } else {
                     if (this.n5 == null) {
                        this.n5 = this.n5(var1.q0(), false);
                        this.s7 = new d6(this.n5);
                     }

                     if (this.l6 == null) {
                        this.l6 = this.n5(var1.m1(), true);
                        this.x8 = new d6(this.l6);
                     }
                  }
               case 6:
               default:
                  break;
               case 7:
                  if (this.n5 == null) {
                     if (ChartTypeCharacterizer.u3(var1.y4().get_Item(0).u9().getType())) {
                        this.n5 = new m1r(var1.q0());
                     } else {
                        this.n5 = this.l6(var1.q0(), false);
                     }

                     this.s7 = new d6(this.n5);
                  }

                  if (this.l6 == null) {
                     this.l6 = this.n5(var1.m1(), true);
                     this.x8 = new d6(this.l6);
                  }
                  break;
               case 8:
                  if (this.n5 == null) {
                     this.n5 = new m1r(var1.q0());
                     this.n5 = this.l6(var1.q0(), false);
                  }

                  if (this.u3 == null) {
                     this.u3 = this.n5(var1.k7(), true);
                     this.y4 = new d6(this.u3);
                  }
            }

            if (var3.c8().size() > 0 || var3.u9().s7() != null && var3.u9().s7().n5() > 0) {
               if (var3.u9().getType() == 77) {
                  if (this.n5 != null) {
                     this.n5.l6.addItem(var3);
                  }

                  if (this.u3 != null) {
                     this.u3.l6.addItem(var3);
                  }
               } else if (var3.u9().getPlotOnSecondAxis()) {
                  if (this.k5 != null) {
                     this.k5.l6.addItem(var3);
                  }

                  if (this.u3 != null) {
                     this.u3.l6.addItem(var3);
                  }
               } else {
                  if (this.n5 != null) {
                     this.n5.l6.addItem(var3);
                  }

                  if (this.l6 != null) {
                     this.l6.l6.addItem(var3);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (this.n5 != null) {
         this.n5(this.n5);
         this.n5(this.s7);
         this.n5.n5(this.l6);
      }

      if (this.l6 != null) {
         this.n5(this.l6);
         this.n5(this.x8);
         this.l6.n5(this.n5);
      }

      if (this.k5 != null) {
         this.n5(this.k5);
         this.n5(this.n3);
         this.k5.n5(this.u3);
      }

      if (this.u3 != null) {
         this.n5(this.u3);
         this.n5(this.y4);
         this.u3.n5(this.k5);
         if (this.u3.l6.size() > 0 && this.u3.l6.get_Item(0).u9().getType() == 77) {
            this.u3.n5(this.n5);
         }
      }

      if (this.a6 != null) {
         this.n5(this.a6);
      }

      if (this.u9 != null) {
         this.n5(this.u9);
         this.n5(this.c8);
         this.u9.n5(this.a6);
      }

      if (this.h0 != null) {
         this.n5(this.h0);
         this.n5(this.t2);
         this.h0.n5(this.a6);
      }
   }

   private void t9() {
      if (this.n5 != null && this.n5.n5().c8().k5().k5()) {
         this.r4 = new p5x(this.n5.n5());
      }

      if (this.l6 != null && this.l6.n5().c8().k5().k5()) {
         this.j5 = new p5x(this.l6.n5());
      }

      if (this.k5 != null && this.k5.n5().c8().k5().k5()) {
         this.c4 = new p5x(this.k5.n5());
      }

      if (this.u3 != null && this.u3.n5().c8().k5().k5()) {
         this.w1 = new p5x(this.u3.n5());
      }

      if (this.r4 != null) {
         this.n5(this.r4);
      }

      if (this.j5 != null) {
         this.n5(this.j5);
      }

      if (this.c4 != null) {
         this.n5(this.c4);
      }

      if (this.w1 != null) {
         this.n5(this.w1);
      }
   }

   private void z1() {
      if (this.n5 != null && this.n5.n5().c8().hasTitle()) {
         this.m1 = new u2(this.n5.n5());
      }

      if (this.l6 != null && this.l6.n5().c8().hasTitle()) {
         this.k7 = new u2(this.l6.n5());
      }

      if (this.k5 != null && this.k5.n5().c8().hasTitle()) {
         this.m3 = new u2(this.k5.n5());
      }

      if (this.u3 != null && this.u3.n5().c8().hasTitle()) {
         this.z8 = new u2(this.u3.n5());
      }

      if (this.m1 != null) {
         this.n5(this.m1);
      }

      if (this.k7 != null) {
         this.n5(this.k7);
      }

      if (this.m3 != null) {
         this.n5(this.m3);
      }

      if (this.z8 != null) {
         this.n5(this.z8);
      }
   }

   private float t4() {
      if (this.y1 == null) {
         return 0.0F;
      }

      if (!this.y2.u3().n3().hasDataTable()) {
         return 0.0F;
      }

      float var1 = this.y1.u3() ? 0.0F : 8.0F;
      return this.y1.d5() + var1;
   }
}
