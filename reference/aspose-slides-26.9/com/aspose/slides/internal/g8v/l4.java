package com.aspose.slides.internal.g8v;

class l4 extends y0 {
   // $VF: synthetic field
   final z6 n5;
   // $VF: synthetic field
   final int l6;
   // $VF: synthetic field
   final byte[] k5;
   // $VF: synthetic field
   final p6 u3;

   l4(p6 var1, z6 var2, int var3, byte[] var4) {
      this.u3 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
   }

   @Override
   public void n5(z6 var1) {
      if (var1.c8()) {
         this.n5.n5(var1.h0(), var1.t2());
      } else if (p6.l6(this.u3).k5.n5 != 0 && p6.l6(this.u3).k5.n5 != 100) {
         this.n5.n5(var1.h0());
      } else {
         if (!p6.k5(this.u3)) {
            p6.n5(this.u3, true);
            v8.n5((Object)p6.l6(this.u3));
         }

         if (this.l6 == 0) {
            p6.k5(this.u3, true);
            this.n5.n5(var1.h0());
         } else {
            p6.l6(this.u3).l6(p6.n5(this.u3), this.k5, 0, this.l6, new i6(this), null);
         }
      }
   }
}
