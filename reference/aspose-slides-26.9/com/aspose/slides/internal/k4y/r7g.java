package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r7g extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<b4h> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("xml:id", "type", "startTime", "action");

   public r7g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r7g$1 var2 = new r7g$1(this);
      n5(var1, var2);
      n5(var1, new r7g$2(this, var1));
   }

   public r7g() {
      this.l6();
   }

   private void l6() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      com.aspose.slides.internal.f8y.n5.n5(this.l6 != null, "Required property \"Type\" is uninitialized.");
      var2.l6("type", this.l6);
      com.aspose.slides.internal.f8y.n5.n5(this.k5 != null, "Required property \"StartTime\" is uninitialized.");
      var2.l6("startTime", this.k5);
      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            b4h var5 = (b4h)var4.next();
            var5.n5("iact", var2, "action");
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
      return a6;
   }

   // $VF: synthetic method
   static String n5(r7g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r7g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(r7g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(r7g var0) {
      return var0.u3;
   }
}
