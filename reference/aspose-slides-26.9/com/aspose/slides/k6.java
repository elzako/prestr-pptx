package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.s6.o0$n5;
import com.aspose.slides.ms.System.IDisposable;

abstract class k6 {
   private boolean k5;
   protected float n5;
   protected float l6;

   protected k6(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.n5(false);
   }

   protected final void n5(
      e3 var1,
      GeometryShape var2,
      List<y5x> var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.s0 var5,
      com.aspose.slides.internal.s6.v3 var6,
      int var7,
      float[] var8,
      List<com.aspose.slides.internal.s6.w1> var9
   ) {
      com.aspose.slides.internal.s6.v8 var10 = new com.aspose.slides.internal.s6.v8();
      com.aspose.slides.internal.s6.v8[] var11 = new com.aspose.slides.internal.s6.v8[]{var10};
      com.aspose.slides.internal.s6.b3 var12 = this.n5(var1, var8, var6.h0(), var4.c8(), var11);
      var11[0].l6(var10);
      List$Enumerator var13 = var9.iterator();

      try {
         while (var13.hasNext()) {
            com.aspose.slides.internal.s6.w1 var14 = (com.aspose.slides.internal.s6.w1)var13.next();
            var14.k5(var4.l6(var14.k5().h0()).u9().h0());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      var10 = new com.aspose.slides.internal.s6.v8(var10.n5(), var10.l6());
      com.aspose.slides.internal.w0.c8 var30 = this.n5(var2, var5.a6(), var10.u3());
      com.aspose.slides.internal.s6.e5 var15 = this.n5(var1, com.aspose.slides.internal.s6.v8.n5(var10).a6(), var7);
      com.aspose.slides.internal.s6.o0 var16 = null;
      com.aspose.slides.internal.s6.o0 var17 = null;
      List$Enumerator var18 = var3.iterator();

      try {
         while (var18.hasNext()) {
            y5x var19 = (y5x)var18.next();
            com.aspose.slides.internal.s6.o0[] var20 = new com.aspose.slides.internal.s6.o0[]{var16};
            com.aspose.slides.internal.s6.o0[] var21 = new com.aspose.slides.internal.s6.o0[]{var17};
            m7b.n5(var19, var12, var9, var20, var21);
            var16 = var20[0];
            var17 = var21[0];
            var15.n5(var19.h0(), var16, var17);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      this.n5(var1, var15, var30, var5.a6(), var10.u3());
   }

   protected com.aspose.slides.internal.s6.s3 n5() {
      return null;
   }

   protected final com.aspose.slides.internal.s6.e5 n5(e3 var1, com.aspose.slides.internal.s6.s0 var2, int var3) {
      com.aspose.slides.internal.o9b.p8 var4 = this.n5(var2.a6(), var1).u3();
      com.aspose.slides.internal.s6.e5 var5 = new com.aspose.slides.internal.s6.e5(var4.l6(), var4.k5(), n5(var3));
      var5.n5(0L);
      var5.n5(this.n5());
      return var5;
   }

   protected final void n5(
      e3 var1,
      com.aspose.slides.internal.s6.e5 var2,
      com.aspose.slides.internal.w0.c8 var3,
      com.aspose.slides.internal.s6.s0 var4,
      com.aspose.slides.internal.s6.v8 var5
   ) {
      com.aspose.slides.internal.o9b.t4 var6 = this.n5(var2);

      try {
         this.n5(var1, var6, var3, var4.a6(), var5.u3());
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   protected final com.aspose.slides.internal.o9b.t4 n5(com.aspose.slides.internal.s6.e5 var1) {
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var1.l6().n5(), var1.l6().l6());
      com.aspose.slides.internal.j9e.n5 var3 = var2.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var2.e2(), var2.h0()), 2, 2498570);
      int var4 = com.aspose.slides.ms.System.q1.n5(var3.a6()) * var2.h0();
      com.aspose.slides.internal.e3m.n5.n5(var1.n5(), 0, var3.u3(), var4);
      var2.n5(var3);
      return var2;
   }

   protected final void n5(
      e3 var1,
      com.aspose.slides.internal.o9b.t4 var2,
      com.aspose.slides.internal.w0.c8 var3,
      com.aspose.slides.internal.s6.s0 var4,
      com.aspose.slides.internal.s6.v8 var5
   ) {
      if (var3 != null) {
         var1.k5(var3);
      }

      var1.n5(
         var2,
         com.aspose.slides.internal.v6g.k5.u3(var4.n5(), 13) - var5.n5() / 2.0F,
         com.aspose.slides.internal.v6g.k5.u3(var4.l6() - var5.l6() / 2.0F, 13),
         var5.n5(),
         var5.l6()
      );
      if (var3 != null) {
         var1.z3();
      }
   }

   protected final void n5(List<y5x> var1) {
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            y5x var3 = (y5x)var2.next();
            boolean var4 = var3.a6() == var3.u9();
            if (var3.a6() != null) {
               var3.a6().dispose();
            }

            if (var3.u9() != null && !var4) {
               var3.u9().dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   static boolean n5(int var0) {
      switch (var0) {
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
            return true;
         default:
            return false;
      }
   }

   protected final com.aspose.slides.internal.o9b.p8 n5(com.aspose.slides.internal.s6.s0 var1, e3 var2) {
      float var3 = var2.a0() != null ? var2.a0().m1().n5()[0] : 1.0F;
      float var4 = this.n5 * var3;
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var1.n5() * var4, 13);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(var1.l6() * var4, 13);
      return new com.aspose.slides.internal.o9b.p8(var5, var6);
   }

   private com.aspose.slides.internal.w0.c8 n5(GeometryShape var1, com.aspose.slides.internal.s6.s0 var2, com.aspose.slides.internal.s6.v8 var3) {
      com.aspose.slides.internal.w0.c8 var4 = new com.aspose.slides.internal.w0.c8();
      if (this.l6()) {
         var4.n5(
            var1.getParentGroup().getRotation(),
            new com.aspose.slides.internal.o9b.w1(
               com.aspose.slides.internal.v6g.k5.u3(var2.n5() - var3.n5() / 2.0F, 13) + var3.n5() / 2.0F,
               com.aspose.slides.internal.v6g.k5.u3(var2.l6() - var3.l6() / 2.0F + var3.l6() / 2.0F, 13)
            )
         );
      } else if (this.n5(var1)) {
         var4.n5(
            var1.getRotation(),
            new com.aspose.slides.internal.o9b.w1(
               com.aspose.slides.internal.v6g.k5.u3(var2.n5() - var3.n5() / 2.0F, 13) + var3.n5() / 2.0F,
               com.aspose.slides.internal.v6g.k5.u3(var2.l6() - var3.l6() / 2.0F + var3.l6() / 2.0F, 13)
            )
         );
      } else {
         var4.n5(var1.getRotation(), new com.aspose.slides.internal.o9b.w1(var1.getX() + var1.getWidth() / 2.0F, var1.getY() + var1.getHeight() / 2.0F));
      }

      return var4;
   }

   protected final com.aspose.slides.internal.s6.b3 n5(
      e3 var1, float[] var2, com.aspose.slides.internal.s6.v3 var3, com.aspose.slides.internal.s6.r4 var4, com.aspose.slides.internal.s6.v8[] var5
   ) {
      float var6 = 0.0F;
      com.aspose.slides.internal.s6.r4 var7 = t4x.n5(var2).c8();
      float[] var8 = new float[]{0.0F};
      com.aspose.slides.internal.s6.r4 var9 = t4x.n5(var2, var7.c8(), var3.h0(), new com.aspose.slides.internal.s6.v8(var1.s7(), var1.x8()), var8, var5).c8();
      var6 = var8[0];
      com.aspose.slides.internal.s6.r4 var10 = com.aspose.slides.internal.s6.r4.n5(
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var6),
            new com.aspose.slides.internal.s6.v3(0.0F),
            new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F)
         )
         .c8();
      com.aspose.slides.internal.s6.b3 var11 = new com.aspose.slides.internal.s6.b3();
      var11.k5(var4.c8());
      var11.n5(com.aspose.slides.internal.s6.r4.n5(var7, var10).c8());
      var11.l6(var9.c8());
      var11.n5(1);
      return var11;
   }

   protected final void n5(
      e3 var1,
      GeometryShape var2,
      List<y5x> var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.s0 var5,
      com.aspose.slides.internal.s6.v3 var6,
      float[] var7
   ) {
      float var8 = 0.0F;
      com.aspose.slides.internal.s6.v8 var9 = new com.aspose.slides.internal.s6.v8();
      com.aspose.slides.internal.s6.r4 var10 = t4x.n5(var7).c8();
      float[] var11 = new float[]{0.0F};
      com.aspose.slides.internal.s6.v8[] var12 = new com.aspose.slides.internal.s6.v8[]{var9};
      com.aspose.slides.internal.s6.r4 var13 = t4x.n5(var7, var10.c8(), var6.h0(), new com.aspose.slides.internal.s6.v8(var1.s7(), var1.x8()), var11, var12)
         .c8();
      var8 = var11[0];
      var12[0].l6(var9);
      com.aspose.slides.internal.s6.r4 var14 = com.aspose.slides.internal.s6.r4.n5(
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var8),
            new com.aspose.slides.internal.s6.v3(0.0F),
            new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F)
         )
         .c8();
      com.aspose.slides.internal.s6.r4 var15 = com.aspose.slides.internal.s6.r4.n5(
            com.aspose.slides.internal.s6.r4.n5(var4, com.aspose.slides.internal.s6.r4.n5(var10, var14)), var13
         )
         .c8();
      com.aspose.slides.internal.o9b.m3 var16 = new com.aspose.slides.internal.o9b.m3(com.aspose.slides.internal.o9b.c8.m3().o8(), 1.0F);
      x2i var17 = l0y.n5(var2);
      if (var17 != null && var17.u3() != 0.0F && var17.a6().l6()) {
         var16 = new com.aspose.slides.internal.o9b.m3(var17.a6().n5().o8(), var17.u3());
      }

      float var18 = var1.a0() != null ? var1.a0().m1().n5()[0] : 1.0F;
      float var19 = this.n5 * var18;
      int var20 = com.aspose.slides.internal.v6g.k5.u3(var9.n5() * var19, 13);
      int var21 = com.aspose.slides.internal.v6g.k5.u3(var9.l6() * var19, 13);
      com.aspose.slides.internal.o9b.l6 var22 = new com.aspose.slides.internal.o9b.l6(var20, var21);
      com.aspose.slides.internal.o9b.z1 var23 = com.aspose.slides.internal.o9b.z1.n5(var22);
      var23.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
      List$Enumerator var24 = var3.iterator();

      try {
         while (var24.hasNext()) {
            y5x var25 = (y5x)var24.next();
            IGenericEnumerator var26 = var25.h0().iterator();

            try {
               while (var26.hasNext()) {
                  com.aspose.slides.internal.s6.c4 var27 = (com.aspose.slides.internal.s6.c4)var26.next();
                  if ((var27.u3() & 4) != 0) {
                     IGenericEnumerator var28 = var27.iterator();

                     try {
                        while (var28.hasNext()) {
                           o0$n5 var29 = (o0$n5)var28.next();
                           com.aspose.slides.internal.s6.g7 var30 = var15.k5(var29.n5.n5.h0()).u9();
                           com.aspose.slides.internal.s6.g7 var31 = var15.k5(var29.l6.n5.h0()).u9();
                           com.aspose.slides.internal.s6.g7 var32 = var15.k5(var29.k5.n5.h0()).u9();
                           if (!(var30.k5() < 0.0F) && !(var31.k5() < 0.0F) && !(var32.k5() < 0.0F)) {
                              com.aspose.slides.internal.s6.v8 var33 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var30, var30.u3()).u9(), var20, var21
                                 )
                                 .u3();
                              com.aspose.slides.internal.s6.v8 var34 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var31, var31.u3()).u9(), var20, var21
                                 )
                                 .u3();
                              com.aspose.slides.internal.s6.v8 var35 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var32, var32.u3()).u9(), var20, var21
                                 )
                                 .u3();
                              com.aspose.slides.internal.x4g.s7 var36 = new com.aspose.slides.internal.x4g.s7();

                              try {
                                 var36.l6(var33.n5(), var33.l6(), var34.n5(), var34.l6());
                                 var36.l6(var33.n5(), var33.l6(), var35.n5(), var35.l6());
                                 var23.n5(var16, var36);
                              } finally {
                                 if (var36 != null) {
                                    var36.dispose();
                                 }
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                           var28.dispose();
                        }
                     }
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
                  var26.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      com.aspose.slides.internal.w0.c8 var62 = new com.aspose.slides.internal.w0.c8();
      if (this.l6()) {
         var62.n5(
            var2.getParentGroup().getRotation(),
            new com.aspose.slides.internal.o9b.w1(
               com.aspose.slides.internal.v6g.k5.u3(var5.n5() - var9.n5() / 2.0F, 13) + var9.n5() / 2.0F,
               com.aspose.slides.internal.v6g.k5.u3(var5.l6() - var9.l6() / 2.0F + var9.l6() / 2.0F, 13)
            )
         );
      } else {
         var62.n5(var2.getRotation(), new com.aspose.slides.internal.o9b.w1(var2.getX() + var2.getWidth() / 2.0F, var2.getY() + var2.getHeight() / 2.0F));
      }

      var1.k5(var62);
      var1.n5(
         var22,
         com.aspose.slides.internal.v6g.k5.u3(var5.n5() - var9.n5() / 2.0F, 13),
         com.aspose.slides.internal.v6g.k5.u3(var5.l6() - var9.l6() / 2.0F, 13),
         var9.n5(),
         var9.l6()
      );
      var1.z3();
      var23.dispose();
      var22.dispose();
   }

   protected final boolean n5(GeometryShape var1) {
      return var1.getShapeType() == 89;
   }

   protected final com.aspose.slides.internal.o9b.l6 n5(
      e3 var1, s5u var2, GeometryShape var3, ShapeElement[] var4, ShapeFrame var5, float var6, byte var7, com.aspose.slides.internal.o9b.y1[] var8
   ) {
      float var9 = var3.getX();
      float var10 = var3.getY();
      com.aspose.slides.internal.w0.c8 var11 = new com.aspose.slides.internal.w0.c8();
      if (this.l6()) {
         var9 = var5.getX();
         var10 = var5.getY();
         var11.n5(var3.getRotation() - var3.getParentGroup().getRotation(), new com.aspose.slides.internal.o9b.w1(var5.getCenterX(), var5.getCenterY()));
      }

      float var12 = com.aspose.slides.ms.System.q1.n5((float)(var6), (float)(com.aspose.slides.ms.System.q1.l6(var3.getWidth(), var3.getHeight())));
      var8[0] = new com.aspose.slides.internal.o9b.y1(var9 - var12, var10 - var12, var3.getWidth() + var12 * 2.0F, var3.getHeight() + var12 * 2.0F);
      com.aspose.slides.internal.o9b.z1 var13 = var1.a0();
      float var14 = var13 != null ? var13.m1().n5()[0] : 1.0F;
      float var15 = var13 != null ? var13.m1().n5()[3] : 1.0F;
      int var16 = com.aspose.slides.internal.v6g.k5.u3(var8[0].s7() * var14 + 0.5F, 13);
      int var17 = com.aspose.slides.internal.v6g.k5.u3(var8[0].k5() * var15 + 0.5F, 13);
      com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var16, var17, 2498570);
      var18.n5(96.0F, 96.0F);
      com.aspose.slides.internal.o9b.z1 var19 = com.aspose.slides.internal.o9b.z1.n5(var18);

      try {
         var19.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      } finally {
         if (var19 != null) {
            var19.dispose();
         }
      }

      r1c var20 = new r1c(var18, var8[0].s7(), var8[0].k5());

      try {
         com.aspose.slides.internal.w0.c8 var21 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var8[0].x8(), -var8[0].n3());
         var21.n5(var11, 0);
         var20.l6(var21);
         var3.t9().n5(var20, var2, var4, var5, var3.y1().getEffective(), var7);
      } finally {
         if (var20 != null) {
            var20.dispose();
         }
      }

      return var18;
   }

   protected final com.aspose.slides.internal.s6.y2 n5(
      com.aspose.slides.internal.s6.s0 var1, float var2, com.aspose.slides.internal.o9b.y1 var3, boolean var4, float var5
   ) {
      return this.n5(var1, var2, var3, var4, var5, null);
   }

   protected final com.aspose.slides.internal.s6.y2 n5(
      com.aspose.slides.internal.s6.s0 var1,
      float var2,
      com.aspose.slides.internal.o9b.y1 var3,
      boolean var4,
      float var5,
      com.aspose.slides.internal.w0.c8 var6
   ) {
      com.aspose.slides.internal.s6.v3 var7 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 1.0F);
      com.aspose.slides.internal.s6.v3 var8 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, -1.0F);
      float var9 = var3.x8() - var1.n5();
      float var10 = var1.l6() - var3.n3();
      float var11 = var9 + var3.s7();
      float var12 = var10 - var3.k5();
      int var13 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(var3.s7() / var5 + 0.5F, 13));
      int var14 = com.aspose.slides.ms.System.q1.n5(1, com.aspose.slides.internal.v6g.k5.u3(var3.k5() / var5 + 0.5F, 13));
      int var15 = var13 + 1;
      int var16 = var14 + 1;
      com.aspose.slides.internal.s6.v3[] var17 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var15 * var16)
      );
      com.aspose.slides.internal.s6.v3[] var18 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var15 * var16)
      );
      com.aspose.slides.internal.s6.v3[] var19 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var15 * var16)
      );
      com.aspose.slides.internal.s6.s0[] var20 = (com.aspose.slides.internal.s6.s0[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.s0.class), var15 * var16)
      );
      int var21 = var13 * var14 * 6;
      int var22 = 0;
      com.aspose.slides.internal.o9b.w1 var23 = new com.aspose.slides.internal.o9b.w1();

      for (int var24 = 0; var24 < var16; var24++) {
         float var25 = (float)var24 / (var16 - 1);
         var23.l6(var10 + (var12 - var10) * var25);

         for (int var26 = 0; var26 < var15; var26++) {
            float var27 = (float)var26 / (var15 - 1);
            var23.n5(var9 + (var11 - var9) * var27);
            if (var6 != null) {
               com.aspose.slides.internal.o9b.w1 var28 = var6.n5(var23.u3()).u3();
               var17[var22] = new com.aspose.slides.internal.s6.v3(var28.l6(), var28.k5(), var2);
            } else {
               var17[var22] = new com.aspose.slides.internal.s6.v3(var23.l6(), var23.k5(), var2);
            }

            var20[var22] = new com.aspose.slides.internal.s6.s0(var27, var25);
            var7.l6(var18[var22]);
            var8.l6(var19[var22]);
            var22++;
         }
      }

      com.aspose.slides.internal.s6.y2 var31 = new com.aspose.slides.internal.s6.y2();
      int[] var32 = new int[var21];
      byte var29 = 0;

      for (int var33 = 0; var33 < var14; var33++) {
         for (int var36 = 0; var36 < var13; var36++) {
            int var38 = var36 + var33 * var15;
            var32[var29 + 0] = var38;
            var32[var29 + 1] = var38 + var15;
            var32[var29 + 2] = var38 + var15 + 1;
            var32[var29 + 3] = var38 + var15 + 1;
            var32[var29 + 4] = var38 + 1;
            var32[var29 + 5] = var38;
            var29 += 6;
         }
      }

      com.aspose.slides.internal.s6.c4 var34 = new com.aspose.slides.internal.s6.c4(2);
      var34.n5(var17);
      var34.l6(var18);
      var34.n5(var20);
      var34.n5(var32);
      var31.n5(var34);
      if (var4) {
         int[] var37 = new int[var21];

         for (int var30 = 0; var30 < var21; var30 += 6) {
            var37[var30 + 5] = var32[var30 + 0];
            var37[var30 + 4] = var32[var30 + 1];
            var37[var30 + 3] = var32[var30 + 2];
            var37[var30 + 2] = var32[var30 + 3];
            var37[var30 + 1] = var32[var30 + 4];
            var37[var30 + 0] = var32[var30 + 5];
         }

         var34 = new com.aspose.slides.internal.s6.c4(2);
         var34.n5(var17);
         var34.l6(var19);
         var34.n5(var20);
         var34.n5(var37);
         var31.n5(var34);
      }

      return var31;
   }

   protected static com.aspose.slides.internal.s6.s0 n5(com.aspose.slides.internal.x4g.s7 var0, byte var1, com.aspose.slides.internal.s6.s0 var2) {
      com.aspose.slides.internal.s6.s0 var3 = new com.aspose.slides.internal.s6.s0();
      if (var0 == null) {
         return var3;
      }

      com.aspose.slides.internal.o9b.y1 var4 = var0.s7().y4();
      if (var1 == 3 || var1 == 4) {
         var3.n5(com.aspose.slides.ms.System.q1.n5((float)(var4.s7()), (float)(var4.k5())) * 0.25F);
         var3.l6(com.aspose.slides.ms.System.q1.n5((float)(var4.s7()), (float)(var4.k5())) * 0.25F);
      } else if (var1 == 5) {
         var3.n5(var4.k5() * 0.5F);
         var3.l6(var4.k5() * 0.5F);
      } else if (var1 == 1 || var1 == 2) {
         var3.n5(var4.k5() * 0.4F + var4.s7() * 0.1F);
         var3.l6(var4.k5() * 0.4F + var4.s7() * 0.1F);
      }

      var3.n5(com.aspose.slides.ms.System.q1.l6(var3.n5(), var2.n5()));
      var3.l6(com.aspose.slides.ms.System.q1.l6(var3.l6(), var2.l6()));
      return var3;
   }

   static int n5(x2i var0, boolean var1) {
      if (var0 == null) {
         return var1 ? 1 : 0;
      }

      if (var0.s7() == 2 && var0.u9() == 13) {
         return 6;
      }

      switch (var0.u9()) {
         case 0:
            return var1 ? 4 : 2;
         case 13:
            return var1 ? 5 : 3;
         default:
            return var1 ? 1 : 0;
      }
   }

   static float n5(com.aspose.slides.internal.x4g.s7 var0) {
      com.aspose.slides.internal.o9b.y1 var1 = var0.s7().y4();
      float var2 = 32.0F;
      return (float)com.aspose.slides.ms.System.q1.l6((double)com.aspose.slides.ms.System.q1.n5((float)(var2 / var1.s7()), (float)(var2 / var1.s7())));
   }

   static com.aspose.slides.internal.o9b.l6 n5(e3 var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2) {
      return n5(var0, var1, var2, null, null, 1.0F);
   }

   static com.aspose.slides.internal.o9b.l6 n5(
      e3 var0, com.aspose.slides.internal.x4g.s7 var1, a1v var2, r0m var3, com.aspose.slides.internal.x4g.m1 var4, float var5
   ) {
      var5 = com.aspose.slides.ms.System.q1.n5(var5, n5(var1));
      com.aspose.slides.internal.x4g.m1 var6 = new com.aspose.slides.internal.x4g.m1();
      if (!(var5 > 1.0F) || var2.u3() != 4 && var2.u3() != 3 && (var3 == null || !var3.u3())) {
         var5 = 1.0F;
      } else {
         var1 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
         com.aspose.slides.internal.o9b.y1 var7 = var1.s7().y4();
         var6.k5(var7.x8(), var7.n3());
         var6.n5(var5, var5);
         var6.k5(-var7.x8(), -var7.n3());
         var1.l6(var6);
      }

      com.aspose.slides.internal.x4g.s7 var23 = (com.aspose.slides.internal.x4g.s7)var1.deepClone();
      if (var4 != null) {
         var23.l6(var4);
      }

      var23.y4();
      com.aspose.slides.internal.o9b.y1 var8 = var23.s7().y4();
      com.aspose.slides.internal.o9b.z1 var9 = var0.a0();
      float var10 = var9 != null ? var9.m1().n5()[0] : 1.0F;
      float var11 = var9 != null ? var9.m1().n5()[3] : 1.0F;
      float var12 = var3 != null ? var3.n5(var5) : 0.0F;
      int var13 = com.aspose.slides.internal.v6g.k5.u3((var8.s7() + var12) * var10 + 0.5F, 13);
      int var14 = com.aspose.slides.internal.v6g.k5.u3((var8.k5() + var12) * var11 + 0.5F, 13);
      var13 = com.aspose.slides.ms.System.q1.n5(var13, 1);
      var14 = com.aspose.slides.ms.System.q1.n5(var14, 1);
      com.aspose.slides.internal.o9b.l6 var15 = new com.aspose.slides.internal.o9b.l6(var13, var14, 2498570);
      var15.n5(96.0F, 96.0F);
      com.aspose.slides.internal.o9b.z1 var16 = com.aspose.slides.internal.o9b.z1.n5(var15);

      try {
         var16.l6(new com.aspose.slides.internal.x4g.m1(var10, 0.0F, 0.0F, var11, 0.0F, 0.0F));
         var16.l6(-var8.x8() + var12 * 0.5F, -var8.n3() + var12 * 0.5F);
         if (var4 != null) {
            var16.n5(var4, 0);
         }

         com.aspose.slides.internal.o9b.u3 var17 = d4.k5(var2);
         if (com.aspose.slides.internal.v6g.k5.l6(var17, com.aspose.slides.internal.o9b.u6.class)) {
            if (var2.u3() == 3 && ((m2a)var2).y4() != -1) {
               ((com.aspose.slides.internal.o9b.u6)var17).k5(var5 / var10, var5 / var11);
            }

            if (var2.u3() == 4) {
               ((com.aspose.slides.internal.o9b.u6)var17).l6(var6, 1);
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var17, com.aspose.slides.internal.x4g.z3.class)) {
            var17.l6(var6);
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var17, com.aspose.slides.internal.x4g.m3.class)) {
            ((com.aspose.slides.internal.x4g.m3)var17).l6(var6, 1);
         }

         var16.n5(var17, var1);
         if (var3 != null) {
            com.aspose.slides.internal.o9b.m3 var18 = var3.l6(var5);
            if (var18 != null) {
               var16.n5(var18, var1);
            }

            var18 = var3.k5(var5);
            if (var18 != null) {
               var16.n5(var18, var1);
            }
         }
      } finally {
         if (var16 != null) {
            var16.dispose();
         }
      }

      com.aspose.slides.internal.k4d.k5.n5(var15, 4);
      return var15;
   }

   static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.c8 var0) {
      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(1, 1, 2498570);
      var1.n5(0, 0, var0.o8());
      return var1;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }
}
