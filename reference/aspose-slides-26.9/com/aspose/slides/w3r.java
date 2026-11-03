package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class w3r implements IDisposable {
   protected float n5;
   protected float l6;
   protected float k5;
   protected float u3;
   protected float a6 = 0.0F;
   protected float u9 = 0.0F;
   protected a8s[] h0;
   protected List<Integer> c8 = new List<>();
   protected double[] t2 = new double[0];
   protected List<t9z> s7 = null;
   protected com.aspose.slides.internal.o9b.c8[] x8;
   protected String[] n3;
   protected com.aspose.slides.internal.o9b.n3 y4;
   protected com.aspose.slides.internal.o9b.c8 e2 = com.aspose.slides.internal.n2d.l6.y1().o8();
   protected float[] t9 = new float[]{0.0F};
   protected int z1 = 1;
   protected float t4 = 1.0F;
   protected int q0 = 0;
   protected boolean z3 = true;
   protected int m1 = -1;
   private boolean k7 = false;

   protected w3r() {
   }

   public w3r(
      float var1, float var2, float var3, float var4, double[] var5, com.aspose.slides.internal.o9b.c8[] var6, float var7, String[] var8, List<t9z> var9
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private void n5(
      float var1, float var2, float var3, float var4, double[] var5, com.aspose.slides.internal.o9b.c8[] var6, float var7, String[] var8, List<t9z> var9
   ) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.t2 = var5;
      this.x8 = var6;
      this.a6 = var7;
      this.n3 = var8;
      this.s7 = var9;
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.k7) {
         if (var1) {
            for (a8s var5 : this.h0) {
               var5.dispose();
            }
         }

         this.k7 = true;
      }
   }

   public final void n5(com.aspose.slides.internal.o9b.n3 var1) {
      this.y4 = var1;
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.e2);
   }

   public final void n5(float[] var1) {
      this.t9 = var1;
   }

   public final void n5(float var1) {
      this.u9 = var1 % 360.0F;
      if (this.u9 < 0.0F) {
         this.u9 += 360.0F;
      }
   }

   final void n5(g3y var1) {
      List var2 = var1.c8();
      int var3 = var1.t2().n3().getRotation3D().getRotationY() & 65535;
      this.n5(var3 - 90.0F);
      float[] var4 = new float[var2.size()];

      for (int var5 = 0; var5 < var2.size(); var5++) {
         var4[var5] = ((t9z)var2.get_Item(var5)).t4() / 100.0F;
      }

      this.n5(var4);
      f3h var7 = var1.c8().get_Item(0).t9();
      this.n5(var7.t2());
      this.n5(var7.s7().o8());
      this.h0();
      if (this.z3) {
         com.aspose.slides.internal.o9b.y1 var6 = this.l6().y4();
         this.n5(var6.y4());
      }
   }

   public final void n5() {
      this.t2();
      if (this.a6 > 0.0F) {
         this.c8();
      }

      this.s7();
   }

   public void n5(n1g var1) {
      com.aspose.slides.internal.o9b.e5 var2 = new com.aspose.slides.internal.o9b.e5();
      var2.n5(1);
      var2.l6(1);
      double var3 = 0.0;

      for (double var8 : this.t2) {
         var3 += var8;
      }

      for (a8s var10 : this.h0) {
         if (var10 != null && var10.u9().length() >= 1) {
            t9z var11 = var10.t4();
            g3y var12 = var11.y4();
            int var13 = var12.c8().indexOf(var11);
            t9z var14 = var1.y4().get_Item(0).c8().get_Item(var13);
            f3h var15 = var14.t9();
            if (var15.l6().isVisible() || !"".equals(var15.k5().getText())) {
               double var16;
               if (var3 == 0.0) {
                  var16 = 0.01;
               } else {
                  var16 = com.aspose.slides.ms.System.q1.n5(var11.n5()) / var3;
               }

               com.aspose.slides.internal.o9b.f2 var18 = n5(var15, var1).a6();
               com.aspose.slides.internal.o9b.f2 var19 = var18.a6();
               com.aspose.slides.internal.o9b.f2 var20 = h2g.n5(var1.y4(), var12.l6(), var11.z1(), var16, var18.l6(), var18.k5(), 0.0, var1).a6();
               if (com.aspose.slides.ms.System.n1.k5(var15.l6().getWidth()) || com.aspose.slides.ms.System.n1.k5(var15.l6().getHeight())) {
                  var20.l6(var19);
               }

               com.aspose.slides.internal.o9b.y1 var21 = com.aspose.slides.internal.o9b.y1.n5.y4();
               float var22 = 0.0F;
               com.aspose.slides.internal.o9b.w1 var23 = com.aspose.slides.internal.o9b.w1.n5.u3();
               boolean var24 = false;
               int var25 = var15.c8();
               if (!com.aspose.slides.ms.System.n1.k5(var15.l6().getX()) || !com.aspose.slides.ms.System.n1.k5(var15.l6().getY())) {
                  int var26 = var25;
                  var25 = var15.l6().c8().getLabels().getDefaultDataLabelFormat().getPosition();
                  if (var25 == 4) {
                     float var27 = 0.0F;
                     float[] var28 = new float[]{0.0F};
                     com.aspose.slides.internal.o9b.w1 var29 = var10.n5(0.47F, var28).u3();
                     var27 = var28[0];
                     com.aspose.slides.internal.o9b.w1[] var30 = new com.aspose.slides.internal.o9b.w1[]{var29};
                     this.l6(var10, var30, var27, var19.a6());
                     var30[0].n5(var29);
                     if (!this.n5(var10, new com.aspose.slides.internal.o9b.y1(var29.u3(), var19.a6()))) {
                        var25 = var26;
                     }
                  }
               }

               while (!var24) {
                  switch (var25) {
                     case 1:
                     case 3:
                     case 5:
                     default:
                        boolean var50 = !com.aspose.slides.ms.System.n1.k5(var15.l6().getX()) || !com.aspose.slides.ms.System.n1.k5(var15.l6().getY());
                        com.aspose.slides.internal.o9b.f2 var52 = (var50 ? var18 : var19).a6();
                        float var54 = 0.47F;
                        float[] var56 = new float[]{var22};
                        var10.n5(var54, var56).n5(var23);
                        var22 = var56[0];
                        com.aspose.slides.internal.o9b.w1[] var31 = new com.aspose.slides.internal.o9b.w1[]{var23};
                        this.l6(var10, var31, var22, var52.a6());
                        var31[0].n5(var23);
                        boolean var32 = this.n5(var10, new com.aspose.slides.internal.o9b.y1(var23.u3(), var52.a6()));
                        if (var32) {
                           var24 = true;
                        } else {
                           var56[0] = var22;
                           var10.n5(0.5F, var56).n5(var23);
                           var22 = var56[0];
                           var31[0] = var23;
                           this.n5(var10, var31, var22, var19.a6());
                           var31[0].n5(var23);
                           com.aspose.slides.internal.o9b.y1 var33 = new com.aspose.slides.internal.o9b.y1(
                              g6z.n5(var23.l6()), g6z.n5(var23.k5()), g6z.n5(var19.l6()), g6z.n5(var19.k5())
                           );
                           com.aspose.slides.internal.o9b.y1[] var34 = new com.aspose.slides.internal.o9b.y1[]{var33};
                           var1.n5(var34);
                           var34[0].a6(var33);
                           g6z.l6(com.aspose.slides.internal.o9b.y2.l6(var33.y4()).n3()).u3(var15.k5.n5);
                           float var35 = !com.aspose.slides.ms.System.n1.k5(var15.l6().getX()) ? var15.l6().getX() * var1.c4() + var33.x8() : var33.x8();
                           float var36 = !com.aspose.slides.ms.System.n1.k5(var15.l6().getY()) ? var15.l6().getY() * var1.y2() + var33.n3() : var33.n3();
                           var23 = new com.aspose.slides.internal.o9b.w1(var35, var36);
                           var24 = true;
                        }
                        break;
                     case 2:
                        float[] var43 = new float[]{var22};
                        var10.n5(0.25F, var43).n5(var23);
                        var22 = var43[0];
                        var23.n5(var23.l6() - var19.l6() / 2.0F);
                        var23.l6(var23.k5() - var19.k5() / 2.0F);
                        var24 = true;
                        break;
                     case 4:
                        float var42 = 0.485F;
                        float[] var48 = new float[]{var22};
                        var10.n5(var42, var48).n5(var23);
                        var22 = var48[0];
                        com.aspose.slides.internal.o9b.w1[] var49 = new com.aspose.slides.internal.o9b.w1[]{var23};
                        this.l6(var10, var49, var22, var19.a6());
                        var49[0].n5(var23);
                        var24 = true;
                        break;
                     case 6:
                        float[] var46 = new float[]{var22};
                        var10.n5(0.5F, var46).n5(var23);
                        var22 = var46[0];
                        com.aspose.slides.internal.o9b.w1[] var47 = new com.aspose.slides.internal.o9b.w1[]{var23};
                        this.n5(var10, var47, var22, var19.a6());
                        var47[0].n5(var23);
                        if (!com.aspose.slides.ms.System.n1.k5(var15.l6().getX())) {
                           var23.n5(var23.l6() + var15.l6().getX() * var1.c4());
                        }

                        if (!com.aspose.slides.ms.System.n1.k5(var15.l6().getY())) {
                           var23.l6(var23.k5() + var15.l6().getY() * var1.y2());
                        }

                        var24 = true;
                  }
               }

               var21 = new com.aspose.slides.internal.o9b.y1(var23.u3(), var19.a6());
               com.aspose.slides.internal.o9b.y1[] var44 = new com.aspose.slides.internal.o9b.y1[]{var21};
               var1.n5(var44);
               var44[0].a6(var21);
               h2g.n5(var12.l6(), var11.z1(), var16, var21.y4(), 0.0, var1);
               if (var11.y4().u3() && !var15.n3()) {
                  float[] var51 = new float[]{var22};
                  com.aspose.slides.internal.o9b.w1 var53 = var10.n5(0.5F, var51).u3();
                  var22 = var51[0];
                  if (var22 >= 5.0F && var22 <= 175.0F) {
                     var53.l6(var53.k5() + var10.c8());
                  }

                  com.aspose.slides.internal.o9b.f2 var57 = var20.a6();
                  com.aspose.slides.internal.o9b.w1 var58 = new com.aspose.slides.internal.o9b.w1(
                     var21.x8() + (var21.s7() - var57.l6()) / 2.0F, var21.n3() + (var21.k5() - var57.k5()) / 2.0F
                  );
                  com.aspose.slides.internal.o9b.y1 var55 = new com.aspose.slides.internal.o9b.y1(var58.u3(), var57.a6());
                  if (!this.n5(var11)) {
                     this.n5(var10, var11.y4(), var55.y4(), var53.u3());
                  }
               }
            }
         }
      }
   }

   private boolean n5(t9z var1) {
      ChartDataPointCollection var2 = var1.s7().u3();
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            IChartDataPoint var4 = (IChartDataPoint)var3.next();
            if (var4 != var1.s7() && var4.getLabel().isVisible()) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return true;
   }

   private void n5(a8s var1, com.aspose.slides.internal.o9b.w1[] var2, float var3, com.aspose.slides.internal.o9b.f2 var4) {
      if (var3 > 67.5 && var3 < 112.5) {
         var2[0].n5((float)(var2[0].l6() - (var3 - 67.5) * var4.l6() / 45.0));
      } else if (var3 >= 112.5 && var3 <= 247.5) {
         var2[0].n5(var2[0].l6() - var4.l6());
      } else if (var3 > 247.5 && var3 < 270.0F) {
         double var5 = var1.k5();
         var2[0].n5((float)(var2[0].l6() - var4.l6() + var4.l6() / var5));
      } else if (var3 >= 270.0F && var3 < 292.5) {
         var2[0].n5((float)(var2[0].l6() - var4.l6() + (var3 - 247.5) * var4.l6() / 45.0));
      }

      if (var3 >= 0.0F && var3 <= 90.0F) {
         var2[0].l6(var2[0].k5() + var1.c8() * (var3 / 90.0F));
      } else if (var3 > 90.0F && var3 < 180.0F) {
         var2[0].l6(var2[0].k5() + var1.c8() * ((var3 - 180.0F) * -1.0F / 90.0F));
      } else if (var3 < 225.0F && var3 > 180.0F) {
         var2[0].l6(var2[0].k5() - (var3 - 135.0F) * var4.k5() / 90.0F);
      } else if (var3 >= 225.0F && var3 <= 315.0F) {
         var2[0].l6(var2[0].k5() - var4.k5());
      } else if (var3 > 315.0F && var3 <= 360.0F) {
         var2[0].l6(var2[0].k5() - var4.k5() + (var3 - 315.0F) * var4.k5() / 90.0F);
      }
   }

   private void l6(a8s var1, com.aspose.slides.internal.o9b.w1[] var2, float var3, com.aspose.slides.internal.o9b.f2 var4) {
      if (var3 > 67.5 && var3 < 112.5) {
         var2[0].n5((float)(var2[0].l6() - (112.5 - var3) * var4.l6() / 45.0));
      } else if (var3 > 247.5 && var3 < 292.5) {
         var2[0].n5((float)(var2[0].l6() - (var3 - 247.5) * var4.l6() / 45.0));
      } else if (var3 <= 67.5 || var3 >= 292.5) {
         var2[0].n5(var2[0].l6() - var4.l6());
      }

      if (var3 < 22.5) {
         var2[0].l6(var2[0].k5() - var4.k5() / 2.0F - var3 * var4.k5() / 45.0F);
      } else if (var3 > 337.5) {
         var2[0].l6(var2[0].k5() - var4.k5() / 2.0F + (360.0F - var3) * var4.k5() / 45.0F);
      } else if (var3 > 157.5 && var3 < 202.5) {
         var2[0].l6((float)(var2[0].k5() - (202.5 - var3) * var4.k5() / 45.0));
      } else if (var3 <= 157.5 && var3 >= 22.5) {
         var2[0].l6(var2[0].k5() - var4.k5());
      }
   }

   private void n5(a8s var1, g3y var2, com.aspose.slides.internal.o9b.y1 var3, com.aspose.slides.internal.o9b.w1 var4) {
      com.aspose.slides.internal.x4g.s7 var5 = this.x8();
      float var6 = var1.h0().s7() / 2.0F * 0.05F;
      com.aspose.slides.internal.o9b.y1 var7 = s2w.n5(var5).y4();
      com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1(var7.x8() + var7.s7() / 2.0F, var7.n3() + var7.k5() / 2.0F);
      com.aspose.slides.internal.o9b.w1 var9 = var4.u3();
      if (var4.l6() < var8.l6()) {
         var9.n5(var9.l6() - 1.0F);
      } else {
         var9.n5(var9.l6() + 1.0F);
      }

      if (var4.k5() < var8.k5()) {
         var9.l6(var9.k5() - 1.0F);
      } else {
         var9.l6(var9.k5() + 1.0F);
      }

      com.aspose.slides.internal.o9b.w1 var10 = new com.aspose.slides.internal.o9b.w1(var3.a6(), var3.t2() + var3.k5() / 3.0F);
      com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var3.a6() + var3.s7() / 3.0F, var3.t2());
      com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var3.h0(), var3.t2() + var3.k5() / 3.0F);
      com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(var3.a6() + var3.s7() / 3.0F, var3.l6());
      int var14 = this.n5(var4.u3(), var3.y4());
      com.aspose.slides.internal.x4g.s7 var15 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.a0 var16 = null;
      com.aspose.slides.internal.o9b.w1 var17 = com.aspose.slides.internal.o9b.w1.n5.u3();
      LineFormat var18 = (LineFormat)com.aspose.slides.internal.v6g.k5.n5(var2.u9().getLabels(), DataLabelCollection.class).getLeaderLinesFormat().getLine();
      com.aspose.slides.internal.o9b.c8 var19 = var2.t2().n3().n5((byte)(var2.t2().n3().getStyle() + 1 > 40 ? 1 : 0)).o8();
      com.aspose.slides.internal.o9b.l6 var20 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var21 = com.aspose.slides.internal.o9b.z1.n5(var20);
      switch (var14) {
         case 1:
            var17 = new com.aspose.slides.internal.o9b.w1(var12.l6() + var6, var12.k5());
            var15.n5(var12.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var67 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var67);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() <= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var78 = new com.aspose.slides.internal.x4g.s7();
               var78.n5(var12.u3(), var17.u3());
               var78.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var78, var18, null, null);
            }
            break;
         case 2:
            var17 = new com.aspose.slides.internal.o9b.w1(var12.l6() + var6, var12.k5());
            var15.n5(var12.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var65 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var65);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() <= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var77 = new com.aspose.slides.internal.x4g.s7();
               var77.n5(var12.u3(), var17.u3());
               var77.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var77, var18, null, null);
            } else {
               var15 = new com.aspose.slides.internal.x4g.s7();
               var17 = new com.aspose.slides.internal.o9b.w1(var13.l6(), var13.k5() + var6);
               var15.n5(var13.u3(), var17.u3());
               var15.n5(var17.u3(), var9.u3());
               var65 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
               com.aspose.slides.internal.n2d.y4.n5(var15, var65);
               var16 = new com.aspose.slides.internal.o9b.a0(var15);
               var16.l6(var5);
               if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() <= var4.k5()) {
                  com.aspose.slides.internal.x4g.s7 var76 = new com.aspose.slides.internal.x4g.s7();
                  var76.n5(var13.u3(), var17.u3());
                  var76.n5(var17.u3(), var4.u3());
                  w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var76, var18, null, null);
               }
            }
            break;
         case 3:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var15.n5(var9.u3(), new com.aspose.slides.internal.o9b.w1(var9.l6(), var13.k5()));
            com.aspose.slides.internal.o9b.m3 var64 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var64);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() <= var4.k5()) {
               com.aspose.slides.internal.x4g.s7 var75 = new com.aspose.slides.internal.x4g.s7();
               var75.n5(var9.u3(), new com.aspose.slides.internal.o9b.w1(var9.l6(), var13.k5()));
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var75, var18, null, null);
            }
            break;
         case 4:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var17 = new com.aspose.slides.internal.o9b.w1(var10.l6() - var6, var10.k5());
            var15.n5(var10.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var62 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var62);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() >= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var74 = new com.aspose.slides.internal.x4g.s7();
               var74.n5(var10.u3(), var17.u3());
               var74.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var74, var18, null, null);
            } else {
               var15 = new com.aspose.slides.internal.x4g.s7();
               var17 = new com.aspose.slides.internal.o9b.w1(var13.l6(), var13.k5() + var6);
               var15.n5(var13.u3(), var17.u3());
               var15.n5(var17.u3(), var9.u3());
               var62 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
               com.aspose.slides.internal.n2d.y4.n5(var15, var62);
               var16 = new com.aspose.slides.internal.o9b.a0(var15);
               var16.l6(var5);
               if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() <= var4.k5()) {
                  com.aspose.slides.internal.x4g.s7 var73 = new com.aspose.slides.internal.x4g.s7();
                  var73.n5(var13.u3(), var17.u3());
                  var73.n5(var17.u3(), var4.u3());
                  w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var73, var18, null, null);
               }
            }
            break;
         case 5:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var17 = new com.aspose.slides.internal.o9b.w1(var10.l6() - var6, var10.k5());
            var15.n5(var10.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var61 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var61);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() >= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var72 = new com.aspose.slides.internal.x4g.s7();
               var72.n5(var10.u3(), var17.u3());
               var72.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var72, var18, null, null);
            }
            break;
         case 6:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var17 = new com.aspose.slides.internal.o9b.w1(var10.l6() - var6, var10.k5());
            var15.n5(var10.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var59 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var59);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() >= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var71 = new com.aspose.slides.internal.x4g.s7();
               var71.n5(var10.u3(), var17.u3());
               var71.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var71, var18, null, null);
            } else {
               var15 = new com.aspose.slides.internal.x4g.s7();
               var17 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5() - var6);
               var15.n5(var11.u3(), var17.u3());
               var15.n5(var17.u3(), var9.u3());
               var59 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
               com.aspose.slides.internal.n2d.y4.n5(var15, var59);
               var16 = new com.aspose.slides.internal.o9b.a0(var15);
               var16.l6(var5);
               if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() >= var4.k5()) {
                  com.aspose.slides.internal.x4g.s7 var70 = new com.aspose.slides.internal.x4g.s7();
                  var70.n5(var11.u3(), var17.u3());
                  var70.n5(var17.u3(), var4.u3());
                  w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var70, var18, null, null);
               }
            }
            break;
         case 7:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var17 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5() - var6);
            var15.n5(var9.u3(), new com.aspose.slides.internal.o9b.w1(var9.l6(), var11.k5()));
            com.aspose.slides.internal.o9b.m3 var58 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var58);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() >= var4.k5()) {
               com.aspose.slides.internal.x4g.s7 var69 = new com.aspose.slides.internal.x4g.s7();
               var69.n5(var9.u3(), new com.aspose.slides.internal.o9b.w1(var9.l6(), var11.k5()));
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var69, var18, null, null);
            }
            break;
         case 8:
            var15 = new com.aspose.slides.internal.x4g.s7();
            var17 = new com.aspose.slides.internal.o9b.w1(var12.l6() + var6, var12.k5());
            var15.n5(var12.u3(), var17.u3());
            var15.n5(var17.u3(), var9.u3());
            com.aspose.slides.internal.o9b.m3 var22 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
            com.aspose.slides.internal.n2d.y4.n5(var15, var22);
            var16 = new com.aspose.slides.internal.o9b.a0(var15);
            var16.l6(var5);
            if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.l6() <= var4.l6()) {
               com.aspose.slides.internal.x4g.s7 var68 = new com.aspose.slides.internal.x4g.s7();
               var68.n5(var12.u3(), var17.u3());
               var68.n5(var17.u3(), var4.u3());
               w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var68, var18, null, null);
            } else {
               var15 = new com.aspose.slides.internal.x4g.s7();
               var17 = new com.aspose.slides.internal.o9b.w1(var11.l6(), var11.k5() - var6);
               var15.n5(var11.u3(), var17.u3());
               var15.n5(var17.u3(), var9.u3());
               var22 = w5k.n5(var19.o8(), var18, var2.t2(), 1.0F);
               com.aspose.slides.internal.n2d.y4.n5(var15, var22);
               var16 = new com.aspose.slides.internal.o9b.a0(var15);
               var16.l6(var5);
               if (com.aspose.slides.internal.n2d.y4.l6(var16, var21) && var17.k5() >= var4.k5()) {
                  com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();
                  var23.n5(var11.u3(), var17.u3());
                  var23.n5(var17.u3(), var4.u3());
                  w5k.n5(var19.o8(), com.aspose.slides.internal.o9b.c8.u3.o8(), var2.t2(), var23, var18, null, null);
               }
            }
      }
   }

   private int n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.y1 var2) {
      byte var3 = 0;
      if (var2.h0() < var1.l6()) {
         if (var2.l6() < var1.k5()) {
            var3 = 2;
         } else if (var2.t2() > var1.k5()) {
            var3 = 8;
         } else {
            var3 = 1;
         }
      } else if (var2.a6() > var1.l6()) {
         if (var2.l6() < var1.k5()) {
            var3 = 4;
         } else if (var2.t2() > var1.k5()) {
            var3 = 6;
         } else {
            var3 = 5;
         }
      } else if (var2.l6() < var1.k5()) {
         var3 = 3;
      } else if (var2.t2() > var1.k5()) {
         var3 = 7;
      } else {
         var3 = 0;
      }

      return var3;
   }

   private com.aspose.slides.internal.x4g.s7 x8() {
      com.aspose.slides.internal.x4g.s7 var1 = new com.aspose.slides.internal.x4g.s7();

      for (a8s var5 : this.h0) {
         var1.l6(var5.h0().x8(), var5.h0().n3(), var5.h0().s7(), var5.h0().k5(), var5.l6(), var5.k5());
         var1.l6(var5.h0().x8(), var5.h0().n3() + var5.c8(), var5.h0().s7(), var5.h0().k5(), var5.l6(), var5.k5());
      }

      return var1;
   }

   private boolean n5(a8s var1, com.aspose.slides.internal.o9b.y1 var2) {
      var2 = new com.aspose.slides.internal.o9b.y1(var2.x8(), var2.n3(), var2.s7(), var2.k5());
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.l6(new com.aspose.slides.internal.o9b.y1(this.n5, this.l6, this.k5, this.u3));
      com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();
      var4.l6(var1.h0().x8(), var1.h0().n3(), var1.h0().s7(), var1.h0().k5(), var1.l6(), var1.k5());
      com.aspose.slides.internal.o9b.a0 var5 = new com.aspose.slides.internal.o9b.a0(var3);
      var5.u3(var4);
      com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(1, 1);
      com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);
      var5.l6(var2.y4());
      return var5.l6(var7) || var5.n5(var7).s7() < 1.0F || var5.n5(var7).k5() < 1.0F;
   }

   protected final com.aspose.slides.internal.o9b.y1 l6() {
      com.aspose.slides.internal.o9b.y1 var1 = this.h0[0].z1().y4();

      for (int var2 = 1; var2 < this.h0.length; var2++) {
         com.aspose.slides.internal.o9b.y1.l6(var1.y4(), this.h0[var2].z1().y4()).a6(var1);
      }

      return var1;
   }

   protected final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      float var2 = this.k5 / var1.s7();
      float var3 = this.u3 / var1.k5();
      float var4 = var1.x8() - this.n5;
      float var5 = var1.n3() - this.l6;

      for (a8s var9 : this.h0) {
         float var10 = var9.h0().x8() - var4;
         float var11 = var9.h0().n3() - var5;
         float var12 = var9.h0().s7() * var2;
         float var13 = var9.h0().k5() * var3;
         float var14 = var9.c8() * var3;
         var9.n5(var10, var11, var12, var13, var14);
      }
   }

   protected final float k5() {
      float var1 = 0.0F;

      for (int var2 = 0; var2 < this.t9.length && var2 < this.t2.length; var2++) {
         if (this.t9[var2] > var1) {
            var1 = this.t9[var2];
         }
      }

      return var1;
   }

   protected final com.aspose.slides.internal.o9b.f2 u3() {
      float var1 = 1.0F + this.k5();
      float var2 = this.k5 / var1;
      float var3 = this.u3 / var1 * (1.0F - this.a6);
      return new com.aspose.slides.internal.o9b.f2(var2, var3);
   }

   protected final com.aspose.slides.internal.o9b.f2 a6() {
      float var1 = this.k5();
      float var2 = this.u3().l6() * var1;
      float var3 = this.u3().k5() * var1;
      return new com.aspose.slides.internal.o9b.f2(var2, var3);
   }

   protected final float u9() {
      return this.u3 / (1.0F + this.k5()) * this.a6;
   }

   protected void h0() {
      double var1 = 0.0;

      for (double var6 : this.t2) {
         var1 += var6;
      }

      com.aspose.slides.internal.o9b.f2 var23 = this.u3().a6();
      com.aspose.slides.internal.o9b.f2 var24 = this.a6().a6();
      int var25 = this.t9.length - 1;
      List var8 = new List();
      this.c8.clear();
      int var9 = 0;
      int var10 = -1;
      int var11 = 0;
      double var12 = this.u9;

      for (int var14 = 0; var14 < this.t2.length; var14++) {
         double var15 = this.t2[var14];
         double var17 = var15 / var1 * 360.0;
         float var19 = this.t9[var11];
         float var20 = this.t9[var11];
         if (var19 > 0.0F) {
            com.aspose.slides.internal.o9b.f2 var21 = this.n5((float)(var12 + var17 / 2.0), this.t9[var11]).a6();
            var19 = var21.l6();
            var20 = var21.k5();
         }

         a8s var26 = null;
         if (var14 == this.m1) {
            var26 = this.n5(
               this.n5 + var24.l6() / 2.0F + var19,
               this.l6 + var24.k5() / 2.0F + var20,
               var23.l6(),
               var23.k5(),
               this.u9(),
               (float)(var12 % 360.0),
               (float)var17,
               this.x8[var9].o8(),
               this.q0,
               this.z1,
               this.t4
            );
         } else {
            t9z var22 = this.s7 != null && var14 < this.s7.size() ? this.s7.get_Item(var14) : null;
            var26 = this.n5(
               this.n5 + var24.l6() / 2.0F + var19,
               this.l6 + var24.k5() / 2.0F + var20,
               var23.l6(),
               var23.k5(),
               this.u9(),
               (float)(var12 % 360.0),
               (float)var17,
               this.x8[var9].o8(),
               this.q0,
               this.z1,
               this.t4,
               var22
            );
         }

         var26.n5(this.n3[var14]);
         if (var10 <= -1 && (!(var12 <= 270.0) || !(var12 + var17 > 270.0)) && (!(var12 >= 270.0) || !(var12 + var17 > 630.0))) {
            var8.addItem(var26);
            this.c8.addItem(var14);
         } else {
            var8.insertItem(++var10, var26);
            this.c8.insertItem(var10, var14);
         }

         if (var11 < var25) {
            var11++;
         }

         if (++var9 >= this.x8.length) {
            var9 = 0;
         }

         var12 += var17;
         if (var12 > 360.0) {
            var12 -= 360.0;
         }
      }

      this.h0 = (a8s[])var8.toArray(new a8s[0]);
   }

   protected a8s n5(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      com.aspose.slides.internal.o9b.c8 var8,
      int var9,
      int var10,
      float var11,
      t9z var12
   ) {
      return new a8s(var1, var2, var3, var4, var5, var6 % 360.0F, var7, var8.o8(), var9, var10, var11, var12);
   }

   protected a8s n5(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      com.aspose.slides.internal.o9b.c8 var8,
      int var9,
      int var10,
      float var11
   ) {
      com.aspose.slides.internal.o9b.c8 var12 = r1q.n5(var8.o8(), 0.3F).o8();
      return new a8s(var1, var2, var3, var4, var5, var6 % 360.0F, var7, var12.o8(), var9, var10, var11);
   }

   protected final com.aspose.slides.internal.o9b.f2 n5(float var1, float var2) {
      if (var2 == 0.0F) {
         return com.aspose.slides.internal.o9b.f2.n5;
      }

      float var3 = (float)(this.u3().l6() * var2 / 2.0F * com.aspose.slides.ms.System.q1.c8(var1 * Math.PI / 180.0));
      float var4 = (float)(this.u3().k5() * var2 / 2.0F * com.aspose.slides.ms.System.q1.h0(var1 * Math.PI / 180.0));
      return new com.aspose.slides.internal.o9b.f2(var3, var4);
   }

   protected final void c8() {
      List var1 = new List();
      var1.addRange(com.aspose.slides.ms.System.u3.n5(this.h0));
      a8s var2 = null;
      if (this.h0[0].l6() > 90.0F && this.h0[0].l6() <= 270.0F && this.h0[0].l6() + this.h0[0].k5() > 450.0F) {
         var2 = (a8s)var1.get_Item(0);
         a8s[] var13 = var2.l6(0.0F);
         var1.set_Item(0, var13[0]);
         if (var13[1].k5() > 0.0F) {
            var1.insertItem(1, var13[1]);
         }
      } else if (this.h0[0].l6() > 270.0F && this.h0[0].l6() + this.h0[0].k5() > 450.0F
         || this.h0[0].l6() < 90.0F && this.h0[0].l6() + this.h0[0].k5() > 270.0F) {
         var2 = (a8s)var1.get_Item(0);
         a8s[] var3 = var2.l6(180.0F);
         var1.set_Item(0, var3[1]);
         if (var3[1].k5() > 0.0F) {
            var1.addItem(var3[0]);
         }
      }

      var2 = (a8s)var1.get_Item(0);
      var2.t2();
      int var14 = 1;
      int var4 = var1.size() - 1;

      while (var14 < var4) {
         a8s var5 = (a8s)var1.get_Item(var4);
         float var6 = var5.l6() - 90.0F;
         if (var6 > 180.0F || var6 < 0.0F) {
            var6 = 0.0F;
         }

         a8s var7 = (a8s)var1.get_Item(var14);
         float var8 = (450.0F - var7.a6()) % 360.0F;
         if (var8 > 180.0F || var8 < 0.0F) {
            var8 = 0.0F;
         }

         if (var8 >= var6) {
            var7.t2();
            var14++;
         } else if (var8 < var6) {
            var5.t2();
            var4--;
         }
      }

      var2 = (a8s)var1.get_Item(var4);
      var2.t2();
   }

   protected final void t2() {
      for (a8s var4 : this.h0) {
         var4.e2();
      }
   }

   protected final void s7() {
      for (a8s var4 : this.h0) {
         var4.t9();
      }
   }

   private static com.aspose.slides.internal.o9b.f2 n5(f3h var0, n1g var1) {
      if (var0 == null) {
         throw new ArgumentNullException("labelContext");
      }

      if (var1 == null) {
         throw new ArgumentNullException("chartContext");
      }

      float var2 = var0.l6().getWidth();
      float var3 = var0.l6().getHeight();
      if (!com.aspose.slides.ms.System.n1.k5(var2) && !com.aspose.slides.ms.System.n1.k5(var3)) {
         return new com.aspose.slides.internal.o9b.f2(var2 * var1.c4() * 0.95F, var3 * var1.y2());
      }

      boolean var4 = var0.l6().getDataLabelFormat().getFormat().getLine().getFillFormat().getFillType() != 0
         || var0.l6().getDataLabelFormat().getFormat().getLine().getFillFormat().getFillType() != -1;
      float var5 = var4 ? 0.175F : 0.2F;
      return new com.aspose.slides.internal.o9b.f2(var1.c4() * var5, var1.y2());
   }
}
