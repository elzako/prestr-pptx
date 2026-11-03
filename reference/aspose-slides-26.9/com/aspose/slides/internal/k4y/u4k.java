package com.aspose.slides.internal.k4y;

public class u4k extends b3 {
   public u4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      l6(var1);
   }

   public u4k() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      var2.s7();
   }
}
