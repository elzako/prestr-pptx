package com.aspose.slides;

class d0n extends v6g {
   private boolean n5;
   private p2k l6;
   private k2i k5;
   private e1o u3;

   d0n(e1o var1) {
      this.u3 = var1;
      this.n5 = !com.aspose.slides.ms.System.d1.n5(this.u3.h0().a6());
      if (!this.n5) {
         if (this.u3.h0().k5().getDisplayEquation()) {
         }

         if (this.u3.h0().k5().getDisplayRSquaredValue()) {
            this.k5 = new k2i(var1);
            this.n5(this.k5);
         }
      } else {
         this.l6 = new p2k(var1, this.u3.h0().a6());
         this.n5(this.l6);
      }
   }

   @Override
   protected void n5(z5 var1) {
      if (this.k5 != null) {
         this.k5.n3(var1);
         this.k5(com.aspose.slides.ms.System.q1.n5((float)(this.d2()), (float)(this.k5.d2())));
         this.u3(this.d5() + this.k5.d5());
      }

      if (this.l6 != null) {
         this.l6.n3(var1);
         this.k5(com.aspose.slides.ms.System.q1.n5((float)(this.d2()), (float)(this.l6.d2())));
         this.u3(this.d5() + this.l6.d5());
      }
   }

   @Override
   protected void l6(z5 var1) {
      if (this.k5 != null) {
         this.k5.t1();
      }

      if (this.l6 != null) {
         this.l6.t1();
      }
   }

   @Override
   protected void u3(z5 var1) {
   }

   static String n5(String var0) {
      if (com.aspose.slides.ms.System.d1.n5(var0)) {
         return "";
      }

      char var1 = com.aspose.slides.ms.System.z3.l6(com.aspose.slides.internal.x7n.s7.s7().q0());
      int var2 = var0.length() - 1;

      for (char var3 = var0.charAt(var2); var3 == '0' || var3 == var1; var3 = var0.charAt(var2)) {
         if (--var2 < 0) {
            break;
         }
      }

      return com.aspose.slides.ms.System.d1.l6(var0, 0, var2 + 1);
   }
}
