package com.aspose.slides.internal.b7;

class g8v {
   private d4 n5 = new d4();

   public d4 n5() {
      return this.n5;
   }

   public g8v(d4 var1) {
      var1.n5(this.n5);
   }

   public g8v(l2p[] var1) {
      if (var1.length == 0) {
         this.n5 = new d4();
      } else {
         double var2 = Double.MAX_VALUE;
         double var4 = -Double.MAX_VALUE;
         double var6 = Double.MAX_VALUE;
         double var8 = -Double.MAX_VALUE;

         for (int var10 = 0; var10 < var1.length; var10++) {
            l2p var11 = var1[var10];
            d4 var12 = var11.k5().s7();
            if (var12.n5() < var2) {
               var2 = var12.n5();
            }

            if (var12.k5() > var4) {
               var4 = var12.k5();
            }

            if (var11.u3().l6().n5() > 0) {
               if (var12.l6() < var6) {
                  var6 = var12.l6();
               }

               if (var12.u3() > var8) {
                  var8 = var12.u3();
               }
            }
         }

         this.n5 = new d4(var2, var6, var4, var8);
      }
   }

   public double n5(double var1) {
      double var3 = (this.n5.k5() - var1) / this.n5.h0();
      if (var3 == 1.0) {
         var3 -= 1.0E-10;
      }

      return 1.0 - var3;
   }

   public double l6(double var1) {
      double var3 = (this.n5.u3() - var1) / this.n5.c8();
      if (var3 == 1.0) {
         var3 -= 1.0E-10;
      }

      return 1.0 - var3;
   }
}
