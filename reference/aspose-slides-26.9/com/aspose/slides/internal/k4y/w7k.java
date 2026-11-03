package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w7k extends b3 {
   private n0g n5;
   private List<s0m> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("dPr", "e");

   public w7k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new w7k$1(this, var1));
   }

   public w7k() {
      this.u3();
   }

   private void u3() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "dPr");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            s0m var5 = (s0m)var4.next();
            var5.n5("m", var2, "e");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(n0g var1) {
      this.n5 = var1;
   }

   public final void n5(s0m var1) {
      this.l6.addItem(var1);
   }

   public final n0g n5() {
      return this.n5;
   }

   public final s0m[] l6() {
      return this.l6.toArray(new s0m[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static n0g n5(w7k var0, n0g var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(w7k var0) {
      return var0.l6;
   }
}
