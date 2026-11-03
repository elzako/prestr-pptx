package com.aspose.slides.internal.b8n;

import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;

public class l6$n5 {
   private static final int[] n5 = new int[]{0, 3, 1, 3};
   private static final double[][] l6 = new double[4][];
   private static final double[][] k5 = new double[4][];
   private static final double[][] u3 = new double[4][];
   private static final double[][] a6 = new double[4][];

   public static c4 n5(y1 var0, w1 var1, w1 var2) {
      return n5(l6, var0.y4(), var1.u3(), var2.u3());
   }

   public static c4 l6(y1 var0, w1 var1, w1 var2) {
      return n5(k5, var0.y4(), var1.u3(), var2.u3());
   }

   public static c4 k5(y1 var0, w1 var1, w1 var2) {
      return n5(u3, var0.y4(), var1.u3(), var2.u3());
   }

   public static c4 u3(y1 var0, w1 var1, w1 var2) {
      return n5(a6, var0.y4(), var1.u3(), var2.u3());
   }

   private static c4 n5(double[][] var0, y1 var1, w1 var2, w1 var3) {
      w1 var4 = w1.n5.u3();
      c4 var5 = new c4();
      int var6 = 0;

      for (int var7 = 0; var7 <= var0.length; var7++) {
         float[] var8 = new float[6];
         if (var7 == var0.length) {
            break;
         }

         int var9 = 0;
         double[] var10 = var0[var7];
         float var11 = q1.l6(var1.s7(), var7 <= 1 ? var2.l6() : var3.l6());
         float var12 = q1.l6(var1.k5(), var7 <= 1 ? var2.k5() : var3.k5());

         for (int var13 = 0; var13 < var10.length; var13 += 4) {
            var8[var9++] = (float)(var1.x8() + var10[var13 + 0] * var1.s7() + var10[var13 + 1] * var11);
            var8[var9++] = (float)(var1.n3() + var10[var13 + 2] * var1.k5() + var10[var13 + 3] * var12);
         }

         switch (n5[var7]) {
            case 0:
               var4 = new w1(var8[0], var8[1]);
               break;
            case 1:
               w1 var17 = new w1(var8[0], var8[1]);
               var5.l6(var4.u3(), var17.u3());
               var17.n5(var4);
            case 2:
            default:
               break;
            case 3:
               w1 var16 = new w1(var8[4], var8[5]);
               com.aspose.slides.internal.e1.a6 var14 = new com.aspose.slides.internal.e1.a6(
                  var4.u3(), new w1(var8[0], var8[1]), new w1(var8[2], var8[3]), var16.u3()
               );
               var16.n5(var4);
               var5.n5(var14);
               var6++;
         }
      }

      return var5;
   }

   static {
      double var0 = 0.5 - 0.6666666666666666 * (q1.z3(2.0) - 1.0);
      l6[0] = new double[]{0.0, 0.0, 0.0, 0.5};
      l6[1] = new double[]{0.0, 0.0, 0.0, var0, 0.0, var0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0};
      l6[2] = new double[]{1.0, -0.5, 0.0, 0.0};
      l6[3] = new double[]{1.0, -var0, 0.0, 0.0, 1.0, 0.0, 0.0, var0, 1.0, 0.0, 0.0, 0.5};
      k5[0] = new double[]{1.0, -0.5, 0.0, 0.0};
      k5[1] = new double[]{1.0, -var0, 0.0, 0.0, 1.0, 0.0, 0.0, var0, 1.0, 0.0, 0.0, 0.5};
      k5[2] = new double[]{1.0, 0.0, 1.0, -0.5};
      k5[3] = new double[]{1.0, 0.0, 1.0, -var0, 1.0, -var0, 1.0, 0.0, 1.0, -0.5, 1.0, 0.0};
      u3[0] = new double[]{1.0, 0.0, 1.0, -0.5};
      u3[1] = new double[]{1.0, 0.0, 1.0, -var0, 1.0, -var0, 1.0, 0.0, 1.0, -0.5, 1.0, 0.0};
      u3[2] = new double[]{0.0, 0.5, 1.0, 0.0};
      u3[3] = new double[]{0.0, var0, 1.0, 0.0, 0.0, 0.0, 1.0, -var0, 0.0, 0.0, 1.0, -0.5};
      a6[0] = new double[]{0.0, 0.5, 1.0, 0.0};
      a6[1] = new double[]{0.0, var0, 1.0, 0.0, 0.0, 0.0, 1.0, -var0, 0.0, 0.0, 1.0, -0.5};
      a6[2] = new double[]{0.0, 0.0, 0.0, 0.5};
      a6[3] = new double[]{0.0, 0.0, 0.0, var0, 0.0, var0, 0.0, 0.0, 0.0, 0.5, 0.0, 0.0};
   }
}
