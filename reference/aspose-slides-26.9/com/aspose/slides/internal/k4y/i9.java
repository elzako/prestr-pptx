package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class i9 extends b3 {
   private boolean n5;
   private boolean l6;
   private f2a k5;
   private c1 u3;
   private j9y a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "showMasterSp", "showMasterPhAnim", "cSld", "clrMapOvr", "extLst"
   );

   public i9(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      i9$1 var2 = new i9$1(this);
      n5(var1, var2);
      n5(var1, new i9$2(this, var1));
   }

   public i9() {
      this.c8();
      this.k5 = new f2a();
   }

   private void c8() {
      this.n5 = true;
      this.l6 = true;
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

      if (!this.n5) {
         var2.l6("showMasterSp", this.n5 ? "1" : "0");
      }

      if (!this.l6) {
         var2.l6("showMasterPhAnim", this.l6 ? "1" : "0");
      }

      this.k5.n5("p", var2, "cSld");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "clrMapOvr");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final c1 n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <clrMapOvr> element can be added.");
      }

      this.u3 = new c1();
      return this.u3;
   }

   public final void n5(x8 var1) {
      this.a6 = (j9y)var1;
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final f2a u3() {
      return this.k5;
   }

   public final c1 a6() {
      return this.u3;
   }

   public final x8 u9() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(i9 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i9 var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f2a n5(i9 var0, f2a var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c1 n5(i9 var0, c1 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j9y n5(i9 var0, j9y var1) {
      return var0.a6 = var1;
   }
}
