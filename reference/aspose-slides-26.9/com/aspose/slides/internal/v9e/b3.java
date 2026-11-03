package com.aspose.slides.internal.v9e;

public class b3 extends y2 {
   private String n5;
   private String l6;

   public b3(z7 var1) {
      this.n5 = var1.t4();
      this.l6 = var1.e2();
   }

   @Override
   public void n5(z1 var1) {
      if (this.n5.length() != 0) {
         o0 var2 = var1.u9(this.n5);
         if (var2 != null) {
            this.n5 = var2.l6;
            if (var2.n5 != null) {
               this.l6 = var2.n5;
            }
         }
      }
   }

   @Override
   public boolean n5(p3 var1, l6 var2) {
      boolean var3 = var1.n5(3, null, this.l6, this.n5, false);
      var3 = var1.a6(3);
      return true;
   }
}
