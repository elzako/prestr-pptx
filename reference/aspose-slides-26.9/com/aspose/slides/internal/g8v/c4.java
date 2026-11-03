package com.aspose.slides.internal.g8v;

import com.aspose.slides.exceptions.Exception;

class c4 extends y0 {
   // $VF: synthetic field
   final s0 n5;
   // $VF: synthetic field
   final w1 l6;

   c4(w1 var1, s0 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public void n5(z6 var1) {
      boolean var2 = var1.h0();
      if (var1.c8()) {
         this.n5.n5(var2, var1.t2());
         this.n5.x8();
      } else {
         if (w1.n5(this.l6)) {
            Exception var3 = w1.l6(this.l6);
            if (w1.k5(this.l6) != null) {
               if (var3 == null) {
                  this.n5.n5(var2, w1.k5(this.l6));
               } else {
                  this.n5.n5(var2, var3);
               }

               this.n5.x8();
               return;
            }

            if (var3 != null) {
               this.n5.n5(var2, var3);
               this.n5.x8();
               return;
            }
         }

         if (!w1.u3(this.l6)) {
            w1.n5(this.l6, true);
            w1.n5(this.l6, 0);
            w1.n5(this.l6, this.l6.m3());
            w1.n5(this.l6, w1.u9(this.l6).n5(this.l6, w1.a6(this.l6)));
         }
      }
   }
}
