package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class u1v extends k6 {
   private static final com.aspose.slides.internal.s6.s0 k5 = new com.aspose.slides.internal.s6.s0(1.0F, 1.0F);
   private static final com.aspose.slides.internal.s6.s0 u3 = new com.aspose.slides.internal.s6.s0(8.0F, 8.0F);

   public u1v(float var1) {
      super(var1, 100.0F);
   }

   public final boolean n5(e3 var1, s5u var2, GeometryShape var3, TextFrame var4) {
      if (com.aspose.slides.ms.System.d1.n5(var4.t2())) {
         return false;
      }

      g0 var5 = h4.n5(var3);
      g0 var6 = h4.n5(var4);
      if (var6 == null && var5 == null) {
         return false;
      }

      x2i var7 = l0y.n5(var3);
      x2i var8 = l0y.n5(var4);
      boolean var9 = true;
      if (var8 != null) {
         if (var3.getWidth() < u3.n5() && var3.getHeight() < u3.l6()) {
            var8.n5((IShapeBevel)null);
            var8.l6((IShapeBevel)null);
         } else {
            if (var8.h0() != null && (var8.h0().getWidth() <= k5.n5() || var8.h0().getHeight() <= k5.l6())) {
               var8.n5((IShapeBevel)null);
            }

            if (var8.c8() != null && (var8.c8().getWidth() <= k5.n5() || var8.c8().getHeight() <= k5.l6())) {
               var8.l6((IShapeBevel)null);
            }
         }

         var9 = var8.h0() == null;
      }

      float[] var10 = var5 != null ? h4.n5(var5.k5(), var5.n5(), var5.l6(), var9) : h4.n5(var6.k5(), var6.n5(), var6.l6(), var9);
      if (var10 == null) {
         return false;
      }

      float var11 = var8 != null ? var8.n5() : 0.0F;
      float var12 = var7 != null && var5 != null ? var7.l6() + var11 : 0.0F;
      com.aspose.slides.ms.System.o5 var13 = (var8 != null ? var8.k5() : new com.aspose.slides.ms.System.o5<>()).k5();
      int var14 = n5(var8, false);
      boolean var15 = com.aspose.slides.ms.System.o5.l6(var13, null) && (var14 == 2 || var14 == 3);
      com.aspose.slides.internal.s6.r4 var16 = t4x.l6(var10).c8();
      ShapeFrame var17 = null;
      com.aspose.slides.internal.o9b.y1 var18 = new com.aspose.slides.internal.o9b.y1();
      ShapeFrame[] var19 = new ShapeFrame[]{var17};
      com.aspose.slides.internal.o9b.y1[] var20 = new com.aspose.slides.internal.o9b.y1[]{var18};
      s3z.n5(var4.u3, var19, var20, null);
      var17 = var19[0];
      var20[0].a6(var18);
      com.aspose.slides.internal.w0.c8 var21 = s3z.n5(var4.u3, var2);
      com.aspose.slides.internal.o9b.y1 var22 = new com.aspose.slides.internal.o9b.y1();
      List var23 = null;
      List[] var24 = new List[]{var23};
      com.aspose.slides.internal.o9b.y1[] var25 = new com.aspose.slides.internal.o9b.y1[]{var22};
      com.aspose.slides.internal.x4g.s7[] var26 = k0r.n5(var1, var2, var3, var4, var17, var21, var24, var25);
      var23 = var24[0];
      var25[0].a6(var22);
      if (var26 != null && var26.length != 0) {
         com.aspose.slides.internal.s6.s0 var27 = new com.aspose.slides.internal.s6.s0();
         com.aspose.slides.internal.o9b.y1 var28 = new com.aspose.slides.internal.o9b.y1();
         if (!var4.h0()) {
            f1z var29 = var4.u3;
            d2k var30 = var29.l6().u3();
            i2h var31 = var4.a6().k5();
            com.aspose.slides.internal.s6.s0 var32 = new com.aspose.slides.internal.s6.s0(var3.getX() + var31.l6 + var30.n5, var3.getY() + var31.k5 + var30.l6);
            com.aspose.slides.internal.s6.s0 var33 = new com.aspose.slides.internal.s6.s0(var29.k5().n5, s3z.k5(var29));
            (var5 == null
                  ? new com.aspose.slides.internal.s6.s0(var32.n5() + var33.n5() / 2.0F, var32.l6() + var33.l6() / 2.0F)
                  : new com.aspose.slides.internal.s6.s0(var3.getX() + var3.getWidth() / 2.0F, var3.getY() + var3.getHeight() / 2.0F))
               .n5(var27);
            var28 = new com.aspose.slides.internal.o9b.y1(var32.n5(), var32.l6(), var33.n5(), var33.l6());
         } else {
            (var5 == null
                  ? new com.aspose.slides.internal.s6.s0(var22.x8() + var22.s7() / 2.0F, var22.n3() + var22.k5() / 2.0F)
                  : new com.aspose.slides.internal.s6.s0(var3.getX() + var3.getWidth() / 2.0F, var3.getY() + var3.getHeight() / 2.0F))
               .n5(var27);
            var22.a6(var28);
         }

         if (this.l6()) {
            var27 = new com.aspose.slides.internal.s6.s0(var3.getParentGroup().getFrame().getCenterX(), var3.getParentGroup().getFrame().getCenterY());
         }

         com.aspose.slides.internal.s6.v3 var49 = new com.aspose.slides.internal.s6.v3(var22.s7() / 2.0F, var22.k5() / 2.0F, var11);
         com.aspose.slides.ms.System.o5 var50 = (var8 != null ? var8.a6() : new com.aspose.slides.ms.System.o5<>()).k5();
         float var51 = var8 != null ? var8.u3() : 0.0F;
         boolean var52 = var50.l6() && var51 > 0.0F;
         List var53 = new List();
         boolean var34 = false;

         for (int var35 = 0; var35 < var26.length; var35++) {
            com.aspose.slides.internal.x4g.s7 var36 = var26[var35];
            if (var36.h0() != 0) {
               TextParam var37 = (TextParam)var23.get_Item(var35);
               y5x var38 = new y5x();
               var38.k5(var14);
               if (com.aspose.slides.internal.v6g.k5.l6(var37.u3(), u4z.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var37.u3(), u4z.class).k5(var28.y4());
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var37.a6().u9, u4z.class)) {
                  com.aspose.slides.internal.v6g.k5.n5(var37.a6().u9, u4z.class).k5(var28.y4());
               }

               r0m var39 = new r0m();
               var39.n5(false);
               var39.n5(var37.a6());
               var39.l6(var52 ? new l6v(((com.aspose.slides.internal.o9b.c8)var50.n5()).o8(), var51) : null);
               a1v var40 = var37.u3();
               if (var40 != null && var40.a6()) {
                  var38.n5(var40.u3() == 1 && (var39 == null || !var39.u3()) ? n5(var40.n5().o8()) : n5(var1, var36, var40, var39, null, this.n5));
               }

               l6v var41 = var39.n5();
               if (com.aspose.slides.ms.System.o5.l6(var13, null)) {
                  var38.l6(n5(((com.aspose.slides.internal.o9b.c8)var13.n5()).o8()));
               } else if (var41 != null && var41.t2()) {
                  var38.l6(var41.c8().u3() != 1 ? n5(var1, var36, var41.c8(), null, null, this.n5) : n5(var41.h0().o8()));
               } else if (var40 != null) {
                  var38.l6(var40.u3() != 1 ? n5(var1, var36, var40, null, null, this.n5) : n5(var40.n5().o8()));
               }

               if (var38.a6() == null) {
                  var38.n5(var38.u9());
               }

               if (var38.a6() != null || var38.u9() != null) {
                  com.aspose.slides.internal.s6.t2 var42 = null;
                  if (((TextParam)var23.get_Item(var35)).z1() >= 40.0F) {
                     var42 = k4.n5(var8);
                  }

                  var34 = var42 != null;
                  var38.n5(6);
                  var38.l6(0);
                  var38.n5(
                     new com.aspose.slides.internal.s6.y2(
                        var36, var12, var11, var38.n5(), var38.l6(), var42, var15, false, new com.aspose.slides.ms.System.o5<>(var27.a6())
                     )
                  );
                  var53.addItem(var38);
                  com.aspose.slides.internal.s6.v3 var43 = new com.aspose.slides.internal.s6.v3();
                  com.aspose.slides.internal.s6.v3 var44 = new com.aspose.slides.internal.s6.v3();
                  com.aspose.slides.internal.s6.v3[] var45 = new com.aspose.slides.internal.s6.v3[]{var43};
                  com.aspose.slides.internal.s6.v3[] var46 = new com.aspose.slides.internal.s6.v3[]{var44};
                  var38.h0().n5(var16.c8(), var45, var46);
                  var45[0].l6(var43);
                  var46[0].l6(var44);
                  var49.n5(
                     com.aspose.slides.internal.s6.w2.n5(
                        var49.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var43.n5()), com.aspose.slides.ms.System.q1.n5(var44.n5())
                     })
                  );
                  var49.l6(
                     com.aspose.slides.internal.s6.w2.n5(
                        var49.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var43.l6()), com.aspose.slides.ms.System.q1.n5(var44.l6())
                     })
                  );
                  var49.k5(
                     com.aspose.slides.internal.s6.w2.n5(
                        var49.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var43.k5()), com.aspose.slides.ms.System.q1.n5(var44.k5())
                     })
                  );
               }
            }
         }

         if (n5(var4)) {
            com.aspose.slides.internal.o9b.y1 var54 = new com.aspose.slides.internal.o9b.y1();
            com.aspose.slides.internal.o9b.y1[] var56 = new com.aspose.slides.internal.o9b.y1[]{var54};
            com.aspose.slides.internal.o9b.l6 var58 = n5(var26, var23, var22.y4(), var56);
            var56[0].a6(var54);
            y5x var59 = new y5x();
            var59.k5(0);
            var59.n5(var58);
            var59.l6(var58);
            com.aspose.slides.internal.w0.c8 var60 = new com.aspose.slides.internal.w0.c8();
            float var61 = var12 - var8.n5();
            if (var8.h0() != null) {
               var61 -= (float)var8.h0().getHeight();
            }

            var59.n5(this.n5(var27.a6(), var61, var54.y4(), false, this.l6, var60));
            com.aspose.slides.internal.s6.v3 var62 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3 var63 = new com.aspose.slides.internal.s6.v3();
            com.aspose.slides.internal.s6.v3[] var64 = new com.aspose.slides.internal.s6.v3[]{var62};
            com.aspose.slides.internal.s6.v3[] var65 = new com.aspose.slides.internal.s6.v3[]{var63};
            var59.h0().n5(var16.c8(), var64, var65);
            var64[0].l6(var62);
            var65[0].l6(var63);
            var49.n5(
               com.aspose.slides.internal.s6.w2.n5(var49.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var62.n5()), com.aspose.slides.ms.System.q1.n5(var63.n5())})
            );
            var49.l6(
               com.aspose.slides.internal.s6.w2.n5(var49.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var62.l6()), com.aspose.slides.ms.System.q1.n5(var63.l6())})
            );
            var49.k5(
               com.aspose.slides.internal.s6.w2.n5(var49.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var62.k5()), com.aspose.slides.ms.System.q1.n5(var63.k5())})
            );
            var53.addItem(var59);
         }

         if (var53.size() == 0) {
            return true;
         }

         x2i var55 = var8 != null ? var8 : var7;
         List var57 = j4u.n5(var55, var34);
         this.n5(var1, var3, var53, var16.c8(), var27.a6(), var49.h0(), var14, var10, var57);
         this.n5(var53);
         return true;
      } else {
         return false;
      }
   }

   private static com.aspose.slides.internal.o9b.l6 n5(
      com.aspose.slides.internal.x4g.s7[] var0, List<TextParam> var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.o9b.y1[] var3
   ) {
      float var4 = com.aspose.slides.ms.System.q1.l6(var2.s7(), var2.k5());
      var3[0] = new com.aspose.slides.internal.o9b.y1(var2.x8() - var4, var2.n3() - var4, var2.s7() + 2.0F * var4, var2.k5() + 2.0F * var4);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(var3[0].s7() * 96.0F / 72.0F + 0.5F, 13);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(var3[0].k5() * 96.0F / 72.0F + 0.5, 14);
      com.aspose.slides.internal.o9b.l6 var7 = new com.aspose.slides.internal.o9b.l6(var5, var6, 2498570);
      var7.n5(96.0F, 96.0F);
      com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var7);

      try {
         var8.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }

      r1c var9 = new r1c(var7, var3[0].s7(), var3[0].k5());

      try {
         var9.l6(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var3[0].x8(), -var3[0].n3()));
         k0r.n5(var9, var1, var0, var2.y4(), true);
      } finally {
         var9.dispose();
      }

      return var7;
   }

   public static boolean n5(TextFrame var0) {
      if (var0 == null) {
         return false;
      }

      IGenericEnumerator var1 = var0.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            IParagraph var2 = (IParagraph)var1.next();
            IGenericEnumerator var3 = var2.getPortions().iterator();

            try {
               while (var3.hasNext()) {
                  IPortion var4 = (IPortion)var3.next();
                  IEffectFormatEffectiveData var5 = var4.getPortionFormat().getEffective().getEffectFormat();
                  if (!var5.isNoEffects()) {
                     return true;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return false;
   }

   public static boolean l6(TextFrame var0) {
      x2i var1 = l0y.n5(var0);
      return var1 != null ? var1.h0() != null : false;
   }

   public static boolean k5(TextFrame var0) {
      return var0.s7().getKeepTextFlat();
   }
}
