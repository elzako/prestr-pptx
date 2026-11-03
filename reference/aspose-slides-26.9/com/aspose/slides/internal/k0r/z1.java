package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentNullException;

public class z1 extends e6r {
   private String n5;

   public z1() {
      this.w1().n5(4026);
   }

   public z1(String var1, short var2) {
      if (var1 == null) {
         throw new ArgumentNullException();
      }

      this.w1().n5(4026);
      this.n5 = var1;
      this.w1().n5(var2);
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = "";
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      char[] var3 = var2.n5(var1.c8(this.w1().a6()));
      if (var3 != null) {
         this.n5 = com.aspose.slides.ms.System.d1.n5(var3);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
      byte[] var3 = var2.l6(com.aspose.slides.ms.System.d1.c8(this.n5));
      var1.n5(var3);
   }

   @Override
   public int n5() {
      return this.n5.length() * 2;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }
}
