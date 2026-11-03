package com.aspose.slides.internal.g7;

public class y1 extends m6 {
   private int c8;

   public y1(int var1) {
      this.c8 = var1;
   }

   @Override
   protected void n5(j2 var1) {
      a0 var2 = (a0)var1;
      switch (var2.n5()) {
         case 0:
            String var3 = var2.a6();
            if (var3 == null) {
               this.n5(var3);
            } else {
               this.n5().n5(var3);
               if (("hintmask".equals(var3) || "cntrmask".equals(var3)) && this.u3.n5() > 0) {
                  long var4 = com.aspose.slides.internal.v6g.k5.u9(this.z6().u3(), 14);
                  if (var4 != 0L) {
                     for (int var6 = 0; var6 < var4; var6++) {
                        var2.u9();
                        this.u3.n5((double)var2.l6());
                     }
                  }

                  this.n5().n5("pickupyourfreakingmask");
               }
            }
            break;
         case 1:
            this.u3.n5((double)var2.k5());
            break;
         case 2:
            this.u3.n5(var2.u3());
      }
   }

   @Override
   protected j2 n5(m1 var1) {
      return new a0(var1, this.c8);
   }
}
