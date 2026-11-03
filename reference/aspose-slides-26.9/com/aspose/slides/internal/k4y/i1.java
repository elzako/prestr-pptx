package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class i1 extends b3 {
   private q2u n5;
   private u8b l6;
   private w6 k5;
   private t7p u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("ptLst", "cxnLst", "bg", "whole", "extLst");

   public i1(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i1$1(this, var1));
   }

   public i1() {
      this.n5 = new q2u();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("dgm", var3, "http://schemas.openxmlformats.org/drawingml/2006/diagram");
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

      this.n5.n5("dgm", var2, "ptLst");
      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "cxnLst");
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "bg");
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "whole");
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final u8b n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <cxnLst> element can be added.");
      }

      this.l6 = new u8b();
      return this.l6;
   }

   public final w6 l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <bg> element can be added.");
      }

      this.k5 = new w6();
      return this.k5;
   }

   public final t7p k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <whole> element can be added.");
      }

      this.u3 = new t7p();
      return this.u3;
   }

   public final x8 u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.a6 = new l8r();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.a6 = (l8r)var1;
   }

   public final q2u a6() {
      return this.n5;
   }

   public final u8b u9() {
      return this.l6;
   }

   public final w6 h0() {
      return this.k5;
   }

   public final t7p c8() {
      return this.u3;
   }

   public final x8 t2() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return u9;
   }

   // $VF: synthetic method
   static q2u n5(i1 var0, q2u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u8b n5(i1 var0, u8b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w6 n5(i1 var0, w6 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static t7p n5(i1 var0, t7p var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l8r n5(i1 var0, l8r var1) {
      return var0.a6 = var1;
   }
}
