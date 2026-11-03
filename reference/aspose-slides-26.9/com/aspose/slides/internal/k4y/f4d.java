package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f4d extends b3 {
   private y4q n5;
   private List<a4m> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("placeholder", "attr");

   public f4d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new f4d$1(this, var1));
   }

   public f4d() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("w", var2, "placeholder");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            a4m var5 = (a4m)var4.next();
            var5.n5("w", var2, "attr");
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
      return k5;
   }

   // $VF: synthetic method
   static y4q n5(f4d var0, y4q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(f4d var0) {
      return var0.l6;
   }
}
