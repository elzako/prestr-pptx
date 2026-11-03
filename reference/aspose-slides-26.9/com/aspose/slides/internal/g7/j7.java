package com.aspose.slides.internal.g7;

class j7 {
   private int n5;
   private u3 l6;
   private u3 k5;
   private u3 u3;
   private k0 a6;
   private j7$n5 u9 = new j7$n5();

   public final byte[] n5(byte[] var1) {
      z3 var2 = new z3(var1);
      boolean var3 = var2.l6();
      this.u9 = new j7$n5();
      this.u9.k5 = 100;
      this.l6 = new u3(var2, 8);
      this.k5 = new u3(var2, 8);
      this.n5 = var2.l6(24);
      this.a6 = new k0(this.n5);
      this.u3 = new u3(var2, this.a6.a6);
      return this.n5(var3);
   }

   private byte[] n5(boolean var1) {
      byte[] var2 = n5(this.n5 + 7168);
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2(this.n5);

      try {
         int var4 = 7168;

         while (true) {
            byte var18;
            while (true) {
               if (var4 >= var2.length) {
                  var3.close();
                  return var3.toArray();
               }

               short var5 = this.u3.n5();
               if (var5 < 256) {
                  var18 = (byte)var5;
                  break;
               }

               if (var5 == this.a6.n5) {
                  int var21 = var4 - 2;
                  var18 = var2[var21];
                  break;
               }

               if (var5 == this.a6.l6) {
                  int var20 = var4 - 4;
                  var18 = var2[var20];
                  break;
               }

               if (var5 == this.a6.k5) {
                  int var19 = var4 - 6;
                  var18 = var2[var19];
                  break;
               }

               int var8 = 0;
               int[] var9 = new int[]{0};
               int var10 = this.n5(var5, var9);
               var8 = var9[0];
               int var11 = this.l6(var8);
               if (var11 >= 512) {
                  var10++;
               }

               int var12 = var4 - var11 - var10 + 1;

               for (int var13 = 0; var13 < var10; var13++) {
                  int var7 = var12 + var13;
                  var18 = var2[var7];
                  var2[var4++] = var18;
                  if (var1) {
                     j7$n5[] var14 = new j7$n5[]{this.u9};
                     n5(var14, var18, var3);
                     var14[0].n5(this.u9);
                  } else {
                     var3.writeByte(var18);
                  }
               }
            }

            var2[var4++] = var18;
            if (var1) {
               j7$n5[] var23 = new j7$n5[]{this.u9};
               n5(var23, var18, var3);
               var23[0].n5(this.u9);
            } else {
               var3.writeByte(var18);
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   private static void n5(j7$n5[] var0, byte var1, com.aspose.slides.internal.z0k.e2 var2) {
      if (com.aspose.slides.internal.v6g.k5.u3(var0[0].k5, 6) == com.aspose.slides.internal.v6g.k5.u3((byte)0, 6)) {
         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == com.aspose.slides.internal.v6g.k5.u3(var0[0].n5, 6)) {
            var0[0].k5 = 1;
         } else {
            var2.writeByte(var1);
         }
      } else if (com.aspose.slides.internal.v6g.k5.u3(var0[0].k5, 6) == com.aspose.slides.internal.v6g.k5.u3((byte)1, 6)) {
         var0[0].l6 = var1;
         if (com.aspose.slides.internal.v6g.k5.u3(var1, 6) == 0) {
            var2.writeByte(var0[0].n5);
            var0[0].k5 = 0;
         } else {
            var0[0].k5 = 2;
         }
      } else if (com.aspose.slides.internal.v6g.k5.u3(var0[0].k5, 6) == com.aspose.slides.internal.v6g.k5.u3((byte)2, 6)) {
         for (int var3 = com.aspose.slides.internal.v6g.k5.u3(var0[0].l6, 6); var3 > 0; var3--) {
            var2.writeByte(var1);
         }

         var0[0].k5 = 0;
      } else {
         var0[0].n5 = var1;
         var0[0].k5 = 0;
      }
   }

   private static byte[] n5(int var0) {
      byte[] var1 = new byte[var0];
      int var2 = 0;

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 96; var4++) {
            var1[var2++] = (byte)var3;
            var1[var2++] = (byte)var4;
         }
      }

      for (int var9 = 0; var2 < 7168 && var9 < 256; var9++) {
         var1[var2++] = (byte)var9;
         var1[var2++] = (byte)var9;
         var1[var2++] = (byte)var9;
         var1[var2++] = (byte)var9;
      }

      return var1;
   }

   private int l6(int var1) {
      int var2 = 0;

      for (int var3 = var1; var3 > 0; var3--) {
         short var4 = this.l6.n5();
         var2 <<= 3;
         var2 |= var4;
      }

      return var2 + 1;
   }

   private int n5(short var1, int[] var2) {
      var2[0] = 0;
      byte var3 = 4;
      boolean var4 = var1 >= 0;
      int var5 = 0;

      boolean var7;
      do {
         int var9;
         if (var4) {
            var9 = var1 - 256;
            var4 = false;
            var2[0] = var9 / 8 + 1;
            var9 %= 8;
         } else {
            var9 = this.k5.n5();
         }

         var7 = (var9 & var3) == 0;
         var9 &= ~var3;
         var5 <<= 2;
         var5 |= var9;
      } while (!var7);

      return var5 + 2;
   }
}
