package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class x2o extends b3 {
   private b8n n5;
   private List<t9z> l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ptCount", "lvl", "extLst");

   public x2o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      n5(var1, new x2o$1(this, var1));
   }

   public x2o() {
      this.u9();
   }

   private void u9() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "ptCount");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            t9z var5 = (t9z)var4.next();
            var5.n5("c", var2, "lvl");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final b8n n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <ptCount> element can be added.");
      }

      this.n5 = new b8n();
      return this.n5;
   }

   public final t9z l6() {
      t9z var1 = new t9z();
      this.l6.addItem(var1);
      return var1;
   }

   public final b8n k5() {
      return this.n5;
   }

   public final t9z[] u3() {
      return this.l6.toArray(new t9z[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static b8n n5(x2o var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(x2o var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a9t n5(x2o var0, a9t var1) {
      return var0.k5 = var1;
   }
}
