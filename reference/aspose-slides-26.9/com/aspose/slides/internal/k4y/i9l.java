package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i9l extends b3 {
   private String n5;
   private List<k3i> l6;
   private a6k k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("name", "if", "else");

   public i9l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      i9l$1 var2 = new i9l$1(this);
      n5(var1, var2);
      n5(var1, new i9l$2(this, var1));
   }

   public i9l() {
      this.a6();
   }

   private void a6() {
      this.n5 = "";
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            k3i var5 = (k3i)var4.next();
            var5.n5("dgm", var2, "if");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "else");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final k3i[] l6() {
      return this.l6.toArray(new k3i[0]);
   }

   public final a6k k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(i9l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(i9l var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a6k n5(i9l var0, a6k var1) {
      return var0.k5 = var1;
   }
}
