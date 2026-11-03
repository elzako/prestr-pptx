package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e8 extends b3 {
   private List<s1e> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("tag");

   public e8(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new e8$1(this, var1));
   }

   public e8() {
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
            s1e var5 = (s1e)var4.next();
            var5.n5("p", var2, "tag");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final s1e n5() {
      s1e var1 = new s1e();
      this.n5.addItem(var1);
      return var1;
   }

   public final s1e[] l6() {
      return this.n5.toArray(new s1e[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(e8 var0) {
      return var0.n5;
   }
}
