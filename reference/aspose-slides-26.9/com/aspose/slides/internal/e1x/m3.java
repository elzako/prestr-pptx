package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m3 {
   private com.aspose.slides.internal.n2d.k5 n5;
   private boolean l6;
   private int[] k5;
   private com.aspose.slides.internal.n2d.t9 u3;
   private com.aspose.slides.internal.z0k.e2 a6;
   private com.aspose.slides.internal.z0k.e2 u9;
   private com.aspose.slides.internal.z0k.e2 h0;

   public final com.aspose.slides.internal.z0k.e2 n5() {
      return this.a6;
   }

   public final com.aspose.slides.internal.z0k.e2 l6() {
      return this.u9;
   }

   public final com.aspose.slides.internal.z0k.e2 k5() {
      return this.h0;
   }

   public m3(com.aspose.slides.internal.n2d.k5 var1, boolean var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final int n5(a3 var1, a3 var2, w1 var3, com.aspose.slides.internal.n2d.k7 var4) {
      this.n5(var1);
      this.n5(var2, var3, var4);
      this.a6();
      return this.u3.n5() - 1;
   }

   public final Dictionary<Integer, t1> n5(a3 var1, a3 var2, com.aspose.slides.internal.n2d.k7 var3, int var4) {
      this.n5(var1);
      Dictionary var5 = new Dictionary();
      com.aspose.slides.internal.n2d.k7 var6 = n5(var3);

      for (int var7 = 0; var7 < var6.n5(); var7++) {
         t1 var8 = new t1(var4);
         int var9 = com.aspose.slides.internal.v6g.k5.u3(var6.k5(var7), int.class);
         this.n5(var9, var2, var8, 1.0F, 1.0F, 0.0F, 0.0F);
         var5.set_Item(var7, var8);
      }

      return var5;
   }

   public final Dictionary<Long, t1> n5(a3 var1, a3 var2, List<Long> var3, int var4) {
      Dictionary var5 = new Dictionary();
      this.n5(var1);
      List$Enumerator var6 = var3.iterator();

      try {
         while (var6.hasNext()) {
            long var7 = com.aspose.slides.internal.v6g.k5.u3(var6.next(), long.class);
            t1 var9 = new t1(var4);
            this.n5((int)var7, var2, var9, 1.0F, 1.0F, 0.0F, 0.0F);
            var5.set_Item(var7, var9);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var5;
   }

   private void n5(int var1, a3 var2, t1 var3, float var4, float var5, float var6, float var7) {
      this.n5.n5().setPosition(var2.k5 + this.k5[var1]);
      short var8 = this.n5.u3();
      this.n5.n5().setPosition(this.n5.n5().getPosition() - 2L);
      if (var8 < 0) {
         this.n5(var3, var2);
      } else {
         this.n5(var3, var4, var5, var6, var7);
      }
   }

   private void n5(t1 var1, a3 var2) {
      this.n5.u3();
      var1.n5(this.n5.u3());
      var1.l6(this.n5.u3());
      var1.k5(this.n5.u3());
      var1.u3(this.n5.u3());

      int var7;
      do {
         float var3 = 1.0F;
         float var4 = 1.0F;
         float var5 = 0.0F;
         float var6 = 0.0F;
         var7 = this.n5.a6() & 65535;
         int var8 = this.n5.a6() & 65535;
         boolean var9 = (var7 & 1) != 0;
         boolean var10 = (var7 & 2) != 0;
         int var11;
         int var12;
         if (var9) {
            var11 = var10 ? this.n5.u3() : this.n5.a6() & 65535;
            var12 = var10 ? this.n5.u3() : this.n5.a6() & 65535;
         } else {
            var11 = var10 ? this.n5.u9() : this.n5.u9() & 0xFF;
            var12 = var10 ? this.n5.u9() : this.n5.u9() & 0xFF;
         }

         if ((var7 & 8) != 0) {
            var3 = var4 = this.u3();
         } else if ((var7 & 64) != 0) {
            var3 = this.u3();
            var4 = this.u3();
         } else if ((var7 & 128) != 0) {
            var3 = this.u3();
            var5 = this.u3();
            var6 = this.u3();
            var4 = this.u3();
         }

         long var13 = this.n5.n5().getPosition();
         if (var10 && (var7 & 4) != 0) {
            int var15 = var11;
            int var16 = var12;
            var1.a6().n5(var15, var16);
         }

         this.n5(var8, var2, var1, var3, var4, var6, var5);
         this.n5.n5().setPosition(var13);
      } while ((var7 & 32) != 0);

      if ((var7 & 256) != 0) {
         int var17 = this.n5.a6() & 65535;
         this.n5.n5(var17);
      }
   }

   private void n5(t1 var1, float var2, float var3, float var4, float var5) {
      short var6 = this.n5.u3();
      var1.n5(this.n5.u3());
      var1.l6(this.n5.u3());
      var1.k5(this.n5.u3());
      var1.u3(this.n5.u3());
      int[] var7 = new int[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = this.n5.a6() & 65535;
      }

      int var19 = 0;

      for (int var9 = 0; var9 < var7.length; var9++) {
         var19 = 1 + (var19 < var7[var9] ? var7[var9] : var19);
      }

      int var20 = this.n5.a6() & 65535;
      this.n5.n5(var20);
      byte[] var10 = new byte[var19];

      for (int var11 = 0; var11 < var19; var11++) {
         byte var12 = this.n5.u9();
         var10[var11] = var12;
         boolean[] var13 = com.aspose.slides.internal.n2d.t4.l6(var10[var11]);
         if (var13[3]) {
            int var14 = this.n5.u9() & 255;

            for (int var15 = 0; var15 < var14; var15++) {
               var10[++var11] = var12;
            }
         }
      }

      int[] var21 = new int[var19];

      for (int var22 = 0; var22 < var19; var22++) {
         boolean[] var24 = com.aspose.slides.internal.n2d.t4.l6(var10[var22]);
         if (var24[1]) {
            var21[var22] = (this.n5.u9() & 255) * (var24[4] ? 1 : -1);
         } else {
            var21[var22] = var24[4] ? var21[var22] : this.n5.u3();
         }
      }

      int[] var23 = new int[var19];

      for (int var25 = 0; var25 < var19; var25++) {
         boolean[] var27 = com.aspose.slides.internal.n2d.t4.l6(var10[var25]);
         if (var27[2]) {
            var23[var25] = (this.n5.u9() & 255) * (var27[5] ? 1 : -1);
         } else {
            var23[var25] = var27[5] ? var23[var25] : this.n5.u3();
         }
      }

      int var26 = 0;

      for (int var28 = 0; var28 < var19; var28++) {
         boolean[] var29 = com.aspose.slides.internal.n2d.t4.l6(var10[var28]);
         boolean var16 = var7[var26] == var28;
         if (var16) {
            var26++;
         }

         float var17 = var21[var28] * var2 + var4 * var23[var28];
         float var18 = var21[var28] * var5 + var23[var28] * var3;
         var1.a6().n5(com.aspose.slides.internal.v6g.k5.u3(var17, 13), com.aspose.slides.internal.v6g.k5.u3(var18, 13), var29[0], var16);
      }
   }

   private float u3() {
      short var1 = this.n5.u3();
      return var1 / 16384.0F;
   }

   private void n5(a3 var1) {
      this.n5.n5().setPosition(var1.k5);
      if (this.l6) {
         int var2 = var1.u3 / 2;
         this.k5 = new int[var2];

         for (int var3 = 0; var3 < var2; var3++) {
            this.k5[var3] = (this.n5.a6() & 65535) * 2;
         }
      } else {
         int var4 = var1.u3 / 4;
         this.k5 = new int[var4];

         for (int var5 = 0; var5 < var4; var5++) {
            this.k5[var5] = this.n5.l6();
         }
      }
   }

   private void a6() {
      this.a6 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.n2d.u3 var1 = new com.aspose.slides.internal.n2d.u3(this.a6);
      if (this.l6) {
         for (int var2 = 0; var2 < this.u3.n5(); var2++) {
            var1.l6(this.u3.l6(var2) / 2);
         }
      } else {
         for (int var3 = 0; var3 < this.u3.n5(); var3++) {
            var1.n5(this.u3.l6(var3));
         }
      }
   }

   private void n5(a3 var1, w1 var2, com.aspose.slides.internal.n2d.k7 var3) {
      com.aspose.slides.internal.n2d.k7 var4 = n5(var3);
      this.u3 = new com.aspose.slides.internal.n2d.t9();
      this.u9 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.n2d.u3 var5 = new com.aspose.slides.internal.n2d.u3(this.u9);
      this.h0 = new com.aspose.slides.internal.z0k.e2();
      com.aspose.slides.internal.n2d.u3 var6 = new com.aspose.slides.internal.n2d.u3(this.h0);

      for (int var7 = 0; var7 < var4.n5(); var7++) {
         this.u3.k5((int)var5.n5().getPosition());
         int var8 = com.aspose.slides.internal.v6g.k5.u3(var4.k5(var7), int.class);
         this.n5.n5().setPosition(var1.k5 + this.k5[var8]);
         int var9 = this.k5[var8 + 1] - this.k5[var8];
         if (var9 > 0) {
            short var10 = this.n5.u3();
            if (var10 < 0) {
               var5.l6(var10);
               byte[] var11 = this.n5.n5(8);
               var5.n5(var11, 0, var11.length);

               int var12;
               do {
                  var12 = this.n5.a6() & 65535;
                  var5.l6(var12);
                  int var13 = this.n5.a6() & 65535;
                  Object var14 = var3.a6(var13);
                  int var15;
                  if (var14 != null) {
                     var15 = com.aspose.slides.internal.v6g.k5.u3(var14, int.class);
                  } else {
                     int var16 = var4.u3(var4.n5() - 1);
                     var15 = var16 + 1;
                     var3.n5(var13, var15);
                     var4.n5(var15, var13);
                  }

                  byte[] var21 = this.n5.n5(n5(var12));
                  var5.l6(var15);
                  var5.n5(var21, 0, var21.length);
               } while ((var12 & 32) != 0);

               if ((var12 & 256) != 0) {
                  int var17 = this.n5.a6() & 65535;
                  byte[] var18 = this.n5.n5(var17);
                  var5.l6(var17);
                  var5.n5(var18, 0, var18.length);
               }
            } else {
               this.n5.n5().setPosition(this.n5.n5().getPosition() - 2L);
               byte[] var20 = this.n5.n5(var9);
               var5.n5(var20, 0, var20.length);
            }

            if (com.aspose.slides.internal.n2d.t4.n5(var5.n5().getPosition())) {
               var5.n5((byte)0);
            }
         }

         j5 var19 = var2.n5(var8).n5();
         var19.n5(var6);
      }

      this.u3.k5((int)var5.n5().getPosition());
   }

   private static int n5(int var0) {
      byte var1;
      if ((var0 & 1) != 0) {
         var1 = 4;
      } else {
         var1 = 2;
      }

      if ((var0 & 8) != 0) {
         var1 += 2;
      } else if ((var0 & 64) != 0) {
         var1 += 4;
      } else if ((var0 & 128) != 0) {
         var1 += 8;
      }

      return var1;
   }

   private static com.aspose.slides.internal.n2d.k7 n5(com.aspose.slides.internal.n2d.k7 var0) {
      com.aspose.slides.internal.n2d.k7 var1 = new com.aspose.slides.internal.n2d.k7();

      for (int var2 = 0; var2 < var0.n5(); var2++) {
         int var3 = var0.u3(var2);
         int var4 = com.aspose.slides.internal.v6g.k5.u3(var0.k5(var2), int.class);
         var1.n5(var4, var3);
      }

      return var1;
   }
}
