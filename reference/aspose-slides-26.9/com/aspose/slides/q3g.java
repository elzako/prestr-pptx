package com.aspose.slides;

class q3g {
   public static e4c n5(e4c var0, double var1, u6x[] var3) {
      e4c var4 = l6(var0.n5, var0.l6, var1).u9();
      n5(var4.u9(), var1).u3(var3[0]);
      return var4;
   }

   private static boolean k5(double var0, double var2) {
      double var4 = 0.001;
      return var0 <= var2 + var4 && var0 >= var2 - var4;
   }

   private static e4c l6(double var0, double var2, double var4) {
      e4c var6 = new e4c();
      if (var4 < 0.0) {
         var4 += 360.0;
      }

      var4 %= 360.0;
      if (!k5(var4, 0.0) && !k5(var4, 180.0)) {
         if (!k5(var4, 90.0) && !k5(var4, 270.0)) {
            double var7 = a6(var4) * (Math.PI / 180.0);
            double var9 = com.aspose.slides.ms.System.q1.c8(var7);
            double var11 = com.aspose.slides.ms.System.q1.h0(var7);
            double var13 = com.aspose.slides.ms.System.q1.l6(var0, var2);
            double var15 = com.aspose.slides.ms.System.q1.k5(var0, var2);
            double var17 = 100.0;

            for (int var19 = 0; var19 <= var17; var19++) {
               double var20 = (var17 - var19) / var17;
               double var22 = var13 * var20;
               double var24 = var13 - var22;
               double var26 = var24 / var9;
               double var28 = var26 * var11;
               double var30 = var22 / var11;
               double var32 = var30 * var9;
               double var34 = var28 + var32 - var15;
               double var36 = var34 * var9;
               double var38 = var36 * var9;
               double var40 = var15 - var32 + var38;
               if (var34 >= 0.0 && var40 <= var15 && var40 >= 0.0) {
                  double var42 = var34 * var11;
                  new e4c();
                  e4c var44;
                  if (var0 < var2) {
                     var44 = new e4c(var30 - var36, var26 - var42);
                  } else {
                     var44 = new e4c(var26 - var42, var30 - var36);
                  }

                  if (var44.l6 * var44.n5 > var6.n5 * var6.l6) {
                     var44.l6(var6);
                  }
               }
            }

            return var6;
         } else {
            return new e4c(var2, var0);
         }
      } else {
         return new e4c(var0, var2);
      }
   }

   public static double n5(e4c var0, e4c var1) {
      double var2 = var1.n5 - var0.n5;
      double var4 = var1.l6 - var0.l6;
      return com.aspose.slides.ms.System.q1.z3(var2 * var2 + var4 * var4);
   }

   public static int n5(e4c var0, e4c var1, e4c var2, e4c var3, e4c[] var4) {
      double var5 = 1.0E-7;
      double var7 = (var0.n5 - var1.n5) * (var3.l6 - var2.l6) - (var0.l6 - var1.l6) * (var3.n5 - var2.n5);
      double var9 = (var0.n5 - var2.n5) * (var3.l6 - var2.l6) - (var0.l6 - var2.l6) * (var3.n5 - var2.n5);
      double var11 = (var0.n5 - var1.n5) * (var0.l6 - var2.l6) - (var0.l6 - var1.l6) * (var0.n5 - var2.n5);
      if (com.aspose.slides.ms.System.q1.n5(var7) < 1.0E-7) {
         e4c.k5.l6(var4[0]);
         return 0;
      } else {
         double var13 = var9 / var7;
         double var15 = var11 / var7;
         if (-1.0E-7 <= var13 && var13 <= 1.0000001 && -1.0E-7 <= var15) {
            var4[0] = new e4c(var0.n5 + var13 * (var1.n5 - var0.n5), var0.l6 + var13 * (var1.l6 - var0.l6));
            return 1;
         } else {
            e4c.k5.l6(var4[0]);
            return -1;
         }
      }
   }

   public static boolean n5(e4c var0, double var1, e4c var3, e4c var4, e4c[] var5) {
      e4c var6 = new e4c(var4.n5 - var3.n5, var4.l6 - var3.l6);
      e4c var7 = new e4c();
      e4c[] var8 = new e4c[]{var7};
      boolean var9 = l6(var0.u9(), new e4c(var0.n5 + var6.n5().n5, var0.l6 + var6.n5().l6), var3.u9(), var4.u9(), var8) > 0;
      var8[0].l6(var7);
      if (var9) {
         double var10 = n5(var7.u9(), var0.u9());
         double var12 = com.aspose.slides.ms.System.q1.z3(var1 * var1 - var10 * var10);
         e4c var14 = var6.u3().u9();
         var5[0] = new e4c(var7.n5 - var14.n5 * var12, var7.l6 - var14.l6 * var12);
         if (n5(var3.u9(), var4.u9(), var5[0].u9())) {
            return true;
         }
      }

      e4c.k5.l6(var5[0]);
      return false;
   }

   public static int l6(e4c var0, e4c var1, e4c var2, e4c var3, e4c[] var4) {
      double var5 = (var0.n5 - var1.n5) * (var3.l6 - var2.l6) - (var0.l6 - var1.l6) * (var3.n5 - var2.n5);
      double var7 = (var0.n5 - var2.n5) * (var3.l6 - var2.l6) - (var0.l6 - var2.l6) * (var3.n5 - var2.n5);
      if (com.aspose.slides.ms.System.q1.n5(var5) < 1.0E-7) {
         e4c.k5.l6(var4[0]);
         return 0;
      } else {
         double var9 = var7 / var5;
         var4[0] = new e4c(var0.n5 + var9 * (var1.n5 - var0.n5), var0.l6 + var9 * (var1.l6 - var0.l6));
         return 1;
      }
   }

   public static boolean n5(double var0, double var2) {
      return com.aspose.slides.ms.System.q1.n5(var0) <= var2;
   }

   public static boolean n5(e4c var0, e4c var1, double var2) {
      return com.aspose.slides.ms.System.q1.n5(var0.n5 - var1.n5) <= var2 && com.aspose.slides.ms.System.q1.n5(var0.l6 - var1.l6) <= var2;
   }

   public static boolean n5(e4c var0, e4c var1, e4c var2) {
      if (n5(var0.u9(), var2.u9(), 1.0E-5F)) {
         return true;
      }

      if (n5(var1.u9(), var2.u9(), 1.0E-5F)) {
         return true;
      }

      e4c var3 = e4c.l6(var1, var0).u9();
      e4c var4 = e4c.l6(var2, var0).u9();
      e4c var5 = e4c.l6(var2, var1).u9();
      double var6 = var3.n5 * var4.l6 - var4.n5 * var3.l6;
      double var8 = var3.n5 * var4.n5 + var3.l6 * var4.l6;
      double var10 = var3.n5 * var5.n5 + var3.l6 * var5.l6;
      return n5(var6, 1.0E-7) && var8 > -1.0E-7 && var10 < 1.0E-7;
   }

   public static double n5(double var0) {
      return var0 * 360.0 / 127.0;
   }

   public static double l6(double var0) {
      return var0 / 360.0 * 127.0;
   }

   public static double k5(double var0) {
      double var2 = var0 % 360.0;
      if (var2 < 0.0) {
         var2 += 360.0;
      }

      return var2;
   }

   public static boolean l6(double var0, double var2) {
      if (var0 == 0.0 && var2 == 0.0) {
         return false;
      }

      var0 = com.aspose.slides.ms.System.q1.n5(var0);
      var2 = com.aspose.slides.ms.System.q1.n5(var2);
      return u3(com.aspose.slides.ms.System.q1.k5(var0, var2) / com.aspose.slides.ms.System.q1.l6(var0, var2));
   }

   public static boolean u3(double var0) {
      return var0 < 0.9999;
   }

   public static e4c n5(double var0, double var2, double var4) {
      if (var2 != 0.0 && var4 != 0.0) {
         double var6 = var4;
         double var8 = var2;
         if (var0 < 1.0) {
            var8 = var4 * var0;
         } else if (var0 == 1.0) {
            if (var2 < var4) {
               var6 = var2;
            } else {
               var8 = var4;
            }
         } else {
            var6 = var2 / var0;
         }

         double var10 = com.aspose.slides.ms.System.q1.k5(1.0, var2 / var8);
         double var12 = com.aspose.slides.ms.System.q1.k5(1.0, var4 / var6);
         var6 *= com.aspose.slides.ms.System.q1.k5(var10, var12);
         var8 *= com.aspose.slides.ms.System.q1.k5(var10, var12);
         return new e4c(var8, var6);
      } else {
         return new e4c(var2, var4);
      }
   }

   public static boolean n5(int var0) {
      return var0 == 61 || var0 == 15;
   }

   public static boolean l6(int var0) {
      return var0 == 22 || var0 == 27;
   }

   public static boolean k5(int var0) {
      return var0 >= 35 && var0 <= 60;
   }

   private static u6x n5(e4c var0, double var1) {
      com.aspose.slides.internal.w0.c8 var3 = new com.aspose.slides.internal.w0.c8();
      var3.n5((float)var1, new com.aspose.slides.internal.o9b.w1((float)(var0.n5 / 2.0), (float)(var0.l6 / 2.0)));
      com.aspose.slides.internal.o9b.y1 var4 = var3.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, (float)var0.n5, (float)var0.l6)).y4();
      return new u6x(var4.x8(), var4.n3(), var4.h0(), var4.l6());
   }

   private static double a6(double var0) {
      if (var0 < 0.0) {
         var0 += 360.0;
      }

      if (var0 > 270.0) {
         var0 = 360.0 - var0;
      } else if (var0 >= 180.0) {
         var0 = var0 - 180.0 + 1.0E-4;
      } else if (var0 > 90.0) {
         var0 = 180.0 - var0;
      }

      return var0;
   }

   public static e4c n5(u6x var0, e4c var1) {
      double var2 = var0.n5();
      double var4 = var0.k5();
      double var6 = var0.l6();
      double var8 = var0.u3();
      double var10 = var2 + (var4 - var2) / 2.0;
      double var12 = var6 + (var8 - var6) / 2.0;
      double var14 = var1.n5;
      double var16 = var1.l6;
      int var18 = n5(var0.z1(), var10, var12);
      int var19 = n5(var0.z1(), var14, var16);

      while ((var18 | var19) != 0 && (var18 & var19) == 0) {
         int var20 = var18 != 0 ? var18 : var19;
         double var21;
         double var23;
         if ((var20 & 4096) == 4096) {
            var21 = var10 + (var14 - var10) * (var6 - var12) / (var16 - var12);
            var23 = var6;
         } else if ((var20 & 256) == 256) {
            var21 = var10 + (var14 - var10) * (var8 - var12) / (var16 - var12);
            var23 = var8;
         } else if ((var20 & 16) == 16) {
            var23 = var12 + (var16 - var12) * (var4 - var10) / (var14 - var10);
            var21 = var4;
         } else if ((var20 & 1) == 1) {
            var23 = var12 + (var16 - var12) * (var2 - var10) / (var14 - var10);
            var21 = var2;
         } else {
            var21 = 0.0;
            var23 = 0.0;
         }

         if (var20 == var18) {
            var10 = var21;
            var12 = var23;
            var18 = n5(var0.z1(), var10, var12);
         } else {
            var14 = var21;
            var16 = var23;
            var19 = n5(var0.z1(), var14, var16);
         }
      }

      return new e4c(var14, var16);
   }

   public static e4c l6(u6x var0, e4c var1) {
      double var2 = com.aspose.slides.ms.System.q1.l6(var0.t2(), var0.s7()) / 2.0;
      e4c var4 = var0.x8().u9();
      e4c var5 = e4c.l6(var1, var4).u9();
      e4c var6 = (n5(var5.l6(), 1.0E-6) ? e4c.k5 : e4c.l6(var5.u3(), var2)).u9();
      return new e4c(var4.n5 + var6.n5, var4.l6 + var6.l6);
   }

   public static boolean k5(u6x var0, e4c var1) {
      double var2 = var1.n5 - var0.x8().n5;
      double var4 = var1.l6 - var0.x8().l6;
      return var2 * var2 / (var0.t2() * var0.t2()) + var4 * var4 / (var0.s7() * var0.s7()) <= 1.0;
   }

   public static double n5(e4c var0, e4c var1, e4c[] var2) {
      double var3 = var0.n5;
      double var5 = var0.l6;
      double var7 = var1.n5;
      double var9 = var1.l6;
      if (var5 > var3) {
         var3 = var0.l6;
         var5 = var0.n5;
         var7 = var1.l6;
         var9 = var1.n5;
      }

      double var11 = com.aspose.slides.ms.System.q1.n5(var7);
      double var13 = com.aspose.slides.ms.System.q1.n5(var9);
      double var15 = 0.0;
      double var17 = 0.0;
      double[] var19 = new double[]{0.0};
      double[] var20 = new double[]{0.0};
      double var21 = n5(var3, var5, var11, var13, var19, var20);
      var15 = var19[0];
      var17 = var20[0];
      if (var7 < 0.0) {
         var15 = -var15;
      }

      if (var9 < 0.0) {
         var17 = -var17;
      }

      (var0.n5 < var0.l6 ? new e4c(var17, var15) : new e4c(var15, var17)).l6(var2[0]);
      return var21;
   }

   private static double n5(double var0, double var2, double var4, double var6, double[] var8, double[] var9) {
      double var20;
      if (var6 > 0.0) {
         if (var4 > 0.0) {
            double var10 = var4 / var0;
            double var12 = var6 / var2;
            double var14 = u9(var10) + u9(var12) - 1.0;
            if (var14 != 0.0) {
               double var16 = u9(var0 / var2);
               double var18 = n5(var16, var10, var12, var14);
               var8[0] = var16 * var4 / (var18 + var16);
               var9[0] = var6 / (var18 + 1.0);
               var20 = com.aspose.slides.ms.System.q1.z3(u9(var8[0] - var4) + u9(var9[0] - var6));
            } else {
               var8[0] = var4;
               var9[0] = var6;
               var20 = 0.0;
            }
         } else {
            var8[0] = 0.0;
            var9[0] = var2;
            var20 = com.aspose.slides.ms.System.q1.n5(var6 - var2);
         }
      } else {
         double var22 = var0 * var4;
         double var23 = u9(var0) - u9(var2);
         if (var22 < var23) {
            double var24 = var22 / var23;
            var8[0] = var0 * var24;
            var9[0] = var2 * com.aspose.slides.ms.System.q1.z3(1.0 - var24 * var24);
            var20 = com.aspose.slides.ms.System.q1.z3(u9(var8[0] - var4) + u9(var9[0]));
         } else {
            var8[0] = var0;
            var9[0] = 0.0;
            var20 = com.aspose.slides.ms.System.q1.n5(var4 - var0);
         }
      }

      return var20;
   }

   private static double u9(double var0) {
      return var0 * var0;
   }

   private static double n5(double var0, double var2, double var4, double var6) {
      byte var8 = 10;
      double var9 = var0 * var2;
      double var11 = var4 - 1.0;
      double var13 = var6 < 0.0 ? 0.0 : u3(var9, var4) - 1.0;
      double var15 = 0.0;

      for (int var17 = 0; var17 < 10; var17++) {
         var15 = (var11 + var13) / 2.0;
         if (var15 == var11 || var15 == var13) {
            break;
         }

         double var18 = var9 / (var15 + var0);
         double var20 = var4 / (var15 + 1.0);
         var6 = u9(var18) + u9(var20) - 1.0;
         if (var6 > 0.0) {
            var11 = var15;
         } else {
            if (!(var6 < 0.0)) {
               break;
            }

            var13 = var15;
         }
      }

      return var15;
   }

   private static double u3(double var0, double var2) {
      return com.aspose.slides.ms.System.q1.z3(var0 * var0 + var2 * var2);
   }

   private static int n5(u6x var0, double var1, double var3) {
      short var5 = 0;
      if (var1 < var0.n5()) {
         var5 |= 1;
      } else if (var1 > var0.k5()) {
         var5 |= 16;
      }

      if (var3 < var0.l6()) {
         var5 |= 4096;
      } else if (var3 > var0.u3()) {
         var5 |= 256;
      }

      return var5;
   }
}
