package com.aspose.slides.internal.v1y;

import com.aspose.slides.internal.o9b.w1;

public class t2 extends n5<k5> {
   private int u3;

   public t2(com.aspose.slides.internal.t9z.h0 var1, int var2) {
      super(var1);
      this.u3 = var2;
   }

   protected float l6() {
      switch (this.u3) {
         case 17:
            return 0.725F * this.l6.q0();
         case 18:
            return this.l6.q0();
         case 19:
            return this.l6.q0();
         case 20:
            return (float)Math.sqrt(3.0) * this.l6.q0();
         default:
            return 0.0F;
      }
   }

   protected float k5() {
      switch (this.u3) {
         case 17:
         case 18:
         case 19:
            return 0.0F;
         case 20:
            return this.l6() / 2.0F;
         default:
            return 0.0F;
      }
   }

   @Override
   protected k5 n5() {
      k5 var1 = new k5();
      var1.l6 = this.l6();
      return var1;
   }

   @Override
   protected void l6(k5 var1) {
      float var2 = var1.h0[0];
      float var3 = var1.h0[1];
      float var4 = var1.a6;
      float var5 = var1.u9;
      double var6 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var2, var3);
      float var8 = this.k5();
      if (var6 < var1.l6 && Math.abs(var8) < var1.l6) {
         float[] var13 = this.k5.n5(var1.k5, var1.u3, var2, var3);
         var1.c8 = new w1(var13[0], var13[1]);
      } else {
         w1 var9 = new w1(var1.k5, var1.u3);
         w1 var10 = this.n5(var1.l6, var1.k5, var1.u3, var4, var5, var2, var3);
         w1 var11 = var9;
         if (var8 != 0.0F) {
            var11 = com.aspose.slides.internal.e3j.u9.n5(new com.aspose.slides.internal.e3j.u3(var9, var10), var9, var10, var8);
         }

         if (var1.k5 == var4 && var1.u3 == var5) {
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var11.l6(), var11.k5()));
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
         } else {
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var11.l6(), var11.k5()));
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var10.l6(), var10.k5()));
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
         }

         float[] var12 = this.k5.n5(var1.k5, var1.u3, var10.l6(), var10.k5());
         var1.c8 = new w1(var12[0], var12[1]);
         var1.x8 = true;
      }

      this.n5(var1, var2, var3);
   }

   @Override
   protected void k5(k5 var1) {
      float var2 = var1.h0[0];
      float var3 = var1.h0[1];
      float var4 = var1.h0[2];
      float var5 = var1.h0[3];
      double var6 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var4, var5);
      float var8 = this.k5();
      if (var6 < var1.l6 && Math.abs(var8) < var1.l6) {
         float[] var18 = this.k5.n5(var1.k5, var1.u3, var4, var5);
         var1.c8 = new w1(var18[0], var18[1]);
      } else {
         float var9 = this.n5(var1.l6, var1.k5, var1.u3, var1.a6, var1.u9, var2, var3, var4, var5);
         w1 var10 = com.aspose.slides.internal.e3j.u9.l6(var9, var1.a6, var1.u9, var2, var3, var4, var5);
         w1 var11 = new w1(var1.k5, var1.u3);
         w1 var12 = var11;
         if (var8 != 0.0F) {
            var12 = com.aspose.slides.internal.e3j.u9.n5(new com.aspose.slides.internal.e3j.u3(var11, var10), var11, var10, var8);
         }

         var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var12.l6(), var12.k5()));
         var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var10.l6(), var10.k5()));
         float[] var13 = new float[8];
         float[] var14 = new float[8];
         com.aspose.slides.internal.k3w.l6.n5(var9, new float[]{var1.a6, var1.u9, var2, var3, var4, var5}, 0, var13, 0, var14, 0);
         var2 = var14[2];
         var3 = var14[3];
         var4 = var14[4];
         var5 = var14[5];
         var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5));
         float[] var15 = this.k5.n5(var1.k5, var1.u3, var10.l6(), var10.k5());
         var1.c8 = new w1(var15[0], var15[1]);
         var1.x8 = true;
      }

      this.n5(var1, var4, var5);
   }

   @Override
   protected void u3(k5 var1) {
      float var2 = var1.h0[0];
      float var3 = var1.h0[1];
      float var4 = var1.h0[2];
      float var5 = var1.h0[3];
      float var6 = var1.h0[4];
      float var7 = var1.h0[5];
      double var8 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var6, var7);
      float var10 = this.k5();
      if (var8 < var1.l6 && Math.abs(var10) < var1.l6) {
         float[] var22 = this.k5.n5(var1.k5, var1.u3, var6, var7);
         var1.c8 = new w1(var22[0], var22[1]);
      } else {
         float var11 = this.n5(var1.l6, var1.k5, var1.u3, var1.a6, var1.u9, var2, var3, var4, var5, var6, var7);
         w1 var12 = com.aspose.slides.internal.e3j.u9.n5(var11, var1.a6, var1.u9, var2, var3, var4, var5, var6, var7);
         w1 var13 = new w1(var1.k5, var1.u3);
         w1 var14 = var13;
         if (var10 != 0.0F) {
            var14 = com.aspose.slides.internal.e3j.u9.n5(new com.aspose.slides.internal.e3j.u3(var13, var12), var13, var12, var10);
         }

         var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var14.l6(), var14.k5()));
         var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var12.l6(), var12.k5()));
         float[] var15 = new float[8];
         float[] var16 = new float[8];
         com.aspose.slides.internal.k3w.l6.n5(var11, new float[]{var1.a6, var1.u9, var2, var3, var4, var5, var6, var7}, 0, var15, 0, var16, 0);
         var2 = var16[2];
         var3 = var16[3];
         var4 = var16[4];
         var5 = var16[5];
         var6 = var16[6];
         var7 = var16[7];
         var1.t2.l6(com.aspose.slides.internal.v9l.l6.n5(var2, var3, var4, var5, var6, var7));
         float[] var17 = this.k5.n5(var1.k5, var1.u3, var12.l6(), var12.k5());
         var1.c8 = new w1(var17[0], var17[1]);
         var1.x8 = true;
      }

      var1.a6 = var6;
      var1.u9 = var7;
   }
}
