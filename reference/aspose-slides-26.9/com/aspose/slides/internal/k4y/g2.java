package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class g2 extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private f2a u3;
   private c1 a6;
   private u9 u9;
   private k8g h0;
   private j9y c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "showMasterSp", "showMasterPhAnim", "show", "cSld", "clrMapOvr", "transition", "timing", "extLst"
   );

   public g2(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      g2$1 var2 = new g2$1(this);
      n5(var1, var2);
      n5(var1, new g2$2(this, var1));
   }

   public g2() {
      this.y4();
      this.u3 = new f2a();
   }

   private void y4() {
      this.n5 = true;
      this.l6 = true;
      this.k5 = true;
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

      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2012/main") == null) {
         var2.u3("xmlns", "p15", null, "http://schemas.microsoft.com/office/powerpoint/2012/main");
      }

      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2015/09/main") == null) {
         var2.u3("xmlns", "p159", null, "http://schemas.microsoft.com/office/powerpoint/2015/09/main");
      }

      if (!this.n5) {
         var2.l6("showMasterSp", this.n5 ? "1" : "0");
      }

      if (!this.l6) {
         var2.l6("showMasterPhAnim", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("show", this.k5 ? "1" : "0");
      }

      this.u3.n5("p", var2, "cSld");
      if (this.a6 != null) {
         this.a6.n5("p", var2, "clrMapOvr");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "transition");
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "timing");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final c1 n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <clrMapOvr> element can be added.");
      }

      this.a6 = new c1();
      return this.a6;
   }

   public final u9 l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.u9 = new u9();
      return this.u9;
   }

   public final k8g k5() {
      if (this.h0 != null) {
         throw new Exception("Only one <timing> element can be added.");
      }

      this.h0 = new k8g();
      return this.h0;
   }

   public final void n5(x8 var1) {
      this.c8 = (j9y)var1;
   }

   public final boolean u3() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean a6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean u9() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final f2a h0() {
      return this.u3;
   }

   public final c1 c8() {
      return this.a6;
   }

   public final u9 t2() {
      return this.u9;
   }

   public final k8g s7() {
      return this.h0;
   }

   public final x8 x8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return t2;
   }

   // $VF: synthetic method
   static boolean n5(g2 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(g2 var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(g2 var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static f2a n5(g2 var0, f2a var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c1 n5(g2 var0, c1 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static u9 n5(g2 var0, u9 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static k8g n5(g2 var0, k8g var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j9y n5(g2 var0, j9y var1) {
      return var0.c8 = var1;
   }
}
