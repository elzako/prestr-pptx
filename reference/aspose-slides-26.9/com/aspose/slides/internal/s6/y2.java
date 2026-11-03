package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class y2 implements IGenericEnumerable<c4> {
   private List<c4> n5 = new List<>();
   private short l6;
   private float k5;

   public y2() {
   }

   public y2(c4 var1) {
      this.n5(var1);
   }

   public y2(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, int var4, int var5) {
      this.n5(var1, var2, var3, var4, var5, null, false, false, null);
   }

   public y2(com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, int var4, int var5, t2 var6) {
      this.n5(var1, var2, var3, var4, var5, var6, false, false, null);
   }

   public y2(
      com.aspose.slides.internal.x4g.s7 var1,
      float var2,
      float var3,
      int var4,
      int var5,
      t2 var6,
      boolean var7,
      boolean var8,
      com.aspose.slides.ms.System.o5<s0> var9
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public final void n5(c4 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("mesh");
      }

      var1.n5(this.l6++);
      this.n5.addItem(var1);
   }

   public final void n5(
      com.aspose.slides.internal.x4g.s7 var1,
      float var2,
      float var3,
      int var4,
      int var5,
      t2 var6,
      boolean var7,
      boolean var8,
      com.aspose.slides.ms.System.o5<s0> var9
   ) {
      if (var1 == null) {
         throw new ArgumentNullException("graphicsPath");
      }

      f2 var10 = y1.n5(var1, var8, var9);
      if ((var4 & 2) != 0) {
         this.n5(var10, var2, var3, var5, var6);
      }

      if ((var4 & 4) != 0) {
         this.n5(var10, var2, var3, var4, var5, var7);
      }
   }

   public final void n5(r4 var1, v3[] var2, v3[] var3) {
      var2[0] = new v3(Float.POSITIVE_INFINITY);
      var3[0] = new v3(Float.NEGATIVE_INFINITY);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            c4 var5 = (c4)var4.next();
            v3[] var6 = var5.n5();

            for (int var10 : var5.k5()) {
               v3 var11 = var1.n5(var6[var10].h0()).h0();
               var2[0].n5(q1.l6(var2[0].n5(), var11.n5()));
               var2[0].l6(q1.l6(var2[0].l6(), var11.l6()));
               var2[0].k5(q1.l6(var2[0].k5(), var11.k5()));
               var3[0].n5(q1.n5(var3[0].n5(), var11.n5()));
               var3[0].l6(q1.n5(var3[0].l6(), var11.l6()));
               var3[0].k5(q1.n5(var3[0].k5(), var11.k5()));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public final void n5(s0 var1, s0 var2) {
      v3 var3 = new v3();
      v3 var4 = new v3();
      v3[] var5 = new v3[]{var3};
      v3[] var6 = new v3[]{var4};
      this.n5(r4.n5().c8(), var5, var6);
      var5[0].l6(var3);
      var6[0].l6(var4);
      List$Enumerator var7 = this.n5.iterator();

      try {
         while (var7.hasNext()) {
            c4 var8 = (c4)var7.next();

            for (int var12 : var8.k5()) {
               float var13 = (var8.n5()[var12].n5() - var3.n5()) / (var4.n5() - var3.n5());
               float var14 = (var4.l6() - var8.n5()[var12].l6()) / (var4.l6() - var3.l6());
               float var15 = var1.n5() + (var2.n5() - var1.n5()) * var13;
               float var16 = var1.l6() + (var2.l6() - var1.l6()) * var14;
               var8.l6()[var12] = new s0(var15, var16);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }
   }

   @Override
   public final IGenericEnumerator<c4> iterator() {
      return this.n5.iterator();
   }

   private void n5(f2 var1, float var2, float var3, int var4, t2 var5) {
      boolean var6 = false;
      boolean var7 = false;
      this.k5 = 0.0F;
      if (var5 != null && !var5.k5()) {
         if (var5.n5() != null) {
            this.k5 = var5.n5().l6();
            var6 = var5.n5().n5(var1, var2 - this.k5, true, var4, this);
         }

         if (var5.l6() != null) {
            var7 = var5.l6().n5(var1, var2 - var3 - this.k5, false, var4, this);
         }
      }

      if (!var6 || !var7) {
         v3 var8 = new v3(0.0F, 0.0F, 1.0F);
         v3 var9 = new v3(0.0F, 0.0F, -1.0F);
         s0 var10 = var1.l6().a6();
         s0 var11 = var1.k5().a6();
         s0 var12 = s0.l6(var11, var10).a6();
         List$Enumerator var13 = var1.u3().iterator();

         try {
            while (var13.hasNext()) {
               p8 var14 = (p8)var13.next();

               y4 var17;
               try {
                  p3 var15 = new p3(var14.n3());
                  x8 var16 = new x8(var15);
                  var17 = var16.n5();
               } catch (RuntimeException var30) {
                  com.aspose.slides.internal.n8e.v4.n5(var30);
                  continue;
               }

               if (var17 != null) {
                  for (int var32 = 0; var32 < var17.n5(); var32++) {
                     n3 var33 = var17.n5(var32);
                     s0[] var18 = (s0[])com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), var33.n5().n5())
                     );

                     for (int var19 = 0; var19 < var33.n5().n5(); var19++) {
                        j4 var20 = var33.n5().l6(var19);
                        var18[var19].n5(var12.n5() > 0.0F ? ((float)var20.n5() - var10.n5()) / var12.n5() : 0.0F);
                        var18[var19].l6(var12.l6() > 0.0F ? (var11.l6() - (float)var20.l6()) / var12.l6() : 0.0F);
                     }

                     if (!var6) {
                        v3[] var34 = (v3[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var33.n5().n5())
                        );
                        v3[] var36 = (v3[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var33.n5().n5())
                        );

                        for (int var21 = 0; var21 < var33.n5().n5(); var21++) {
                           j4 var22 = var33.n5().l6(var21);
                           var34[var21] = new v3((float)var22.n5(), (float)var22.l6(), var2 - this.k5);
                           var8.l6(var36[var21]);
                        }

                        int[] var38 = new int[var33.u3().n5() * 3];
                        int var41 = 0;

                        for (int var23 = 0; var41 < var33.u3().n5(); var23 += 3) {
                           int var24 = var33.n5().k5(var33.u3().l6(var41).n5()[0]);
                           int var25 = var33.n5().k5(var33.u3().l6(var41).n5()[1]);
                           int var26 = var33.n5().k5(var33.u3().l6(var41).n5()[2]);
                           var38[var23] = var26;
                           var38[var23 + 1] = var25;
                           var38[var23 + 2] = var24;
                           var41++;
                        }

                        c4 var42 = new c4(2);
                        var42.n5(var34);
                        var42.n5(var38);
                        var42.l6(var36);
                        var42.n5(var18);
                        this.n5(var42);
                     }

                     if (!var7) {
                        v3[] var35 = (v3[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var33.n5().n5())
                        );
                        v3[] var37 = (v3[])com.aspose.slides.ms.System.u3.n5(
                           com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var33.n5().n5())
                        );

                        for (int var39 = 0; var39 < var33.n5().n5(); var39++) {
                           j4 var43 = var33.n5().l6(var39);
                           var35[var39] = new v3((float)var43.n5(), (float)var43.l6(), var2 - var3 - this.k5);
                           var9.l6(var37[var39]);
                        }

                        int[] var40 = new int[var33.u3().n5() * 3];
                        int var44 = 0;

                        for (int var46 = 0; var44 < var33.u3().n5(); var46 += 3) {
                           int var47 = var33.n5().k5(var33.u3().l6(var44).n5()[0]);
                           int var48 = var33.n5().k5(var33.u3().l6(var44).n5()[1]);
                           int var49 = var33.n5().k5(var33.u3().l6(var44).n5()[2]);
                           var40[var46] = var47;
                           var40[var46 + 1] = var48;
                           var40[var46 + 2] = var49;
                           var44++;
                        }

                        c4 var45 = new c4(2);
                        var45.n5(var35);
                        var45.n5(var40);
                        var45.l6(var37);
                        var45.n5(var18);
                        this.n5(var45);
                     }
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }
      }
   }

   private void n5(f2 var1, float var2, float var3, int var4, int var5, boolean var6) {
      s0 var7 = var1.l6().a6();
      s0 var8 = var1.k5().a6();
      s0 var9 = s0.l6(var8, var7).a6();
      IGenericEnumerator var10 = var1.iterator();

      try {
         while (var10.hasNext()) {
            p8 var11 = (p8)var10.next();
            if (var11.u9() >= 2) {
               int var12 = var11.u9() - 1;
               int var13 = var12 * 4;
               int var14 = var12 * 2;
               v3[] var15 = (v3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var13));

               for (int var16 = 0; var16 < var12; var16++) {
                  var15[var16 * 2] = new v3(var11.l6(var16).u3(), var11.l6(var16).a6(), var2 - this.k5);
                  var15[var16 * 2 + 1] = new v3(var11.l6(var16 + 1).u3(), var11.l6(var16 + 1).a6(), var2 - this.k5);
                  var15[var16 * 2 + var14] = new v3(var11.l6(var16).u3(), var11.l6(var16).a6(), var2 - var3 - this.k5);
                  var15[var16 * 2 + var14 + 1] = new v3(var11.l6(var16 + 1).u3(), var11.l6(var16 + 1).a6(), var2 - var3 - this.k5);
               }

               v3[] var26 = (v3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var13));

               for (int var17 = 0; var17 < var12; var17++) {
                  float var18 = var11.l6(var17 + 1).u3() - var11.l6(var17).u3();
                  float var19 = var11.l6(var17 + 1).a6() - var11.l6(var17).a6();
                  v3 var20 = new v3(var19, -var18, 0.0F).u9().h0();
                  var20.l6(var26[var17 * 2 + var14 + 1]);
                  var20.l6(var26[var17 * 2 + var14]);
                  var20.l6(var26[var17 * 2 + 1]);
                  var20.l6(var26[var17 * 2]);
               }

               s0[] var27 = (s0[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), var13));

               for (int var28 = 0; var28 < var13; var28++) {
                  var27[var28].n5(var9.n5() > 0.0F ? (var15[var28].n5() - var7.n5()) / var9.n5() : 0.0F);
                  var27[var28].l6(var9.l6() > 0.0F ? (var8.l6() - var15[var28].l6()) / var9.l6() : 0.0F);
               }

               this.n5(var11, var26, var5);
               int[] var29 = new int[var12 * 6];
               int var30 = 0;
               int var33 = 0;

               while (var30 < var12) {
                  int var21 = var30 * 2;
                  int var22 = var30 * 2 + var14;
                  var29[var33++] = var21;
                  var29[var33++] = var22;
                  var29[var33++] = var21 + 1;
                  var29[var33++] = var22 + 1;
                  var29[var33++] = var21 + 1;
                  var29[var33++] = var22;
                  var30++;
               }

               c4 var31 = new c4(4);
               var31.n5(var15);
               var31.n5(var29);
               var31.l6(var26);
               var31.n5(var27);
               this.n5(var31);
               if (!var11.l6() || (var4 & 2) == 0 || var6) {
                  v3[] var39 = (v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var26.length)
                  );

                  for (int var40 = 0; var40 < var39.length; var40++) {
                     v3.n5(var26[var40]).l6(var39[var40]);
                  }

                  int[] var41 = new int[var29.length];

                  for (int var42 = 0; var42 < var41.length; var42 += 3) {
                     var41[var42] = var29[var42 + 2];
                     var41[var42 + 1] = var29[var42 + 1];
                     var41[var42 + 2] = var29[var42];
                  }

                  c4 var32 = new c4(4);
                  var32.n5(var15);
                  var32.n5(var41);
                  var32.l6(var39);
                  var32.n5(var27);
                  this.n5(var32);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }
   }

   private void n5(p8 var1, v3[] var2, int var3) {
      if (var3 != -1) {
         int var4 = var1.u9() - 1;
         int var5 = var4 * 2;
         switch (var3) {
            case 0:
               if (!var1.k5()) {
                  for (int var12 = 1; var12 < var4; var12++) {
                     if (var1.l6(var12).k5() == 2 && var1.l6(var12 + 1).k5() == 2) {
                        v3 var18 = v3.n5(var2[var12 * 2 - 1], var2[var12 * 2]).u9().h0();
                        var18.l6(var2[var12 * 2 + var5]);
                        var18.l6(var2[var12 * 2 - 1 + var5]);
                        var18.l6(var2[var12 * 2]);
                        var18.l6(var2[var12 * 2 - 1]);
                     }
                  }

                  if (var1.l6() && var1.l6(var4).k5() == 2 && var1.l6(1).k5() == 2) {
                     v3 var13 = v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var13.l6(var2[var5 - 1 + var5]);
                     var13.l6(var2[var5]);
                     var13.l6(var2[var5 - 1]);
                     var13.l6(var2[0]);
                  }
               } else {
                  for (int var14 = var4 - 1; var14 > 0; var14--) {
                     if (var1.l6(var14).k5() == 2 && var1.l6(var14 - 1).k5() == 2) {
                        v3 var19 = v3.n5(var2[var14 * 2 - 1], var2[var14 * 2]).u9().h0();
                        var19.l6(var2[var14 * 2 + var5]);
                        var19.l6(var2[var14 * 2 - 1 + var5]);
                        var19.l6(var2[var14 * 2]);
                        var19.l6(var2[var14 * 2 - 1]);
                     }
                  }

                  if (var1.l6() && var1.l6(0).k5() == 2 && var1.l6(var4 - 1).k5() == 2) {
                     v3 var15 = v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var15.l6(var2[var5 - 1 + var5]);
                     var15.l6(var2[var5]);
                     var15.l6(var2[var5 - 1]);
                     var15.l6(var2[0]);
                  }
               }
               break;
            case 1:
               for (int var10 = 1; var10 < var4; var10++) {
                  float var16 = v3.k5(var2[var10 * 2 - 1].h0(), var2[var10 * 2].h0());
                  if (var16 > 0.7071068F) {
                     v3 var8 = v3.n5(var2[var10 * 2 - 1], var2[var10 * 2]).u9().h0();
                     var8.l6(var2[var10 * 2 + var5]);
                     var8.l6(var2[var10 * 2 - 1 + var5]);
                     var8.l6(var2[var10 * 2]);
                     var8.l6(var2[var10 * 2 - 1]);
                  }
               }

               if (var1.l6()) {
                  float var11 = v3.k5(var2[0].h0(), var2[var5 - 1].h0());
                  if (var11 > 0.7071068F) {
                     v3 var17 = v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var17.l6(var2[var5 - 1 + var5]);
                     var17.l6(var2[var5]);
                     var17.l6(var2[var5 - 1]);
                     var17.l6(var2[0]);
                  }
               }
               break;
            case 2:
               for (int var6 = 1; var6 < var4; var6++) {
                  v3 var7 = v3.n5(var2[var6 * 2 - 1], var2[var6 * 2]).u9().h0();
                  var7.l6(var2[var6 * 2 + var5]);
                  var7.l6(var2[var6 * 2 - 1 + var5]);
                  var7.l6(var2[var6 * 2]);
                  var7.l6(var2[var6 * 2 - 1]);
               }

               if (var1.l6()) {
                  v3 var9 = v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                  var9.l6(var2[var5 - 1 + var5]);
                  var9.l6(var2[var5]);
                  var9.l6(var2[var5 - 1]);
                  var9.l6(var2[0]);
               }
         }
      }
   }
}
