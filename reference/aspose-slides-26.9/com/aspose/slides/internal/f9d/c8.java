package com.aspose.slides.internal.f9d;

import com.aspose.slides.internal.r1x.p6;

abstract class c8 extends h0 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private y4[] a6;
   private int u9;
   private boolean h0 = true;

   protected c8(int var1, int var2) {
      super(var1, var2);
   }

   public void n3() {
   }

   public final p6 n5(byte[] var1, int var2) {
      String var3 = null;
      boolean var4 = true;
      int var5 = 0;
      if (this.h0) {
         p6 var6 = this.y4().n5();
         if (!var6.n5) {
            var4 = false;
            var3 = var6.k5;
         } else {
            int var7 = var6.l6;
            if (var7 == this.k5()) {
               this.s7();
               this.a6 = k5(4096 - this.u3());
               this.k5 = 0;
               this.u3 = -1;
               this.u9 = 1 << this.a6();
            } else if (var7 == this.l6()) {
               var2 = 0;
            } else {
               var4 = false;
               var3 = "Failed to decode. The first compression code should be <CC>. Table is not ready.";
            }
         }

         this.h0 = false;
      } else {
         int[] var12 = new int[]{0};
         this.n5(var1, var12, var2);
         var5 = var12[0];
      }

      if (var4) {
         while (var5 < var2) {
            if (this.k5 >= this.c8()) {
               this.x8();
            }

            p6 var13 = this.y4().n5();
            if (!var13.n5) {
               var4 = false;
               var3 = var13.k5;
               break;
            }

            int var15 = var13.l6;
            if (var15 == this.k5()) {
               this.s7();
               this.u3 = -1;
               this.k5 = 0;
            } else {
               if (var15 == this.l6()) {
                  break;
               }

               if (var15 < this.k5()) {
                  byte var8 = (byte)var15;
                  var1[var5++] = var8;
                  int[] var9 = new int[]{this.k5};
                  n5(var8, this.a6, var9, this.u3, this.u9);
                  this.k5 = var9[0];
                  this.u3 = var15;
               } else {
                  int var16 = var15 - this.u3();
                  if (var16 < this.k5) {
                     int[] var17 = new int[]{var5};
                     byte var10 = this.n5(var16, var1, var17, var2);
                     var5 = var17[0];
                     int[] var11 = new int[]{this.k5};
                     n5(var10, this.a6, var11, this.u3, this.u9);
                     this.k5 = var11[0];
                  } else {
                     var16 = this.k5;
                     if (this.u3 >= this.u9) {
                        y4 var18 = this.a6[this.u3 - this.u9].n5();
                        int[] var21 = new int[]{this.k5};
                        n5(var18.n5, this.a6, var21, this.u3, this.u9);
                        this.k5 = var21[0];
                     } else {
                        if (this.u3 < 0) {
                           var4 = false;
                           var3 = "The first compressed code is incorrect. String table is not created yet.";
                           break;
                        }

                        int[] var19 = new int[]{this.k5};
                        n5((byte)this.u3, this.a6, var19, this.u3, this.u9);
                        this.k5 = var19[0];
                     }

                     int[] var20 = new int[]{var5};
                     this.n5(this.k5 - 1, var1, var20, var2);
                     var5 = var20[0];
                  }

                  this.u3 = this.u9 + var16;
               }
            }
         }
      }

      p6 var14 = new p6();
      var14.n5 = var4;
      var14.l6 = var5;
      var14.k5 = var3;
      return var14;
   }

   private static y4[] k5(int var0) {
      y4[] var1 = new y4[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = new y4();
      }

      return var1;
   }

   protected abstract p6 y4();

   private static void n5(byte var0, y4[] var1, int[] var2, int var3, int var4) {
      if (var2[0] < var1.length) {
         if (var3 >= var4) {
            int var5 = var3 - var4;
            y4 var6 = var1[var5].n5();
            y4 var7 = new y4();
            var7.l6 = var0;
            var7.u3 = var6.u3 + 1;
            var7.k5 = var2[0] - var5;
            var7.n5 = var6.n5;
            var7.n5(var1[var2[0]++]);
         } else if (var3 >= 0) {
            y4 var8 = new y4();
            var8.l6 = var0;
            var8.k5 = var2[0] + var3 + 1;
            var8.u3 = 1;
            var8.n5 = (byte)var3;
            var8.n5(var1[var2[0]++]);
         }
      }
   }

   private void n5(byte[] var1, int[] var2, int var3) {
      if (this.n5 > 0) {
         y4[] var4 = this.a6;
         y4 var5 = var4[this.l6].n5();
         int var6 = 0;
         int var7 = this.l6;

         while (this.n5 > var3) {
            this.n5--;
            var7 -= var5.k5;
            var6++;
            if (var7 < 0) {
               break;
            }

            var4[var7].n5(var5);
         }

         var2[0] = this.n5 - 1;

         while (var2[0] >= 0) {
            var1[var2[0]--] = var5.l6;
            var7 -= var5.k5;
            if (var7 < 0) {
               break;
            }

            var4[var7].n5(var5);
         }

         var2[0] = this.n5;
         this.n5 = var6;
      }
   }

   private byte n5(int var1, byte[] var2, int[] var3, int var4) {
      y4 var5 = this.a6[var1].n5();
      int var6 = var3[0] + var5.u3;
      int var7 = var5.u3 + 1;
      if (var6 >= var4) {
         this.n5 = var6 - var4 + 1;
         var7 -= this.n5;
         this.l6 = var1;

         while (var6 >= var4) {
            var6--;
            var1 -= var5.k5;
            if (var1 < 0) {
               break;
            }

            this.a6[var1].n5(var5);
         }
      } else {
         this.n5 = 0;
         var2[var6--] = var5.l6;
         var1 -= var5.k5;
      }

      while (var1 >= 0) {
         this.a6[var1].n5(var5);
         var2[var6--] = var5.l6;
         var1 -= var5.k5;
      }

      var2[var3[0]] = var5.n5;
      var3[0] += var7;
      return var5.n5;
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(y4.class, new t2());
   }
}
