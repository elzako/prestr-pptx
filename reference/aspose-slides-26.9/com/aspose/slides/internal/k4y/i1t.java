package com.aspose.slides.internal.k4y;

public final class i1t extends b3 {
   private byte n5 = 2;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public i1t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (l6.n5(k5(var1))) {
               case 0:
                  this.n5 = com.aspose.slides.ms.System.Xml.f4.z1(var1.z1());
            }
         }
      }

      var1.a6();
      l6(var1);
   }

   public i1t() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }
}
