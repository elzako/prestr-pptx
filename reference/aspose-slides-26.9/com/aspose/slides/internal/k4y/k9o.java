package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k9o extends b3 {
   private String n5;
   private int l6;
   private int k5;
   private t5l u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "w_Instr",
      "w_FldLock",
      "w_Dirty",
      "fldData",
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

   public k9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k9o$1 var2 = new k9o$1(this);
      n5(var1, var2);
      n5(var1, new k9o$2(this, var1));
   }

   public k9o() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:instr", this.n5);
      if (this.l6 != 0) {
         var2.l6("w:fldLock", h5k.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("w:dirty", h5k.n5(this.k5));
      }

      if (this.u3 != null) {
         this.u3.n5("w", var2, "fldData");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((w8r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 5:
                  ((w0a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 6:
                  ((j2a)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 7:
                  ((z4t)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 8:
                  ((n4r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 9:
                  ((f3y)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 10:
                  ((t9r)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 11:
                  ((s2c)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 12:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 13:
                  ((f3g)var5.k5()).n5("w", var2, var5.n5());
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
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 18:
                  ((j3l)var5.k5()).n5("w", var2, var5.n5());
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
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 28:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 29:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 30:
                  ((k5v)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 31:
                  ((m1r)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 32:
                  ((o3d)var5.k5()).n5("m", var2, var5.n5());
                  break;
               case 33:
                  ((k9o)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 34:
                  ((f6s)var5.k5()).n5("w", var2, var5.n5());
                  break;
               case 35:
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
      return u9;
   }

   // $VF: synthetic method
   static String n5(k9o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(k9o var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(k9o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static t5l n5(k9o var0, t5l var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(k9o var0) {
      return var0.a6;
   }
}
