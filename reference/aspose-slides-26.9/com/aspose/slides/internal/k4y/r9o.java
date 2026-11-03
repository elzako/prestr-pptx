package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class r9o extends b3 {
   private List<p5t> n5;
   private w4m l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("custData", "tags");

   public r9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new r9o$1(this, var1));
   }

   public r9o() {
      this.u9();
   }

   private void u9() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            p5t var5 = (p5t)var4.next();
            var5.n5("p", var2, "custData");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "tags");
      }

      var2.s7();
   }

   public final p5t n5() {
      p5t var1 = new p5t();
      this.n5.addItem(var1);
      return var1;
   }

   public final w4m l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <tags> element can be added.");
      }

      this.l6 = new w4m();
      return this.l6;
   }

   public final p5t[] k5() {
      return this.n5.toArray(new p5t[0]);
   }

   public final w4m u3() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(r9o var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static w4m n5(r9o var0, w4m var1) {
      return var0.l6 = var1;
   }
}
