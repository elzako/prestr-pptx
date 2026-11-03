package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w2p extends b3 {
   private v3y n5;
   private w8s l6;
   private b9y k5;
   private j3z u3;
   private d0 a6;
   private v4b u9;
   private u4x h0;
   private h6m c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "chartData", "chart", "spPr", "txPr", "clrMapOvr", "fmtOvrs", "printSettings", "extLst"
   );

   public w2p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w2p$1(this, var1));
   }

   public w2p() {
      this.n5 = new v3y();
      this.l6 = new w8s();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("cx", var3, "http://schemas.microsoft.com/office/drawing/2014/chartex");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
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

      if (var2.n5("http://www.w3.org/2001/XMLSchema") == null) {
         var2.u3("xmlns", "xs", null, "http://www.w3.org/2001/XMLSchema");
      }

      this.n5.n5("cx", var2, "chartData");
      this.l6.n5("cx", var2, "chart");
      if (this.k5 != null) {
         this.k5.n5("cx", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "txPr");
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "clrMapOvr");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "fmtOvrs");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "printSettings");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final b9y n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.k5 = new b9y();
      return this.k5;
   }

   public final void n5(v4b var1) {
      this.u9 = var1;
   }

   public final void n5(h6m var1) {
      this.c8 = var1;
   }

   public final v3y l6() {
      return this.n5;
   }

   public final w8s k5() {
      return this.l6;
   }

   public final b9y u3() {
      return this.k5;
   }

   public final d0 a6() {
      return this.a6;
   }

   public final v4b u9() {
      return this.u9;
   }

   public final h6m h0() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return t2;
   }

   // $VF: synthetic method
   static v3y n5(w2p var0, v3y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w8s n5(w2p var0, w8s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(w2p var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j3z n5(w2p var0, j3z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static d0 n5(w2p var0, d0 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static v4b n5(w2p var0, v4b var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u4x n5(w2p var0, u4x var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static h6m n5(w2p var0, h6m var1) {
      return var0.c8 = var1;
   }
}
