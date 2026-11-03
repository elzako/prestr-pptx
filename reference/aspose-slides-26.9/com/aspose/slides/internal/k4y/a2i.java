package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a2i extends b3 {
   private List<g7> n5;
   private List<h0> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "generator",
      "title",
      "description",
      "subject",
      "keyword",
      "initial-creator",
      "creator",
      "printed-by",
      "creation-date",
      "date",
      "print-date",
      "template",
      "auto-reload",
      "hyperlink-behaviour",
      "language",
      "editing-cycles",
      "editing-duration",
      "document-statistic",
      "user-defined"
   );

   public a2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (k5.n5(var1.n3())) {
                  case 0:
                     var1.u9();
                     String var4 = var1.z1();
                     this.n5.addItem(new g7("generator", var4));
                     break;
                  case 1:
                     var1.u9();
                     String var5 = var1.z1();
                     this.n5.addItem(new g7("title", var5));
                     break;
                  case 2:
                     var1.u9();
                     String var6 = var1.z1();
                     this.n5.addItem(new g7("description", var6));
                     break;
                  case 3:
                     var1.u9();
                     String var7 = var1.z1();
                     this.n5.addItem(new g7("subject", var7));
                     break;
                  case 4:
                     var1.u9();
                     String var8 = var1.z1();
                     this.n5.addItem(new g7("keyword", var8));
                     break;
                  case 5:
                     var1.u9();
                     String var9 = var1.z1();
                     this.n5.addItem(new g7("initial-creator", var9));
                     break;
                  case 6:
                     var1.u9();
                     String var10 = var1.z1();
                     this.n5.addItem(new g7("creator", var10));
                     break;
                  case 7:
                     var1.u9();
                     String var11 = var1.z1();
                     this.n5.addItem(new g7("printed-by", var11));
                     break;
                  case 8:
                     var1.u9();
                     com.aspose.slides.ms.System.j5 var12 = com.aspose.slides.ms.System.j5.n5(var1.z1(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3();
                     this.n5.addItem(new g7("creation-date", var12.m3()));
                     break;
                  case 9:
                     var1.u9();
                     String var13 = var1.z1();
                     this.n5.addItem(new g7("date", var13));
                     break;
                  case 10:
                     var1.u9();
                     com.aspose.slides.ms.System.j5 var14 = com.aspose.slides.ms.System.j5.n5(var1.z1(), com.aspose.slides.internal.x7n.l6.u3(), 16).m3();
                     this.n5.addItem(new g7("print-date", var14.m3()));
                     break;
                  case 11:
                     o1l var15 = new o1l(var1);
                     this.n5.addItem(new g7("template", var15));
                     break;
                  case 12:
                     l1a var16 = new l1a(var1);
                     this.n5.addItem(new g7("auto-reload", var16));
                     break;
                  case 13:
                     a3a var17 = new a3a(var1);
                     this.n5.addItem(new g7("hyperlink-behaviour", var17));
                     break;
                  case 14:
                     var1.u9();
                     String var18 = var1.z1();
                     this.n5.addItem(new g7("language", var18));
                     break;
                  case 15:
                     var1.u9();
                     long var19 = q0(var1.z1());
                     this.n5.addItem(new g7("editing-cycles", var19));
                     break;
                  case 16:
                     var1.u9();
                     com.aspose.slides.ms.System.s4 var21 = t9(var1.z1()).n3();
                     this.n5.addItem(new g7("editing-duration", var21.n3()));
                     break;
                  case 17:
                     x2u var22 = new x2u(var1);
                     this.n5.addItem(new g7("document-statistic", var22));
                     break;
                  case 18:
                     e5e var23 = new e5e(var1);
                     this.n5.addItem(new g7("user-defined", var23));
                     break;
                  default:
                     h0 var24 = new h0(var1);
                     this.l6.addItem(var24);
                     var3 = true;
               }
            }
         }
      }
   }

   public a2i() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (k5.n5(var5.n5())) {
               case 0:
                  this.n5("meta", var2, "generator", (String)var5.k5(), false);
                  break;
               case 1:
                  this.n5("dc", var2, "title", (String)var5.k5(), false);
                  break;
               case 2:
                  this.n5("dc", var2, "description", (String)var5.k5(), false);
                  break;
               case 3:
                  this.n5("dc", var2, "subject", (String)var5.k5(), false);
                  break;
               case 4:
                  this.n5("meta", var2, "keyword", (String)var5.k5(), false);
                  break;
               case 5:
                  this.n5("meta", var2, "initial-creator", (String)var5.k5(), false);
                  break;
               case 6:
                  this.n5("dc", var2, "creator", (String)var5.k5(), false);
                  break;
               case 7:
                  this.n5("meta", var2, "printed-by", (String)var5.k5(), false);
                  break;
               case 8:
                  this.n5(
                     "meta",
                     var2,
                     "creation-date",
                     com.aspose.slides.ms.System.Xml.f4.n5(
                        com.aspose.slides.internal.v6g.k5.u3(var5.k5(), com.aspose.slides.ms.System.j5.class).m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"
                     ),
                     false
                  );
                  break;
               case 9:
                  this.n5("dc", var2, "date", (String)var5.k5(), false);
                  break;
               case 10:
                  this.n5(
                     "meta",
                     var2,
                     "print-date",
                     com.aspose.slides.ms.System.Xml.f4.n5(
                        com.aspose.slides.internal.v6g.k5.u3(var5.k5(), com.aspose.slides.ms.System.j5.class).m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"
                     ),
                     false
                  );
                  break;
               case 11:
                  ((o1l)var5.k5()).n5("meta", var2, var5.n5());
                  break;
               case 12:
                  ((l1a)var5.k5()).n5("meta", var2, var5.n5());
                  break;
               case 13:
                  ((a3a)var5.k5()).n5("meta", var2, var5.n5());
                  break;
               case 14:
                  this.n5("dc", var2, "language", (String)var5.k5(), false);
                  break;
               case 15:
                  this.n5(
                     "meta",
                     var2,
                     "editing-cycles",
                     com.aspose.slides.ms.System.Xml.f4.l6(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), long.class).longValue()),
                     false
                  );
                  break;
               case 16:
                  this.n5(
                     "meta", var2, "editing-duration", n5(com.aspose.slides.internal.v6g.k5.u3(var5.k5(), com.aspose.slides.ms.System.s4.class).n3()), false
                  );
                  break;
               case 17:
                  ((x2u)var5.k5()).n5("meta", var2, var5.n5());
                  break;
               case 18:
                  ((e5e)var5.k5()).n5("meta", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.l6.iterator();

      try {
         while (var14.hasNext()) {
            h0 var6 = (h0)var14.next();
            var6.n5("", var2, "");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(g7 var1) {
      this.n5.addItem(var1);
   }

   public final List<g7> n5() {
      return this.n5;
   }
}
