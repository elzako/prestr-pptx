package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f5w extends b3 {
   private int k5;
   private int u3;
   private List<g7> a6;
   public static final int n5 = n9d.n5("span");
   public static final int l6 = x5y.n5("cw");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "meth", "hueDir", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public f5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      f5w$1 var2 = new f5w$1(this);
      n5(var1, var2);
      n5(var1, new f5w$2(this, var1));
   }

   public f5w() {
      this.u3();
   }

   private void u3() {
      this.k5 = n5;
      this.u3 = l6;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("meth", n9d.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("hueDir", x5y.n5(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 2:
                  ((e4w)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 3:
                  ((e8p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((d0p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((s0i)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((q4d)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((x4a)var5.k5()).n5("a", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.k5;
   }

   public final List<g7> l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(f5w var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(f5w var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(f5w var0) {
      return var0.a6;
   }
}
