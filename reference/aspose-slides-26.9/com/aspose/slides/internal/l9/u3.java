package com.aspose.slides.internal.l9;

import com.aspose.slides.internal.e7.s7;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.j8;

public abstract class u3 extends h0 {
   private String n5;
   private com.aspose.slides.internal.e7.t2 l6;

   public static String l6() {
      return "Image";
   }

   public final com.aspose.slides.internal.e7.t2 k5() {
      return this.l6;
   }

   private void n5(com.aspose.slides.internal.e7.t2 var1) {
      this.l6 = var1;
   }

   public u3(s7 var1, String var2) {
      super(var1);
      this.n5 = var2;
   }

   public u3(s7 var1, com.aspose.slides.internal.e7.t2 var2) {
      super(var1);
      this.n5(var2);
   }

   public abstract com.aspose.slides.internal.o9b.l6 n5();

   public final u3 u3() {
      s7 var1 = this.t9();
      x8 var2 = var1.l6();
      com.aspose.slides.internal.v2.s7 var3 = var2.u9(com.aspose.slides.internal.v2.c8.k4s);
      return var3 != null ? (u3)h0.n5(var3, this.k5()) : null;
   }

   public abstract void n5(t4 var1);

   public final int a6() {
      x8 var1 = this.e2();
      return var1.n5(com.aspose.slides.internal.v2.c8.i3, -1);
   }

   public final int u9() {
      x8 var1 = this.e2();
      return var1.n5(com.aspose.slides.internal.v2.c8.e8p, -1);
   }

   public final com.aspose.slides.internal.g9.a6 h0() {
      x8 var1 = this.e2();
      com.aspose.slides.internal.v2.s7 var2 = var1.n5(com.aspose.slides.internal.v2.c8.f5, com.aspose.slides.internal.v2.c8.r8);
      com.aspose.slides.internal.g9.a6 var3 = null;
      if (var2 != null) {
         var3 = com.aspose.slides.internal.g9.a6.n5(var2, this.k5());
      } else {
         com.aspose.slides.internal.v2.s7 var4 = var1.u9(com.aspose.slides.internal.v2.c8.b2);
         if (com.aspose.slides.internal.v2.c8.y0.equals(var4) || com.aspose.slides.internal.v2.c8.j9.equals(var4)) {
            var3 = new com.aspose.slides.internal.g9.s7();
         } else if (com.aspose.slides.internal.v2.c8.q7.equals(var4)) {
            var3 = new com.aspose.slides.internal.g9.s7();
         } else if (this.c8()) {
            var3 = new com.aspose.slides.internal.g9.s7();
         }
      }

      return var3;
   }

   public final boolean c8() {
      x8 var1 = this.e2();
      return var1.n5(com.aspose.slides.internal.v2.c8.i7, false);
   }

   public final int s7() {
      x8 var1 = this.e2();
      return var1.n5(com.aspose.slides.internal.v2.c8.f2, com.aspose.slides.internal.v2.c8.z7, -1);
   }

   public final com.aspose.slides.internal.v2.s7 x8() {
      x8 var1 = this.e2();
      com.aspose.slides.internal.v2.s7 var2 = var1.u9(com.aspose.slides.internal.v2.c8.e7);
      return var2 != null ? var2 : null;
   }

   public final com.aspose.slides.internal.v2.n5 n3() {
      x8 var1 = this.e2();
      com.aspose.slides.internal.v2.s7 var2 = var1.u9(com.aspose.slides.internal.v2.c8.c2);
      return var2 != null && com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.n5.class) ? (com.aspose.slides.internal.v2.n5)var2 : null;
   }

   public final u3 y4() {
      s7 var1 = this.t9();
      x8 var2 = var1.l6();
      com.aspose.slides.internal.v2.s7 var3 = var2.u9(com.aspose.slides.internal.v2.c8.k4s);
      return var3 == null ? null : (u3)h0.n5(var3, this.k5());
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, boolean var2, float[] var3) {
      if (this.c8()) {
         return this.n5(var1);
      }

      if (this.x8() != null) {
         return this.l6(var1);
      }

      u3 var4 = this.y4();
      if (var4 != null) {
         com.aspose.slides.internal.o9b.l6 var5 = var4.n5();
         if (var5 != null) {
            int var6 = var1.e2();
            int var7 = var1.h0();
            if (var5.e2() >= var6 && var5.h0() >= var7) {
               var6 = var5.e2();
               var7 = var5.h0();
               var1 = this.n5(var1, var6, var7);
            } else {
               var5 = this.n5(var5, var6, var7);
            }

            com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(var6, var7, 2498570);
            float[] var9 = new float[4];
            float[] var10 = new float[4];
            float[] var11 = new float[1];

            for (int var12 = 0; var12 < var7; var12++) {
               for (int var13 = 0; var13 < var6; var13++) {
                  com.aspose.slides.internal.o9b.c8 var14 = var1.l6(var13, var12).o8();
                  var9[0] = var14.x8() & 0xFF;
                  var9[1] = var14.n3() & 0xFF;
                  var9[2] = var14.y4() & 0xFF;
                  var10[0] = var9[0];
                  var10[1] = var9[1];
                  var10[2] = var9[2];
                  com.aspose.slides.internal.o9b.c8 var15 = var5.l6(var13, var12).o8();
                  var11[0] = var15.x8() & 0xFF;
                  if (var2) {
                     var10[3] = var11[0];
                     if (var3 != null && !j8.n5(var11[0], 0.0F)) {
                        var10[0] = this.n5(((var10[0] / 255.0F - var3[0]) / (var11[0] / 255.0F) + var3[0]) * 255.0F);
                        var10[1] = this.n5(((var10[1] / 255.0F - var3[1]) / (var11[0] / 255.0F) + var3[1]) * 255.0F);
                        var10[2] = this.n5(((var10[2] / 255.0F - var3[2]) / (var11[0] / 255.0F) + var3[2]) * 255.0F);
                     }
                  } else {
                     var10[3] = 255.0F - var11[0];
                  }

                  com.aspose.slides.internal.o9b.c8 var16 = com.aspose.slides.internal.o9b.c8.n5(
                        com.aspose.slides.internal.v6g.k5.u3(var10[3], 13),
                        com.aspose.slides.internal.v6g.k5.u3(var10[0], 13),
                        com.aspose.slides.internal.v6g.k5.u3(var10[1], 13),
                        com.aspose.slides.internal.v6g.k5.u3(var10[2], 13)
                     )
                     .o8();
                  var8.n5(var13, var12, var16.o8());
               }
            }

            return var8;
         }
      }

      return var1;
   }

   private float n5(float var1) {
      return var1 < 0.0F ? 0.0F : (var1 > 255.0F ? 255.0F : var1);
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, int var2, int var3) {
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var2, var3, 139273);
      z1 var5 = z1.n5(var4);

      try {
         var5.k5(7);
         var5.l6(2);
         var5.u9(2);
         int var6 = var1.e2() > 1 ? var1.e2() - 1 : var1.e2();
         int var7 = var1.h0() > 1 ? var1.h0() - 1 : var1.h0();
         var5.n5(var1, new y2(0, 0, var2, var3), new y2(0, 0, var6, var7), 2);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var4;
   }

   protected final float[] n5(u3 var1) {
      com.aspose.slides.internal.v2.k5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1.t2(), com.aspose.slides.internal.v2.k5.class);
      if (var2 == null) {
         return null;
      }

      com.aspose.slides.internal.v2.s7 var3 = var2.n3(com.aspose.slides.internal.v2.c8.j0);
      float[] var4 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.n5.class)) {
         var4 = ((com.aspose.slides.internal.v2.n5)var3).l6();
         if (var4.length < this.h0().a6()) {
            return null;
         }

         var4 = this.h0().n5(var4);
      }

      return var4;
   }

   public final com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0(), 2498570);
      z1 var3 = z1.n5(var2);

      try {
         com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.u3.o8();
         com.aspose.slides.internal.o9b.c8.m3().n5(var4);
         var3.n5(new i1(var4.o8()), 0, 0, var1.e2(), var1.h0());
         com.aspose.slides.internal.v2.n5 var5 = this.n3();
         if (var5 != null && var5.u3(0) == 1) {
            var3.n5(0);
         } else {
            var3.n5(1);
         }

         var3.n5(var1, 0, 0);
         return var2;
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.o9b.l6 l6(com.aspose.slides.internal.o9b.l6 var1) {
      com.aspose.slides.internal.v2.s7 var2 = this.x8();
      if (!com.aspose.slides.internal.v6g.k5.l6(var2, x8.class)) {
         return var1;
      }

      u3 var3 = (u3)h0.n5((x8)var2, this.k5());
      com.aspose.slides.internal.o9b.l6 var4 = var3.n5();
      if (var4 == null) {
         return var1;
      }

      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6(var4.e2(), var4.h0(), 2498570);
      z1 var6 = z1.n5(var5);

      try {
         y1 var7 = new y1(0.0F, 0.0F, var1.e2(), var1.h0());
         y1 var8 = new y1(0.0F, 0.0F, var4.e2(), var4.h0());
         var6.n5(var1, var8.y4(), var7.y4(), 2);
         var6.n5(1);
         var6.n5(var4, 0, 0);
         return var5;
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }
}
