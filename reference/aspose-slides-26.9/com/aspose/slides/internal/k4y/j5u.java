package com.aspose.slides.internal.k4y;

public class j5u extends b3 {
   private f3v n5;
   private y1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("sectionZmObj", "extLst");

   public j5u(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new j5u$1(this, var1));
   }

   public j5u() {
      this.n5 = new f3v();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("psez", var3, "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom");
      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2016/6/main") == null) {
         var2.u3("xmlns", "p166", null, "http://schemas.microsoft.com/office/powerpoint/2016/6/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      this.n5.n5("psez", var2, "sectionZmObj");
      if (this.l6 != null) {
         this.l6.n5("psez", var2, "extLst");
      }

      var2.s7();
   }

   public final f3v n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static f3v n5(j5u var0, f3v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(j5u var0, y1g var1) {
      return var0.l6 = var1;
   }
}
