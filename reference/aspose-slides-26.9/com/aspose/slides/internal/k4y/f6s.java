package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f6s extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private String a6;
   private String u9;
   private List<g7> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "w_TgtFrame",
      "w_Tooltip",
      "w_DocLocation",
      "w_History",
      "w_Anchor",
      "r:id",
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

   public f6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f6s$1 var2 = new f6s$1(this);
      n5(var1, var2);
      n5(var1, new f6s$2(this, var1));
   }

   public f6s() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.h0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:tgtFrame", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("w:tooltip", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("w:docLocation", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("w:history", h5k.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("w:anchor", this.a6);
      }

      if (this.u9 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.u9);
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (c8.n5(var5.n5())) {
               case 6:
                  ((w8r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((w0a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((j2a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((z4t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((n4r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((f3y)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((t9r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((s2c)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 14:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 15:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 16:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 17:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 19:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 20:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 21:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 22:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 23:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 24:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 25:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 26:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 27:
                  ((v8s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 28:
                  ((h1g)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 29:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 30:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 31:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 32:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 33:
                  ((m1r)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 34:
                  ((o3d)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 35:
                  ((k9o)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 36:
                  ((f6s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 37:
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
      return c8;
   }

   // $VF: synthetic method
   static String n5(f6s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(f6s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(f6s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(f6s var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(f6s var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(f6s var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static List n5(f6s var0) {
      return var0.h0;
   }
}
