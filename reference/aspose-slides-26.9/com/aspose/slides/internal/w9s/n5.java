package com.aspose.slides.internal.w9s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.b5j.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.s7;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.q1;

public class n5 {
   public static s7 n5(List<c8> var0) {
      s7 var1 = new s7();
      if (var0 != null && var0.size() != 0) {
         w1 var2 = new w1(0.0F, 0.0F);
         w1 var3 = new w1(0.0F, 0.0F);
         o5 var4 = new o5();
         o5 var5 = new o5();
         List$Enumerator var6 = var0.iterator();

         try {
            while (var6.hasNext()) {
               c8 var7 = (c8)var6.next();
               new List();
               boolean var9 = false;
               boolean var10 = false;
               switch (var7.n5) {
                  case 0:
                  case 1:
                     w1 var31 = n5(var3.u3(), var7, var7.n5()).u3();
                     var31.n5(var3);
                     var31.n5(var2);
                     var1.t9();
                     break;
                  case 2:
                     var2.n5(var3);
                     var1.n3();
                     break;
                  case 3:
                  case 4:
                     for (int var30 = 0; var30 < var7.l6.size(); var30 += 2) {
                        w1 var40 = var3.u3();
                        n5(var40.u3(), var7.l6.get_Item(var30), var7.l6.get_Item(var30 + 1), var7.n5()).n5(var3);
                        var1.n5(var40.u3(), var3.u3());
                     }
                     break;
                  case 5:
                     for (int var29 = 0; var29 < var7.l6.size(); var29++) {
                        w1 var39 = var3.u3();
                        n5(var39.u3(), var7.l6.get_Item(var29), var3.k5(), true).n5(var3);
                        var1.n5(var39.u3(), var3.u3());
                     }
                     break;
                  case 6:
                     for (int var28 = 0; var28 < var7.l6.size(); var28++) {
                        w1 var38 = var3.u3();
                        n5(var38.u3(), var7.l6.get_Item(var28), 0.0F, false).n5(var3);
                        var1.n5(var38.u3(), var3.u3());
                     }
                     break;
                  case 7:
                     for (int var27 = 0; var27 < var7.l6.size(); var27++) {
                        w1 var37 = var3.u3();
                        n5(var37.u3(), var3.l6(), var7.l6.get_Item(var27), true).n5(var3);
                        var1.n5(var37.u3(), var3.u3());
                     }
                     break;
                  case 8:
                     for (int var26 = 0; var26 < var7.l6.size(); var26++) {
                        w1 var36 = var3.u3();
                        n5(var36.u3(), 0.0F, var7.l6.get_Item(var26), false).n5(var3);
                        var1.n5(var36.u3(), var3.u3());
                     }
                     break;
                  case 9:
                  case 10:
                     for (int var25 = 0; var25 < var7.l6.size(); var25 += 6) {
                        w1 var35 = var3.u3();
                        w1 var44 = n5(var35.u3(), var7.l6.get_Item(var25), var7.l6.get_Item(var25 + 1), var7.n5()).u3();
                        w1 var48 = n5(var35.u3(), var7.l6.get_Item(var25 + 2), var7.l6.get_Item(var25 + 3), var7.n5()).u3();
                        w1 var50 = n5(var35.u3(), var7.l6.get_Item(var25 + 4), var7.l6.get_Item(var25 + 5), var7.n5()).u3();
                        var1.n5(var35.u3(), var44.u3(), var48.u3(), var50.u3());
                        var50.n5(var3);
                        var4 = new o5<>(var48.u3());
                        var9 = true;
                     }
                     break;
                  case 11:
                  case 12:
                     for (int var24 = 0; var24 < var7.l6.size(); var24 += 4) {
                        w1 var34 = var3.u3();
                        w1 var43 = (var4.l6() ? n5(((w1)var4.n5()).u3(), var34.u3()) : var34).u3();
                        w1 var47 = n5(var34.u3(), var7.l6.get_Item(var24), var7.l6.get_Item(var24 + 1), var7.n5()).u3();
                        w1 var49 = n5(var34.u3(), var7.l6.get_Item(var24 + 2), var7.l6.get_Item(var24 + 3), var7.n5()).u3();
                        var1.n5(var34.u3(), var43.u3(), var47.u3(), var49.u3());
                        var49.n5(var3);
                        var4 = new o5<>(var47.u3());
                        var9 = true;
                     }
                     break;
                  case 13:
                  case 14:
                     for (int var23 = 0; var23 < var7.l6.size(); var23 += 4) {
                        w1 var33 = var3.u3();
                        w1 var42 = n5(var33.u3(), var7.l6.get_Item(var23), var7.l6.get_Item(var23 + 1), var7.n5()).u3();
                        w1 var46 = n5(var33.u3(), var7.l6.get_Item(var23 + 2), var7.l6.get_Item(var23 + 3), var7.n5()).u3();
                        n5(var1, var33.u3(), var42.u3(), var46.u3());
                        var46.n5(var3);
                        var5 = new o5<>(var42.u3());
                        var10 = true;
                     }
                     break;
                  case 15:
                  case 16:
                     for (int var22 = 0; var22 < var7.l6.size(); var22 += 2) {
                        w1 var32 = var3.u3();
                        w1 var41 = (var5.l6() ? n5(((w1)var5.n5()).u3(), var32.u3()) : var32).u3();
                        w1 var45 = n5(var32.u3(), var7.l6.get_Item(var22), var7.l6.get_Item(var22 + 1), var7.n5()).u3();
                        n5(var1, var32.u3(), var41.u3(), var45.u3());
                        var45.n5(var3);
                        var5 = new o5<>(var41.u3());
                        var10 = true;
                     }
                     break;
                  case 17:
                  case 18:
                     for (int var11 = 0; var11 < var7.l6.size(); var11 += 7) {
                        w1 var12 = var3.u3();
                        float var13 = var7.l6.get_Item(var11);
                        float var14 = var7.l6.get_Item(var11 + 1);
                        float var15 = var7.l6.get_Item(var11 + 2);
                        float var16 = var7.l6.get_Item(var11 + 3);
                        float var17 = var7.l6.get_Item(var11 + 4);
                        w1 var18 = n5(var12.u3(), var7.l6.get_Item(var11 + 5), var7.l6.get_Item(var11 + 6), var7.n5()).u3();
                        n5(var1, var12.u3(), var18.u3(), var13, var14, var15, var16 > 0.0F, var17 > 0.0F);
                        var18.n5(var3);
                     }
               }

               if (!var10) {
                  var5 = new o5();
               }

               if (!var9) {
                  var4 = new o5();
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
               var6.dispose();
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private static w1 n5(w1 var0, c8 var1, boolean var2) {
      return n5(var0.u3(), var1.l6.get_Item(0), var1.l6.get_Item(1), var2);
   }

   private static w1 n5(w1 var0, float var1, float var2, boolean var3) {
      return var3 ? new w1(var1, var2) : new w1(var0.l6() + var1, var0.k5() + var2);
   }

   private static void n5(s7 var0, w1 var1, w1 var2, w1 var3) {
      float var4 = var1.l6() + (var2.l6() - var1.l6()) * 2.0F / 3.0F;
      float var5 = var1.k5() + (var2.k5() - var1.k5()) * 2.0F / 3.0F;
      w1 var6 = new w1(var4, var5);
      float var7 = var2.l6() + (var3.l6() - var2.l6()) / 3.0F;
      float var8 = var2.k5() + (var3.k5() - var2.k5()) / 3.0F;
      w1 var9 = new w1(var7, var8);
      var0.n5(var1.u3(), var6.u3(), var9.u3(), var3.u3());
   }

   private static void n5(s7 var0, w1 var1, w1 var2, float var3, float var4, float var5, boolean var6, boolean var7) {
      if (!w1.n5(var1, var2)) {
         double var8 = q1.h0(var5 * (Math.PI / 180.0));
         double var10 = q1.c8(var5 * (Math.PI / 180.0));
         double var12 = var10 * (var1.l6() - var2.l6()) / 2.0 + var8 * (var1.k5() - var2.k5()) / 2.0;
         double var14 = -var8 * (var1.l6() - var2.l6()) / 2.0 + var10 * (var1.k5() - var2.k5()) / 2.0;
         double var16 = var3 * var3 * var4 * var4 - var3 * var3 * var14 * var14 - var4 * var4 * var12 * var12;
         double var19;
         if (var16 < 0.0) {
            float var18 = (float)q1.z3(1.0 - var16 / (var3 * var3 * var4 * var4));
            var3 *= var18;
            var4 *= var18;
            var19 = 0.0;
         } else {
            var19 = ((!var6 || !var7) && (var6 || var7) ? 1.0 : -1.0) * q1.z3(var16 / (var3 * var3 * var14 * var14 + var4 * var4 * var12 * var12));
         }

         double var21 = var19 * var3 * var14 / var4;
         double var23 = -var19 * var4 * var12 / var3;
         double var25 = var10 * var21 - var8 * var23 + (var1.l6() + var2.l6()) / 2.0;
         double var27 = var8 * var21 + var10 * var23 + (var1.k5() + var2.k5()) / 2.0;
         double var29 = n5(1.0, 0.0, (var12 - var21) / var3, (var14 - var23) / var4);
         double var31 = n5((var12 - var21) / var3, (var14 - var23) / var4, (-var12 - var21) / var3, (-var14 - var23) / var4);
         if (!var7 && var31 > 0.0) {
            var31 -= Math.PI * 2;
         } else if (var7 && var31 < 0.0) {
            var31 += Math.PI * 2;
         }

         int var33 = com.aspose.slides.internal.v6g.k5.u3(q1.l6(q1.n5(var31 / (Math.PI / 2))), 14);
         double var34 = var31 / var33;
         double var36 = 2.6666666666666665 * q1.h0(var34 / 4.0) * q1.h0(var34 / 4.0) / q1.h0(var34 / 2.0);
         double var38 = var1.l6();
         double var40 = var1.k5();

         for (int var42 = 0; var42 < var33; var42++) {
            double var43 = q1.c8(var29);
            double var45 = q1.h0(var29);
            double var47 = var29 + var34;
            double var49 = q1.c8(var47);
            double var51 = q1.h0(var47);
            double var53 = var10 * var3 * var49 - var8 * var4 * var51 + var25;
            double var55 = var8 * var3 * var49 + var10 * var4 * var51 + var27;
            double var57 = var36 * (-var10 * var3 * var45 - var8 * var4 * var43);
            double var59 = var36 * (-var8 * var3 * var45 + var10 * var4 * var43);
            double var61 = var36 * (var10 * var3 * var51 + var8 * var4 * var49);
            double var63 = var36 * (var8 * var3 * var51 - var10 * var4 * var49);
            var0.n5(
               (float)var38,
               (float)var40,
               (float)(var38 + var57),
               (float)(var40 + var59),
               (float)(var53 + var61),
               (float)(var55 + var63),
               (float)var53,
               (float)var55
            );
            var29 = var47;
            var38 = (float)var53;
            var40 = (float)var55;
         }
      }
   }

   private static double n5(double var0, double var2, double var4, double var6) {
      double var8 = q1.u3(var2, var0);
      double var10 = q1.u3(var6, var4);
      return var10 >= var8 ? var10 - var8 : (Math.PI * 2) - (var8 - var10);
   }

   private static w1 n5(w1 var0, w1 var1) {
      float var2 = q1.n5(var1.l6() - var0.l6());
      float var3 = q1.n5(var1.k5() - var0.k5());
      float var4;
      if (var1.l6() >= var0.l6()) {
         var4 = var1.l6() + var2;
      } else {
         var4 = var1.l6() - var2;
      }

      float var5;
      if (var1.k5() >= var0.k5()) {
         var5 = var1.k5() + var3;
      } else {
         var5 = var1.k5() - var3;
      }

      return new w1(var4, var5);
   }
}
