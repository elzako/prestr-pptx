package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.ms.System.IDisposable;

class q3b extends e8s {
   private final w1g n5 = new w1g();
   private final e8s l6;
   private e8s k5;
   private k8l<g4v> u3;
   private d2k a6 = new d2k();
   private IPortionFormat u9;

   public q3b(MathRadical var1, c0e var2, w1g var3) {
      super(var1, var2);
      var3.k5++;
      var3.n5(this.n5);
      this.l6 = this.n5(var1.getBase(), var3.n5());
      if (!var1.getHideDegree()) {
         w1g var4 = var3.n5();
         float var5 = 0.64F;
         if (var3.h0) {
            var5 = 0.9F;
         }

         var4.a6 = var5 * var3.a6;
         var4.u9 = true;
         this.k5 = this.n5(var1.getDegree(), var4.n5());
      }

      this.u9 = var1.n5.l6();
   }

   public final MathRadical n5() {
      return (MathRadical)super.t2;
   }

   @Override
   public void n5(v1l var1) {
      c6v var2 = new c6v(var1.n5);

      try {
         var1.n5.n5(this.a6.n5, this.a6.l6);
         this.u3.n5(var1.n5, this.a6().l6.invoke((PortionFormat)this.u9));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      super.n5(var1.n5());
   }

   @Override
   protected y1m n5(d2k var1) {
      float var2 = this.n5.a6 / 96.0F;
      p1e var3 = this.a6().n5(this.a6().n5);
      y1m var4 = this.l6.u9().n5();
      n3y var5 = var4.l6.l6();
      float var6 = var5.n5() + var3.m3();
      if (!this.a6().l6() && var5.n5() + var3.m3() / 2.0F > var3.n5()) {
         var6 += var3.m3() * 1.7F;
      }

      if (this.n5.u3 > 0) {
         var6 = var5.n5() + var3.m3();
      }

      if (!this.a6().h0.n5() && this.n5.u3 > 0 && this.n5(this.h0)) {
         var6 = var5.n5() + var3.m3() * 2.1F;
      }

      if (this.a6().l6() && this.n5.u3 == 0) {
         var6 = var5.n5() + var3.m3() * 0.98F;
      }

      this.u3 = this.a6().n5().n5(this.n5.a6, var6, var4.n5);
      new d2k();
      new y1m();
      g4v var8 = this.u3.n5().n5();
      float var9 = var3.m3();
      float var10 = var8.k5 + var9;
      float var11 = var10 + (var8.l6 - var10 - var5.n5()) / 2.0F;
      d2k var16 = new d2k(var8.n5 - var4.n5, var11);
      d2k.k5.n5(this.a6);
      float var12 = var11 + var5.n5;
      y1m var7 = new y1m();
      var7.l6 = new n3y(var12, com.aspose.slides.ms.System.q1.n5((float)(var8.l6), (float)(var11 + var5.n5())) - var12);
      var7.n5 = var16.n5 + var4.n5;
      if (!n5(this.x8) && !com.aspose.slides.internal.v6g.k5.l6(this.x8, k3i.class)) {
         var16.l6 = var16.l6 + var3.k7();
         this.a6.l6 = this.a6.l6 + var3.k7();
         var7.l6.n5 = var7.l6.n5 + var3.k7();
         var7.l6.l6 = var7.l6.l6 - var3.k7();
      }

      if (this.n5().getHideDegree()) {
         this.l6.l6(var16.n5, var16.l6);
         return var7;
      }

      y1m var17 = this.k5.u9().n5();
      d2k var18 = new d2k(26.0F * var2 - var17.n5, 0.4F * this.u3.n5().l6 - var17.l6.n5());
      var10 = 0.0F;
      float[] var21 = new float[]{0.0F};
      n3y var22 = n3y.n5(var7.l6.l6(), var17.l6.n5(), var18.l6, var21).l6();
      var10 = var21[0];
      float var13 = 0.0F;
      if (var18.n5 < 0.0F) {
         var13 = -var18.n5;
      }

      float var14 = 7.0F * var2;
      var13 += var14;
      if (!n5(this.x8)) {
         var18.l6 = var18.l6 + var3.k7();
      }

      this.k5.l6(var18.n5 + var13, var18.l6 + var10);
      this.l6.l6(var16.n5 + var13, var16.l6 + var10);
      this.a6.l6 += var10;
      this.a6.n5 += var13;
      y1m var15 = new y1m();
      var22.n5(var15.l6);
      var15.n5 = var7.n5 + var13;
      return var15;
   }

   static boolean n5(e8s var0) {
      while (var0 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0, q3b.class)) {
            return true;
         }

         var0 = var0.x8;
      }

      return false;
   }

   private boolean n5(ReadOnlyCollection<e8s> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            e8s var3 = (e8s)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3, t7e.class) && this.n5(var3.h0)) {
               return true;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var3, q3b.class)) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }
}
