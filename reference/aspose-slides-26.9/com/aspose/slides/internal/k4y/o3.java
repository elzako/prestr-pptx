package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class o3 extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("relSizeAnchor", "absSizeAnchor");

   public o3(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new o3$1(this, var1));
   }

   public o3() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("c", var3, "http://schemas.openxmlformats.org/drawingml/2006/chart");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/chartDrawing") == null) {
         var2.u3("xmlns", "cdr", null, "http://schemas.openxmlformats.org/drawingml/2006/chartDrawing");
      }

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

      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2010/main") == null) {
         var2.u3("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((w2v)var5.k5()).n5("cdr", var2, var5.n5());
                  break;
               case 1:
                  ((o7p)var5.k5()).n5("cdr", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (l6.n5(var1)) {
         case 0:
            var2 = new g7("relSizeAnchor", new w2v());
            break;
         case 1:
            var2 = new g7("absSizeAnchor", new o7p());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.n5.addItem(var2);
      return var2;
   }

   public final List<g7> n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(o3 var0) {
      return var0.n5;
   }
}
