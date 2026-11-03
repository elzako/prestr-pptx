package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e4j extends b3 {
   private List<n9a> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("dlblFTEntry");

   public e4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new e4j$1(this, var1));
   }

   public e4j() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("c", var3, "http://schemas.microsoft.com/office/drawing/2012/chart");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/chart") == null) {
         var2.u3("xmlns", "c", null, "http://schemas.openxmlformats.org/drawingml/2006/chart");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            n9a var5 = (n9a)var4.next();
            var5.n5("c", var2, "dlblFTEntry");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final n9a[] n5() {
      return this.n5.toArray(new n9a[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(e4j var0) {
      return var0.n5;
   }
}
