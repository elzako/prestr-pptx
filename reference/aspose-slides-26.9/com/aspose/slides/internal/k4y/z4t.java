package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class z4t extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private h5a u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "w_RsidRPr",
      "w_RsidDel",
      "w_RsidR",
      "rPr",
      "br",
      "t",
      "delText",
      "instrText",
      "delInstrText",
      "noBreakHyphen",
      "softHyphen",
      "dayShort",
      "monthShort",
      "yearShort",
      "dayLong",
      "monthLong",
      "yearLong",
      "annotationRef",
      "footnoteRef",
      "endnoteRef",
      "separator",
      "continuationSeparator",
      "sym",
      "pgNum",
      "cr",
      "tab",
      "object",
      "pict",
      "fldChar",
      "ruby",
      "footnoteReference",
      "endnoteReference",
      "commentReference",
      "drawing",
      "ptab",
      "lastRenderedPageBreak"
   );

   public z4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z4t$1 var2 = new z4t$1(this);
      n5(var1, var2);
      n5(var1, new z4t$2(this, var1));
   }

   public z4t() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:rsidRPr", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("w:rsidDel", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("w:rsidR", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != null) {
         this.u3.n5("w", var2, "rPr");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((m1w)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((t5l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((t5l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((t5l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((t5l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 14:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 15:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 16:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 17:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 19:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 20:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 21:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 22:
                  ((q4n)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 23:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 24:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 25:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 26:
                  ((h4g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 27:
                  ((d6g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 28:
                  ((w2r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 29:
                  ((g3s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 30:
                  ((k9t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 31:
                  ((k9t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 32:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 33:
                  ((x9j)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 34:
                  ((p5z)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 35:
                  ((v6m)var5.k5()).n5("w", var2, var5.n5());
            }
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
      return u9;
   }

   // $VF: synthetic method
   static int n5(z4t var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(z4t var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(z4t var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h5a n5(z4t var0, h5a var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(z4t var0) {
      return var0.a6;
   }
}
