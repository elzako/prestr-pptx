package com.aspose.slides.internal.u0b;

class z7 {
   private final int n5;

   public z7(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.f4l.x9 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.x9 var2 = new com.aspose.slides.internal.f4l.x9();
      if ((this.n5 & 2) == 2) {
         var2.n5(j4.n5(var1));
      }

      com.aspose.slides.internal.f4l.h0 var3 = null;
      if ((this.n5 & 4) != 0 && (this.n5 & 8) == 0) {
         var3 = u3.n5(var1);
      } else if ((this.n5 & 4) == 0 && (this.n5 & 8) != 0) {
         var3 = a6.n5(var1);
      }

      var2.n5(var3);
      if ((this.n5 & 64) == 64) {
         var2.n5(r4.n5(var1));
      }

      return var2;
   }
}
