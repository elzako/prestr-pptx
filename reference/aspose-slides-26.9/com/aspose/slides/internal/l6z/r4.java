package com.aspose.slides.internal.l6z;

import com.aspose.slides.Collections.Generic.List;

class r4 extends n1 {
   private final int n5;
   private String l6;
   private String k5;

   public r4(int var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var2;
   }

   public r4(int var1) {
      this.n5 = var1;
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.n5 var1) {
      byte[] var2 = com.aspose.slides.internal.l6z.n5.n5(var1, (byte)0);
      this.l6 = com.aspose.slides.internal.l6z.k5.n5(var2, this.n5);
      List var3 = new List();

      while ((com.aspose.slides.internal.l6z.n5.l6(var1) & 255) != 0 && (com.aspose.slides.internal.l6z.n5.l6(var1) & 255) != 0) {
         var3.addRange(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.n8e.v4.n5(var1.c8(2))));
      }

      var1.c8(2);
      this.k5 = com.aspose.slides.internal.l6z.k5.n5(com.aspose.slides.internal.n8e.v4.l6(var3), com.aspose.slides.internal.l7h.t1.z1());
   }

   @Override
   void n5(com.aspose.slides.internal.z0k.l6 var1) {
      com.aspose.slides.internal.l6z.l6.n5(var1, this.l6, this.n5);
      var1.n5((byte)0);
      com.aspose.slides.internal.l6z.l6.n5(var1, this.k5, com.aspose.slides.internal.l7h.t1.z1());
      var1.n5((byte)0);
      var1.n5((byte)0);
   }

   final String n5() {
      return this.l6;
   }
}
