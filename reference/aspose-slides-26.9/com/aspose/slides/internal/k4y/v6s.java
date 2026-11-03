package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v6s extends b3 {
   private int n5;
   private String l6;
   private List<k7m> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ax:persistence", "r:id", "ocxPr");

   public v6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      v6s$1 var2 = new v6s$1(this);
      n5(var1, var2);
      n5(var1, new v6s$2(this, var1));
   }

   public v6s() {
      this.a6();
   }

   private void a6() {
      this.n5 = -1;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("ax:persistence", q2.n5(this.n5));
      }

      if (this.l6 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            k7m var5 = (k7m)var4.next();
            var5.n5("ax", var2, "ocxPr");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final k7m n5() {
      k7m var1 = new k7m();
      this.k5.addItem(var1);
      return var1;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final k7m[] k5() {
      return this.k5.toArray(new k7m[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(v6s var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(v6s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(v6s var0) {
      return var0.k5;
   }
}
