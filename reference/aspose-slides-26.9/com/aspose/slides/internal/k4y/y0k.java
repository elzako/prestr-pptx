package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class y0k extends b3 {
   private String n5;
   private f2q l6;
   private w8e k5;
   private List<u7a> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "Id", "CanonicalizationMethod", "SignatureMethod", "Reference"
   );

   public y0k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      y0k$1 var2 = new y0k$1(this);
      n5(var1, var2);
      n5(var1, new y0k$2(this, var1));
   }

   public y0k() {
      this.a6();
      this.l6 = new f2q();
      this.k5 = new w8e();
   }

   private void a6() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      this.l6.n5("", var2, "CanonicalizationMethod");
      this.k5.n5("", var2, "SignatureMethod");
      List$Enumerator var4 = this.u3.iterator();

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
      this.u3.addItem(var1);
      return var1;
   }

   public final f2q l6() {
      return this.l6;
   }

   public final w8e k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(y0k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f2q n5(y0k var0, f2q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w8e n5(y0k var0, w8e var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(y0k var0) {
      return var0.u3;
   }
}
