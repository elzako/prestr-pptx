package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f1s extends b3 {
   private List<c0> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("extraClrScheme");

   public f1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new f1s$1(this, var1));
   }

   public f1s() {
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
            c0 var5 = (c0)var4.next();
            var5.n5("a", var2, "extraClrScheme");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final c0 n5() {
      c0 var1 = new c0();
      this.n5.addItem(var1);
      return var1;
   }

   public final c0[] l6() {
      return this.n5.toArray(new c0[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(f1s var0) {
      return var0.n5;
   }
}
