package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class g2g extends b3 {
   private List<g7> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "customXml",
      "smartTag",
      "sdt",
      "r",
      "proofErr",
      "permStart",
      "permEnd",
      "bookmarkStart",
      "bookmarkEnd",
      "moveFromRangeStart",
      "moveFromRangeEnd",
      "moveToRangeStart",
      "moveToRangeEnd",
      "commentRangeStart",
      "commentRangeEnd",
      "customXmlInsRangeStart",
      "customXmlInsRangeEnd",
      "customXmlDelRangeStart",
      "customXmlDelRangeEnd",
      "customXmlMoveFromRangeStart",
      "customXmlMoveFromRangeEnd",
      "customXmlMoveToRangeStart",
      "customXmlMoveToRangeEnd",
      "ins",
      "del",
      "moveFrom",
      "moveTo",
      "oMathPara",
      "oMath",
      "fldSimple",
      "hyperlink",
      "subDoc"
   );

   public g2g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new g2g$1(this, var1));
   }

   public g2g() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (l6.n5(var5.n5())) {
               case 0:
                  ((w8r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 1:
                  ((w0a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 2:
                  ((j2a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 3:
                  ((z4t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 4:
                  ((n4r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((f3y)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((t9r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((s2c)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 14:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 15:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 16:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 17:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 19:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 20:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 21:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 22:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 23:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 24:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 25:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 26:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 27:
                  ((m1r)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 28:
                  ((o3d)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 29:
                  ((k9o)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 30:
                  ((f6s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 31:
                  ((s2l)var5.k5()).n5("w", var2, var5.n5());
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
      return l6;
   }

   // $VF: synthetic method
   static List n5(g2g var0) {
      return var0.n5;
   }
}
