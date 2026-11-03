package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

abstract class s5n {
   private float t2;
   private float s7;
   private float x8;
   private float n3;
   private float y4;
   private float e2;
   private float t9;
   private float z1;
   protected boolean n5 = false;
   protected com.aspose.slides.internal.x4g.s7 l6;
   protected float k5;
   protected float u3;
   protected com.aspose.slides.ms.System.o5<com.aspose.slides.internal.s6.s0> a6 = new com.aspose.slides.ms.System.o5<>();
   protected int u9 = 0;
   protected int h0;
   protected n6u c8;

   public s5n(
      com.aspose.slides.internal.x4g.s7 var1, float var2, float var3, int var4, n6u var5, com.aspose.slides.ms.System.o5<com.aspose.slides.internal.s6.s0> var6
   ) {
      if (var1 == null) {
         throw new ArgumentNullException("graphicsPath");
      }

      this.l6 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);
      this.k5 = var2;
      this.u3 = var3;
      this.h0 = var4;
      this.c8 = var5;
      var6.n5(this.a6);
      com.aspose.slides.internal.o9b.y1 var7 = var1.s7().y4();
      this.n5(var7.x8());
      this.l6(var7.n3());
      this.k5(var7.s7());
      this.u3(var7.k5());
      this.a6(var7.n3() + var7.k5());
      this.u9(var7.x8() + var7.s7());
      this.h0(var7.x8() + var7.s7() / 2.0F);
      this.c8(var7.n3() + var7.k5() / 2.0F);
   }

   public final float k5() {
      return this.t2;
   }

   private void n5(float var1) {
      this.t2 = var1;
   }

   public final float u3() {
      return this.s7;
   }

   private void l6(float var1) {
      this.s7 = var1;
   }

   public final float a6() {
      return this.x8;
   }

   private void k5(float var1) {
      this.x8 = var1;
   }

   public final float u9() {
      return this.n3;
   }

   private void u3(float var1) {
      this.n3 = var1;
   }

   public final float h0() {
      return this.y4;
   }

   private void a6(float var1) {
      this.y4 = var1;
   }

   public final float c8() {
      return this.e2;
   }

   private void u9(float var1) {
      this.e2 = var1;
   }

   public final float t2() {
      return this.t9;
   }

   private void h0(float var1) {
      this.t9 = var1;
   }

   public final float s7() {
      return this.z1;
   }

   private void c8(float var1) {
      this.z1 = var1;
   }

   public com.aspose.slides.internal.s6.y2 n5() {
      com.aspose.slides.internal.s6.y2 var1 = new com.aspose.slides.internal.s6.y2();
      com.aspose.slides.internal.s6.f2 var2 = this.l6();
      this.n5(var1, var2);
      this.l6(var1, var2);
      return var1;
   }

   protected abstract com.aspose.slides.internal.s6.f2 l6();

   protected abstract com.aspose.slides.internal.s6.v3 n5(float var1, float var2);

   protected abstract com.aspose.slides.internal.s6.v3 l6(float var1, float var2);

   protected void n5(com.aspose.slides.internal.s6.y2 var1, com.aspose.slides.internal.s6.f2 var2) {
      com.aspose.slides.internal.s6.v3 var3 = this.x8().h0();
      com.aspose.slides.internal.s6.v3 var4 = this.n3().h0();
      com.aspose.slides.internal.s6.s0 var5 = var2.l6().a6();
      com.aspose.slides.internal.s6.s0 var6 = var2.k5().a6();
      com.aspose.slides.internal.s6.s0 var7 = com.aspose.slides.internal.s6.s0.l6(var6, var5).a6();
      List$Enumerator var8 = var2.u3().iterator();

      try {
         while (var8.hasNext()) {
            com.aspose.slides.internal.s6.p8 var9 = (com.aspose.slides.internal.s6.p8)var8.next();

            com.aspose.slides.internal.s6.y4 var12;
            try {
               com.aspose.slides.internal.s6.p3 var10 = new com.aspose.slides.internal.s6.p3(var9.n3());
               com.aspose.slides.internal.s6.x8 var11 = new com.aspose.slides.internal.s6.x8(var10);
               var12 = var11.n5();
            } catch (RuntimeException var28) {
               com.aspose.slides.internal.f8y.n5.u3("Drawing3D: Triangulation error. The mesh is skipped.");
               continue;
            }

            if (var12 != null) {
               for (int var30 = 0; var30 < var12.n5(); var30++) {
                  com.aspose.slides.internal.s6.n3 var31 = var12.n5(var30);
                  int[] var13 = new int[var31.u3().n5() * 3];
                  int[] var14 = new int[var31.u3().n5() * 3];
                  com.aspose.slides.internal.s6.v3[] var15 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var31.n5().n5())
                  );
                  com.aspose.slides.internal.s6.v3[] var16 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var31.n5().n5())
                  );
                  com.aspose.slides.internal.s6.v3[] var17 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var31.n5().n5())
                  );
                  com.aspose.slides.internal.s6.v3[] var18 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var31.n5().n5())
                  );
                  com.aspose.slides.internal.s6.s0[] var19 = (com.aspose.slides.internal.s6.s0[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.s0.class), var31.n5().n5())
                  );

                  for (int var20 = 0; var20 < var31.n5().n5(); var20++) {
                     com.aspose.slides.internal.s6.j4 var21 = var31.n5().l6(var20);
                     this.n5((float)var21.n5(), (float)var21.l6()).l6(var15[var20]);
                     this.l6((float)var21.n5(), (float)var21.l6()).l6(var16[var20]);
                     var3.l6(var17[var20]);
                     var4.l6(var18[var20]);
                     var19[var20].n5(((float)var21.n5() - var5.n5()) / var7.n5());
                     var19[var20].l6(((float)var21.l6() - var5.l6()) / var7.l6());
                  }

                  int var32 = 0;

                  for (int var37 = 0; var32 < var31.u3().n5(); var37 += 3) {
                     int var22 = var31.n5().k5(var31.u3().l6(var32).n5()[0]);
                     int var23 = var31.n5().k5(var31.u3().l6(var32).n5()[1]);
                     int var24 = var31.n5().k5(var31.u3().l6(var32).n5()[2]);
                     var13[var37] = var24;
                     var14[var37] = var22;
                     var13[var37 + 1] = var23;
                     var14[var37 + 1] = var23;
                     var13[var37 + 2] = var22;
                     var14[var37 + 2] = var24;
                     var32++;
                  }

                  com.aspose.slides.internal.s6.c4 var33 = new com.aspose.slides.internal.s6.c4(4);
                  if (u6p.l6(this.h0)) {
                     int[] var38 = new int[var14.length];

                     for (int var40 = 0; var40 < var38.length; var40 += 3) {
                        var38[var40] = var14[var40 + 2];
                        var38[var40 + 1] = var14[var40 + 1];
                        var38[var40 + 2] = var14[var40];
                     }

                     com.aspose.slides.internal.s6.c4 var35 = new com.aspose.slides.internal.s6.c4(4);
                     var35.n5(var16);
                     var35.n5(var38);
                     var35.l6(var18);
                     var35.n5(var19);
                     var1.n5(var35);
                     var38 = new int[var13.length];

                     for (int var41 = 0; var41 < var38.length; var41 += 3) {
                        var38[var41] = var13[var41 + 2];
                        var38[var41 + 1] = var13[var41 + 1];
                        var38[var41 + 2] = var13[var41];
                     }

                     com.aspose.slides.internal.s6.c4 var36 = new com.aspose.slides.internal.s6.c4(4);
                     var36.n5(var15);
                     var36.n5(var38);
                     var36.l6(var17);
                     var36.n5(var19);
                     var1.n5(var36);
                     return;
                  }

                  var33.n5(var15);
                  var33.n5(var13);
                  var33.l6(var17);
                  var33.n5(var19);
                  var1.n5(var33);
                  com.aspose.slides.internal.s6.c4 var34 = new com.aspose.slides.internal.s6.c4(4);
                  var34.n5(var16);
                  var34.n5(var14);
                  var34.l6(var18);
                  var34.n5(var19);
                  var1.n5(var34);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
            var8.dispose();
         }
      }
   }

   protected void l6(com.aspose.slides.internal.s6.y2 var1, com.aspose.slides.internal.s6.f2 var2) {
      com.aspose.slides.internal.s6.s0 var3 = var2.l6().a6();
      com.aspose.slides.internal.s6.s0 var4 = var2.k5().a6();
      com.aspose.slides.internal.s6.s0 var5 = com.aspose.slides.internal.s6.s0.l6(var4, var3).a6();
      IGenericEnumerator var6 = var2.iterator();

      try {
         while (var6.hasNext()) {
            com.aspose.slides.internal.s6.p8 var7 = (com.aspose.slides.internal.s6.p8)var6.next();
            if (var7.u9() >= 2) {
               int var8 = var7.u9() - 1;
               int var9 = var8 * 4;
               int var10 = var8 * 2;
               com.aspose.slides.internal.s6.v3[] var11 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var9)
               );

               for (int var12 = 0; var12 < var8; var12++) {
                  this.n5(var7.l6(var12).u3(), var7.l6(var12).a6()).l6(var11[var12 * 2]);
                  this.n5(var7.l6(var12 + 1).u3(), var7.l6(var12 + 1).a6()).l6(var11[var12 * 2 + 1]);
                  this.l6(var7.l6(var12).u3(), var7.l6(var12).a6()).l6(var11[var12 * 2 + var10]);
                  this.l6(var7.l6(var12 + 1).u3(), var7.l6(var12 + 1).a6()).l6(var11[var12 * 2 + var10 + 1]);
               }

               com.aspose.slides.internal.s6.v3[] var22 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var9)
               );

               for (int var13 = 0; var13 < var8; var13++) {
                  com.aspose.slides.internal.s6.v3 var14 = com.aspose.slides.internal.s6.v3.l6(var11[var13 * 2], var11[var13 * 2 + var10]).h0();
                  com.aspose.slides.internal.s6.v3 var15 = com.aspose.slides.internal.s6.v3.l6(var11[var13 * 2 + 1], var11[var13 * 2]).h0();
                  com.aspose.slides.internal.s6.v3 var16 = com.aspose.slides.internal.s6.v3.n5(com.aspose.slides.internal.s6.v3.u3(var14.h0(), var15.h0()).u9())
                     .h0();
                  var16.l6(var22[var13 * 2 + var10 + 1]);
                  var16.l6(var22[var13 * 2 + var10]);
                  var16.l6(var22[var13 * 2 + 1]);
                  var16.l6(var22[var13 * 2]);
               }

               com.aspose.slides.internal.s6.s0[] var23 = (com.aspose.slides.internal.s6.s0[])com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.s0.class), var9)
               );

               for (int var24 = 0; var24 < var9; var24++) {
                  var23[var24].n5(var5.n5() > 0.0F ? (var11[var24].n5() - var3.n5()) / var5.n5() : 0.0F);
                  var23[var24].l6(var5.l6() > 0.0F ? (this.u9() / 2.0F - var11[var24].l6()) / this.u9() : 0.0F);
               }

               this.n5(var7, var22, this.u9);
               int[] var25 = new int[var8 * 6];
               int var26 = 0;
               int var29 = 0;

               while (var26 < var8) {
                  int var17 = var26 * 2;
                  int var18 = var26 * 2 + var10;
                  var25[var29++] = var17;
                  var25[var29++] = var18;
                  var25[var29++] = var17 + 1;
                  var25[var29++] = var18 + 1;
                  var25[var29++] = var17 + 1;
                  var25[var29++] = var18;
                  var26++;
               }

               com.aspose.slides.internal.s6.c4 var27 = new com.aspose.slides.internal.s6.c4(4);
               if (u6p.l6(this.h0)) {
                  com.aspose.slides.internal.s6.v3[] var35 = (com.aspose.slides.internal.s6.v3[])com.aspose.slides.ms.System.u3.n5(
                     com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.s6.v3.class), var22.length)
                  );

                  for (int var36 = 0; var36 < var35.length; var36++) {
                     com.aspose.slides.internal.s6.v3.n5(var22[var36]).l6(var35[var36]);
                  }

                  int[] var37 = new int[var25.length];

                  for (int var38 = 0; var38 < var37.length; var38 += 3) {
                     var37[var38] = var25[var38 + 2];
                     var37[var38 + 1] = var25[var38 + 1];
                     var37[var38 + 2] = var25[var38];
                  }

                  com.aspose.slides.internal.s6.c4 var28 = new com.aspose.slides.internal.s6.c4(4);
                  var28.n5(var11);
                  var28.n5(var37);
                  var28.l6(var35);
                  var28.n5(var23);
                  var1.n5(var28);
                  return;
               }

               var27.n5(var11);
               var27.n5(var25);
               var27.l6(var22);
               var27.n5(var23);
               var1.n5(var27);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   protected com.aspose.slides.internal.s6.v3 x8() {
      return u6p.l6(this.h0) ? new com.aspose.slides.internal.s6.v3(-1.0F, 0.0F, 0.0F) : new com.aspose.slides.internal.s6.v3(0.0F, -1.0F, 0.0F);
   }

   protected com.aspose.slides.internal.s6.v3 n3() {
      return u6p.l6(this.h0) ? new com.aspose.slides.internal.s6.v3(1.0F, 0.0F, 0.0F) : new com.aspose.slides.internal.s6.v3(0.0F, 1.0F, 0.0F);
   }

   protected final void n5(com.aspose.slides.internal.s6.p8 var1, com.aspose.slides.internal.s6.v3[] var2, int var3) {
      if (var3 != -1) {
         int var4 = var1.u9() - 1;
         int var5 = var4 * 2;
         switch (var3) {
            case 0:
               if (!var1.k5()) {
                  for (int var12 = 1; var12 < var4; var12++) {
                     if (var1.l6(var12).k5() == 2 && var1.l6(var12 + 1).k5() == 2) {
                        com.aspose.slides.internal.s6.v3 var18 = com.aspose.slides.internal.s6.v3.n5(var2[var12 * 2 - 1], var2[var12 * 2]).u9().h0();
                        var18.l6(var2[var12 * 2 + var5]);
                        var18.l6(var2[var12 * 2 - 1 + var5]);
                        var18.l6(var2[var12 * 2]);
                        var18.l6(var2[var12 * 2 - 1]);
                     }
                  }

                  if (var1.l6() && var1.l6(var4).k5() == 2 && var1.l6(1).k5() == 2) {
                     com.aspose.slides.internal.s6.v3 var13 = com.aspose.slides.internal.s6.v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var13.l6(var2[var5 - 1 + var5]);
                     var13.l6(var2[var5]);
                     var13.l6(var2[var5 - 1]);
                     var13.l6(var2[0]);
                  }
               } else {
                  for (int var14 = var4 - 1; var14 > 0; var14--) {
                     if (var1.l6(var14).k5() == 2 && var1.l6(var14 - 1).k5() == 2) {
                        com.aspose.slides.internal.s6.v3 var19 = com.aspose.slides.internal.s6.v3.n5(var2[var14 * 2 - 1], var2[var14 * 2]).u9().h0();
                        var19.l6(var2[var14 * 2 + var5]);
                        var19.l6(var2[var14 * 2 - 1 + var5]);
                        var19.l6(var2[var14 * 2]);
                        var19.l6(var2[var14 * 2 - 1]);
                     }
                  }

                  if (var1.l6() && var1.l6(0).k5() == 2 && var1.l6(var4 - 1).k5() == 2) {
                     com.aspose.slides.internal.s6.v3 var15 = com.aspose.slides.internal.s6.v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var15.l6(var2[var5 - 1 + var5]);
                     var15.l6(var2[var5]);
                     var15.l6(var2[var5 - 1]);
                     var15.l6(var2[0]);
                  }
               }
               break;
            case 1:
               for (int var10 = 1; var10 < var4; var10++) {
                  float var16 = com.aspose.slides.internal.s6.v3.k5(var2[var10 * 2 - 1].h0(), var2[var10 * 2].h0());
                  if (var16 > 0.7071068F) {
                     com.aspose.slides.internal.s6.v3 var8 = com.aspose.slides.internal.s6.v3.n5(var2[var10 * 2 - 1], var2[var10 * 2]).u9().h0();
                     var8.l6(var2[var10 * 2 + var5]);
                     var8.l6(var2[var10 * 2 - 1 + var5]);
                     var8.l6(var2[var10 * 2]);
                     var8.l6(var2[var10 * 2 - 1]);
                  }
               }

               if (var1.l6()) {
                  float var11 = com.aspose.slides.internal.s6.v3.k5(var2[0].h0(), var2[var5 - 1].h0());
                  if (var11 > 0.7071068F) {
                     com.aspose.slides.internal.s6.v3 var17 = com.aspose.slides.internal.s6.v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                     var17.l6(var2[var5 - 1 + var5]);
                     var17.l6(var2[var5]);
                     var17.l6(var2[var5 - 1]);
                     var17.l6(var2[0]);
                  }
               }
               break;
            case 2:
               for (int var6 = 1; var6 < var4; var6++) {
                  com.aspose.slides.internal.s6.v3 var7 = com.aspose.slides.internal.s6.v3.n5(var2[var6 * 2 - 1], var2[var6 * 2]).u9().h0();
                  var7.l6(var2[var6 * 2 + var5]);
                  var7.l6(var2[var6 * 2 - 1 + var5]);
                  var7.l6(var2[var6 * 2]);
                  var7.l6(var2[var6 * 2 - 1]);
               }

               if (var1.l6()) {
                  com.aspose.slides.internal.s6.v3 var9 = com.aspose.slides.internal.s6.v3.n5(var2[0], var2[var5 - 1]).u9().h0();
                  var9.l6(var2[var5 - 1 + var5]);
                  var9.l6(var2[var5]);
                  var9.l6(var2[var5 - 1]);
                  var9.l6(var2[0]);
               }
         }
      }
   }
}
