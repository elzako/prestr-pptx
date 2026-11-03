package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class w8r extends b3 {
   private String n5;
   private String l6;
   private f4d k5;
   private List<g7> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "w_Uri",
      "w_Element",
      "customXmlPr",
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

   public w8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w8r$1 var2 = new w8r$1(this);
      n5(var1, var2);
      n5(var1, new w8r$2(this, var1));
   }

   public w8r() {
      this.l6();
   }

   private void l6() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:uri", this.n5);
      }

      var2.l6("w:element", this.l6);
      if (this.k5 != null) {
         this.k5.n5("w", var2, "customXmlPr");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 3:
                  ((w8r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 4:
                  ((w0a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((j2a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((z4t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((n4r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((f3y)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((t9r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((s2c)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 14:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 15:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 16:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 17:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 19:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 20:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 21:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 22:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 23:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 24:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 25:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 26:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 27:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 28:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 29:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 30:
                  ((m1r)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 31:
                  ((o3d)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 32:
                  ((k9o)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 33:
                  ((f6s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 34:
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
      return a6;
   }

   // $VF: synthetic method
   static String n5(w8r var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(w8r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f4d n5(w8r var0, f4d var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(w8r var0) {
      return var0.u3;
   }
}
