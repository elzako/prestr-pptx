package com.aspose.slides.internal.p5k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.q1;

public class k7 extends com.aspose.slides.internal.e1.y4 {
   private com.aspose.slides.internal.o9b.w1 n5;
   private final r4 l6;
   private boolean k5;
   private boolean u3;
   private List<com.aspose.slides.internal.o9b.w1> a6;
   private double u9;
   private float[] h0;

   public k7(l6 var1) {
      this(new r4(var1));
   }

   public k7(r4 var1) {
      this.n5 = com.aspose.slides.internal.o9b.w1.n5.u3();
      this.a6 = new List<>();
      this.l6 = var1;
   }

   public final void k5(com.aspose.slides.internal.e1.r4 var1) {
      this.l6(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c4 var1) {
      this.k5 = true;
      this.u3 = var1.n5();
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.c4 var1) {
      if (var1.n5()) {
         this.n5();
      }

      if (this.a6.size() > 0) {
         float[] var2 = new float[this.h0.length];

         for (int var3 = 0; var3 < this.h0.length; var3++) {
            var2[var3] = this.h0[var3] * (float)this.u9;
         }

         for (int var7 = 0; var7 < this.a6.size() - 1; var7++) {
            double var4 = var2[var7 % var2.length];

            for (int var6 = var7 + 1;
               var6 < this.a6.size()
                  && q1.a6(this.a6.get_Item(var6).l6() - this.a6.get_Item(var7).l6(), 2.0)
                        + q1.a6(this.a6.get_Item(var6).k5() - this.a6.get_Item(var7).k5(), 2.0)
                     < var4 * var4;
               var6++
            ) {
               this.a6.removeAt(var6--);
            }
         }

         for (int var8 = 0; var8 < this.a6.size() - 1; var8++) {
            if (var8 % 2 == 0) {
               this.n5(this.a6.get_Item(var8++).u3());
               this.l6(this.a6.get_Item(var8).u3());
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      if (var1.n5().size() > 0) {
         int var2 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6() == null ? 0 : ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().s7();
         if (var2 != 0 && !this.u3) {
            this.u9 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().l6();
            this.h0 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().x8();

            for (int var5 = 0; var5 < var1.n5().size() - 1; var5++) {
               this.n5(
                  new com.aspose.slides.internal.o9b.w1[]{
                     var1.n5().get_Item(var5), var1.n5().get_Item(var5++), var1.n5().get_Item(var5), var1.n5().get_Item(var5)
                  }
               );
            }
         } else {
            if (this.k5) {
               var1.n5().get_Item(0).n5(this.n5);
               this.n5(this.n5.u3());
               this.k5 = false;
            }

            for (int var3 = 0; var3 < var1.n5().size(); var3++) {
               com.aspose.slides.internal.o9b.w1 var4 = var1.n5().get_Item(var3).u3();
               this.l6(var4.u3());
            }
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      int var2 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6() == null ? 0 : ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().s7();
      if (var2 != 0) {
         this.u9 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().l6();
         this.h0 = ((com.aspose.slides.internal.e1.r4)var1.y2().y2()).l6().x8();
         this.n5(new com.aspose.slides.internal.o9b.w1[]{var1.n5().n5(), var1.n5().l6(), var1.n5().k5(), var1.n5().u3()});
      } else {
         if (this.k5) {
            var1.n5().n5().n5(this.n5);
            this.n5(this.n5.u3());
            this.k5 = false;
         } else {
            this.l6(var1.n5().n5().u3());
         }

         com.aspose.slides.internal.e1.y1[] var3 = var1.n5().a6();

         for (com.aspose.slides.internal.e1.y1 var7 : var3) {
            this.n5(var7.n5().u3(), var7.l6().u3());
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1[] var1) {
      double var2 = 0.0;
      List var4 = new List();
      byte var5 = 40;
      float var6 = 1.0F / var5;
      float var7 = 0.0F;

      for (int var8 = 0; var8 <= var5; var8++) {
         var4.addItem(this.n5(var1, var7).u3());
         var7 += var6;
      }

      for (int var12 = 0; var12 < var4.size() - 1; var12++) {
         var2 += q1.z3(
            q1.a6(((com.aspose.slides.internal.o9b.w1)var4.get_Item(var12 + 1)).l6() - ((com.aspose.slides.internal.o9b.w1)var4.get_Item(var12)).l6(), 2.0)
               + q1.a6(((com.aspose.slides.internal.o9b.w1)var4.get_Item(var12 + 1)).k5() - ((com.aspose.slides.internal.o9b.w1)var4.get_Item(var12)).k5(), 2.0)
         );
      }

      int var13 = com.aspose.slides.internal.v6g.k5.u3(var2 + 1.0, 14) * 3;
      var6 = 1.0F / var13;
      var7 = 0.0F;
      var4.clear();

      for (int var9 = 0; var9 <= var13; var9++) {
         var4.addItem(this.n5(var1, var7).u3());
         var7 += var6;
      }

      this.a6.addRange(com.aspose.slides.ms.System.u3.n5((com.aspose.slides.internal.o9b.w1[])var4.toArray(new com.aspose.slides.internal.o9b.w1[0])));
   }

   private com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1[] var1, float var2) {
      float var3 = (1.0F - var2) * (1.0F - var2) * (1.0F - var2);
      float var4 = (1.0F - var2) * (1.0F - var2) * 3.0F * var2;
      float var5 = (1.0F - var2) * var2 * 3.0F * var2;
      float var6 = var2 * var2 * var2;
      float var7 = var3 * var1[0].l6() + var4 * var1[1].l6() + var5 * var1[2].l6() + var6 * var1[3].l6();
      float var8 = var3 * var1[0].k5() + var4 * var1[1].k5() + var5 * var1[2].k5() + var6 * var1[3].k5();
      return new com.aspose.slides.internal.o9b.w1(var7, var8);
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1) {
      this.l6.n5(com.aspose.slides.internal.n2d.t4.n5(var1.l6()), com.aspose.slides.internal.n2d.t4.n5(var1.k5()));
   }

   private void l6(com.aspose.slides.internal.o9b.w1 var1) {
      int var2 = com.aspose.slides.internal.n2d.t4.n5(var1.l6()) - this.l6.u3();
      int var3 = com.aspose.slides.internal.n2d.t4.n5(var1.k5()) - this.l6.a6();
      if (var2 != 0 || var3 != 0) {
         this.l6.l6(var2, var3);
      }
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      int var3 = com.aspose.slides.internal.n2d.t4.n5(var1.l6()) - this.l6.u3();
      int var4 = com.aspose.slides.internal.n2d.t4.n5(var1.k5()) - this.l6.a6();
      int var5 = com.aspose.slides.internal.n2d.t4.n5(var2.l6()) - com.aspose.slides.internal.n2d.t4.n5(var1.l6());
      int var6 = com.aspose.slides.internal.n2d.t4.n5(var2.k5()) - com.aspose.slides.internal.n2d.t4.n5(var1.k5());
      this.l6.n5(var3, var4, var5, var6);
   }

   private void n5() {
      this.l6.l6(com.aspose.slides.internal.n2d.t4.n5(this.n5.l6()) - this.l6.u3(), com.aspose.slides.internal.n2d.t4.n5(this.n5.k5()) - this.l6.a6());
   }
}
