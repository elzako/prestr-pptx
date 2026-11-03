package com.aspose.slides.internal.b5j;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class t9 {
   private n3 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "rotate",
      "translate",
      "scale",
      "shear",
      "skew",
      "skewX",
      "skewY",
      "matrix",
      "xMinYMin",
      "xMinYMid",
      "xMinYMax",
      "xMidYMin",
      "xMidYMid",
      "xMidYMax",
      "xMaxYMin",
      "xMaxYMid"
   );

   public t9(n3 var1) {
      this.n5 = var1;
   }

   public static float[] n5(m1 var0) {
      float var1 = var0.n5()[0];
      float var2 = var0.n5()[1];
      float var3 = var0.n5()[2];
      float var4 = var0.n5()[3];
      float var5 = (float)q1.n5(q1.z3(var1 * var1 + var2 * var2));
      float var6 = (float)q1.n5(q1.z3(var3 * var3 + var4 * var4));
      return new float[]{var5, var6};
   }

   public final m1 n5(String var1, f2 var2) {
      try {
         m1 var3 = new m1();
         Dictionary var4 = this.l6(var1, var2.a6());

         for (int var5 = 0; var5 < var4.size(); var5++) {
            e2 var6 = (e2)var4.get_Item(var5);
            String var7 = var6.n5;
            float[] var8 = var6.l6;
            switch (l6.n5(var7)) {
               case 0:
                  var3.n5(var8[0]);
                  break;
               case 1:
                  var3.k5(var8[0], var8[1]);
                  break;
               case 2:
                  var3.n5(var8[0], var8[1]);
                  break;
               case 3:
                  var3.l6(var8[0], var8[1]);
                  break;
               case 4:
                  var3.l6((float)q1.t2(var8[0] / 180.0F * Math.PI), (float)q1.t2(var8[1] / 180.0F * Math.PI));
                  break;
               case 5:
                  var3.l6((float)q1.t2(var8[0] / 180.0F * Math.PI), (float)q1.t2(0.0));
                  break;
               case 6:
                  var3.l6((float)q1.t2(0.0), (float)q1.t2(var8[0] / 180.0F * Math.PI));
                  break;
               case 7:
                  var3.l6(new m1(var8[0], var8[1], var8[2], var8[3], var8[4], var8[5]));
            }
         }

         return var3;
      } catch (RuntimeException var9) {
         if (com.aspose.slides.internal.n1n.n5.n5) {
            return new m1();
         } else {
            throw var9;
         }
      }
   }

   public final Dictionary<Integer, e2> l6(String var1, f2 var2) {
      String[] var10000 = new String[]{"rotate", "translate", "scale", "shear", "skewX", "skewY", "skew", "matrix"};
      Dictionary var4 = new Dictionary();
      String[] var5 = d1.n5(var1, new String[]{")"}, 1);
      int var6 = 0;

      for (String var10 : var5) {
         String[] var11 = d1.n5(var10, new String[]{"("}, 1);
         if (var11.length == 2) {
            String var12 = d1.k5(var11[0], ' ', ',', '\r', '\n', '\t', '(', ')');
            String var13 = d1.n5(d1.n5(d1.n5(d1.n5(d1.k5(var11[1], ' ', ',', '\r', '\n', '\t', '(', ')'), "\r", ""), "\n", ""), "\t", ""), ",", " ");
            boolean var14 = !"translate".equals(var12) && !"matrix".equals(var12);
            String[] var15 = d1.n5(var13, new String[]{" "}, 1);
            if (var15.length == 1) {
               float var16 = this.n5(var15[0], var2.a6(), var14);
               float var17 = "translate".equals(var12) ? 0.0F : var16;
               var4.addItem(var6++, new e2(var12, new float[]{var16, var17}));
            }

            if (var15.length == 2) {
               float var24 = this.n5(var15[0], var2.a6(), var14);
               float var27 = this.n5(var15[1], var2.a6(), var14);
               var4.addItem(var6++, new e2(var12, new float[]{var24, var27}));
            } else if ("rotate".equals(var12) && var15.length >= 3) {
               float var26 = this.n5(var15[0], var2.a6(), true);
               float var29 = this.n5(var15[1], var2.a6(), false);
               float var30 = this.n5(var15[2], var2.a6(), false);
               var4.addItem(var6++, new e2("translate", new float[]{var29, var30}));
               var4.addItem(var6++, new e2("rotate", new float[]{var26}));
               var4.addItem(var6++, new e2("translate", new float[]{-var29, -var30}));
            } else if ("matrix".equals(var12) && var15.length >= 6) {
               float var25 = this.n5(var15[0], var2.a6(), true);
               float var28 = this.n5(var15[1], var2.a6(), true);
               float var18 = this.n5(var15[2], var2.a6(), true);
               float var19 = this.n5(var15[3], var2.a6(), true);
               float var20 = this.n5(var15[4], var2.a6(), false);
               float var21 = this.n5(var15[5], var2.a6(), false);
               var4.addItem(var6++, new e2("matrix", new float[]{var25, var28, var18, var19, var20, var21}));
            }
         }
      }

      return var4;
   }

   private float n5(String var1, f2 var2, boolean var3) {
      return var3 ? com.aspose.slides.internal.b3z.c8.n5(var1) : this.n5.n5(var1, d1.n5, null, var2.a6());
   }

   public final com.aspose.slides.internal.w0.c8 n5(float[] var1, float var2, float var3, String var4) {
      com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8();
      float var6 = var1[2] / var1[3];
      float var7 = var2 / var3;
      if ("none".equals(var4)) {
         var5.n5(var2 / var1[2], var3 / var1[3]);
         var5.l6(-var1[0], -var1[1]);
      } else if (var6 < var7) {
         float var8 = var3 / var1[3];
         var5.n5(var8, var8);
         switch (l6.n5(var4)) {
            case 8:
            case 9:
            case 10:
               var5.l6(-var1[0], -var1[1]);
               break;
            case 11:
            case 12:
            case 13:
               var5.l6(-var1[0] - (var1[2] - var2 * var1[3] / var3) / 2.0F, -var1[1]);
               break;
            default:
               var5.l6(-var1[0] - (var1[2] - var2 * var1[3] / var3), -var1[1]);
         }
      } else {
         float var9 = var2 / var1[2];
         var5.n5(var9, var9);
         switch (l6.n5(var4)) {
            case 8:
            case 11:
            case 14:
               var5.l6(-var1[0], -var1[1]);
               break;
            case 9:
            case 12:
            case 15:
               var5.l6(-var1[0], -var1[1] - (var1[3] - var3 * var1[2] / var2) / 2.0F);
               break;
            case 10:
            case 13:
            default:
               var5.l6(-var1[0], -var1[1] - (var1[3] - var3 * var1[2] / var2));
         }
      }

      return var5;
   }
}
