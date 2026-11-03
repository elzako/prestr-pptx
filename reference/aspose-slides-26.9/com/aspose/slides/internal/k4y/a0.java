package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a0 extends b3 {
   private List<r2s> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("cmAuthor");

   public a0(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new a0$1(this, var1));
   }

   public a0() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p", var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            r2s var5 = (r2s)var4.next();
            var5.n5("p", var2, "cmAuthor");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final r2s n5() {
      r2s var1 = new r2s();
      this.n5.addItem(var1);
      return var1;
   }

   public final r2s[] l6() {
      return this.n5.toArray(new r2s[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(a0 var0) {
      return var0.n5;
   }
}
