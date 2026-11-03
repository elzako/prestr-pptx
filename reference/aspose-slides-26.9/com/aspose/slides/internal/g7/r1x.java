package com.aspose.slides.internal.g7;

public class r1x extends m6 {
   public r1x() {
   }

   public r1x(c1 var1) {
      super(var1);
   }

   @Override
   protected void n5(j2 var1) {
      y4u var2 = (y4u)var1;
      switch (var2.n5()) {
         case 0:
            String var3 = var2.u3();
            if (var3 == null) {
               this.n5(var3);
            } else {
               this.n5().n5(var3);
            }
            break;
         case 1:
            this.u3.n5((double)var2.l6());
            break;
         case 2:
            this.u3.n5(var2.k5());
      }
   }

   @Override
   protected j2 n5(m1 var1) {
      return new y4u(var1);
   }
}
