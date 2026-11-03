package com.aspose.slides.internal.r7n;

import com.aspose.slides.internal.o9b.e5;

public final class k7 extends t4 {
   public k7() {
   }

   public k7(e5 var1) {
      if (var1 != null) {
         switch (var1.n5()) {
            case 0:
               this.n5 = (short)(this.n5 | 0);
            case 1:
               this.n5 = (short)(this.n5 | 6);
            case 2:
               this.n5 = (short)(this.n5 | 2);
            default:
               switch (var1.l6()) {
                  case 0:
                     this.n5 = (short)(this.n5 | 0);
                  case 1:
                     this.n5 = (short)(this.n5 | 6);
                  case 2:
                     this.n5 = (short)(this.n5 | 8);
               }
         }
      }
   }

   @Override
   public int n5() {
      return 302;
   }

   @Override
   public void n5(com.aspose.slides.internal.o6t.k5 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.x8(this.n5);
      super.n5(var1, var2, var3);
   }
}
