package com.aspose.slides.internal.a1;

import com.aspose.slides.ms.System.d1;

public class k5 extends h0 {
   private com.aspose.slides.internal.o9b.c8 n5 = new com.aspose.slides.internal.o9b.c8();

   public k5(com.aspose.slides.internal.w5.k5 var1, com.aspose.slides.internal.o9b.c8 var2) {
      super(var1);
      var2.n5(this.n5);
   }

   public String n5() {
      return (this.n5.s7() & 255) == 0 ? com.aspose.slides.internal.o9b.c8.e2().l6() : d1.n5("#{0:x8}", new Object[]{this.n5.h0() & 4294967295L});
   }
}
