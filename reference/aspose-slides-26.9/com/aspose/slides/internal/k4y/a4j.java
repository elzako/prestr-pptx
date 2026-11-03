package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a4j extends b3 {
   private List<i2t> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("smartTagType");

   public a4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new a4j$1(this, var1));
   }

   public a4j() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            i2t var5 = (i2t)var4.next();
            var5.n5("ssml", var2, "smartTagType");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(a4j var0) {
      return var0.n5;
   }
}
