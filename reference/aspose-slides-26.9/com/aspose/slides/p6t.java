package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class p6t extends x4g {
   public p6t(p6w var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, l6v var3, com.aspose.slides.internal.x4g.s7 var4, float var5, float var6, n6u var7) {
      if (var2 != null && var2.u3() != 0) {
         this.n5(this.l6().l6(), var1.y4(), var2, null, var4, var5, var6, var7);
      }

      if (var3 != null && var3.u9()) {
         this.n5(this.l6().l6(), var1.y4(), null, var3, var4, var5, var6, var7);
      }
   }

   private void n5(
      n1g var1, com.aspose.slides.internal.o9b.y1 var2, a1v var3, l6v var4, com.aspose.slides.internal.x4g.s7 var5, float var6, float var7, n6u var8
   ) {
      if (var5.h0() != 0) {
         IRotation3D var9 = var1.n3().getRotation3D();
         g0 var10 = n5(var9);
         float[] var11 = n5(var10);
         if (var11 != null) {
            com.aspose.slides.internal.s6.r4 var12 = l6(var9).c8();
            com.aspose.slides.internal.s6.r4 var13 = n5(var11).c8();
            y5x var14 = new y5x();
            boolean var15 = false;
            if (var3 != null && var3.u3() != 0 && var3.u3() != -1) {
               var14.n5(var3.u3() != 1 ? k6.n5(var1.d2(), var5, var3) : k6.n5(var3.n5().o8()));
               var15 = true;
            }

            com.aspose.slides.ms.System.o5 var16 = this.n5(var3, var4).k5();
            var14.l6(com.aspose.slides.ms.System.o5.l6(var16, null) ? k6.n5(((com.aspose.slides.internal.o9b.c8)var16.n5()).o8()) : var14.a6());
            boolean var17 = false;
            if (var4 != null && var4.u9() && var4.c8() != null && var4.c8().u3() != 0 && var4.c8().u3() != -1) {
               if (com.aspose.slides.internal.o9b.c8.l6(var4.h0(), com.aspose.slides.internal.o9b.c8.u3)) {
                  var14.l6(k6.n5(var4.h0().o8()));
               }

               if (var14.a6() == null) {
                  var14.n5(var14.u9());
               }

               var17 = true;
            }

            if (var14.a6() != null || var14.u9() != null) {
               com.aspose.slides.internal.x4g.s7 var18 = (com.aspose.slides.internal.x4g.s7)var5.deepClone();
               var14.n5(new List<>());
               var14.u3().addItem(var18);
               var14.n5((var15 ? 2 : 0) | 4);
               var14.l6(0);
               com.aspose.slides.internal.s6.s0 var19 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
               if (!var15 && var4 != null) {
                  com.aspose.slides.internal.o9b.m3 var20 = var4.q0();
                  if (var6 != 0.0F) {
                     var20.k5(0);
                  }

                  com.aspose.slides.internal.n2d.y4.n5(var18, var20);
                  var14.n5(true);
                  var14.n5(var14.n5() | 2);
                  var14.l6(1);
               }

               com.aspose.slides.internal.s6.v3 var38 = new com.aspose.slides.internal.s6.v3(var2.s7() / 2.0F, var2.k5() / 2.0F, var6);
               com.aspose.slides.internal.s6.s0 var21 = new com.aspose.slides.internal.s6.s0(var2.x8() + var2.s7() / 2.0F, var2.n3() + var2.k5() / 2.0F);
               com.aspose.slides.internal.s6.s0.n5(var21, var19).n5(var21);
               s5n var22 = t7p.n5(var14.u3().get_Item(0), var7, var6, new com.aspose.slides.ms.System.o5<>(var21.a6()), var1.n3().getType(), var8);
               var14.n5(var22.n5());

               for (int var23 = 1; var23 < var14.u3().size(); var23++) {
                  var14.h0()
                     .n5(
                        var14.u3().get_Item(var23),
                        var7,
                        var6,
                        var14.n5(),
                        var14.l6(),
                        null,
                        false,
                        var14.k5(),
                        new com.aspose.slides.ms.System.o5<>(var21.a6())
                     );
               }

               if (var14.u3().size() > 1) {
                  var14.h0().n5(new com.aspose.slides.internal.s6.s0(0.0F, 0.0F), new com.aspose.slides.internal.s6.s0(1.0F, 1.0F));
               }

               com.aspose.slides.internal.s6.v3 var39 = new com.aspose.slides.internal.s6.v3();
               com.aspose.slides.internal.s6.v3 var24 = new com.aspose.slides.internal.s6.v3();
               com.aspose.slides.internal.s6.v3[] var25 = new com.aspose.slides.internal.s6.v3[]{var39};
               com.aspose.slides.internal.s6.v3[] var26 = new com.aspose.slides.internal.s6.v3[]{var24};
               var14.h0().n5(var13.c8(), var25, var26);
               var25[0].l6(var39);
               var26[0].l6(var24);
               var38.n5(
                  com.aspose.slides.internal.s6.w2.n5(var38.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var39.n5()), com.aspose.slides.ms.System.q1.n5(var24.n5())})
               );
               var38.l6(
                  com.aspose.slides.internal.s6.w2.n5(var38.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var39.l6()), com.aspose.slides.ms.System.q1.n5(var24.l6())})
               );
               var38.k5(
                  com.aspose.slides.internal.s6.w2.n5(var38.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var39.k5()), com.aspose.slides.ms.System.q1.n5(var24.k5())})
               );
               com.aspose.slides.internal.s6.v8 var27 = new com.aspose.slides.internal.s6.v8(var1.d2().s7(), var1.d2().x8());
               float var28 = 0.0F;
               com.aspose.slides.internal.s6.v8 var29 = new com.aspose.slides.internal.s6.v8();
               float[] var30 = new float[]{0.0F};
               com.aspose.slides.internal.s6.v8[] var31 = new com.aspose.slides.internal.s6.v8[]{var29};
               com.aspose.slides.internal.s6.r4 var32 = t4x.n5(var11, var12.c8(), var38.h0(), var27.u3(), var30, var31).c8();
               var28 = var30[0];
               var31[0].l6(var29);
               com.aspose.slides.internal.s6.v3 var33 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var28);
               com.aspose.slides.internal.s6.v3 var34 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F);
               com.aspose.slides.internal.s6.v3 var35 = new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
               com.aspose.slides.internal.s6.r4 var36 = com.aspose.slides.internal.s6.r4.n5(var33.h0(), var34.h0(), var35.h0()).c8();
               com.aspose.slides.internal.s6.v3 var37 = this.n5(var9, var15, var17, var6).h0();
               this.n5(var14, var13.c8(), var12.c8(), var36.c8(), var32.c8(), var37.h0(), var21.a6(), var29.u3());
            }
         }
      }
   }
}
