package com.aspose.slides.internal.y4u;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

public class y1 extends s7 {
   private com.aspose.slides.internal.g7i.n5 z8;
   private final Dictionary<y1$n5, double[]> j5 = new Dictionary<>();

   public final void n5(com.aspose.slides.internal.r1x.v3 var1, com.aspose.slides.internal.r1x.v3 var2, boolean var3, boolean var4) {
      this.z8 = new com.aspose.slides.internal.g7i.n5(true, var3, var4);

      try {
         this.z8.n5(var1.k5());
      } catch (com.aspose.slides.internal.d3l.h0 var7) {
         this.z8.n5(com.aspose.slides.internal.r1x.k7.n5().n5());
      }

      try {
         this.z8.n5(var2.k5());
      } catch (com.aspose.slides.internal.d3l.h0 var6) {
         this.z8.n5(com.aspose.slides.internal.r1x.k7.l6().n5());
      }
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      if (this.z8 == null) {
         throw new ArgumentNullException("converter");
      }

      int var9 = this.n3.z3();
      int var10 = this.u3.z3();
      double[] var11 = new double[var9];
      double[] var12 = new double[var10];
      int var13 = var2;
      int var14 = var7;

      for (int var15 = 0; var15 < var5; var15++) {
         int var16 = var13;
         int var17 = var14;

         for (int var18 = 0; var18 < var4; var18++) {
            for (int var19 = 0; var19 < var9; var19++) {
               var11[var19] = (var1[var16++] & 0xFF) / 255.0;
            }

            this.n5(var11, var12);

            for (int var20 = 0; var20 < var10; var20++) {
               var6[var17++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var12[var20] * 255.0), 14);
            }
         }

         var13 += this.s7;
         var14 += var8;
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.o9b.y2 var1, byte[][] var2, int var3, int var4, int var5, int var6, byte[] var7, int var8, int var9, int var10) {
      if (this.z8 == null) {
         throw new ArgumentNullException("The converter is null");
      }

      int var11 = this.n3.z3();
      int var12 = this.u3.z3();
      double[] var13 = new double[var11];
      double[] var14 = new double[var12];
      int var15 = var3;
      int var16 = var8;

      for (int var17 = 0; var17 < var6; var17++) {
         int var18 = var16;

         for (int var19 = var1.u3(); var19 < var1.u9(); var19++) {
            int var20 = var15 + var19;

            for (int var21 = 0; var21 < var11; var21++) {
               var13[var21] = (var2[var21][var20] & 0xFF) / 255.0;
            }

            this.n5(var13, var14);

            for (int var22 = 0; var22 < var12; var22++) {
               var7[var18++] = com.aspose.slides.internal.v6g.k5.n5((Object)(var14[var22] * 255.0), 14);
            }
         }

         var15 += var10;
         var16 += var9;
      }
   }

   protected final void n5(double[] var1, double[] var2) {
      y1$n5 var3 = new y1$n5(var1);
      double[] var4 = null;
      double[][] var5 = new double[][]{var4};
      boolean var6 = this.j5.tryGetValue(var3, var5);
      var4 = var5[0];
      if (var6) {
         com.aspose.slides.ms.System.y4.n5(var4, 0, var2, 0, var4.length * com.aspose.slides.internal.v6g.k5.n5(14));
      } else {
         this.z8.n5(var1, var2);
         this.j5.set_Item(var3, com.aspose.slides.internal.r1x.k5.n5(var2));
      }
   }
}
