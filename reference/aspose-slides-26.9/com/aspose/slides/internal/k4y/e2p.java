package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e2p extends b3 {
   private boolean l6;
   private int k5;
   private List<m0r> u3;
   private List<s4n> a6;
   public static final int n5 = e1v.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("blank", "calendarType", "filter", "dateGroupItem");

   public e2p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e2p$1 var2 = new e2p$1(this);
      n5(var1, var2);
      n5(var1, new e2p$2(this, var1));
   }

   public e2p() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = n5;
      this.u3 = new List<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         var2.l6("blank", this.l6 ? "1" : "0");
      }

      if (this.k5 != n5) {
         var2.l6("calendarType", e1v.n5(this.k5));
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            m0r var5 = (m0r)var4.next();
            var5.n5("ssml", var2, "filter");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.a6.iterator();

      try {
         while (var14.hasNext()) {
            s4n var6 = (s4n)var14.next();
            var6.n5("ssml", var2, "dateGroupItem");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(e2p var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(e2p var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(e2p var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static List l6(e2p var0) {
      return var0.a6;
   }
}
