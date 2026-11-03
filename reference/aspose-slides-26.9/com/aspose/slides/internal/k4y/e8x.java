package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class e8x extends b3 {
   private r2d n5;
   private m0l l6;
   private List<g7> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "m:rPr",
      "a:rPr",
      "w:br",
      "w:t",
      "w:delText",
      "w:instrText",
      "w:delInstrText",
      "w:noBreakHyphen",
      "w:softHyphen",
      "w:dayShort",
      "w:monthShort",
      "w:yearShort",
      "w:dayLong",
      "w:monthLong",
      "w:yearLong",
      "w:annotationRef",
      "w:footnoteRef",
      "w:endnoteRef",
      "w:separator",
      "w:continuationSeparator",
      "w:sym",
      "w:pgNum",
      "w:cr",
      "w:tab",
      "w:object",
      "w:pict",
      "w:fldChar",
      "w:ruby",
      "w:footnoteReference",
      "w:endnoteReference",
      "w:commentReference",
      "w:drawing",
      "w:ptab",
      "w:lastRenderedPageBreak",
      "m:t"
   );

   public e8x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (u3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var1.e2(), ":", var1.n3()}))) {
                  case 0:
                     this.n5 = new r2d(var1);
                     break;
                  case 1:
                     this.l6 = new m0l(var1);
                     break;
                  case 2:
                     m1w var4 = new m1w(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "br"}), var4));
                     break;
                  case 3:
                     t5l var5 = new t5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "t"}), var5));
                     break;
                  case 4:
                     t5l var6 = new t5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "delText"}), var6));
                     break;
                  case 5:
                     t5l var7 = new t5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "instrText"}), var7));
                     break;
                  case 6:
                     t5l var8 = new t5l(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "delInstrText"}), var8));
                     break;
                  case 7:
                     v6m var9 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "noBreakHyphen"}), var9));
                     break;
                  case 8:
                     v6m var10 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "softHyphen"}), var10));
                     break;
                  case 9:
                     v6m var11 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "dayShort"}), var11));
                     break;
                  case 10:
                     v6m var12 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "monthShort"}), var12));
                     break;
                  case 11:
                     v6m var13 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "yearShort"}), var13));
                     break;
                  case 12:
                     v6m var14 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "dayLong"}), var14));
                     break;
                  case 13:
                     v6m var15 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "monthLong"}), var15));
                     break;
                  case 14:
                     v6m var16 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "yearLong"}), var16));
                     break;
                  case 15:
                     v6m var17 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "annotationRef"}), var17));
                     break;
                  case 16:
                     v6m var18 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "footnoteRef"}), var18));
                     break;
                  case 17:
                     v6m var19 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "endnoteRef"}), var19));
                     break;
                  case 18:
                     v6m var20 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "separator"}), var20));
                     break;
                  case 19:
                     v6m var21 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "continuationSeparator"}), var21));
                     break;
                  case 20:
                     q4n var22 = new q4n(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "sym"}), var22));
                     break;
                  case 21:
                     v6m var23 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "pgNum"}), var23));
                     break;
                  case 22:
                     v6m var24 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "cr"}), var24));
                     break;
                  case 23:
                     v6m var25 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "tab"}), var25));
                     break;
                  case 24:
                     h4g var26 = new h4g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "object"}), var26));
                     break;
                  case 25:
                     d6g var27 = new d6g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "pict"}), var27));
                     break;
                  case 26:
                     w2r var28 = new w2r(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "fldChar"}), var28));
                     break;
                  case 27:
                     g3s var29 = new g3s(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "ruby"}), var29));
                     break;
                  case 28:
                     k9t var30 = new k9t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "footnoteReference"}), var30));
                     break;
                  case 29:
                     k9t var31 = new k9t(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "endnoteReference"}), var31));
                     break;
                  case 30:
                     h1g var32 = new h1g(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "commentReference"}), var32));
                     break;
                  case 31:
                     x9j var33 = new x9j(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "drawing"}), var33));
                     break;
                  case 32:
                     p5z var34 = new p5z(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "ptab"}), var34));
                     break;
                  case 33:
                     v6m var35 = new v6m(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"w:", "lastRenderedPageBreak"}), var35));
                     break;
                  case 34:
                     t9f var36 = new t9f(var1);
                     this.k5.addItem(new g7(com.aspose.slides.ms.System.d1.n5(new String[]{"m:", "t"}), var36));
                     break;
                  default:
                     var1.r4();
                     var3 = true;
               }
            }
         }
      }
   }

   public e8x() {
      this.u9();
   }

   private void u9() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "rPr");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "rPr");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u3.n5(var5.n5())) {
               case 2:
                  ((m1w)var5.k5()).n5("w", var2, "br");
                  break;
               case 3:
                  ((t5l)var5.k5()).n5("w", var2, "t");
                  break;
               case 4:
                  ((t5l)var5.k5()).n5("w", var2, "delText");
                  break;
               case 5:
                  ((t5l)var5.k5()).n5("w", var2, "instrText");
                  break;
               case 6:
                  ((t5l)var5.k5()).n5("w", var2, "delInstrText");
                  break;
               case 7:
                  ((v6m)var5.k5()).n5("w", var2, "noBreakHyphen");
                  break;
               case 8:
                  ((v6m)var5.k5()).n5("w", var2, "softHyphen");
                  break;
               case 9:
                  ((v6m)var5.k5()).n5("w", var2, "dayShort");
                  break;
               case 10:
                  ((v6m)var5.k5()).n5("w", var2, "monthShort");
                  break;
               case 11:
                  ((v6m)var5.k5()).n5("w", var2, "yearShort");
                  break;
               case 12:
                  ((v6m)var5.k5()).n5("w", var2, "dayLong");
                  break;
               case 13:
                  ((v6m)var5.k5()).n5("w", var2, "monthLong");
                  break;
               case 14:
                  ((v6m)var5.k5()).n5("w", var2, "yearLong");
                  break;
               case 15:
                  ((v6m)var5.k5()).n5("w", var2, "annotationRef");
                  break;
               case 16:
                  ((v6m)var5.k5()).n5("w", var2, "footnoteRef");
                  break;
               case 17:
                  ((v6m)var5.k5()).n5("w", var2, "endnoteRef");
                  break;
               case 18:
                  ((v6m)var5.k5()).n5("w", var2, "separator");
                  break;
               case 19:
                  ((v6m)var5.k5()).n5("w", var2, "continuationSeparator");
                  break;
               case 20:
                  ((q4n)var5.k5()).n5("w", var2, "sym");
                  break;
               case 21:
                  ((v6m)var5.k5()).n5("w", var2, "pgNum");
                  break;
               case 22:
                  ((v6m)var5.k5()).n5("w", var2, "cr");
                  break;
               case 23:
                  ((v6m)var5.k5()).n5("w", var2, "tab");
                  break;
               case 24:
                  ((h4g)var5.k5()).n5("w", var2, "object");
                  break;
               case 25:
                  ((d6g)var5.k5()).n5("w", var2, "pict");
                  break;
               case 26:
                  ((w2r)var5.k5()).n5("w", var2, "fldChar");
                  break;
               case 27:
                  ((g3s)var5.k5()).n5("w", var2, "ruby");
                  break;
               case 28:
                  ((k9t)var5.k5()).n5("w", var2, "footnoteReference");
                  break;
               case 29:
                  ((k9t)var5.k5()).n5("w", var2, "endnoteReference");
                  break;
               case 30:
                  ((h1g)var5.k5()).n5("w", var2, "commentReference");
                  break;
               case 31:
                  ((x9j)var5.k5()).n5("w", var2, "drawing");
                  break;
               case 32:
                  ((p5z)var5.k5()).n5("w", var2, "ptab");
                  break;
               case 33:
                  ((v6m)var5.k5()).n5("w", var2, "lastRenderedPageBreak");
                  break;
               case 34:
                  ((t9f)var5.k5()).n5("m", var2, "t");
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final r2d n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <rPr> element can be added.");
      }

      this.n5 = new r2d();
      return this.n5;
   }

   public final m0l l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <rPr2> element can be added.");
      }

      this.l6 = new m0l();
      return this.l6;
   }

   public final void n5(g7 var1) {
      this.k5.addItem(var1);
   }

   public final r2d k5() {
      return this.n5;
   }

   public final m0l u3() {
      return this.l6;
   }

   public final List<g7> a6() {
      return this.k5;
   }
}
