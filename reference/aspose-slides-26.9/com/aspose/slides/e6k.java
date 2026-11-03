package com.aspose.slides;

final class e6k extends com.aspose.slides.internal.k4y.c1 {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("clrMapOvr");

   private e6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      super(var1);
   }

   public e6k() {
   }

   public static e6k n5(com.aspose.slides.ms.System.Xml.c7 var0) {
      String var1 = var0.n3();
      if (var0.m1()) {
         return new e6k();
      }

      e6k var2 = null;
      boolean var3 = false;

      while (var3 && !var0.j5() || var0.u9()) {
         if (var0.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var0.n3(), var1)) {
            break;
         }

         var3 = false;
         if (var0.s7() == 1) {
            switch (n5.n5(var0.n3())) {
               case 0:
                  var2 = new e6k(var0);
                  break;
               default:
                  var0.r4();
                  var3 = true;
            }
         }
      }

      return var2 == null ? new e6k() : var2;
   }
}
