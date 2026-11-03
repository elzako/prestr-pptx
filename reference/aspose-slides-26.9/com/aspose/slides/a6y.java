package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class a6y extends v6g {
   private final t9z n5;
   private final List<com.aspose.slides.internal.o9b.w1> l6;
   private com.aspose.slides.internal.o9b.w1 k5 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();
   private boolean a6;

   @Override
   public boolean T_() {
      return this.u3();
   }

   public final boolean u3() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   @Override
   public int O_() {
      return 4;
   }

   public a6y(t9z var1) {
      this.n5 = var1;
      this.l6 = new List<>();
   }

   public final boolean n5(com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.w1[] var2, com.aspose.slides.internal.o9b.w1[] var3) {
      com.aspose.slides.internal.o9b.w1 var4 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1 var5 = new com.aspose.slides.internal.o9b.w1();
      com.aspose.slides.internal.o9b.w1[] var6 = new com.aspose.slides.internal.o9b.w1[]{var4};
      com.aspose.slides.internal.o9b.w1[] var7 = new com.aspose.slides.internal.o9b.w1[]{var5};
      boolean var8 = this.n5(var1.y4(), var2, var3, false, var6, var7);
      var6[0].n5(var4);
      var7[0].n5(var5);
      return var8;
   }

   public final boolean n5(
      com.aspose.slides.internal.o9b.y1 var1,
      com.aspose.slides.internal.o9b.w1[] var2,
      com.aspose.slides.internal.o9b.w1[] var3,
      boolean var4,
      com.aspose.slides.internal.o9b.w1[] var5,
      com.aspose.slides.internal.o9b.w1[] var6
   ) {
      this.l6.clear();
      com.aspose.slides.internal.o9b.w1.n5.n5(var5[0]);
      com.aspose.slides.internal.o9b.w1.n5.n5(var6[0]);
      double var7 = Double.MAX_VALUE;
      z3y var9 = new z3y(var1.y4());

      for (com.aspose.slides.internal.o9b.w1 var13 : var2) {
         if (!var9.l6(var13.u3())) {
            for (com.aspose.slides.internal.o9b.w1 var17 : var3) {
               float var18 = var17.l6() - var13.l6();
               float var19 = var17.k5() - var13.k5();
               double var20 = com.aspose.slides.ms.System.q1.z3(var18 * var18 + var19 * var19);
               if (var7 > var20) {
                  var7 = var20;
                  var17.n5(var6[0]);
                  var13.n5(var5[0]);
               }
            }
         }
      }

      if (com.aspose.slides.internal.o9b.w1.l6(var6[0], com.aspose.slides.internal.o9b.w1.n5)
         && com.aspose.slides.internal.o9b.w1.l6(var5[0], com.aspose.slides.internal.o9b.w1.n5)) {
         this.l6.addItem(var5[0].u3());
         float var22 = 4.0F;
         com.aspose.slides.internal.o9b.w1 var24 = new com.aspose.slides.internal.o9b.w1();
         boolean var23;
         if (var4) {
            com.aspose.slides.internal.o9b.w1[] var25 = new com.aspose.slides.internal.o9b.w1[]{var24};
            var23 = n5(var5[0].u3(), var9.u3().y4(), var25);
            var25[0].n5(var24);
         } else {
            com.aspose.slides.internal.o9b.w1[] var26 = new com.aspose.slides.internal.o9b.w1[]{var24};
            var23 = n5(var5[0].u3(), var9.u3().y4(), var22, var26);
            var26[0].n5(var24);
         }

         if (var23) {
            var24.n5(var6[0]);
            this.l6.addItem(var6[0].u3());
         } else {
            float var27 = var9.a6().l6() - var6[0].l6();
            if (com.aspose.slides.ms.System.q1.n5(var27) > var22) {
               if (var9.a6().l6() - var6[0].l6() > 0.0F) {
                  var22 *= -1.0F;
               }

               com.aspose.slides.internal.o9b.w1 var28 = var6[0].u3();
               var6[0] = new com.aspose.slides.internal.o9b.w1(var6[0].l6() + var22, var6[0].k5());
               this.l6.addItem(var6[0].u3());
               this.l6.addItem(var28.u3());
            } else {
               this.l6.addItem(var6[0].u3());
            }
         }

         var5[0].n5(this.k5);
         var6[0].n5(this.u3);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();
      if (this.l6.size() > 1) {
         com.aspose.slides.internal.o9b.w1 var2 = x5h.n5(this.l6.get_Item(0).u3(), this.p8(), this.f2()).u3();

         for (int var3 = 1; var3 < this.l6.size(); var3++) {
            com.aspose.slides.internal.o9b.w1 var4 = x5h.n5(this.l6.get_Item(var3).u3(), this.p8(), this.f2()).u3();
            var1.n5(var2.u3(), var4.u3());
            var4.n5(var2);
         }
      }

      this.n5(var1);
   }

   private static boolean n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.y1 var1, com.aspose.slides.internal.o9b.w1[] var2) {
      com.aspose.slides.internal.o9b.w1.n5.n5(var2[0]);
      if (var0.l6() >= var1.a6() && var0.l6() <= var1.h0()) {
         if (var0.k5() < var1.t2()) {
            var2[0] = new com.aspose.slides.internal.o9b.w1(var0.l6(), var1.t2());
         } else {
            var2[0] = new com.aspose.slides.internal.o9b.w1(var0.l6(), var1.l6());
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean n5(
      com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.y1 var1, float var2, com.aspose.slides.internal.o9b.w1[] var3
   ) {
      com.aspose.slides.internal.o9b.w1.n5.n5(var3[0]);
      float var4 = var1.a6() - var2;
      float var5 = var1.h0() + var2;
      if (var0.l6() >= var4 && var0.l6() <= var5) {
         float var6 = var1.x8() + var1.s7() / 2.0F;
         if (var0.k5() < var1.t2()) {
            var3[0] = new com.aspose.slides.internal.o9b.w1(var6, var1.t2());
         } else {
            var3[0] = new com.aspose.slides.internal.o9b.w1(var6, var1.l6());
         }

         return true;
      } else {
         return false;
      }
   }

   private void n5(com.aspose.slides.internal.x4g.s7 var1) {
      g3y var2 = this.n5.y4();
      LineFormat var3 = (LineFormat)((DataLabelCollection)var2.u9().getLabels()).getLeaderLinesFormat().getLine();
      com.aspose.slides.internal.o9b.c8 var4 = var2.t2().n3().n5((byte)(var2.t2().n3().getStyle() + 1 > 40 ? 1 : 0)).o8();
      w5k.n5(var4.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var1, var3, null, null);
   }

   final com.aspose.slides.internal.o9b.w1 h0() {
      return this.k5;
   }

   final com.aspose.slides.internal.o9b.w1 c8() {
      return this.u3;
   }
}
