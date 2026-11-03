package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w7 extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private List<g7> a6;
   private l8r u9;
   public static final int n5 = k0b.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "r:embed",
      "r:link",
      "cstate",
      "alphaBiLevel",
      "alphaCeiling",
      "alphaFloor",
      "alphaInv",
      "alphaMod",
      "alphaModFix",
      "alphaRepl",
      "biLevel",
      "blur",
      "clrChange",
      "clrRepl",
      "duotone",
      "fillOverlay",
      "grayscl",
      "hsl",
      "lum",
      "tint",
      "extLst"
   );

   public w7(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      w7$1 var2 = new w7$1(this);
      n5(var1, var2);
      n5(var1, new w7$2(this, var1));
   }

   public w7() {
      this.u9();
   }

   private void u9() {
      this.l6 = "";
      this.k5 = "";
      this.u3 = n5;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (!"".equals(this.l6)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:embed", this.l6);
      }

      if (!"".equals(this.k5)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:link", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("cstate", k0b.n5(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (h0.n5(var5.n5())) {
               case 3:
                  ((p0)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 4:
                  ((s1)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 5:
                  ((g9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 6:
                  ((l9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 7:
                  ((z2)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 8:
                  ((m5)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 9:
                  ((p2)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 10:
                  ((m7)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 11:
                  ((f9)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 12:
                  ((x4)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 13:
                  ((l3)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 14:
                  ((d4n)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 15:
                  ((k1d)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 16:
                  ((l2p)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 17:
                  ((t1z)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 18:
                  ((k3h)var5.k5()).n5("a", var2, var5.n5());
                  break;
               case 19:
                  ((j8o)var5.k5()).n5("a", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.u9 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (h0.n5(var1)) {
         case 3:
            var2 = new g7("alphaBiLevel", new p0());
            break;
         case 4:
            var2 = new g7("alphaCeiling", new s1());
            break;
         case 5:
            var2 = new g7("alphaFloor", new g9());
            break;
         case 6:
            var2 = new g7("alphaInv", new l9());
            break;
         case 7:
            var2 = new g7("alphaMod", new z2());
            break;
         case 8:
            var2 = new g7("alphaModFix", new m5());
            break;
         case 9:
            var2 = new g7("alphaRepl", new p2());
            break;
         case 10:
            var2 = new g7("biLevel", new m7());
            break;
         case 11:
            var2 = new g7("blur", new f9());
            break;
         case 12:
            var2 = new g7("clrChange", new x4());
            break;
         case 13:
            var2 = new g7("clrRepl", new l3());
            break;
         case 14:
            var2 = new g7("duotone", new d4n());
            break;
         case 15:
            var2 = new g7("fillOverlay", new k1d());
            break;
         case 16:
            var2 = new g7("grayscl", new l2p());
            break;
         case 17:
            var2 = new g7("hsl", new t1z());
            break;
         case 18:
            var2 = new g7("lum", new k3h());
            break;
         case 19:
            var2 = new g7("tint", new j8o());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.a6.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final List<g7> k5() {
      return this.a6;
   }

   public final x8 u3() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(w7 var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(w7 var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(w7 var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(w7 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static l8r n5(w7 var0, l8r var1) {
      return var0.u9 = var1;
   }
}
