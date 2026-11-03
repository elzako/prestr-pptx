package com.aspose.slides.internal.g7;

class g0 {
   public static f3 n5(w0 var0, double var1, double var3) {
      d7 var5 = var0.j9().n5();
      double var6 = 0.0;
      double var8 = 0.0;
      var5.n5(new g3(var5.n5().n5() + var1, var5.n5().l6() + var3));
      double[] var10 = new double[]{0.0};
      double[] var11 = new double[]{0.0};
      var5.l6().n5(var5.n5().n5(), var5.n5().l6(), var10, var11);
      var6 = var10[0];
      var8 = var11[0];
      f3 var12 = new f3(var6, var8);
      var5.k5().n5().n5(var12);
      return var12;
   }

   public static t8 l6(w0 var0, double var1, double var3) {
      d7 var5 = var0.j9().n5();
      double var6 = 0.0;
      double var8 = 0.0;
      var5.n5(new g3(var5.n5().n5() + var1, var5.n5().l6() + var3));
      double[] var10 = new double[]{0.0};
      double[] var11 = new double[]{0.0};
      var5.l6().n5(var5.n5().n5(), var5.n5().l6(), var10, var11);
      var6 = var10[0];
      var8 = var11[0];
      t8 var12 = new t8(var6, var8);
      var5.k5().n5().n5(var12);
      return var12;
   }

   public static h7 n5(w0 var0, double var1, double var3, double var5, double var7, double var9, double var11) {
      d7 var13 = var0.j9().n5();
      double var14 = var13.n5().n5();
      double var16 = var13.n5().l6();
      double var18 = var14 + var1;
      double var20 = var16 + var3;
      double var22 = var18 + var5;
      double var24 = var20 + var7;
      double var26 = var22 + var9;
      double var28 = var24 + var11;
      double var30 = 0.0;
      double var32 = 0.0;
      double var34 = 0.0;
      double var36 = 0.0;
      double var38 = 0.0;
      double var40 = 0.0;
      var13.n5(new g3(var26, var28));
      double[] var42 = new double[]{0.0};
      double[] var43 = new double[]{0.0};
      var13.l6().n5(var18, var20, var42, var43);
      var30 = var42[0];
      var36 = var43[0];
      double[] var44 = new double[]{0.0};
      double[] var45 = new double[]{0.0};
      var13.l6().n5(var22, var24, var44, var45);
      var32 = var44[0];
      var38 = var45[0];
      double[] var46 = new double[]{0.0};
      double[] var47 = new double[]{0.0};
      var13.l6().n5(var26, var28, var46, var47);
      var34 = var46[0];
      var40 = var47[0];
      h7 var48 = new h7(var30, var36, var32, var38, var34, var40);
      var13.k5().n5().n5(var48);
      return var48;
   }

   static g4 n5(w0 var0) {
      d7 var1 = var0.j9().n5();
      g4 var2 = null;

      for (int var3 = var1.k5().n5().size() - 1; var3 >= 0; var3--) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.k5().n5().n5(var3), f3.class)) {
            f3 var4 = (f3)var1.k5().n5().n5(var3);
            var2 = new g4(var4.n5(), var4.l6());
            var1.k5().n5().n5(var2);
            break;
         }
      }

      return var2;
   }
}
