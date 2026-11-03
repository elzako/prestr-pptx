package com.aspose.slides.internal.b9y;

import com.aspose.slides.internal.y5s.d2;

public abstract class u3 extends k5 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private u9[] a6;
   private int u9;
   private boolean h0 = true;

   protected u3(int var1, int var2) {
      super(var1, var2);
   }

   public void t9() {
   }

   private static u9[] n5(int var0) {
      u9[] var1 = new u9[var0];

      for (int var2 = 0; var2 < var0; var2++) {
         var1[var2] = new u9();
      }

      return var1;
   }

   public d2 n5(byte[] var1, int var2) {
      String var3 = null;
      boolean var4 = true;
      int var5 = 0;
      if (this.h0) {
         d2 var6 = this.l6().n5();
         if (!var6.n5) {
            var4 = false;
            var3 = var6.k5;
         } else {
            int var7 = var6.l6;
            if (var7 == this.h0()) {
               this.y4();
               this.a6 = n5(4096 - this.c8());
               this.k5 = 0;
               this.u3 = -1;
               this.u9 = 1 << this.t2();
            } else if (var7 == this.u9()) {
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
            if (this.k5 >= this.x8()) {
               this.e2();
            }

            d2 var13 = this.n5().n5();
            if (!var13.n5) {
               var4 = false;
               var3 = var13.k5;
               break;
            }

            int var15 = var13.l6;
            if (var15 == this.h0()) {
               this.y4();
               this.u3 = -1;
               this.k5 = 0;
            } else {
               if (var15 == this.u9()) {
                  break;
               }

               if (var15 < this.h0()) {
                  byte var8 = (byte)var15;
                  var1[var5++] = var8;
                  int[] var9 = new int[]{this.k5};
                  n5(var8, this.a6, var9, this.u3, this.u9);
                  this.k5 = var9[0];
                  this.u3 = var15;
               } else {
                  int var16 = var15 - this.c8();
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
                        u9 var18 = this.a6[this.u3 - this.u9].n5();
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

      d2 var14 = new d2();
      var14.n5 = var4;
      var14.l6 = var5;
      var14.k5 = var3;
      return var14;
   }

   protected d2 l6() {
      return this.n5().n5();
   }

   protected abstract d2 n5();

   private static void n5(byte var0, u9[] var1, int[] var2, int var3, int var4) {
      if (var2[0] < var1.length) {
         if (var3 >= var4) {
            int var5 = var3 - var4;
            u9 var6 = var1[var5].n5();
            u9 var7 = new u9();
            var7.l6 = var0;
            var7.u3 = var6.u3 + 1;
            var7.k5 = var2[0] - var5;
            var7.n5 = var6.n5;
            var7.n5(var1[var2[0]++]);
         } else if (var3 >= 0) {
            u9 var8 = new u9();
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
         u9 var4 = this.a6[this.l6].n5();
         int var5 = 0;
         int var6 = this.l6;

         while (this.n5 > var3) {
            this.n5--;
            var6 -= var4.k5;
            var5++;
            if (var6 < 0) {
               break;
            }

            this.a6[var6].n5(var4);
         }

         var2[0] = this.n5 - 1;

         while (var2[0] >= 0) {
            var1[var2[0]--] = var4.l6;
            var6 -= var4.k5;
            if (var6 < 0) {
               break;
            }

            this.a6[var6].n5(var4);
         }

         var2[0] = this.n5;
         this.n5 = var5;
      }
   }

   private byte n5(int var1, byte[] var2, int[] var3, int var4) {
      u9 var5 = this.a6[var1].n5();
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
}
