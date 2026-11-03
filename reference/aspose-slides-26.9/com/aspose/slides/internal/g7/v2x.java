package com.aspose.slides.internal.g7;

public class v2x extends h8 {
   public int n5;
   public int[] l6;
   public byte[] k5;
   public int u3;
   public double[] a6;
   public double[] u9;
   public boolean[] h0;
   public boolean[] c8;
   public byte[] t2;

   private v2x() {
   }

   public static v2x l6() {
      v2x var0 = new v2x();
      var0.n5 = 0;
      var0.l6 = new int[var0.n5];
      var0.k5 = new byte[var0.n5];
      var0.u3 = 0;
      var0.a6 = new double[var0.n5];
      var0.u9 = new double[var0.n5];
      var0.h0 = new boolean[var0.n5];
      var0.c8 = new boolean[var0.n5];
      var0.t2 = new byte[var0.n5];
      return var0;
   }

   public static v2x k5() {
      return new v2x();
   }

   public final v2x u3() {
      v2x var1 = new v2x();
      var1.l6 = new int[this.l6.length];
      var1.k5 = new byte[this.k5.length];
      var1.a6 = new double[this.a6.length];
      var1.u9 = new double[this.u9.length];
      var1.t2 = new byte[this.t2.length];
      var1.h0 = new boolean[this.h0.length];
      var1.c8 = new boolean[this.c8.length];
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.l6)), 0, this.l6.length * 2);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.k5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.k5)), 0, this.k5.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.a6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.a6)), 0, this.a6.length * 8);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.u9)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.u9)), 0, this.u9.length * 8);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.h0)), 0, this.h0.length);
      com.aspose.slides.ms.System.y4.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.c8)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1.c8)), 0, this.c8.length);
      var1.u3 = this.u3;
      var1.n5 = this.n5;
      return var1;
   }

   @Override
   public n4 n5() {
      n4 var1 = super.n5();
      double var2 = 0.0;
      double var4 = 0.0;
      int var6 = -1;

      for (int var7 = 0; var7 < this.u3; var7++) {
         this.k5[var7] = (byte)(this.k5[var7] & 0xFF & 1);
      }

      for (int var36 = 0; var36 < this.l6.length; var36++) {
         double var8 = 0.0;
         double var10 = 0.0;
         boolean var12 = false;

         for (int var13 = var6 + 1; var13 <= (this.l6[var36] & 65535); var13++) {
            if (var13 == var6 + 1 && !var12) {
               if ((this.k5[var13] & 255 & 1) == 0 && (this.k5[this.l6[var36] & 65535] & 255 & 1) != 0) {
                  var2 = this.a6[this.l6[var36] & 65535];
                  var4 = this.u9[this.l6[var36] & 65535];
                  var8 = var2;
                  var10 = var4;
                  var1.n5().n5(new j0(var2, var4));
                  var13--;
               } else {
                  var2 = this.a6[var13];
                  var4 = this.u9[var13];
                  var8 = var2;
                  var10 = var4;
                  var1.n5().n5(new j0(var2, var4));
               }

               var12 = true;
            } else if ((this.k5[var13] & 255 & 1) != 0) {
               var2 = this.a6[var13];
               var4 = this.u9[var13];
               var1.n5().n5(new f7(var2, var4));
            } else {
               int var14 = var13 - 1;
               int var15 = var14 == var6 ? this.l6[var36] & 65535 : var14;
               int var16 = 0;
               int var17 = 0;

               while (true) {
                  if (var13 == (this.l6[var36] & 65535) + 1) {
                     var16 = var6 + 1;
                     break;
                  }

                  if ((this.k5[var13] & 255 & 1) != 0) {
                     var16 = var13;
                     break;
                  }

                  var13++;
                  var17++;
               }

               int var18;
               int var19;
               switch (var17) {
                  case 0:
                     var2 = this.a6[var16];
                     var4 = this.u9[var16];
                     var1.n5().n5(new f7(var2, var4));
                     continue;
                  case 1:
                     var2 = this.a6[var16];
                     var4 = this.u9[var16];
                     var1.n5()
                        .n5(
                           new z5(
                              (this.a6[var15] + 2.0 * this.a6[var14 + 1]) / 3.0,
                              (this.u9[var15] + 2.0 * this.u9[var14 + 1]) / 3.0,
                              (2.0 * this.a6[var14 + 1] + this.a6[var16]) / 3.0,
                              (2.0 * this.u9[var14 + 1] + this.u9[var16]) / 3.0,
                              var2,
                              var4
                           )
                        );
                     continue;
                  case 2:
                     var2 = this.a6[var16];
                     var4 = this.u9[var16];
                     var1.n5()
                        .n5(
                           new z5(
                              (-this.a6[var15] + 4.0 * this.a6[var14 + 1]) / 3.0,
                              (-this.u9[var15] + 4.0 * this.u9[var14 + 1]) / 3.0,
                              (4.0 * this.a6[var14 + 2] - this.a6[var16]) / 3.0,
                              (4.0 * this.u9[var14 + 2] - this.u9[var16]) / 3.0,
                              this.a6[var16],
                              this.u9[var16]
                           )
                        );
                     continue;
                  case 3:
                     var1.n5()
                        .n5(
                           new z5(
                              (this.a6[var15] + 2.0 * this.a6[var14 + 1]) / 3.0,
                              (this.u9[var15] + 2.0 * this.u9[var14 + 1]) / 3.0,
                              (5.0 * this.a6[var14 + 1] + this.a6[var14 + 2]) / 6.0,
                              (5.0 * this.u9[var14 + 1] + this.u9[var14 + 2]) / 6.0,
                              (this.a6[var14 + 1] + this.a6[var14 + 2]) / 2.0,
                              (this.u9[var14 + 1] + this.u9[var14 + 2]) / 2.0
                           )
                        );
                     var1.n5()
                        .n5(
                           new z5(
                              (this.a6[var14 + 1] + 5.0 * this.a6[var14 + 2]) / 6.0,
                              (this.u9[var14 + 1] + 5.0 * this.u9[var14 + 2]) / 6.0,
                              (5.0 * this.a6[var14 + 2] + this.a6[var14 + 3]) / 6.0,
                              (5.0 * this.u9[var14 + 2] + this.u9[var14 + 3]) / 6.0,
                              (this.a6[var14 + 3] + this.a6[var14 + 2]) / 2.0,
                              (this.u9[var14 + 3] + this.u9[var14 + 2]) / 2.0
                           )
                        );
                     var2 = this.a6[var16];
                     var4 = this.u9[var16];
                     var1.n5()
                        .n5(
                           new z5(
                              (this.a6[var14 + 2] + 5.0 * this.a6[var14 + 3]) / 6.0,
                              (this.u9[var14 + 2] + 5.0 * this.u9[var14 + 3]) / 6.0,
                              (2.0 * this.a6[var14 + 3] + this.a6[var16]) / 3.0,
                              (2.0 * this.u9[var14 + 3] + this.u9[var16]) / 3.0,
                              var2,
                              var4
                           )
                        );
                     continue;
                  default:
                     var18 = var14 + var17;
                     var1.n5()
                        .n5(
                           new z5(
                              (this.a6[var15] + 2.0 * this.a6[var14 + 1]) / 3.0,
                              (this.u9[var15] + 2.0 * this.u9[var14 + 1]) / 3.0,
                              (5.0 * this.a6[var14 + 1] + this.a6[var14 + 2]) / 6.0,
                              (5.0 * this.u9[var14 + 1] + this.u9[var14 + 2]) / 6.0,
                              (this.a6[var14 + 1] + this.a6[var14 + 2]) / 2.0,
                              (this.u9[var14 + 1] + this.u9[var14 + 2]) / 2.0
                           )
                        );
                     var19 = var14 + 2;
               }

               while (var19 <= var18 - 1) {
                  var1.n5()
                     .n5(
                        new z5(
                           (this.a6[var19 - 1] + 5.0 * this.a6[var19]) / 6.0,
                           (this.u9[var19 - 1] + 5.0 * this.u9[var19]) / 6.0,
                           (5.0 * this.a6[var19] + this.a6[var19 + 1]) / 6.0,
                           (5.0 * this.u9[var19] + this.u9[var19 + 1]) / 6.0,
                           (this.a6[var19] + this.a6[var19 + 1]) / 2.0,
                           (this.u9[var19] + this.u9[var19 + 1]) / 2.0
                        )
                     );
                  var19++;
               }

               var2 = this.a6[var16];
               var4 = this.u9[var16];
               var1.n5()
                  .n5(
                     new z5(
                        (this.a6[var18 - 1] + 5.0 * this.a6[var18]) / 6.0,
                        (this.u9[var18 - 1] + 5.0 * this.u9[var18]) / 6.0,
                        (2.0 * this.a6[var18] + this.a6[var16]) / 3.0,
                        (2.0 * this.u9[var18] + this.u9[var16]) / 3.0,
                        var2,
                        var4
                     )
                  );
            }
         }

         var6 = this.l6[var36] & 65535;
         var1.n5().n5(new b5(var8, var10));
      }

      return var1;
   }
}
