package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.d2;
import com.aspose.slides.ms.System.q1;

public class y4 extends s7 {
   private final com.aspose.slides.internal.w0.h0 u3;
   private final u3 a6;
   private static final float[] u9 = new float[]{0.0F, 1.0F};
   private static final float[] h0 = new float[]{0.0F, 1.0F};

   public y4(com.aspose.slides.internal.z4.c8 var1, com.aspose.slides.internal.w0.h0 var2) {
      super(var1);
      this.u3 = var2;
      this.a6 = this.z1();
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.n5("/Shading");
      var1.c8();
      var1.n5("/ShadingType", 2);
      w1[] var2 = n5(this.u3);
      var1.n5("/Extend", new boolean[]{true, true});
      var1.k5("/ColorSpace", d1.n5(new String[]{"/", com.aspose.slides.internal.f1s.l6.l6().a6()}));
      var1.n5("/Coords", new float[]{var2[0].l6(), var2[0].k5(), var2[1].l6(), var2[1].k5()});
      var1.k5("/Function", this.a6.t2());
      var1.t2();
      this.k5(var1);
   }

   public static w1[] n5(com.aspose.slides.internal.w0.h0 var0) {
      y1 var1 = var0.a6().y4();
      double var2 = d2.k5(var0.t2()) ? 0.0 : var0.t2();
      double var4 = (360.0 - var2) % 360.0 * Math.PI / 180.0 * -1.0;
      double var6 = q1.c8(var4);
      double var8 = q1.h0(var4);
      double var10 = var1.x8() + var1.s7() / 2.0;
      double var12 = var1.n3() + var1.k5() / 2.0;
      double var14 = q1.n5(var1.s7() * var6) + q1.n5(var1.k5() * var8);
      double var16 = var14 / 2.0;
      if (var2 % 90.0 != 0.0) {
         var16 += q1.k5(3.0, q1.l6(1.0, var14 * 0.01));
      }

      return new w1[]{
         new w1((float)(var10 - var6 * var16), (float)(var12 - var8 * var16)), new w1((float)(var10 + var6 * var16), (float)(var12 + var8 * var16))
      };
   }

   private u3 z1() {
      boolean var1 = true;
      byte var2 = 3;
      int var5;
      float[][] var6;
      if (this.u3.l6() == null) {
         float[] var3 = this.u3.k5();
         if (var3 == null) {
            var3 = u9;
         }

         float[] var4 = this.u3.u3();
         if (var4 == null) {
            var4 = h0;
         }

         var5 = var3.length + 1;
         var6 = new float[var5][];

         for (int var7 = 0; var7 < var5; var7++) {
            var6[var7] = new float[4];
         }

         var6[var5 - 1][0] = 1.0F;

         for (int var16 = 0; var16 < 3; var16++) {
            var6[var5 - 1][var16 + 1] = n5(this.u3.h0(), var16);
         }

         for (int var17 = 0; var17 < var5 - 1; var17++) {
            float var8 = var3[var17];
            if (var8 <= 1.0F) {
               var6[var17][0] = var8;
            }

            for (int var9 = 0; var9 < 3; var9++) {
               float var10 = var4[var17] * n5(this.u3.h0(), var9);
               float var11 = 1.0F - var4[var17];
               float var12 = n5(this.u3.u9(), var9);
               var6[var17][var9 + 1] = var10 + var11 * var12;
            }
         }
      } else {
         var5 = this.u3.l6().length;
         var6 = new float[var5][];

         for (int var13 = 0; var13 < var5; var13++) {
            var6[var13] = new float[4];
         }

         for (int var14 = 0; var14 < var5; var14++) {
            var6[var14][0] = this.u3.l6()[var14].l6();

            for (int var15 = 0; var15 < 3; var15++) {
               com.aspose.slides.internal.p1s.n5 var18 = this.u3.l6()[var14].n5();
               var6[var14][var15 + 1] = n5(var18, var15);
            }
         }
      }

      return n3.n5(this.l6, var6, var5, 1, 3);
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      this.l6(var1);
      var1.t2();
      var1.l6();
      this.a6.n5(var1);
   }

   private static float n5(com.aspose.slides.internal.p1s.n5 var0, int var1) {
      int var2;
      switch (var1) {
         case 0:
            var2 = var0.k5();
            break;
         case 1:
            var2 = var0.u3();
            break;
         case 2:
            var2 = var0.a6();
            break;
         default:
            throw new ArgumentOutOfRangeException();
      }

      return (float)(var2 / 255.0);
   }

   @Override
   protected int n5() {
      return 2;
   }

   @Override
   protected com.aspose.slides.internal.w0.c8 l6() {
      return this.u3.n3();
   }
}
