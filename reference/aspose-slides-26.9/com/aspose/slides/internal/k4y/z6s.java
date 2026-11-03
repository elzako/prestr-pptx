package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z6s extends b3 {
   private List<e6d> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("reply");

   public z6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new z6s$1(this, var1));
   }

   public z6s() {
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
            e6d var5 = (e6d)var4.next();
            var5.n5("p188", var2, "reply");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final e6d n5() {
      e6d var1 = new e6d();
      this.n5.addItem(var1);
      return var1;
   }

   public final e6d[] l6() {
      return this.n5.toArray(new e6d[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(z6s var0) {
      return var0.n5;
   }
}
