package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class n3c {
   private float n5;

   public n3c(float var1) {
      this.n5 = var1;
   }

   public final boolean n5(n1g var1, IThreeDFormat var2, com.aspose.slides.internal.o9b.y1 var3, a1v var4, l6v var5, com.aspose.slides.internal.x4g.s7 var6) {
      if (var6.h0() == 0) {
         return false;
      }

      if (ChartTypeCharacterizer.is3DChart(var1.n3().getType())) {
         return false;
      }

      boolean var7 = var1.n3().getType() == 69;
      g0 var8 = this.n5(var2, var7);
      if (var8 == null) {
         return false;
      }

      boolean var9 = false;
      boolean[] var10 = new boolean[]{false};
      x2i var11 = this.n5(var2, var6, var7, var10);
      var9 = var10[0];
      if (var11 == null) {
         return false;
      }

      float[] var12 = h4.n5(var8.k5(), var8.n5(), var8.l6(), var9);
      if (var12 == null) {
         return false;
      }

      com.aspose.slides.internal.s6.r4 var13 = com.aspose.slides.internal.s6.r4.n5().c8();
      com.aspose.slides.internal.s6.r4 var14 = t4x.l6(var12).c8();
      com.aspose.slides.ms.System.o5 var15 = this.n5(var4, var5).k5();
      int var16 = k6.n5(var11, false);
      boolean var17 = com.aspose.slides.ms.System.o5.l6(var15, null) && (var16 == 2 || var16 == 3);
      y5x var18 = new y5x();
      boolean var19 = false;
      boolean[] var20 = new boolean[]{false};
      this.n5(var18, var6, var1, var4, var5, var15.k5(), var20);
      var19 = var20[0];
      if (var18.a6() == null && var18.u9() == null) {
         return false;
      }

      com.aspose.slides.internal.x4g.s7 var21 = (com.aspose.slides.internal.x4g.s7)var6.deepClone();
      var18.n5(new List<>());
      var18.u3().addItem(var21);
      var18.n5((var19 ? 2 : 0) | 4);
      var18.l6(0);
      float var22 = 0.0F;
      float var23 = 0.0F;
      com.aspose.slides.internal.s6.s0 var24 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
      if (!var19 && var5 != null) {
         com.aspose.slides.internal.o9b.m3 var25 = var5.q0();
         com.aspose.slides.internal.n2d.y4.n5(var21, var25);
         var18.n5(true);
         var18.n5(var18.n5() | 2);
         var18.l6(1);
      }

      com.aspose.slides.internal.s6.s0 var51 = new com.aspose.slides.internal.s6.s0(var3.x8() + var3.s7() / 2.0F, var3.n3() + var3.k5() / 2.0F);
      com.aspose.slides.internal.s6.s0.n5(var51, var24).n5(var51);
      com.aspose.slides.internal.s6.t2 var26 = k4.n5(var11);
      var18.n5(
         new com.aspose.slides.internal.s6.y2(
            var18.u3().get_Item(0), var22, var23, var18.n5(), var18.l6(), var26, var17, var18.k5(), new com.aspose.slides.ms.System.o5<>(var51.a6())
         )
      );

      for (int var27 = 1; var27 < var18.u3().size(); var27++) {
         var18.h0()
            .n5(var18.u3().get_Item(var27), var22, var23, var18.n5(), var18.l6(), var26, var17, var18.k5(), new com.aspose.slides.ms.System.o5<>(var51.a6()));
      }

      if (var18.u3().size() > 1) {
         var18.h0().n5(new com.aspose.slides.internal.s6.s0(0.0F, 0.0F), new com.aspose.slides.internal.s6.s0(1.0F, 1.0F));
      }

      com.aspose.slides.internal.s6.v3 var52 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var28 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var29 = new com.aspose.slides.internal.s6.v3[]{var52};
      com.aspose.slides.internal.s6.v3[] var30 = new com.aspose.slides.internal.s6.v3[]{var28};
      var18.h0().n5(var14.c8(), var29, var30);
      var29[0].l6(var52);
      var30[0].l6(var28);
      com.aspose.slides.internal.s6.v3 var31 = new com.aspose.slides.internal.s6.v3(var3.s7() / 2.0F, var3.k5() / 2.0F, var23);
      var31.n5(com.aspose.slides.internal.s6.w2.n5(var31.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var52.n5()), com.aspose.slides.ms.System.q1.n5(var28.n5())}));
      var31.l6(com.aspose.slides.internal.s6.w2.n5(var31.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var52.l6()), com.aspose.slides.ms.System.q1.n5(var28.l6())}));
      var31.k5(com.aspose.slides.internal.s6.w2.n5(var31.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var52.k5()), com.aspose.slides.ms.System.q1.n5(var28.k5())}));
      com.aspose.slides.internal.s6.v8 var32 = new com.aspose.slides.internal.s6.v8(var1.d2().s7(), var1.d2().x8());
      float var33 = 0.0F;
      com.aspose.slides.internal.s6.v8 var34 = new com.aspose.slides.internal.s6.v8();
      float[] var35 = new float[]{0.0F};
      com.aspose.slides.internal.s6.v8[] var36 = new com.aspose.slides.internal.s6.v8[]{var34};
      com.aspose.slides.internal.s6.r4 var37 = t4x.n5(var12, var13.c8(), var31.h0(), var32.u3(), var35, var36).c8();
      var33 = var35[0];
      var36[0].l6(var34);
      com.aspose.slides.internal.s6.v3 var38 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var33);
      com.aspose.slides.internal.s6.v3 var39 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
      com.aspose.slides.internal.s6.v3 var40 = new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
      com.aspose.slides.internal.s6.r4 var41 = com.aspose.slides.internal.s6.r4.n5(var38.h0(), var39.h0(), var40.h0()).c8();
      var18.k5(var16);
      List var42 = new List();
      var42.addItem(var18);
      List var43 = j4u.n5(var11);
      List$Enumerator var44 = var43.iterator();

      try {
         while (var44.hasNext()) {
            com.aspose.slides.internal.s6.w1 var45 = (com.aspose.slides.internal.s6.w1)var44.next();
            var45.k5(var14.n5(var45.k5().h0()).u9().h0());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var44, IDisposable.class)) {
            var44.dispose();
         }
      }

      n3c$n5 var54 = new n3c$n5(var14.c8(), var13.c8(), var41.c8(), var37.c8(), var43, var16);
      this.n5(var1.d2(), var42, var54, var51.a6(), var34.u3());
      return true;
   }

   private void n5(e3 var1, List<y5x> var2, n3c$n5 var3, com.aspose.slides.internal.s6.s0 var4, com.aspose.slides.internal.s6.v8 var5) {
      com.aspose.slides.internal.s6.b3 var6 = new com.aspose.slides.internal.s6.b3();
      var6.k5(var3.n5().c8());
      var6.n5(com.aspose.slides.internal.s6.r4.n5(var3.l6(), var3.k5()).c8());
      var6.l6(var3.u3().c8());
      var6.n5(1);
      float var7 = var1.a0() != null ? var1.a0().m1().n5()[0] : 1.0F;
      float var8 = this.n5 * var7;
      int var9 = com.aspose.slides.internal.v6g.k5.u3(var5.n5() * var8, 13);
      int var10 = com.aspose.slides.internal.v6g.k5.u3(var5.l6() * var8, 13);
      com.aspose.slides.internal.s6.e5 var11 = new com.aspose.slides.internal.s6.e5(var9, var10, k6.n5(var3.u9()));
      var11.n5(0L);
      List$Enumerator var12 = var2.iterator();

      try {
         while (var12.hasNext()) {
            y5x var13 = (y5x)var12.next();
            com.aspose.slides.internal.s6.o0 var14 = null;
            com.aspose.slides.internal.s6.o0 var15 = null;
            com.aspose.slides.internal.s6.o0[] var16 = new com.aspose.slides.internal.s6.o0[]{var14};
            com.aspose.slides.internal.s6.o0[] var17 = new com.aspose.slides.internal.s6.o0[]{var15};
            m7b.n5(var13, var6, var3.a6(), var16, var17);
            var14 = var16[0];
            var15 = var17[0];
            var11.n5(var13.h0(), var14, var15);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      com.aspose.slides.internal.o9b.l6 var26 = new com.aspose.slides.internal.o9b.l6(var9, var10);

      try {
         com.aspose.slides.internal.j9e.n5 var28 = var26.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var26.e2(), var26.h0()), 2, 2498570);
         int var30 = com.aspose.slides.ms.System.q1.n5(var28.a6()) * var26.h0();
         com.aspose.slides.internal.e3m.n5.n5(var11.n5(), 0, var28.u3(), var30);
         var26.n5(var28);
         var1.n5(
            var26,
            com.aspose.slides.internal.v6g.k5.u3(var4.n5() - var5.n5() / 2.0F, 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.l6() - var5.l6() / 2.0F, 13),
            var5.n5(),
            var5.l6()
         );
      } finally {
         if (var26 != null) {
            var26.dispose();
         }
      }
   }

   private void n5(
      y5x var1,
      com.aspose.slides.internal.x4g.s7 var2,
      n1g var3,
      a1v var4,
      l6v var5,
      com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> var6,
      boolean[] var7
   ) {
      var7[0] = false;
      if (var4 != null && var4.u3() != 0 && var4.u3() != -1) {
         var1.n5(var4.u3() != 1 ? k6.n5(var3.d2(), var2, var4) : k6.n5(var4.n5().o8()));
         var7[0] = true;
      }

      var1.l6(com.aspose.slides.ms.System.o5.l6(var6, null) ? k6.n5(((com.aspose.slides.internal.o9b.c8)var6.n5()).o8()) : var1.a6());
      if (var5 != null && var5.u9() && var5.c8() != null && var5.c8().u3() != 0 && var5.c8().u3() != -1) {
         if (com.aspose.slides.internal.o9b.c8.l6(var5.h0(), com.aspose.slides.internal.o9b.c8.u3)) {
            var1.l6(k6.n5(var5.h0().o8()));
         }

         if (var1.a6() == null) {
            var1.n5(var1.u9());
         }
      }
   }

   private x2i n5(IThreeDFormat var1, com.aspose.slides.internal.x4g.s7 var2, boolean var3, boolean[] var4) {
      var4[0] = true;
      x2i var5 = l0y.n5(var1);
      com.aspose.slides.internal.o9b.y1 var6 = var2.s7().y4();
      if (var3) {
         if (var5 == null) {
            var5 = new x2i();
         }

         var5.n5(10);
         var5.n5(new ShapeBevel(true));
         var5.h0().setBevelType(2);
         var5.h0().setHeight(var6.k5());
         var5.h0().setWidth(var6.s7());
         var5.l6(new ShapeBevel(false));
         var5.c8().setBevelType(2);
         var5.c8().setHeight(var6.k5());
         var5.c8().setWidth(var6.s7());
      }

      if (var5 == null) {
         return null;
      }

      com.aspose.slides.internal.s6.s0 var7 = new com.aspose.slides.internal.s6.s0(1.0F, 1.0F);
      com.aspose.slides.internal.s6.s0 var8 = new com.aspose.slides.internal.s6.s0(7.0F, 7.0F);
      if (var6.s7() < var8.n5() && var6.k5() < var8.l6()) {
         var5.n5((IShapeBevel)null);
         var5.l6((IShapeBevel)null);
      } else {
         if (var5.h0() != null && (var5.h0().getWidth() < var7.n5() || var5.h0().getHeight() < var7.l6())) {
            var5.n5((IShapeBevel)null);
         }

         if (var5.c8() != null && (var5.c8().getWidth() < var7.n5() || var5.c8().getHeight() < var7.l6())) {
            var5.l6((IShapeBevel)null);
         }
      }

      var4[0] = var5.h0() == null;
      return var5;
   }

   private g0 n5(IThreeDFormat var1, boolean var2) {
      g0 var3 = h4.n5(var1);
      if (var3 == null && var2) {
         var3 = new g0();
         var3.n5(45.0F);
         var3.n5(46);
         var3.n5(new float[]{0.0F, 0.0F, 0.0F});
      }

      return var3;
   }

   private com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> n5(a1v var1, l6v var2) {
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      if (var1 != null && var1.u3() == 1) {
         var3 = new com.aspose.slides.ms.System.o5<>(var1.n5().o8());
      } else if (var2 != null && var2.u9() && var2.c8().u3() == 1) {
         var3 = new com.aspose.slides.ms.System.o5<>(var2.h0().o8());
      }

      if (com.aspose.slides.ms.System.o5.l6(var3, null)
         && com.aspose.slides.internal.o9b.c8.n5((com.aspose.slides.internal.o9b.c8)var3.n5(), com.aspose.slides.internal.o9b.c8.u3)) {
         var3 = new com.aspose.slides.ms.System.o5();
      }

      return var3;
   }
}
