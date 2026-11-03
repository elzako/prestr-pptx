package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s8 extends b3 {
   private boolean n5;
   private f2a l6;
   private d0 k5;
   private j5e u3;
   private u9 a6;
   private k8g u9;
   private c1v h0;
   private q0h c8;
   private j9y t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "preserve", "cSld", "clrMap", "sldLayoutIdLst", "transition", "timing", "hf", "txStyles", "extLst"
   );

   public s8(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z1();
      s8$1 var2 = new s8$1(this);
      n5(var1, var2);
      n5(var1, new s8$2(this, var1));
   }

   public s8() {
      this.z1();
      this.l6 = new f2a();
      this.k5 = new d0();
   }

   private void z1() {
      this.n5 = false;
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

      if (this.n5) {
         var2.l6("preserve", this.n5 ? "1" : "0");
      }

      this.l6.n5("p", var2, "cSld");
      this.k5.n5("p", var2, "clrMap");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "sldLayoutIdLst");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "transition");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "timing");
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "hf");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "txStyles");
      }

      if (this.t2 != null) {
         this.t2.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final j5e n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <sldLayoutIdLst> element can be added.");
      }

      this.u3 = new j5e();
      return this.u3;
   }

   public final u9 l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.a6 = new u9();
      return this.a6;
   }

   public final k8g k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <timing> element can be added.");
      }

      this.u9 = new k8g();
      return this.u9;
   }

   public final c1v u3() {
      if (this.h0 != null) {
         throw new Exception("Only one <hf> element can be added.");
      }

      this.h0 = new c1v();
      return this.h0;
   }

   public final q0h a6() {
      if (this.c8 != null) {
         throw new Exception("Only one <txStyles> element can be added.");
      }

      this.c8 = new q0h();
      return this.c8;
   }

   public final void n5(x8 var1) {
      this.t2 = (j9y)var1;
   }

   public final boolean u9() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final f2a h0() {
      return this.l6;
   }

   public final d0 c8() {
      return this.k5;
   }

   public final j5e t2() {
      return this.u3;
   }

   public final u9 s7() {
      return this.a6;
   }

   public final k8g x8() {
      return this.u9;
   }

   public final c1v n3() {
      return this.h0;
   }

   public final q0h y4() {
      return this.c8;
   }

   public final x8 e2() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return s7;
   }

   // $VF: synthetic method
   static boolean n5(s8 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f2a n5(s8 var0, f2a var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static d0 n5(s8 var0, d0 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j5e n5(s8 var0, j5e var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u9 n5(s8 var0, u9 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static k8g n5(s8 var0, k8g var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static c1v n5(s8 var0, c1v var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static q0h n5(s8 var0, q0h var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static j9y n5(s8 var0, j9y var1) {
      return var0.t2 = var1;
   }
}
