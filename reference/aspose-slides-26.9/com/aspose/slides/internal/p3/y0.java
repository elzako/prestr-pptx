package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;

public class y0 extends l6 {
   private e9 u3;
   private boolean a6 = true;
   private boolean u9;
   private boolean h0;
   private z6 c8;
   private com.aspose.slides.internal.a0.t2 t2 = null;
   private com.aspose.slides.internal.a0.t2 s7 = null;
   private boolean x8;
   private z8 n3 = null;
   private f5 y4 = null;
   private f5 e2 = null;

   public y0(e9 var1) {
      this.u3 = var1;
      this.c8 = var1.d5();
      this.n3 = var1.y1().n5(var1, var1.s3().v4());
   }

   @Override
   protected void n5(t1 var1) {
      int var2 = this.u3.w1().x8().k7();
      var1.l6(var2);
   }

   @Override
   protected y2 k5() {
      return this.u3;
   }

   @Override
   protected z6 h0() {
      return this.u3.d5();
   }

   public final void l6(int var1) {
      this.n5(var1, false);
   }

   @Override
   protected a0 c8() {
      return new y0$n5(this);
   }

   @Override
   protected int l6(t1 var1, int var2) {
      this.h0 = false;
      if (var1.c4() != 0) {
         var2 = var1.c4();
         this.h0 = var1.c4() == 5 && var1.p8() == 48;
      }

      return var2;
   }

   @Override
   protected int k5(t1 var1, int var2) {
      return this.n5(var1, var2, null, null, null);
   }

   @Override
   protected int n5(t1 var1, int var2, j8 var3, y2 var4, List<com.aspose.slides.internal.r4.u9> var5) {
      if (!this.a6) {
         this.u3(var2);
      }

      this.a6 = false;
      this.u9 = true;
      this.c8.n5(this.u3.a0(), this.u3.w1().x8().j5(), this.x8);
      return super.n5(var1, var2, var3, var4, var5);
   }

   private boolean n5(List<com.aspose.slides.internal.r4.u9> var1, t1 var2, boolean[] var3) {
      boolean var4 = false;
      var3[0] = false;
      if (var1 != null) {
         com.aspose.slides.internal.r4.u3 var5 = new com.aspose.slides.internal.r4.u3(var1);

         while (var5.l6()) {
            v0 var6 = ((com.aspose.slides.internal.r4.u9)var5.k5()).n5();
            p8 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, p8.class);
            if (com.aspose.slides.internal.v6g.k5.l6(var6, p8.class)) {
               if (var7.h0()) {
                  var4 = true;
                  t1 var8 = new t1(var2);
                  var8.n5(var2.q0());
                  var8.l6(this.u3.w1().l6(58).l6());
                  List var9 = var7.a6();
                  com.aspose.slides.internal.r4.u3 var10 = new com.aspose.slides.internal.r4.u3(var9);

                  while (var10.l6()) {
                     j5 var11 = (j5)var10.k5();
                     var11.n5(this.n3);
                     var11.t4();
                     var7.n5(var11.n5(var8, this.n5));
                  }
               }

               if (var7.t2()) {
                  var3[0] = true;
                  t1 var12 = new t1(var2);
                  var12.n5(var2.q0());
                  var12.l6(this.u3.w1().l6(58).l6());
                  List var13 = var7.u9();
                  com.aspose.slides.internal.r4.u3 var14 = new com.aspose.slides.internal.r4.u3(var13);

                  while (var14.l6()) {
                     z3 var15 = (z3)var14.k5();
                     var15.n5(this.n3);
                     var15.t4();
                     var7.l6(var15.n5(var12, this.n5));
                  }
               }
            }
         }
      }

      return var4;
   }

   private void n3() {
      com.aspose.slides.internal.t1.w1 var1 = this.u3.s3().a6("xsl-footnote-separator");
      if (var1 != null) {
         this.t2 = new com.aspose.slides.internal.a0.t2();
         this.t2.l6(this.u3.w1().l6(58).l6());
         this.y4 = this.u3.y1().n5(this.u3, var1, this.t2);
         this.y4.y1();
         this.l6 = com.aspose.slides.internal.v8.u9.n5(this.t2.e_());
      }
   }

   private void n5(boolean var1) {
      com.aspose.slides.internal.t1.w1 var2;
      if (var1 && (var2 = this.u3.s3().a6("xsl-before-float-separator")) != null) {
         this.s7 = new com.aspose.slides.internal.a0.t2();
         this.s7.l6(this.u3.w1().l6(58).l6());
         this.e2 = this.u3.y1().n5(this.u3, var2, this.s7);
         this.e2.y1();
         this.k5 = com.aspose.slides.internal.v8.u9.n5(this.s7.e_());
      }
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = null;

      while (!this.n3.m3() && var3 == null) {
         var3 = this.n3.n5(var1, var2);
      }

      boolean var4 = false;
      boolean[] var5 = new boolean[]{false};
      boolean var6 = this.n5(var3, var1, var5);
      var4 = var5[0];
      if (var6) {
         this.n3();
      }

      this.n5(var4);
      return var3;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2, j8 var3, y2 var4) {
      List var5 = null;

      do {
         var5 = this.n3.n5(var1, var2, var3, var4);
      } while (!this.n3.m3() && var5 == null);

      boolean var6 = false;
      boolean[] var7 = new boolean[]{false};
      boolean var8 = this.n5(var5, var1, var7);
      var6 = var7[0];
      if (var8) {
         this.n3();
      }

      this.n5(var6);
      return var5;
   }

   @Override
   protected int n5() {
      return this.u3.j5().n5().h0(58).z7();
   }

   @Override
   protected boolean l6() {
      return !this.n3.m3();
   }

   @Override
   protected void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      if (this.y4 != null) {
         com.aspose.slides.internal.t1.w1 var3 = this.u3.s3().a6("xsl-footnote-separator");
         this.t2 = new com.aspose.slides.internal.a0.t2();
         this.t2.l6(this.u3.w1().l6(58).l6());
         this.y4 = this.u3.y1().n5(this.u3, var3, this.t2);
         this.y4.y1();
      }

      if (this.e2 != null) {
         com.aspose.slides.internal.t1.w1 var4 = this.u3.s3().a6("xsl-before-float-separator");
         this.s7 = new com.aspose.slides.internal.a0.t2();
         this.s7.l6(this.u3.w1().l6(58).l6());
         this.e2 = this.u3.y1().n5(this.u3, var4, this.s7);
         this.e2.y1();
      }

      this.n3.n5(var1, var2);
   }

   @Override
   protected void n5(j9 var1, int var2, l6$n5 var3, l6$n5 var4) {
      if (this.h0) {
         this.k5(var1, var2, var3, var4);
      } else {
         boolean var5 = this.u3.s3().a5();
         if (!this.l6() && var5) {
            this.k5(var1, var2, var3, var4);
         } else {
            this.l6(var1, var2, var3, var4);
         }
      }
   }

   private void k5(j9 var1, int var2, l6$n5 var3, l6$n5 var4) {
      int var5 = 0;
      int var6 = this.c8.a6(var2);
      if (var6 > 0) {
         this.l6(var1, var6, var3, var4);
         l6$l6 var7 = var1.t9().get_Item(var6 - 1);
         var5 = var7.n5() + 1;
         if (var5 > 0) {
            this.u3(104);
         }
      }

      this.u9 = true;
      int var11 = this.u3.a0();
      this.c8.n5(var11, this.u3.w1().x8().j5(), this.x8);
      var4.n5 = var5;
      j9 var8;
      if (this.h0) {
         var8 = new c8(this.k5(), this.h0(), this.c8(), this.n5, 135, this.l6, this.k5, this.a6(), this.u3.w1().s7().k7());
      } else {
         com.aspose.slides.internal.a0.n3 var9 = this.c8.n5(false, var11).l6().s7();
         this.k5(var11);
         com.aspose.slides.internal.a0.n3 var10 = this.c8.n5(false, var11).l6().s7();
         var10.z8().l6(var9.z8().m1());
         var8 = new j9(this.k5(), this.h0(), this.c8(), var1.y4(), var1.e2(), this.l6, this.k5, this.a6(), false, false);
      }

      int var12 = var8.n5(var4, var5, 1.0, true, 0);
      boolean var13 = var12 <= this.u3.w1().s7().z8().k7().m1();
      if (this.h0) {
         if (!var13) {
         }
      } else {
         if (!var13) {
            this.n5(var1, var6, var2 - var6, var3, var4);
            this.k5(var11 + 1);
            this.u3.n5(this.u3.u3(true));
            return;
         }

         this.u3.n5(this.c8.n5(false, var11));
      }

      this.l6(var8, var12, var3, var4);
   }

   private void k5(int var1) {
      int var2 = this.u3.k5(var1);
      this.c8.n5(var2);
   }

   @Override
   protected void n5(l6$n5 var1, int var2) {
      if (this.u3.j5() == null) {
         throw new InvalidOperationException("curPage must not be null");
      }

      if (!this.u9) {
         if (!this.a6) {
            this.u3(var2);
         }

         this.c8.n5(this.u3.a0(), this.u3.w1().x8().j5(), this.x8);
      }

      this.u9 = false;
      this.a6 = false;
   }

   @Override
   protected void s7() {
      this.u3.w1().a6().n5();
   }

   @Override
   protected void n5(j9 var1, l6$l6 var2) {
      if (var2.h0 <= var2.c8) {
         for (int var3 = var2.h0; var3 <= var2.c8; var3++) {
            List var4 = var1.h0(var3);
            byte var5 = 0;
            int var6 = var4.size() - 1;
            j4.n5(var4, var5, var6, -1);
            t1 var7 = new t1(0);
            com.aspose.slides.internal.p3.h0.n5(null, new z7(var4, var5, var6 + 1), var7);
         }

         com.aspose.slides.internal.a0.c8 var8 = this.u3.w1().s7().w1();
         var8.n5(this.s7);
      }

      if (var2.k5 < var2.a6 || var2.u3 <= var2.u9) {
         for (int var9 = var2.k5; var9 <= var2.a6; var9++) {
            List var11 = var1.u9(var9);
            int var13 = var9 == var2.k5 ? var2.u3 : 0;
            int var14 = var9 == var2.a6 ? var2.u9 : var11.size() - 1;
            j4.n5(var11, var13, var14, -1);
            t1 var15 = new t1(0);
            com.aspose.slides.internal.p3.h0.n5(null, new z7(var11, var13, var14 + 1), var15);
         }

         com.aspose.slides.internal.a0.z1 var10 = this.u3.w1().s7().r4();
         int var12 = this.u3.w1().s7().e_() - var10.e_() - this.u3.w1().s7().w1().e_();
         if (this.t2 != null) {
            var12 -= this.t2.e_();
         }

         var10.t2(var12);
         var10.n5(this.t2);
      }

      this.u3.w1().x8().c4();
   }

   @Override
   protected y2 u3() {
      return this.n3;
   }

   private void u3(int var1) {
      x9 var2 = this.u3.j5();
      switch (var1) {
         case -1:
         case 9:
         case 28:
         case 104:
            o5 var3 = var2.l6();
            boolean var4 = false;
            com.aspose.slides.internal.t1.t9 var5 = (com.aspose.slides.internal.t1.t9)var2.n5().h0(58);
            var4 = var5.t1() > 1 && var3.x8().m1() == 1;
            if (var4) {
               var2 = this.u3.u3(false);
               var2.l6().n5(true);
            } else if (var3.x8().r4()) {
               var3.x8().w1();
            } else {
               this.u3.u3(false);
            }

            return;
         case 5:
            var2.l6().n5(true);
            this.x8 = true;
            return;
         case 95:
            var2.l6().n5(false);
            this.x8 = false;
            return;
         default:
            if (this.a6(var1)) {
               this.u3.u3(true);
            }

            if (this.u9(var1)) {
               this.u3.u3(false);
            }
      }
   }

   private boolean a6(int var1) {
      if (var1 != 104 && !this.u3.j5().l6().a6().l6()) {
         return this.u3.a0() % 2 == 0 ? var1 == 44 : var1 == 100;
      } else {
         return false;
      }
   }

   private boolean u9(int var1) {
      if (this.u3.j5().l6().a6().l6()) {
         if (var1 == 104) {
            return false;
         } else {
            return this.u3.a0() % 2 == 0 ? var1 == 100 : var1 == 44;
         }
      } else {
         return true;
      }
   }

   // $VF: synthetic method
   static z6 n5(y0 var0) {
      return var0.c8;
   }
}
