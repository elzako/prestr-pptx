package com.aspose.slides.internal.k4y;

public final class x8w extends b3 {
   private double n5 = Double.NaN;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public x8w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (l6.n5(k5(var1))) {
               case 0:
                  this.n5 = e2(var1.z1());
            }
         }
      }

      var1.a6();
      l6(var1);
   }

   public x8w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }
}
