package com.aspose.slides.internal.e6s;

import com.aspose.slides.ms.System.Xml.c7;

class a6$l6 {
   public final c7 n5;
   public boolean l6;
   public boolean k5;

   public a6$l6(c7 var1) {
      this.n5 = var1;
      this.l6 = false;
      this.k5 = false;
   }

   public final boolean n5() {
      this.l6 = this.n5.u9();
      if (this.l6) {
         switch (this.n5.s7()) {
            case 1:
               this.k5 = this.n5.m1();
               break;
            case 15:
               this.k5 = false;
         }
      }

      return this.l6;
   }
}
