package com.aspose.slides.internal.g7;

public class k6 {
   n4 n5;
   private double k5 = -Double.MAX_VALUE;
   private double u3 = -Double.MAX_VALUE;
   private double a6;
   private double u9;
   private int h0;
   private z9 c8;
   private Object t2 = new Object();
   private Object s7 = new Object();
   private Object x8 = new Object();
   private g2 n3;
   private k6$n5 y4 = k6$n5.n5;
   h8 l6;
   private boolean e2 = false;
   private Object t9 = new Object();
   private int z1;

   public k6() {
      this.n5(0);
      this.n3 = new g2();
      this.n5 = new n4();
   }

   h8 k5() {
      return this.l6;
   }

   void n5(h8 var1) {
      this.l6 = var1;
      this.e2 = false;
   }

   final k6$n5 u3() {
      return this.y4;
   }

   final void n5(k6$n5 var1) {
      this.y4 = var1;
   }

   public final int a6() {
      return this.z1;
   }

   public final void n5(int var1) {
      this.z1 = var1;
   }

   public n4 u9() {
      if (this.k5() != null && !this.e2) {
         synchronized (this.t9) {
            if (!this.e2) {
               this.n5 = this.l6.n5();
               this.e2 = true;
            }
         }
      }

      return this.n5;
   }

   public final double h0() {
      if (this.k5 == -Double.MAX_VALUE) {
         synchronized (this.s7) {
            if (this.k5 == -Double.MAX_VALUE) {
               this.k5 = this.n3().n5();
            }
         }
      }

      return this.k5;
   }

   public final void n5(double var1) {
      this.k5 = var1;
   }

   public final double c8() {
      if (this.u3 == -Double.MAX_VALUE) {
         synchronized (this.x8) {
            if (this.u3 == -Double.MAX_VALUE) {
               this.u3 = this.n3().u3();
            }
         }
      }

      return this.u3;
   }

   public final void l6(double var1) {
      this.u3 = var1;
   }

   public final double t2() {
      return this.a6;
   }

   public final void k5(double var1) {
      this.a6 = var1;
   }

   public final double s7() {
      return this.u9;
   }

   public final void u3(double var1) {
      this.u9 = var1;
   }

   public final int x8() {
      return this.h0;
   }

   public final void l6(int var1) {
      this.h0 = var1;
   }

   public final z9 n3() {
      if (this.c8 == null) {
         synchronized (this.t2) {
            if (this.c8 == null) {
               this.c8 = new z9();
               this.l6(this.c8);
            }
         }
      }

      return this.c8;
   }

   public final void n5(z9 var1) {
      this.c8 = var1;
   }

   final g2 y4() {
      return this.n3;
   }

   final void l6(z9 var1) {
      if (var1 != null) {
         double var2;
         double var4;
         double var6;
         double var8;
         if (this.u9().n5().size() == 0) {
            var2 = 0.0;
            var4 = 0.0;
            var6 = 0.0;
            var8 = 0.0;
         } else {
            var6 = -Double.MAX_VALUE;
            var8 = -Double.MAX_VALUE;
            var2 = Double.MAX_VALUE;
            var4 = Double.MAX_VALUE;

            for (Object recoveredElement$var11$3027 : this.u9().n5()) {
               q9 var11 = (q9)recoveredElement$var11$3027;
               double var12 = -2.1474836E9F;
               double var14 = -2.1474836E9F;
               j0 var16;
               if ((var16 = com.aspose.slides.internal.v6g.k5.n5(var11, j0.class)) != null) {
                  var12 = var16.n5();
                  var14 = var16.l6();
               } else {
                  f7 var17;
                  if ((var17 = com.aspose.slides.internal.v6g.k5.n5(var11, f7.class)) != null) {
                     var12 = var17.n5();
                     var14 = var17.l6();
                  } else {
                     z5 var18;
                     if ((var18 = com.aspose.slides.internal.v6g.k5.n5(var11, z5.class)) != null) {
                        var12 = var18.u9();
                        var14 = var18.h0();
                     }
                  }
               }

               if (var12 != -2.1474836E9F && var14 != -2.1474836E9F) {
                  if (var12 < var2) {
                     var2 = var12;
                  }

                  if (var12 > var6) {
                     var6 = var12;
                  }

                  if (var14 < var4) {
                     var4 = var14;
                  }

                  if (var14 > var8) {
                     var8 = var14;
                  }
               }
            }
         }

         var1.n5(var2);
         var1.k5(var6);
         var1.l6(var4);
         var1.u3(var8);
      }
   }

   public final void n5(double var1, double var3) {
      for (Object recoveredElement$var6$4541 : this.u9().n5()) {
         q9 var6 = (q9)recoveredElement$var6$4541;
         j0 var7;
         if ((var7 = com.aspose.slides.internal.v6g.k5.n5(var6, j0.class)) != null) {
            var7.n5(var7.n5() + var1);
            var7.l6(var7.l6() + var3);
         } else {
            f7 var8;
            if ((var8 = com.aspose.slides.internal.v6g.k5.n5(var6, f7.class)) != null) {
               var8.n5(var8.n5() + var1);
               var8.l6(var8.l6() + var3);
            } else {
               z5 var9;
               if ((var9 = com.aspose.slides.internal.v6g.k5.n5(var6, z5.class)) != null) {
                  var9.n5(var9.n5() + var1);
                  var9.l6(var9.l6() + var3);
                  var9.k5(var9.u3() + var1);
                  var9.u3(var9.a6() + var3);
                  var9.a6(var9.u9() + var1);
                  var9.u9(var9.h0() + var3);
               } else {
                  b5 var10;
                  if ((var10 = com.aspose.slides.internal.v6g.k5.n5(var6, b5.class)) != null) {
                     var10.n5(var10.n5() + var1);
                     var10.l6(var10.l6() + var3);
                  }
               }
            }
         }
      }
   }

   public final void n5(v2 var1) {
      for (Object recoveredElement$var3$5740 : this.u9().n5()) {
         q9 var3 = (q9)recoveredElement$var3$5740;
         double var4 = 0.0;
         double var6 = 0.0;
         j0 var8;
         if ((var8 = com.aspose.slides.internal.v6g.k5.n5(var3, j0.class)) != null) {
            double[] var9 = new double[]{0.0};
            double[] var10 = new double[]{0.0};
            n5(var8.n5(), var8.l6(), var1, var9, var10);
            var4 = var9[0];
            var6 = var10[0];
            var8.n5(var4);
            var8.l6(var6);
         } else {
            f7 var11;
            if ((var11 = com.aspose.slides.internal.v6g.k5.n5(var3, f7.class)) != null) {
               double[] var26 = new double[]{0.0};
               double[] var29 = new double[]{0.0};
               n5(var11.n5(), var11.l6(), var1, var26, var29);
               var4 = var26[0];
               var6 = var29[0];
               var11.n5(var4);
               var11.l6(var6);
            } else {
               z5 var12;
               if ((var12 = com.aspose.slides.internal.v6g.k5.n5(var3, z5.class)) != null) {
                  double[] var27 = new double[]{0.0};
                  double[] var30 = new double[]{0.0};
                  n5(var12.n5(), var12.l6(), var1, var27, var30);
                  var4 = var27[0];
                  var6 = var30[0];
                  var12.n5(var4);
                  var12.l6(var6);
                  var27[0] = var4;
                  var30[0] = var6;
                  n5(var12.u3(), var12.a6(), var1, var27, var30);
                  var4 = var27[0];
                  var6 = var30[0];
                  var12.k5(var4);
                  var12.u3(var6);
                  var27[0] = var4;
                  var30[0] = var6;
                  n5(var12.u9(), var12.h0(), var1, var27, var30);
                  var4 = var27[0];
                  var6 = var30[0];
                  var12.a6(var4);
                  var12.u9(var6);
               } else {
                  b5 var13;
                  if ((var13 = com.aspose.slides.internal.v6g.k5.n5(var3, b5.class)) != null) {
                     double[] var28 = new double[]{0.0};
                     double[] var31 = new double[]{0.0};
                     n5(var13.n5(), var13.l6(), var1, var28, var31);
                     var4 = var28[0];
                     var6 = var31[0];
                     var13.n5(var4);
                     var13.l6(var6);
                  }
               }
            }
         }
      }
   }

   private static void n5(double var0, double var2, v2 var4, double[] var5, double[] var6) {
      var5[0] = var0 * var4.n5() + var2 * var4.l6();
      var6[0] = var0 * var4.k5() + var2 * var4.u3();
   }
}
