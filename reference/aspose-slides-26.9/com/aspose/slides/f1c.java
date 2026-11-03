package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.s6.o0$n5;
import com.aspose.slides.ms.System.IDisposable;

class f1c extends x4g {
   public f1c(p6w var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, l6v var3, com.aspose.slides.internal.x4g.s7 var4, float var5, float var6) {
      if (var2 != null && var2.u3() != 0) {
         this.n5(this.l6().l6(), var1.y4(), var2, null, var4, var5, var6);
      }

      if (var3 != null && var3.u9()) {
         this.n5(this.l6().l6(), var1.y4(), null, var3, var4, var5, var6);
      }
   }

   private void n5(n1g var1, com.aspose.slides.internal.o9b.y1 var2, a1v var3, l6v var4, com.aspose.slides.internal.x4g.s7 var5, float var6, float var7) {
      if (var5.h0() != 0) {
         IRotation3D var8 = var1.n3().getRotation3D();
         float[] var9 = null;
         com.aspose.slides.internal.s6.r4 var10 = new com.aspose.slides.internal.s6.r4();
         com.aspose.slides.internal.s6.r4 var11 = new com.aspose.slides.internal.s6.r4();
         float[][] var12 = new float[][]{var9};
         com.aspose.slides.internal.s6.r4[] var13 = new com.aspose.slides.internal.s6.r4[]{var10};
         com.aspose.slides.internal.s6.r4[] var14 = new com.aspose.slides.internal.s6.r4[]{var11};
         boolean var15 = !n5(var8, var12, var13, var14);
         var9 = var12[0];
         var13[0].n5(var10);
         var14[0].n5(var11);
         if (!var15) {
            y5x var16 = new y5x();
            boolean var17 = false;
            if (var3 != null && var3.u3() != 0 && var3.u3() != -1) {
               var16.n5(var3.u3() != 1 ? k6.n5(var1.d2(), var5, var3) : k6.n5(var3.n5().o8()));
               var17 = true;
            }

            com.aspose.slides.ms.System.o5 var18 = this.n5(var3, var4).k5();
            var16.l6(com.aspose.slides.ms.System.o5.l6(var18, null) ? k6.n5(((com.aspose.slides.internal.o9b.c8)var18.n5()).o8()) : var16.a6());
            boolean var19 = false;
            if (var4 != null && var4.u9() && var4.c8() != null && var4.c8().u3() != 0 && var4.c8().u3() != -1) {
               if (com.aspose.slides.ms.System.o5.l6(var18, null)) {
                  if (var16.a6() == null) {
                     var16.n5(k6.n5(var4.h0().o8()));
                  }
               } else {
                  if (com.aspose.slides.internal.o9b.c8.l6(var4.h0(), com.aspose.slides.internal.o9b.c8.u3)) {
                     var16.l6(k6.n5(var4.h0().o8()));
                  }

                  if (var16.a6() == null) {
                     var16.n5(var16.u9());
                  }
               }

               var19 = true;
            }

            if (var16.a6() != null || var16.u9() != null) {
               com.aspose.slides.internal.x4g.s7 var20 = (com.aspose.slides.internal.x4g.s7)var5.deepClone();
               var16.n5(new List<>());
               var16.u3().addItem(var20);
               var16.n5((var17 ? 2 : 0) | 4);
               var16.l6(0);
               com.aspose.slides.internal.s6.s0 var21 = new com.aspose.slides.internal.s6.s0(0.0F, 0.0F);
               if (!var17 && var4 != null) {
                  com.aspose.slides.internal.o9b.m3 var22 = var4.q0();
                  if (var6 != 0.0F) {
                     var22.k5(0);
                  }

                  com.aspose.slides.internal.n2d.y4.n5(var20, var22);
                  var16.n5(true);
                  var16.n5(var16.n5() | 2);
                  var16.l6(1);
               }

               com.aspose.slides.internal.s6.v3 var31 = new com.aspose.slides.internal.s6.v3(var2.s7() / 2.0F, var2.k5() / 2.0F, var6);
               com.aspose.slides.internal.s6.s0 var23 = new com.aspose.slides.internal.s6.s0(var2.x8() + var2.s7() / 2.0F, var2.n3() + var2.k5() / 2.0F);
               com.aspose.slides.internal.s6.s0.n5(var23, var21).n5(var23);
               var16.n5(
                  new com.aspose.slides.internal.s6.y2(
                     var16.u3().get_Item(0), var7, var6, var16.n5(), var16.l6(), null, false, var16.k5(), new com.aspose.slides.ms.System.o5<>(var23.a6())
                  )
               );

               for (int var24 = 1; var24 < var16.u3().size(); var24++) {
                  var16.h0()
                     .n5(
                        var16.u3().get_Item(var24),
                        var7,
                        var6,
                        var16.n5(),
                        var16.l6(),
                        null,
                        false,
                        var16.k5(),
                        new com.aspose.slides.ms.System.o5<>(var23.a6())
                     );
               }

               if (var16.u3().size() > 1) {
                  var16.h0().n5(new com.aspose.slides.internal.s6.s0(0.0F, 0.0F), new com.aspose.slides.internal.s6.s0(1.0F, 1.0F));
               }

               com.aspose.slides.internal.s6.v8 var32 = new com.aspose.slides.internal.s6.v8();
               com.aspose.slides.internal.s6.r4 var25 = new com.aspose.slides.internal.s6.r4();
               com.aspose.slides.internal.s6.r4[] var26 = new com.aspose.slides.internal.s6.r4[]{var25};
               com.aspose.slides.internal.s6.v8[] var27 = new com.aspose.slides.internal.s6.v8[]{var32};
               com.aspose.slides.internal.s6.r4 var28 = n5(var1, var16.h0(), var9, var10.c8(), var11.c8(), var31.h0(), var26, var27).c8();
               var26[0].n5(var25);
               var27[0].l6(var32);
               com.aspose.slides.internal.s6.v3 var29 = this.n5(var8, var17, var19, var6).h0();
               if (var17) {
                  this.n5(var16, var11.c8(), var10.c8(), var25.c8(), var28.c8(), var29.h0(), var23.a6(), var32.u3());
               }

               if (var19) {
                  this.l6(var16, var11.c8(), var10.c8(), var25.c8(), var28.c8(), var23.a6(), var32.u3(), var4);
               }
            }
         }
      }
   }

   public final void n5(
      com.aspose.slides.internal.o9b.y1 var1, l6v var2, com.aspose.slides.internal.o9b.w1 var3, com.aspose.slides.internal.o9b.w1 var4, float var5, float var6
   ) {
      if (var2 != null && var2.u9()) {
         n1g var7 = this.l6().l6();
         IRotation3D var8 = var7.n3().getRotation3D();
         float[] var9 = null;
         com.aspose.slides.internal.s6.r4 var10 = new com.aspose.slides.internal.s6.r4();
         com.aspose.slides.internal.s6.r4 var11 = new com.aspose.slides.internal.s6.r4();
         float[][] var12 = new float[][]{var9};
         com.aspose.slides.internal.s6.r4[] var13 = new com.aspose.slides.internal.s6.r4[]{var10};
         com.aspose.slides.internal.s6.r4[] var14 = new com.aspose.slides.internal.s6.r4[]{var11};
         boolean var15 = !n5(var8, var12, var13, var14);
         var9 = var12[0];
         var13[0].n5(var10);
         var14[0].n5(var11);
         if (!var15) {
            com.aspose.slides.internal.s6.s0 var16 = new com.aspose.slides.internal.s6.s0(var1.x8() + var1.s7() / 2.0F, var1.n3() + var1.k5() / 2.0F);
            float var17 = var3.l6() - var16.n5();
            float var18 = var16.l6() - var3.k5();
            float var19 = var4.l6() - var16.n5();
            float var20 = var16.l6() - var4.k5();
            boolean var21 = com.aspose.slides.ms.System.q1.n5(var3.l6() - var4.l6()) < Float.MIN_VALUE
               && com.aspose.slides.ms.System.q1.n5(var3.k5() - var4.k5()) < Float.MIN_VALUE;
            com.aspose.slides.internal.s6.v3[] var24;
            com.aspose.slides.internal.s6.v3[] var26;
            if (var21) {
               float var22 = var6 + var5;
               float var23 = (float)com.aspose.slides.ms.System.q1.l6(1.0, var2.n5()) * 0.5F;
               var24 = new com.aspose.slides.internal.s6.v3[]{
                  new com.aspose.slides.internal.s6.v3(var17, var18 - var23, var6),
                  new com.aspose.slides.internal.s6.v3(var17, var18 + var23, var6),
                  new com.aspose.slides.internal.s6.v3(var17, var18 - var23, var22),
                  new com.aspose.slides.internal.s6.v3(var17, var18 + var23, var22)
               };
               com.aspose.slides.internal.s6.v3 var25 = new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, 0.0F);
               var26 = new com.aspose.slides.internal.s6.v3[]{var25, var25, var25, var25};
            } else {
               float var35 = var19 - var17;
               float var37 = var20 - var18;
               float var39 = (float)com.aspose.slides.ms.System.q1.z3(var35 * var35 + var37 * var37);
               if (var39 < Float.MIN_VALUE) {
                  return;
               }

               float var27 = (float)com.aspose.slides.ms.System.q1.l6(1.0, var2.n5()) * 0.5F;
               float var28 = -var37 / var39 * var27;
               float var29 = var35 / var39 * var27;
               var24 = new com.aspose.slides.internal.s6.v3[]{
                  new com.aspose.slides.internal.s6.v3(var17 - var28, var18 - var29, var6),
                  new com.aspose.slides.internal.s6.v3(var17 + var28, var18 + var29, var6),
                  new com.aspose.slides.internal.s6.v3(var19 - var28, var20 - var29, var6),
                  new com.aspose.slides.internal.s6.v3(var19 + var28, var20 + var29, var6)
               };
               com.aspose.slides.internal.s6.v3 var30 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 1.0F);
               var26 = new com.aspose.slides.internal.s6.v3[]{var30, var30, var30, var30};
            }

            com.aspose.slides.internal.s6.s0[] var36 = new com.aspose.slides.internal.s6.s0[]{
               new com.aspose.slides.internal.s6.s0(0.0F, 0.0F),
               new com.aspose.slides.internal.s6.s0(1.0F, 0.0F),
               new com.aspose.slides.internal.s6.s0(0.0F, 1.0F),
               new com.aspose.slides.internal.s6.s0(1.0F, 1.0F)
            };
            int[] var38 = new int[]{0, 2, 1, 1, 2, 3};
            com.aspose.slides.internal.s6.c4 var40 = new com.aspose.slides.internal.s6.c4(4);
            var40.n5(var24);
            var40.l6(var26);
            var40.n5(var36);
            var40.n5(var38);
            y5x var41 = new y5x();
            var41.n5(new com.aspose.slides.internal.s6.y2(var40));
            var41.n5(4);
            var41.l6(0);
            var41.k5(0);
            com.aspose.slides.internal.s6.v3 var42 = new com.aspose.slides.internal.s6.v3(
               var1.s7() / 2.0F, var1.k5() / 2.0F, com.aspose.slides.ms.System.q1.n5(1.0F, com.aspose.slides.ms.System.q1.n5(var5))
            );
            com.aspose.slides.internal.s6.v8 var43 = new com.aspose.slides.internal.s6.v8();
            com.aspose.slides.internal.s6.r4 var44 = new com.aspose.slides.internal.s6.r4();
            com.aspose.slides.internal.s6.r4[] var31 = new com.aspose.slides.internal.s6.r4[]{var44};
            com.aspose.slides.internal.s6.v8[] var32 = new com.aspose.slides.internal.s6.v8[]{var43};
            com.aspose.slides.internal.s6.r4 var33 = n5(var7, var41.h0(), var9, var10.c8(), var11.c8(), var42.h0(), var31, var32).c8();
            var31[0].n5(var44);
            var32[0].l6(var43);
            this.n5(var41, var11.c8(), var10.c8(), var44.c8(), var33.c8(), var16.a6(), var43.u3(), var2);
         }
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1, a1v var2, com.aspose.slides.internal.o9b.y1 var3, float var4, float var5) {
      if (var2 != null) {
         if (var2.u3() != 0 && var2.u3() != -1) {
            n1g var6 = this.l6().l6();
            IRotation3D var7 = var6.n3().getRotation3D();
            float[] var8 = null;
            com.aspose.slides.internal.s6.r4 var9 = new com.aspose.slides.internal.s6.r4();
            com.aspose.slides.internal.s6.r4 var10 = new com.aspose.slides.internal.s6.r4();
            float[][] var11 = new float[][]{var8};
            com.aspose.slides.internal.s6.r4[] var12 = new com.aspose.slides.internal.s6.r4[]{var9};
            com.aspose.slides.internal.s6.r4[] var13 = new com.aspose.slides.internal.s6.r4[]{var10};
            boolean var14 = !n5(var7, var11, var12, var13);
            var8 = var11[0];
            var12[0].n5(var9);
            var13[0].n5(var10);
            if (!var14) {
               com.aspose.slides.internal.s6.s0 var15 = new com.aspose.slides.internal.s6.s0(var1.x8() + var1.s7() / 2.0F, var1.n3() + var1.k5() / 2.0F);
               float var16 = var3.a6() - var15.n5();
               float var17 = var3.h0() - var15.n5();
               float var18 = var15.l6() - var3.t2();
               float var19 = var15.l6() - var3.l6();
               new com.aspose.slides.internal.s6.v3();
               com.aspose.slides.internal.s6.v3 var20;
               com.aspose.slides.internal.s6.v3[] var21;
               com.aspose.slides.internal.s6.s0[] var22;
               if (var4 == 0.0F) {
                  var21 = new com.aspose.slides.internal.s6.v3[]{
                     new com.aspose.slides.internal.s6.v3(var16, var18, var5),
                     new com.aspose.slides.internal.s6.v3(var17, var18, var5),
                     new com.aspose.slides.internal.s6.v3(var16, var19, var5),
                     new com.aspose.slides.internal.s6.v3(var17, var19, var5)
                  };
                  var20 = new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 1.0F);
                  var22 = new com.aspose.slides.internal.s6.s0[]{
                     new com.aspose.slides.internal.s6.s0(0.0F, 0.0F),
                     new com.aspose.slides.internal.s6.s0(1.0F, 0.0F),
                     new com.aspose.slides.internal.s6.s0(0.0F, 1.0F),
                     new com.aspose.slides.internal.s6.s0(1.0F, 1.0F)
                  };
               } else {
                  float var23 = var5 + var4;
                  if (com.aspose.slides.ms.System.q1.n5(var3.s7()) >= com.aspose.slides.ms.System.q1.n5(var3.k5())) {
                     var21 = new com.aspose.slides.internal.s6.v3[]{
                        new com.aspose.slides.internal.s6.v3(var16, var18, var5),
                        new com.aspose.slides.internal.s6.v3(var17, var18, var5),
                        new com.aspose.slides.internal.s6.v3(var16, var18, var23),
                        new com.aspose.slides.internal.s6.v3(var17, var18, var23)
                     };
                     var20 = new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
                     var22 = new com.aspose.slides.internal.s6.s0[]{
                        new com.aspose.slides.internal.s6.s0(0.0F, 0.0F),
                        new com.aspose.slides.internal.s6.s0(1.0F, 0.0F),
                        new com.aspose.slides.internal.s6.s0(0.0F, 1.0F),
                        new com.aspose.slides.internal.s6.s0(1.0F, 1.0F)
                     };
                  } else {
                     var21 = new com.aspose.slides.internal.s6.v3[]{
                        new com.aspose.slides.internal.s6.v3(var16, var18, var5),
                        new com.aspose.slides.internal.s6.v3(var16, var19, var5),
                        new com.aspose.slides.internal.s6.v3(var16, var18, var23),
                        new com.aspose.slides.internal.s6.v3(var16, var19, var23)
                     };
                     var20 = new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, 0.0F);
                     var22 = new com.aspose.slides.internal.s6.s0[]{
                        new com.aspose.slides.internal.s6.s0(1.0F, 0.0F),
                        new com.aspose.slides.internal.s6.s0(0.0F, 1.0F),
                        new com.aspose.slides.internal.s6.s0(0.0F, 0.0F),
                        new com.aspose.slides.internal.s6.s0(1.0F, 1.0F)
                     };
                  }
               }

               com.aspose.slides.internal.s6.v3[] var37 = new com.aspose.slides.internal.s6.v3[]{var20, var20, var20, var20};
               int[] var24 = new int[]{0, 2, 1, 1, 2, 3};
               com.aspose.slides.internal.s6.c4 var25 = new com.aspose.slides.internal.s6.c4(2);
               var25.n5(var21);
               var25.l6(var37);
               var25.n5(var22);
               var25.n5(var24);
               y5x var26 = new y5x();
               if (var2.u3() != 1) {
                  com.aspose.slides.internal.o9b.y1 var27 = var3.y4();
                  if (var27.s7() < 1.0F) {
                     var27.l6(1.0F);
                  }

                  if (var27.k5() < 1.0F) {
                     var27.n5(1.0F);
                  }

                  com.aspose.slides.internal.x4g.s7 var28 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var28.l6(var27.y4());
                     var26.n5(k6.n5(var6.d2(), var28, var2));
                  } finally {
                     var28.dispose();
                  }
               } else {
                  var26.n5(k6.n5(var2.n5().o8()));
               }

               if (var26.a6() != null) {
                  if (var26.u9() == null) {
                     var26.l6(var26.a6());
                  }

                  var26.n5(new com.aspose.slides.internal.s6.y2(var25));
                  var26.n5(4);
                  var26.l6(0);
                  com.aspose.slides.internal.s6.v3 var38 = new com.aspose.slides.internal.s6.v3(
                     var1.s7() / 2.0F, var1.k5() / 2.0F, com.aspose.slides.ms.System.q1.n5(1.0F, com.aspose.slides.ms.System.q1.n5(var4))
                  );
                  com.aspose.slides.internal.s6.v8 var39 = new com.aspose.slides.internal.s6.v8();
                  com.aspose.slides.internal.s6.r4 var29 = new com.aspose.slides.internal.s6.r4();
                  com.aspose.slides.internal.s6.r4[] var30 = new com.aspose.slides.internal.s6.r4[]{var29};
                  com.aspose.slides.internal.s6.v8[] var31 = new com.aspose.slides.internal.s6.v8[]{var39};
                  com.aspose.slides.internal.s6.r4 var32 = n5(var6, var26.h0(), var8, var9.c8(), var10.c8(), var38.h0(), var30, var31).c8();
                  var30[0].n5(var29);
                  var31[0].l6(var39);
                  com.aspose.slides.internal.s6.v3 var33 = this.n5(var7, true, false, var4).h0();
                  this.n5(var26, var10.c8(), var9.c8(), var29.c8(), var32.c8(), var33.h0(), var15.a6(), var39.u3());
               }
            }
         }
      }
   }

   private void n5(
      y5x var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.r4 var5,
      com.aspose.slides.internal.s6.s0 var6,
      com.aspose.slides.internal.s6.v8 var7,
      l6v var8
   ) {
      if (var8 != null && var8.u9()) {
         com.aspose.slides.internal.s6.r4 var9 = new com.aspose.slides.internal.s6.r4();
         float var10 = 0.0F;
         int var11 = 0;
         int var12 = 0;
         com.aspose.slides.internal.s6.r4[] var13 = new com.aspose.slides.internal.s6.r4[]{var9};
         float[] var14 = new float[]{0.0F};
         int[] var15 = new int[]{0};
         int[] var16 = new int[]{0};
         this.n5(var2.c8(), var3.c8(), var4.c8(), var5.c8(), var7.u3(), var13, var14, var15, var16);
         var13[0].n5(var9);
         var10 = var14[0];
         var11 = var15[0];
         var12 = var16[0];
         com.aspose.slides.internal.o9b.m3 var17 = (com.aspose.slides.internal.o9b.m3)var8.q0().deepClone();

         try {
            var17.k5((float)com.aspose.slides.ms.System.q1.l6(1.0, var8.n5()) * var10);
            com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var11, var12);

            try {
               com.aspose.slides.internal.o9b.z1 var19 = com.aspose.slides.internal.o9b.z1.n5(var18);

               try {
                  var19.u9(4);
                  var19.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
                  IGenericEnumerator var20 = var1.h0().iterator();

                  try {
                     while (var20.hasNext()) {
                        com.aspose.slides.internal.s6.c4 var21 = (com.aspose.slides.internal.s6.c4)var20.next();
                        com.aspose.slides.internal.s6.v3[] var22 = var21.n5();
                        if (var22 != null && var22.length >= 4) {
                           com.aspose.slides.internal.s6.g7 var23 = var9.k5(var22[0].h0()).u9();
                           com.aspose.slides.internal.s6.g7 var24 = var9.k5(var22[1].h0()).u9();
                           com.aspose.slides.internal.s6.g7 var25 = var9.k5(var22[2].h0()).u9();
                           com.aspose.slides.internal.s6.g7 var26 = var9.k5(var22[3].h0()).u9();
                           if (!(var23.k5() < 0.0F) && !(var24.k5() < 0.0F) && !(var25.k5() < 0.0F) && !(var26.k5() < 0.0F)) {
                              com.aspose.slides.internal.s6.g7.l6(var23, var23.u3()).n5(var23);
                              com.aspose.slides.internal.s6.g7.l6(var24, var24.u3()).n5(var24);
                              com.aspose.slides.internal.s6.g7.l6(var25, var25.u3()).n5(var25);
                              com.aspose.slides.internal.s6.g7.l6(var26, var26.u3()).n5(var26);
                              com.aspose.slides.internal.o9b.w1 var27 = n5(var23.u9(), var24.u9(), var11, var12).u3();
                              com.aspose.slides.internal.o9b.w1 var28 = n5(var25.u9(), var26.u9(), var11, var12).u3();
                              var19.n5(var17, var27.u3(), var28.u3());
                           }
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
                        var20.dispose();
                     }
                  }

                  this.l6().n5(var18, var6.a6(), var7.u3(), var10);
               } finally {
                  if (var19 != null) {
                     var19.dispose();
                  }
               }
            } finally {
               if (var18 != null) {
                  var18.dispose();
               }
            }
         } finally {
            if (var17 != null) {
               var17.dispose();
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.s6.g7 var0, com.aspose.slides.internal.s6.g7 var1, int var2, int var3) {
      float var4 = (var0.n5() + var1.n5()) * 0.5F;
      float var5 = (var0.l6() + var1.l6()) * 0.5F;
      return new com.aspose.slides.internal.o9b.w1((1.0F + var4) * var2 * 0.5F, (1.0F - var5) * var3 * 0.5F);
   }

   private void l6(
      y5x var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.r4 var5,
      com.aspose.slides.internal.s6.s0 var6,
      com.aspose.slides.internal.s6.v8 var7,
      l6v var8
   ) {
      com.aspose.slides.internal.s6.r4 var9 = new com.aspose.slides.internal.s6.r4();
      float var10 = 0.0F;
      int var11 = 0;
      int var12 = 0;
      com.aspose.slides.internal.s6.r4[] var13 = new com.aspose.slides.internal.s6.r4[]{var9};
      float[] var14 = new float[]{0.0F};
      int[] var15 = new int[]{0};
      int[] var16 = new int[]{0};
      this.n5(var2.c8(), var3.c8(), var4.c8(), var5.c8(), var7.u3(), var13, var14, var15, var16);
      var13[0].n5(var9);
      var10 = var14[0];
      var11 = var15[0];
      var12 = var16[0];
      com.aspose.slides.internal.o9b.u3 var17 = null;
      if (var8 != null && var8.u9()) {
         var17 = var8.q0().l6();
      }

      if (var17 != null) {
         com.aspose.slides.internal.o9b.l6 var18 = new com.aspose.slides.internal.o9b.l6(var11, var12);

         try {
            com.aspose.slides.internal.o9b.z1 var19 = com.aspose.slides.internal.o9b.z1.n5(var18);

            try {
               var19.u9(4);
               var19.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
               IGenericEnumerator var20 = var1.h0().iterator();

               try {
                  while (var20.hasNext()) {
                     com.aspose.slides.internal.s6.c4 var21 = (com.aspose.slides.internal.s6.c4)var20.next();
                     IGenericEnumerator var22 = var21.iterator();

                     try {
                        while (var22.hasNext()) {
                           o0$n5 var23 = (o0$n5)var22.next();
                           com.aspose.slides.internal.s6.g7 var24 = var9.k5(var23.n5.n5.h0()).u9();
                           com.aspose.slides.internal.s6.g7 var25 = var9.k5(var23.l6.n5.h0()).u9();
                           com.aspose.slides.internal.s6.g7 var26 = var9.k5(var23.k5.n5.h0()).u9();
                           if (!(var24.k5() < 0.0F) && !(var25.k5() < 0.0F) && !(var26.k5() < 0.0F)) {
                              com.aspose.slides.internal.s6.v8 var27 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var24, var24.u3()).u9(), var11, var12
                                 )
                                 .u3();
                              com.aspose.slides.internal.s6.v8 var28 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var25, var25.u3()).u9(), var11, var12
                                 )
                                 .u3();
                              com.aspose.slides.internal.s6.v8 var29 = com.aspose.slides.internal.s6.w2.n5(
                                    com.aspose.slides.internal.s6.g7.l6(var26, var26.u3()).u9(), var11, var12
                                 )
                                 .u3();
                              com.aspose.slides.internal.x4g.s7 var30 = new com.aspose.slides.internal.x4g.s7();

                              try {
                                 var30.l6(var27.n5(), var27.l6(), var28.n5(), var28.l6());
                                 var30.l6(var28.n5(), var28.l6(), var29.n5(), var29.l6());
                                 var30.l6(var29.n5(), var29.l6(), var27.n5(), var27.l6());
                                 var19.n5(var17, var30);
                              } finally {
                                 if (var30 != null) {
                                    var30.dispose();
                                 }
                              }
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
                           var22.dispose();
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
                     var20.dispose();
                  }
               }

               this.l6().n5(var18, var6.a6(), var7.u3(), var10);
            } finally {
               if (var19 != null) {
                  var19.dispose();
               }
            }
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }
      }
   }

   private static boolean n5(IRotation3D var0, float[][] var1, com.aspose.slides.internal.s6.r4[] var2, com.aspose.slides.internal.s6.r4[] var3) {
      com.aspose.slides.internal.s6.r4.n5().n5(var2[0]);
      com.aspose.slides.internal.s6.r4.n5().n5(var3[0]);
      g0 var4 = n5(var0);
      var1[0] = n5(var4);
      if (var1[0] == null) {
         return false;
      }

      l6(var0).n5(var2[0]);
      n5(var1[0]).n5(var3[0]);
      return true;
   }

   private static com.aspose.slides.internal.s6.r4 n5(
      n1g var0,
      com.aspose.slides.internal.s6.y2 var1,
      float[] var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.v3 var5,
      com.aspose.slides.internal.s6.r4[] var6,
      com.aspose.slides.internal.s6.v8[] var7
   ) {
      com.aspose.slides.internal.s6.v3 var8 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3 var9 = new com.aspose.slides.internal.s6.v3();
      com.aspose.slides.internal.s6.v3[] var10 = new com.aspose.slides.internal.s6.v3[]{var8};
      com.aspose.slides.internal.s6.v3[] var11 = new com.aspose.slides.internal.s6.v3[]{var9};
      var1.n5(var4.c8(), var10, var11);
      var10[0].l6(var8);
      var11[0].l6(var9);
      var5.n5(com.aspose.slides.internal.s6.w2.n5(var5.n5(), new float[]{com.aspose.slides.ms.System.q1.n5(var8.n5()), com.aspose.slides.ms.System.q1.n5(var9.n5())}));
      var5.l6(com.aspose.slides.internal.s6.w2.n5(var5.l6(), new float[]{com.aspose.slides.ms.System.q1.n5(var8.l6()), com.aspose.slides.ms.System.q1.n5(var9.l6())}));
      var5.k5(com.aspose.slides.internal.s6.w2.n5(var5.k5(), new float[]{com.aspose.slides.ms.System.q1.n5(var8.k5()), com.aspose.slides.ms.System.q1.n5(var9.k5())}));
      com.aspose.slides.internal.s6.v8 var12 = new com.aspose.slides.internal.s6.v8(var0.d2().s7(), var0.d2().x8());
      float var13 = 0.0F;
      float[] var14 = new float[]{0.0F};
      com.aspose.slides.internal.s6.r4 var15 = t4x.n5(var2, var3.c8(), var5.h0(), var12.u3(), var14, var7).c8();
      var13 = var14[0];
      com.aspose.slides.internal.s6.r4.n5(
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, var13),
            new com.aspose.slides.internal.s6.v3(0.0F, 0.0F, 0.0F),
            new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F)
         )
         .n5(var6[0]);
      return var15;
   }

   private void n5(
      com.aspose.slides.internal.s6.r4 var1,
      com.aspose.slides.internal.s6.r4 var2,
      com.aspose.slides.internal.s6.r4 var3,
      com.aspose.slides.internal.s6.r4 var4,
      com.aspose.slides.internal.s6.v8 var5,
      com.aspose.slides.internal.s6.r4[] var6,
      float[] var7,
      int[] var8,
      int[] var9
   ) {
      com.aspose.slides.internal.s6.r4.n5(com.aspose.slides.internal.s6.r4.n5(var1, com.aspose.slides.internal.s6.r4.n5(var2, var3)), var4).n5(var6[0]);
      var7[0] = this.l6().u3() * this.l6().a6();
      var8[0] = com.aspose.slides.internal.v6g.k5.u3(var5.n5() * var7[0], 13);
      var9[0] = com.aspose.slides.internal.v6g.k5.u3(var5.l6() * var7[0], 13);
   }
}
