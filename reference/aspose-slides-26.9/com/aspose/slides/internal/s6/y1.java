package com.aspose.slides.internal.s6;

import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.q1;

public class y1 {
   public static f2 n5(com.aspose.slides.internal.x4g.s7 var0) {
      return n5(var0, false, null, 0.25F);
   }

   public static f2 n5(com.aspose.slides.internal.x4g.s7 var0, boolean var1, com.aspose.slides.ms.System.o5<s0> var2) {
      return n5(var0, var1, var2, 0.25F);
   }

   public static f2 n5(com.aspose.slides.internal.x4g.s7 var0, boolean var1, com.aspose.slides.ms.System.o5<s0> var2, float var3) {
      f2 var4 = n5(var0, var3);
      if (var4 == null) {
         throw new NullReferenceException("The path cannot be null.");
      }

      var4.n5(var1, var2);
      return var4;
   }

   private static f2 n5(com.aspose.slides.internal.x4g.s7 var0, float var1) {
      if (var0.h0() == 0) {
         return null;
      }

      f2 var2 = new f2();
      s0 var3 = new s0(0.0F);

      for (int var4 = 0; var4 < var0.h0(); var4++) {
         byte var5 = var0.u9()[var4];
         int var6 = var5 & 255 & 3;
         switch (var6) {
            case 0:
               var3 = new s0(var0.a6()[var4].u3());
               var2.n5(var3.a6());
               break;
            case 1:
               var3 = new s0(var0.a6()[var4].u3());
               var2.l6(var3.a6());
            case 2:
            default:
               break;
            case 3:
               n5(var3.a6(), new s0(var0.a6()[var4].u3()), new s0(var0.a6()[var4 + 1].u3()), new s0(var0.a6()[var4 + 2].u3()), var2, var1);
               var4 += 2;
               var5 = var0.u9()[var4];
               var3 = new s0(var0.a6()[var4].u3());
         }

         if ((var5 & 255 & 128) == 128) {
            var2.n5();
         }
      }

      return var2;
   }

   private static void n5(s0 var0, s0 var1, s0 var2, s0 var3, f2 var4, float var5) {
      i1 var6 = new i1(var0.a6(), 2);
      i1 var7 = new i1(var3.a6(), 2);
      var6.l6(var7);
      n5(var6, var1.a6(), var2.a6(), var7, var5, 0);

      for (i1 var8 = var6.l6(); var8 != null; var8 = var8.l6()) {
         var4.n5(var8);
      }
   }

   private static void n5(i1 var0, s0 var1, s0 var2, i1 var3, float var4, int var5) {
      if (var5 <= 15) {
         s0 var6 = var0.n5().a6();
         s0 var7 = var3.n5().a6();
         s0 var8 = s0.n5(s0.n5(var1, var2), 0.5F).a6();
         s0[] var9 = (s0[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), 5));
         s0.n5(s0.n5(var6, var1), 0.5F).n5(var9[0]);
         s0.n5(s0.n5(var9[0], var8), 0.5F).n5(var9[1]);
         s0.n5(s0.n5(var7, var2), 0.5F).n5(var9[4]);
         s0.n5(s0.n5(var9[4], var8), 0.5F).n5(var9[3]);
         s0.n5(s0.n5(var9[1], var9[3]), 0.5F).n5(var9[2]);
         if ((!w2.n5(var1.a6(), var9[0].a6()) || !w2.n5(var2.a6(), var9[1].a6())) && (!w2.n5(var1.a6(), var9[3].a6()) || !w2.n5(var2.a6(), var9[4].a6()))) {
            if (var5 == 0 || n5(var6.a6(), var7.a6(), var9[2].a6(), var4)) {
               i1 var10 = new i1(var9[2].a6(), 2);
               var0.l6(var10);
               n5(var0, var9[0].a6(), var9[1].a6(), var10, var4, var5 + 1);
               n5(var10, var9[3].a6(), var9[4].a6(), var3, var4, var5 + 1);
            }
         }
      }
   }

   private static boolean n5(s0 var0, s0 var1, s0 var2, float var3) {
      float var4 = q1.n5((var1.l6() - var0.l6()) * var2.n5() - (var1.n5() - var0.n5()) * var2.l6() + var1.n5() * var0.l6() - var1.l6() * var0.n5());
      float var5 = (float)q1.z3(q1.a6(var1.l6() - var0.l6(), 2.0) + q1.a6(var1.n5() - var0.n5(), 2.0));
      return var4 > var3 * var5;
   }
}
