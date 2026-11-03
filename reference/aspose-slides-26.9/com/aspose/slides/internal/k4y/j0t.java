package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j0t extends b3 {
   private List<e4c> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("sheet");

   public j0t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new j0t$1(this, var1));
   }

   public j0t() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            e4c var5 = (e4c)var4.next();
            var5.n5("ssml", var2, "sheet");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final e4c n5() {
      e4c var1 = new e4c();
      this.n5.addItem(var1);
      return var1;
   }

   public final e4c[] l6() {
      return this.n5.toArray(new e4c[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(j0t var0) {
      return var0.n5;
   }
}
