package com.aspose.slides.internal.o9n;

import com.aspose.slides.internal.r1x.d2;

class n5$n5$l6 extends n5$n5$h0 {
   private final int k5;
   private int[] u3;
   private int a6;
   private int u9;
   private int h0;

   public n5$n5$l6(com.aspose.slides.internal.r2q.u3 var1, int var2, com.aspose.slides.internal.r2q.u9 var3, d2 var4) {
      super(var3, var1, var4);
      this.k5 = var2;
   }

   public final void n5(int[] var1) {
      this.u3 = var1;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
   }

   public final void n5() {
      com.aspose.slides.internal.r2q.n5[] var1 = new com.aspose.slides.internal.r2q.n5[this.k5 * 2];
      int var2 = 0;
      if (this.u3 == null) {
         this.n5("Cannot perform 2d decoding. Missing changes from previous row.");
         this.h0 = this.k5;
      } else {
         while (this.h0 < this.k5) {
            com.aspose.slides.internal.r2q.h0 var3 = this.n5.n5(7, true).n5();
            if (var3.n5 == 2) {
               if (var3.u3 != 0) {
                  this.n5(var3.u3, var3.l6);
               } else {
                  this.n5(var3.l6);
               }

               this.h0 = this.k5;
               break;
            }

            int var4 = var3.k5;
            com.aspose.slides.internal.r2q.n5 var5 = com.aspose.slides.internal.r2q.n5.n5(com.aspose.slides.internal.e0w.n5.h0(), var4);
            this.n5.n5(var5.k5() & 255);
            var1[var2++] = var5;
            switch (var5.l6()) {
               case 1:
                  if (this.a6 + 1 >= this.u3.length) {
                     this.n5("Cannot do pass. There is no more changes exist.");
                     this.h0 = this.k5;
                  } else {
                     this.u9 = this.u9 + this.u3[this.a6++];
                     this.u9 = this.u9 + this.u3[this.a6++];
                     int var6 = this.u9 - this.h0;
                     this.l6.n5(var6);
                     this.h0 += var6;
                  }
                  break;
               case 2:
                  byte var7 = 13;
                  byte var8 = 12;
                  if (this.l6.k5() == 0) {
                     var7 = 12;
                     var8 = 13;
                  }

                  if (this.l6(var7) && this.l6(var8)) {
                     while (this.a6 < this.u3.length - 1 && this.u9 + this.u3[this.a6] <= this.h0) {
                        this.u9 = this.u9 + this.u3[this.a6++];
                        this.u9 = this.u9 + this.u3[this.a6++];
                     }
                  }
                  break;
               case 3:
                  this.k5(0);
                  break;
               case 4:
                  this.k5(var5.u3());
                  break;
               case 5:
                  this.k5(-var5.u3());
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               default:
                  break;
               case 12:
                  int var9 = this.k5 - this.h0;
                  if (var9 > 0) {
                     this.l6.n5(var9);
                     this.h0 += var9;
                  }
            }
         }
      }
   }

   private boolean l6(int var1) {
      int var2 = 0;
      int[] var3 = com.aspose.slides.internal.e0w.n5.a6();
      if (this.l6.k5() == 1) {
         var3 = com.aspose.slides.internal.e0w.n5.u3();
      }

      boolean var4 = false;
      boolean var5 = true;

      while (!var4) {
         com.aspose.slides.internal.r2q.h0 var6 = this.n5.n5(var1, true).n5();
         int var7 = var6.k5;
         int var8 = var6.n5;
         if (var7 <= 0 || var8 != 0) {
            this.n5(var6.l6);
            this.h0 = this.k5;
            var5 = false;
            break;
         }

         com.aspose.slides.internal.r2q.n5 var9 = com.aspose.slides.internal.r2q.n5.n5(var3, var7);
         this.n5.n5(var9.k5() & 255);
         switch (var9.l6()) {
            case 0:
            case 12:
               this.n5("EOL has been found");
               this.h0 = this.k5;
               var4 = true;
               var5 = false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            default:
               break;
            case 7:
            case 8:
               var2 += var9.u3();
               this.l6.n5(var2);
               this.l6.u9();
               this.h0 += var2;
               var4 = true;
               break;
            case 9:
            case 10:
            case 11:
               var2 += var9.u3();
         }
      }

      return var5;
   }

   private void k5(int var1) {
      int var2 = this.u9;
      if (this.a6 < this.u3.length) {
         var2 += this.u3[this.a6];
      }

      int var3 = 1;
      if (this.h0 > 0 || var2 + var1 < 0) {
         while (this.a6 + var3 + 1 < this.u3.length && (var2 <= this.h0 || var2 + var1 <= this.h0)) {
            var2 += this.u3[this.a6 + var3++];
            var2 += this.u3[this.a6 + var3++];
         }
      }

      var2 += var1;
      int var4 = var2 - this.h0;
      if (var4 <= 0 && this.a6 > 0) {
         this.n5("Vertical code is incorrect.");
         this.h0 = this.k5;
      } else {
         this.l6.n5(var4);
         this.l6.u9();
         this.h0 = var2;
         if (this.u9 > this.h0) {
            if (this.a6 == 0) {
               this.n5("Cannot adjust reference position backwards. No more changes exist.");
               this.h0 = this.k5;
            } else {
               this.u9 = this.u9 - this.u3[--this.a6];
            }
         } else if (this.a6 < this.u3.length) {
            for (this.u9 = this.u9 + this.u3[this.a6++];
               this.u9 < this.k5 && this.a6 < this.u3.length - 1 && this.u9 + this.u3[this.a6] <= this.h0;
               this.u9 = this.u9 + this.u3[this.a6++]
            ) {
               this.u9 = this.u9 + this.u3[this.a6++];
            }
         }
      }
   }
}
