package com.aspose.slides.internal.k4y;

public final class b5j extends b3 {
   private int l6;
   public static final int n5 = o6.n5("linear");
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("val");

   public b5j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (k5.n5(k5(var1))) {
               case 0:
                  this.l6 = o6.n5(var1.z1());
            }
         }
      }

      var1.a6();
      l6(var1);
   }

   public b5j() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("val", o6.n5(this.l6));
      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }
}
