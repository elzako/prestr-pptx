package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

final class v4n extends e8s {
   private final p1e n5;
   private final e8s l6;
   private final e8s k5;
   private final e8s u3;

   public v4n(BaseScript var1, c0e var2, w1g var3) {
      super(var1, var2);
      this.n5 = this.a6().n5(var3.a6);
      this.l6 = this.n5(var1.getBase(), var3.n5());
      w1g var4 = var3.n5();
      var4.l6++;
      float var5 = g5s.n5(var3.l6, var4.l6, this.n5);
      var4.a6 = var5 * var3.a6;
      this.u3 = this.n5(this.l6(), var4.n5());
      this.k5 = this.n5(this.n5(), var4.n5());
   }

   public final IMathElement n5() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t2, MathRightSubSuperscriptElement.class)) {
         return ((MathRightSubSuperscriptElement)this.t2).getSuperscript();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.t2, MathLeftSubSuperscriptElement.class)) {
         return ((MathLeftSubSuperscriptElement)this.t2).getSuperscript();
      } else {
         throw new NotImplementedException();
      }
   }

   public final IMathElement l6() {
      if (com.aspose.slides.internal.v6g.k5.l6(this.t2, MathRightSubSuperscriptElement.class)) {
         return ((MathRightSubSuperscriptElement)this.t2).getSubscript();
      } else if (com.aspose.slides.internal.v6g.k5.l6(this.t2, MathLeftSubSuperscriptElement.class)) {
         return ((MathLeftSubSuperscriptElement)this.t2).getSubscript();
      } else {
         throw new NotImplementedException();
      }
   }

   @Override
   protected y1m n5(d2k var1) {
      return com.aspose.slides.internal.v6g.k5.l6(this.t2, MathLeftSubSuperscriptElement.class) ? this.k5() : this.u3();
   }

   private y1m k5() {
      y1m var1 = this.l6.u9().n5();
      y1m var2 = this.u3.u9().n5();
      y1m var3 = this.k5.u9().n5();
      float var4 = 0.0F;
      float var5 = 0.0F;
      float[] var6 = new float[]{0.0F};
      float[] var7 = new float[]{0.0F};
      this.n5(var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      n3y var8 = d5w.n5(var1.l6.l6(), var2.l6.l6(), var3.l6.l6(), var5, var4).l6();
      float var9 = var1.l6.n5 - var3.l6.n5 - var4;
      float var10 = var1.l6.n5 - var2.l6.n5 + var5;
      float var11 = var8.n5 - var1.l6.n5;
      float var12 = this.n5.t9();
      this.k5.l6(var12, var9 + var11);
      this.u3.l6(var12, var10 + var11);
      float var13 = var12 + com.aspose.slides.ms.System.q1.n5((float)(var3.n5), (float)(var2.n5)) + this.n5.t9();
      this.l6.l6(var13, var11);
      y1m var14 = new y1m();
      var14.n5 = var13 + var1.n5;
      var8.n5(var14.l6);
      return var14;
   }

   private y1m u3() {
      y1m var1 = this.l6.u9().n5();
      y1m var2 = this.u3.u9().n5();
      y1m var3 = this.k5.u9().n5();
      float var4 = 0.0F;
      float var5 = 0.0F;
      float[] var6 = new float[]{0.0F};
      float[] var7 = new float[]{0.0F};
      this.n5(var6, var7);
      var4 = var6[0];
      var5 = var7[0];
      n3y var8 = d5w.n5(var1.l6.l6(), var2.l6.l6(), var3.l6.l6(), var5, var4).l6();
      float var9 = var1.n5 + this.n5.t9();
      float var10 = var1.l6.n5 - var3.l6.n5 - var4;
      float var11 = var1.l6.n5 - var2.l6.n5 + var5;
      float var12 = var8.n5 - var1.l6.n5;
      this.k5.l6(var9, var10 + var12);
      this.u3.l6(var9, var11 + var12);
      this.l6.l6(0.0F, var12);
      y1m var13 = new y1m();
      var8.n5(var13.l6);
      var13.n5 = var9 + com.aspose.slides.ms.System.q1.n5((float)(var3.n5), (float)(var2.n5));
      return var13;
   }

   private void n5(float[] var1, float[] var2) {
      y1m var3 = this.l6.u9().n5();
      y1m var4 = this.u3.u9().n5();
      y1m var5 = this.k5.u9().n5();
      j6m var6 = new j6m();
      var6.n5 = this.n5.n3();
      var6.l6 = this.n5.e2();
      var6.k5 = this.n5.y4();
      var1[0] = d5w.n5(var3.l6.l6(), var5.l6.l6(), var6.n5()) * 1.1F;
      k6n var7 = new k6n();
      var7.k5 = this.n5.m1();
      var7.n5 = this.n5.q0();
      var7.l6 = this.n5.z3();
      var2[0] = d5w.n5(0.0F, var4.l6.l6(), var7.n5()) * 1.1F;
   }
}
