package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m0y extends b3 {
   private boolean l6;
   private boolean k5;
   private int u3;
   private String a6;
   private List<y7i> u9;
   private l0k h0;
   public static final int n5 = b4x.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "columnSort", "caseSensitive", "sortMethod", "ref", "sortCondition", "extLst"
   );

   public m0y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m0y$1 var2 = new m0y$1(this);
      n5(var1, var2);
      n5(var1, new m0y$2(this, var1));
   }

   public m0y() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = n5;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         var2.l6("columnSort", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("caseSensitive", this.k5 ? "1" : "0");
      }

      if (this.u3 != n5) {
         var2.l6("sortMethod", b4x.n5(this.u3));
      }

      var2.l6("ref", this.a6);
      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            y7i var5 = (y7i)var4.next();
            var5.n5("ssml", var2, "sortCondition");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static boolean n5(m0y var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(m0y var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(m0y var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(m0y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(m0y var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static l0k n5(m0y var0, l0k var1) {
      return var0.h0 = var1;
   }
}
