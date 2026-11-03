package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g8f extends b3 {
   private List<s3x> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("author");

   public g8f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new g8f$1(this, var1));
   }

   public g8f() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p188", var3, "http://schemas.microsoft.com/office/powerpoint/2018/8/main");
      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            s3x var5 = (s3x)var4.next();
            var5.n5("p188", var2, "author");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final s3x n5() {
      s3x var1 = new s3x();
      this.n5.addItem(var1);
      return var1;
   }

   public final s3x[] l6() {
      return this.n5.toArray(new s3x[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(g8f var0) {
      return var0.n5;
   }
}
