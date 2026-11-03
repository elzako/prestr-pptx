package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r8e extends b3 {
   private String n5;
   private List<s7q> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Id", "SignatureProperty");

   public r8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      r8e$1 var2 = new r8e$1(this);
      n5(var1, var2);
      n5(var1, new r8e$2(this, var1));
   }

   public r8e() {
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
            s7q var5 = (s7q)var4.next();
            var5.n5("", var2, "SignatureProperty");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final s7q n5() {
      s7q var1 = new s7q();
      this.l6.addItem(var1);
      return var1;
   }

   public final s7q[] l6() {
      return this.l6.toArray(new s7q[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(r8e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(r8e var0) {
      return var0.l6;
   }
}
