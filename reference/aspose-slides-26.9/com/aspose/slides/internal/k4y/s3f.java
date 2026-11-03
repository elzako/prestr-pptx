package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s3f extends b3 {
   private long n5;
   private boolean l6;
   private boolean k5;
   private List<n1x> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "deleted", "xmlBased", "cellSmartTagPr");

   public s3f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s3f$1 var2 = new s3f$1(this);
      n5(var1, var2);
      n5(var1, new s3f$2(this, var1));
   }

   public s3f() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6) {
         var2.l6("deleted", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("xmlBased", this.k5 ? "1" : "0");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            n1x var5 = (n1x)var4.next();
            var5.n5("ssml", var2, "cellSmartTagPr");
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
   static long n5(s3f var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(s3f var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(s3f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(s3f var0) {
      return var0.u3;
   }
}
