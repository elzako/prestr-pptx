package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class d0 {
   private float n5;

   public d0(float var1) {
      this.n5 = var1;
   }

   public final boolean n5(e3 var1, Cell var2, ShapeFrame var3, com.aspose.slides.internal.x4g.s7 var4, a1v var5) {
      if (var4.h0() == 0) {
         return false;
      }

      boolean var6 = false;
      boolean[] var7 = new boolean[]{false};
      x2i var8 = this.n5(var2, var7);
      var6 = var7[0];
      if (var8 == null) {
         return false;
      }

      g0 var9 = new g0();
      var9.n5(new float[]{0.0F, 0.0F, 0.0F});
      var9.n5(0.0F);
      var9.n5(46);
      float[] var10 = h4.n5(var9.k5(), var9.n5(), var9.l6(), var6);
      com.aspose.slides.internal.s6.r4 var11 = com.aspose.slides.internal.s6.r4.n5().c8();
      com.aspose.slides.internal.s6.r4 var12 = t4x.l6(var10).c8();
      com.aspose.slides.ms.System.o5 var13 = this.n5(var5).k5();
      int var14 = k6.n5(var8, false);
      boolean var15 = com.aspose.slides.ms.System.o5.l6(var13, null) && (var14 == 2 || var14 == 3);
      y5x var16 = new y5x();
      boolean var17 = false;
      boolean[] var18 = new boolean[]{false};
      this.n5(var16, var4, var1, var5, var13.k5(), var18);
      var17 = var18[0];
      if (var16.a6() == null && var16.u9() == null) {
         return false;
      }

      com.aspose.slides.internal.x4g.s7 var19 = (com.aspose.slides.internal.x4g.s7)var4.deepClone();
      var16.n5(new List<>());
      var16.u3().addItem(var19);
      var16.n5((var17 ? 2 : 0) | 4);
      var16.l6(0);
      float var20 = 0.0F;
      float var21 = 0.0F;
      com.aspose.slides.internal.s6.s0 var22 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
      com.aspose.slides.internal.s6.s0 var23 = new com.aspose.slides.internal.s6.s0(var3.getX() + var3.getWidth() / 2.0F, var3.getY() + var3.getHeight() / 2.0F);
      com.aspose.slides.internal.s6.s0.n5(var23, var22).n5(var23);
      com.aspose.slides.internal.s6.t2 var24 = k4.n5(var8);
      var16.n5(
         new com.aspose.slides.internal.s6.y2(
            var16.u3().get_Item(0), var20, var21, var16.n5(), var16.l6(), var24, var15, var16.k5(), new com.aspose.slides.ms.System.o5<>(var23.a6())
         )
      );

      for (int var25 = 1; var25 < var16.u3().size(); var25++) {
         var16.h0()
            .n5(var16.u3().get_Item(var25), var20, var21, var16.n5(), var16.l6(), var24, var15, var16.k5(), new com.aspose.slides.ms.System.o5<>(var23.a6()));
      }

      if (var16.u3().size() > 1) {
         var16.h0().n5(new com.aspose.slides.internal.s6.s0(0.0F, 0.0F), new com.aspose.slides.internal.s6.s0(1.0F, 1.0F));
      }

      com.aspose.slides.internal.s6.v3 var49 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var26 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var27 = new com.aspose.slides.internal.s6.v3[]{var49};
      com.aspose.slides.internal.s6.v3[] var28 = new com.aspose.slides.internal.s6.v3[]{var26};
      var16.h0().n5(var12.c8(), var27, var28);
      var27[0].l6(var49);
      var28[0].l6(var26);
      com.aspose.slides.internal.s6.v3 var29 = new com.aspose.slides.internal.s6.v3(var3.getWidth() / 2.0F, var3.getHeight() / 2.0F, var21);
      var29.n5(com.aspose.slides.internal.s6.w2.n5(var29.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var49.n5()), com.aspose.slides.ms.System.q1.n5(var26.n5())}));
      var29.l6(com.aspose.slides.internal.s6.w2.n5(var29.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var49.l6()), com.aspose.slides.ms.System.q1.n5(var26.l6())}));
      var29.k5(com.aspose.slides.internal.s6.w2.n5(var29.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var49.k5()), com.aspose.slides.ms.System.q1.n5(var26.k5())}));
      com.aspose.slides.internal.s6.v8 var30 = new com.aspose.slides.internal.s6.v8(var1.s7(), var1.x8());
      float var31 = 0.0F;
      com.aspose.slides.internal.s6.v8 var32 = new com.aspose.slides.internal.s6.v8();
      float[] var33 = new float[]{0.0F};
      com.aspose.slides.internal.s6.v8[] var34 = new com.aspose.slides.internal.s6.v8[]{var32};
      com.aspose.slides.internal.s6.r4 var35 = t4x.n5(var10, var11.c8(), var29.h0(), var30.u3(), var33, var34).c8();
      var31 = var33[0];
      var34[0].l6(var32);
      com.aspose.slides.internal.s6.v3 var36 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var31);
      com.aspose.slides.internal.s6.v3 var37 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
      com.aspose.slides.internal.s6.v3 var38 = new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
      com.aspose.slides.internal.s6.r4 var39 = com.aspose.slides.internal.s6.r4.n5(var36.h0(), var37.h0(), var38.h0()).c8();
      var16.k5(var14);
      List var40 = new List();
      var40.addItem(var16);
      List var41 = j4u.n5(var8);
      List$Enumerator var42 = var41.iterator();

      try {
         while (var42.hasNext()) {
            com.aspose.slides.internal.s6.w1 var43 = (com.aspose.slides.internal.s6.w1)var42.next();
            var43.k5(var12.n5(var43.k5().h0()).u9().h0());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var42, IDisposable.class)) {
            var42.dispose();
         }
      }

      d0$n5 var51 = new d0$n5(var12.c8(), var11.c8(), var39.c8(), var35.c8(), var41, var14);
      this.n5(var1, var40, var51, var23.a6(), var32.u3());
      return true;
   }

   private void n5(e3 var1, List<y5x> var2, d0$n5 var3, com.aspose.slides.internal.s6.s0 var4, com.aspose.slides.internal.s6.v8 var5) {
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
         n2d.n5(var26, (byte)0, 1);
         var1.n5(var26, var4.n5() - var5.n5() / 2.0F, var4.l6() - var5.l6() / 2.0F, var5.n5(), var5.l6());
      } finally {
         if (var26 != null) {
            var26.dispose();
         }
      }
   }

   private com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> n5(a1v var1) {
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      if (var1 != null && var1.u3() == 1) {
         var2 = new com.aspose.slides.ms.System.o5<>(var1.n5().o8());
      }

      if (com.aspose.slides.ms.System.o5.l6(var2, null)
         && com.aspose.slides.internal.o9b.c8.n5((com.aspose.slides.internal.o9b.c8)var2.n5(), com.aspose.slides.internal.o9b.c8.u3)) {
         var2 = new com.aspose.slides.ms.System.o5();
      }

      return var2;
   }

   private void n5(
      y5x var1,
      com.aspose.slides.internal.x4g.s7 var2,
      e3 var3,
      a1v var4,
      com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.c8> var5,
      boolean[] var6
   ) {
      var6[0] = false;
      if (var4 != null && var4.u3() != 0 && var4.u3() != -1) {
         var1.n5(var4.u3() != 1 ? k6.n5(var3, var2, var4) : k6.n5(var4.n5().o8()));
         var6[0] = true;
      }

      var1.l6(com.aspose.slides.ms.System.o5.l6(var5, null) ? k6.n5(((com.aspose.slides.internal.o9b.c8)var5.n5()).o8()) : var1.a6());
   }

   private x2i n5(Cell var1, boolean[] var2) {
      var2[0] = true;
      x2i var3 = this.n5(var1);
      if (var3 != null) {
         if (var1.getWidth() < k4.l6.n5() && var1.getHeight() < k4.l6.l6()) {
            var3.n5((IShapeBevel)null);
            var3.l6((IShapeBevel)null);
         } else if (var3.h0() != null && var3.h0().getWidth() < k4.n5.n5() && 0.0 < var3.h0().getHeight()) {
            var3.n5((IShapeBevel)null);
         }

         var2[0] = var3.h0() == null;
      }

      return var3;
   }

   private x2i n5(Cell var1) {
      if (var1 != null && var1.l6().l6() != null && var1.l6().l6().l6() != null) {
         x2i var2 = new x2i();
         var2.n5(var1.l6().l6().n5());
         var2.k5(var1.l6().l6().k5().l6());
         var2.l6(var1.l6().l6().k5().k5());
         if (var1.l6().l6().k5().u3() != null) {
            var2.n5(new float[]{var1.l6().l6().k5().u3().n5(), var1.l6().l6().k5().u3().l6(), var1.l6().l6().k5().u3().k5()});
         }

         ShapeBevel var3 = new ShapeBevel(true);
         var3.setBevelType(var1.l6().l6().l6().k5());
         var3.setWidth(var1.l6().l6().l6().n5());
         var3.setHeight(var1.l6().l6().l6().l6());
         var2.n5(var3);
         return var2;
      } else {
         return null;
      }
   }
}
