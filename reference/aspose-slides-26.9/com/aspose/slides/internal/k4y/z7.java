package com.aspose.slides.internal.k4y;

public class z7 extends b3 {
   private f2a n5;
   private d0 l6;
   private c1v k5;
   private j9y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("cSld", "clrMap", "hf", "extLst");

   public z7(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new z7$1(this, var1));
   }

   public z7() {
      this.n5 = new f2a();
      this.l6 = new d0();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p", var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/math") == null) {
         var2.u3("xmlns", "m", null, "http://schemas.openxmlformats.org/officeDocument/2006/math");
      }

      if (var2.n5("http://schemas.openxmlformats.org/wordprocessingml/2006/main") == null) {
         var2.u3("xmlns", "w", null, "http://schemas.openxmlformats.org/wordprocessingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing") == null) {
         var2.u3("xmlns", "wp", null, "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing");
      }

      if (var2.n5("http://schemas.microsoft.com/office/drawing/2010/main") == null) {
         var2.u3("xmlns", "a14", null, "http://schemas.microsoft.com/office/drawing/2010/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/markup-compatibility/2006") == null) {
         var2.u3("xmlns", "mc", null, "http://schemas.openxmlformats.org/markup-compatibility/2006");
      }

      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2010/main") == null) {
         var2.u3("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
      }

      this.n5.n5("p", var2, "cSld");
      this.l6.n5("p", var2, "clrMap");
      if (this.k5 != null) {
         this.k5.n5("p", var2, "hf");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(c1v var1) {
      this.k5 = var1;
   }

   public final void n5(x8 var1) {
      this.u3 = (j9y)var1;
   }

   public final f2a n5() {
      return this.n5;
   }

   public final d0 l6() {
      return this.l6;
   }

   public final c1v k5() {
      return this.k5;
   }

   public final x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static f2a n5(z7 var0, f2a var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static d0 n5(z7 var0, d0 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c1v n5(z7 var0, c1v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j9y n5(z7 var0, j9y var1) {
      return var0.u3 = var1;
   }
}
