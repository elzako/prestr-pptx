package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s9c extends b3 {
   private List<p1s> n5;
   private h3k l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("label", "extLst");

   public s9c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      n5(var1, new s9c$1(this, var1));
   }

   public s9c() {
      this.a6();
   }

   private void a6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("clbl", var3, "http://schemas.microsoft.com/office/2020/mipLabelMetadata");
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            p1s var5 = (p1s)var4.next();
            var5.n5("clbl", var2, "label");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("clbl", var2, "extLst");
      }

      var2.s7();
   }

   public final p1s n5() {
      p1s var1 = new p1s();
      this.n5.addItem(var1);
      return var1;
   }

   public final void n5(h3k var1) {
      this.l6 = var1;
   }

   public final p1s[] l6() {
      return this.n5.toArray(new p1s[0]);
   }

   public final h3k k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(s9c var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static h3k n5(s9c var0, h3k var1) {
      return var0.l6 = var1;
   }
}
