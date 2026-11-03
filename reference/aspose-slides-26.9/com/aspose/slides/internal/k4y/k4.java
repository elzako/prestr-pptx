package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k4 extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private List<a1k> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("def", "tblStyle");

   public k4(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      k4$1 var2 = new k4$1(this);
      n5(var1, var2);
      n5(var1, new k4$2(this, var1));
   }

   public k4() {
      this.a6();
   }

   private void a6() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a", var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("def", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            a1k var5 = (a1k)var4.next();
            var5.n5("a", var2, "tblStyle");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final a1k n5() {
      a1k var1 = new a1k();
      this.l6.addItem(var1);
      return var1;
   }

   public final com.aspose.slides.ms.System.o0 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final a1k[] k5() {
      return this.l6.toArray(new a1k[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(k4 var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(k4 var0) {
      return var0.l6;
   }
}
