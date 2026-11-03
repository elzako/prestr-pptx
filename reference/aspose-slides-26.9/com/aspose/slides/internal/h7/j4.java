package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class j4 implements t9 {
   protected final com.aspose.slides.internal.t8.l6 n5;
   protected final com.aspose.slides.internal.k0.u3 l6;
   private final com.aspose.slides.internal.t8.n5 k5;

   public j4(com.aspose.slides.internal.t8.l6 var1, com.aspose.slides.internal.t8.n5 var2, com.aspose.slides.internal.k0.u3 var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2.size() >= 1) {
         if (com.aspose.slides.internal.v6g.k5.l6(var2.get_Item(0), com.aspose.slides.internal.v2.y4.class)) {
            com.aspose.slides.internal.v2.y4 var3 = com.aspose.slides.internal.v6g.k5.n5(var2.get_Item(0), com.aspose.slides.internal.v2.y4.class);
            this.n5(var3.n5());
         }
      }
   }

   protected final void n5(byte[] var1) {
      com.aspose.slides.internal.t8.a6 var2 = this.n5.n5();
      float var3 = var2.t2().n5();
      float var4 = var2.t2().l6();
      float var5 = var2.t2().k5();
      float var6 = var2.t2().u3();
      float var7 = var2.t2().a6();
      com.aspose.slides.internal.u1.u3 var8 = var2.t2().u9();
      if (var8 == null) {
         var8 = com.aspose.slides.internal.u1.h0.n5();
      }

      float var9 = 0.001F;
      float var10 = 0.001F;
      float var11 = 0.001F;
      if (com.aspose.slides.internal.v6g.k5.l6(var8, com.aspose.slides.internal.u1.e2.class)) {
         com.aspose.slides.internal.x4g.m1 var12 = var8.z1();
         var9 = com.aspose.slides.internal.t8.u3.n5(var12, 0, 0);
         var10 = com.aspose.slides.internal.t8.u3.n5(var12, 1, 1);
         var11 = com.aspose.slides.internal.t8.u3.n5(var12, 0, 0);
      }

      float var21 = 0.0F;

      try {
         float var13 = var8.q0();
         var21 = var13 * var11;
      } catch (RuntimeException var19) {
      }

      if (var21 == 0.0F) {
         float var23 = var8.l6();
         var21 = var23 * var11;
         var21 *= 0.8F;
      }

      if (var21 == 0.0F) {
         var21 = 1.0F;
      }

      List var24 = this.n5(var2, var8, var1, var9, var10, var6, var3, var4, var5, var7, var21);
      List$Enumerator var14 = var24.iterator();

      try {
         while (var14.hasNext()) {
            x8 var15 = (x8)var14.next();
            this.l6.n5(var15);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }
   }

   private List<x8> n5(
      com.aspose.slides.internal.t8.a6 var1,
      com.aspose.slides.internal.u1.u3 var2,
      byte[] var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      List var12 = new List();
      com.aspose.slides.internal.x4g.m1 var13 = var1.n5();
      com.aspose.slides.internal.x4g.m1 var14 = this.l6.l6().u9();
      var14.n5(var13, 1);
      com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();
      float var16 = this.n5(var14);
      com.aspose.slides.internal.o9b.w1 var17 = new com.aspose.slides.internal.o9b.w1(var14.u3(), var14.a6());
      if (var16 > 0.0F) {
         var15.n5(var16, 1);
         var14.n5(var15, 1);
      }

      float var18 = 0.0F;
      float var19 = 0.0F;
      com.aspose.slides.internal.x4g.m1 var20 = null;
      com.aspose.slides.internal.x4g.m1 var21 = null;
      com.aspose.slides.internal.l7h.a5 var22 = new com.aspose.slides.internal.l7h.a5();
      String var23 = var1.t2().c8();
      boolean var24 = false;
      int var25 = 0;

      while (var25 < var3.length) {
         int var26 = 1;
         String var27 = var2.k5(var3, var25, var26);
         if (d1.n5(var27) && var25 + 1 < var3.length) {
            var27 = var2.k5(var3, var25, ++var26);
         }

         if (!"\u0000".equals(var27)) {
            if (var25 == 0) {
               var24 = com.aspose.slides.internal.g4.y4.n5(var27);
            }

            float var28 = com.aspose.slides.internal.t8.u3.n5(var14);
            var19 = var11 * var7 * var8 * var28;
            float var29 = var2.n5(var3, var25, var26);
            if (var29 == 0.0F) {
               var29 = var2.l6();
            }

            var29 *= var4;
            float var30 = var2.l6(var3, var25, var26);
            var30 *= var5;
            var18 = q1.n5(var18, var30);
            float var31 = 0.0F;
            if ((var3[var25] & 255) == 32 && var26 == 1) {
               var31 = var6;
            }

            com.aspose.slides.internal.x4g.m1 var32 = new com.aspose.slides.internal.x4g.m1(var7 * var8, 0.0F, 0.0F, var7, 0.0F, var9);
            if (var20 == null) {
               var20 = var32.u9();
               var20.n5(var14, 1);
            }

            float var33 = var29 * var7 * var8;
            com.aspose.slides.internal.x4g.m1 var34 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, var33, 0.0F);
            if (var21 != null) {
               var21.dispose();
            }

            var21 = var32.u9();
            var21.n5(var34, 1);
            var21.n5(var14, 1);
            float var35 = (var29 * var7 + var10 + var31) * var8;
            com.aspose.slides.internal.x4g.m1[] var36 = new com.aspose.slides.internal.x4g.m1[]{var14};
            this.n5(var35, 0.0F, var36);
            var14 = var36[0];
            if (var24) {
               var22.n5(0, var27);
            } else {
               var22.n5(var27);
            }
         }

         var25 += var26;
      }

      if (var20 != null && var21 != null) {
         try {
            float var40 = this.k5.n5() - var20.a6();
            float var42 = this.n5(var20, var21);
            float var43 = this.n5(var14, var18, var7);
            float var45 = this.n5(var13, var7);
            x8 var47 = new x8(var20.u3(), var40, var42, var43, var16, var22.toString(), var2, var45, var1.a0().o8(), var19);
            if (var16 > 0.0F) {
               var47.n5(new com.aspose.slides.internal.o9b.w1(var17.l6(), this.k5.n5() - var17.k5()));
            }

            var47.n5(var23);
            var12.addItem(var47);
         } finally {
            var20.dispose();
            var21.dispose();
         }
      }

      if (!var15.l6()) {
         var15.h0();
         var14.n5(var15, 1);
      }

      com.aspose.slides.internal.x4g.m1 var41 = var13.u9();
      var41.h0();
      var14.n5(var41, 1);
      this.l6.n5(var14);
      return var12;
   }

   private float n5(com.aspose.slides.internal.x4g.m1 var1, com.aspose.slides.internal.x4g.m1 var2) {
      float var3 = var2.u3();
      float var4 = var1.u3();
      return q1.n5(var3 - var4);
   }

   private float n5(com.aspose.slides.internal.x4g.m1 var1, float var2, float var3) {
      float var4 = com.aspose.slides.internal.t8.u3.l6(var1);
      return var2 * var3 * var4;
   }

   private float n5(com.aspose.slides.internal.x4g.m1 var1, float var2) {
      float var3 = com.aspose.slides.internal.t8.u3.n5(this.l6.l6());
      float var4 = com.aspose.slides.internal.t8.u3.n5(var1);
      return var2 * var3 * var4;
   }

   private void n5(float var1, float var2, com.aspose.slides.internal.x4g.m1[] var3) {
      com.aspose.slides.internal.x4g.m1 var4 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, var1, var2);
      var4.n5(var3[0], 1);
      var3[0] = var4;
   }

   private float n5(com.aspose.slides.internal.x4g.m1 var1) {
      float[] var2 = var1.n5();
      float var3 = (float)q1.u3(var2[1], var2[0]);
      float var4 = -(var3 * 180.0F / (float) Math.PI);
      var4 %= 360.0F;
      if (var4 < 0.0F) {
         var4 += 360.0F;
      }

      return var4;
   }
}
