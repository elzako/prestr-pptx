package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c4x extends b3 {
   private List<p4e> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("file-entry");

   public c4x() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("manifest", var3, "urn:oasis:names:tc:opendocument:xmlns:manifest:1.0");
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            p4e var5 = (p4e)var4.next();
            var5.n5("manifest", var2, "file-entry");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final p4e n5() {
      p4e var1 = new p4e();
      this.n5.addItem(var1);
      return var1;
   }

   public final void n5(p4e var1) {
      this.n5.addItem(var1);
   }
}
