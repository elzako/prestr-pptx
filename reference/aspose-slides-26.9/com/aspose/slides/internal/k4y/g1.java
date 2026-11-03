package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class g1 extends b3 {
   private d7u n5;
   private r2n l6;
   private List<j3b> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("tblPr", "tblGrid", "tr");

   public g1(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n5(var1, new g1$1(this, var1));
   }

   public g1() {
      this.h0();
      this.l6 = new r2n();
   }

   private void h0() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a", var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
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

      if (this.n5 != null) {
         this.n5.n5("a", var2, "tblPr");
      }

      this.l6.n5("a", var2, "tblGrid");
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            j3b var5 = (j3b)var4.next();
            var5.n5("a", var2, "tr");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final d7u n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <tblPr> element can be added.");
      }

      this.n5 = new d7u();
      return this.n5;
   }

   public final j3b l6() {
      j3b var1 = new j3b();
      this.k5.addItem(var1);
      return var1;
   }

   public final d7u k5() {
      return this.n5;
   }

   public final r2n u3() {
      return this.l6;
   }

   public final j3b[] a6() {
      return this.k5.toArray(new j3b[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static d7u n5(g1 var0, d7u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static r2n n5(g1 var0, r2n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(g1 var0) {
      return var0.k5;
   }
}
