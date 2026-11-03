package com.aspose.slides.internal.g7;

public class q1 extends k6 {
   private w8 k5;
   private boolean u3 = false;
   private Object a6 = new Object();

   public q1() {
      this.k5 = new w8();
   }

   public final k6 n5() {
      k6 var1 = new k6();

      for (Object recoveredElement$var3$264 : this.u9().n5()) {
         q9 var3 = (q9)recoveredElement$var3$264;
         var1.u9().n5().n5(var3);
      }

      var1.n5(this.h0());
      var1.l6(this.c8());
      var1.n5(this.n3());
      var1.l6(this.x8());
      var1.k5(this.t2());
      var1.u3(this.s7());
      return var1;
   }

   public final w8 l6() {
      return this.k5;
   }

   @Override
   public h8 k5() {
      if (!this.u3) {
         synchronized (this.a6) {
            if (!this.u3) {
               int var2 = 0;
               int var3 = 0;

               for (Object recoveredElement$var5$766 : this.l6()) {
                  u5 var5 = (u5)recoveredElement$var5$766;
                  var2 += ((v2x)var5.n5().k5()).u3;
                  var3 += ((v2x)var5.n5().k5()).n5;
               }

               v2x var18 = v2x.k5();
               var18.a6 = new double[var2];
               var18.u9 = new double[var2];
               var18.k5 = new byte[var2];
               var18.h0 = new boolean[var2];
               var18.c8 = new boolean[var2];
               var18.l6 = new int[var3];

               for (Object recoveredElement$var6$1230 : this.l6()) {
                  u5 var6 = (u5)recoveredElement$var6$1230;
                  v2 var7 = var6.l6();
                  v2x var8 = (v2x)var6.n5().k5();

                  for (int var9 = 0; var9 < var8.u3; var9++) {
                     double var10 = 0.0;
                     double var12 = 0.0;
                     double[] var14 = new double[]{0.0};
                     double[] var15 = new double[]{0.0};
                     var7.n5(var8.a6[var9], var8.u9[var9], var14, var15);
                     var10 = var14[0];
                     var12 = var15[0];
                     var18.a6[var9 + var18.u3] = var10;
                     var18.u9[var9 + var18.u3] = var12;
                     var18.k5[var9 + var18.u3] = var8.k5[var9];
                     var18.h0[var9 + var18.u3] = var8.h0[var9];
                     var18.c8[var9 + var18.u3] = var8.c8[var9];
                  }

                  for (int var20 = 0; var20 < var8.l6.length; var20++) {
                     var18.l6[var20 + var18.n5] = var18.u3 + (var8.l6[var20] & 65535) & 65535;
                  }

                  var18.u3 = var18.u3 + var8.u3;
                  var18.n5 = var18.n5 + var8.n5;
               }

               this.l6 = var18;
               this.u3 = true;
            }
         }
      }

      return this.l6;
   }

   @Override
   public void n5(h8 var1) {
      this.l6 = var1;
   }
}
