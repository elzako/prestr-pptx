package com.aspose.slides.internal.k4y;

public class c9 extends b3 {
   private String[] n5 = new String[]{
      "http://schemas.microsoft.com/office/powerpoint/2010/main",
      "http://schemas.openxmlformats.org/presentationml/2006/main",
      "http://schemas.openxmlformats.org/drawingml/2006/main",
      "http://schemas.openxmlformats.org/drawingml/2006/chart",
      "http://schemas.openxmlformats.org/officeDocument/2006/relationships"
   };
   private String l6;

   private void n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6 = var1.e5();
   }

   c9(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n5(var1);
   }

   c9() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      String var4 = this.n5();

      for (String var8 : this.n5) {
         String var9 = var2.n5(var8);
         if (var9 != null) {
            var4 = com.aspose.slides.ms.System.d1.n5(
               var4, com.aspose.slides.ms.System.d1.n5(" xmlns:", var9, "=\"", var8, "\""), com.aspose.slides.ms.System.d1.n5
            );
         }
      }

      var2.c8(var4);
   }

   public String n5() {
      return this.l6;
   }

   public void n5(String var1) {
      this.l6 = var1;
   }
}
