package com.aspose.slides.internal.k4y;

public final class c4 extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("id");

   private void n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      String var2 = var1.n3();
      this.u3(var1);
      if (!var1.m1()) {
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (l6.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   private void u3(com.aspose.slides.ms.System.Xml.c7 var1) {
      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (l6.n5(var1.n3())) {
               case 0:
                  if ("http://schemas.openxmlformats.org/officeDocument/2006/relationships".equals(var1.y4())) {
                     this.n5 = var1.z1();
                  }
            }
         }
      }

      var1.a6();
   }

   public c4(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n5(var1);
   }

   public c4() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("c", var3, "http://schemas.openxmlformats.org/drawingml/2006/chart");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }
}
