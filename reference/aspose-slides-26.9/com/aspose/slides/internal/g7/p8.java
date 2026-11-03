package com.aspose.slides.internal.g7;

public class p8 extends m6 {
   @Override
   protected void n5(j2 var1) {
      f2 var2 = (f2)var1;
      i3 var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5(), i3.class);
      int var4 = var2.h0();
      if (var3 != null) {
         var3.n5(false);
      }

      switch (var2.n5()) {
         case 0:
            String var5 = var2.u3();
            if (var5 == null) {
               this.n5(var5);
            } else {
               this.n5().n5(var5);
            }
            break;
         case 1:
            this.u3.n5((double)var2.l6());
            break;
         case 2:
            this.u3.n5(var2.k5());
      }

      int var7 = var2.h0();
      if (var3 != null && !var3.i1()) {
         for (int var6 = var4; var6 < var7; var6++) {
            var3.f2().writeByte(var2.c8().n5(var6));
         }
      }
   }

   @Override
   protected j2 n5(m1 var1) {
      return new f2(var1);
   }
}
