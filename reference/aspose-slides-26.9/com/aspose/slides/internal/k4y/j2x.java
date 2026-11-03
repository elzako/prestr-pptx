package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j2x extends b3 {
   private String n5;
   private List<u7a> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Id", "Reference");

   public j2x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      j2x$1 var2 = new j2x$1(this);
      n5(var1, var2);
      n5(var1, new j2x$2(this, var1));
   }

   public j2x() {
      this.u3();
   }

   private void u3() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            u7a var5 = (u7a)var4.next();
            var5.n5("", var2, "Reference");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final u7a n5() {
      u7a var1 = new u7a();
      this.l6.addItem(var1);
      return var1;
   }

   public final u7a[] l6() {
      return this.l6.toArray(new u7a[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(j2x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(j2x var0) {
      return var0.l6;
   }
}
