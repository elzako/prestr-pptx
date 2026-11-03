package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v3t extends b3 {
   private byte n5;
   private s2b l6;
   private List<s2b> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("edited", "start", "lineTo");

   public v3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v3t$1 var2 = new v3t$1(this);
      n5(var1, var2);
      n5(var1, new v3t$2(this, var1));
   }

   public v3t() {
      this.l6();
      this.l6 = new s2b();
   }

   private void l6() {
      this.n5 = -1;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("edited", this.n5 == 1 ? "1" : "0");
      }

      this.l6.n5("wp", var2, "start");
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            s2b var5 = (s2b)var4.next();
            var5.n5("wp", var2, "lineTo");
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
      return u3;
   }

   // $VF: synthetic method
   static byte n5(v3t var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s2b n5(v3t var0, s2b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(v3t var0) {
      return var0.k5;
   }
}
