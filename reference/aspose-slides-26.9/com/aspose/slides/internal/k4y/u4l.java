package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class u4l extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private String u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name",
      "text:name",
      "text:protected",
      "text:protection-key",
      "h",
      "p",
      "list",
      "numbered-paragraph",
      "table",
      "a",
      "section",
      "soft-page-break",
      "table-of-content",
      "illustration-index",
      "table-index",
      "object-index",
      "user-index",
      "alphabetical-index",
      "bibliography",
      "rect",
      "line",
      "polyline",
      "polygon",
      "regular-polygon",
      "path",
      "circle",
      "ellipse",
      "g",
      "page-thumbnail",
      "frame",
      "measure",
      "caption",
      "connector",
      "control",
      "scene",
      "custom-shape",
      "change",
      "change-start",
      "change-end",
      "index-title"
   );

   public u4l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u4l$1 var2 = new u4l$1(this);
      n5(var1, var2);
      n5(var1, new u4l$2(this, var1));
   }

   public u4l() {
      this.l6();
   }

   private void l6() {
      this.k5 = -1;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      var2.l6("text:name", this.l6);
      if (this.k5 != -1) {
         var2.l6("text:protected", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("text:protection-key", this.u3);
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 5:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 6:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 7:
                  ((e2q)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 8:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 9:
                  ((y3o)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 10:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 11:
                  ((j0v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 12:
                  ((o1b)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 13:
                  ((e1e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 14:
                  ((i6x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 15:
                  ((i2e)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 16:
                  ((q5c)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 17:
                  ((s1f)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 18:
                  ((z4m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 19:
                  ((e6x)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 20:
                  ((j6v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 21:
                  ((u5l)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 22:
                  ((s4p)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 23:
                  ((z7d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 24:
                  ((c5w)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 25:
                  ((f1h)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 26:
                  ((d2z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 27:
                  ((c4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 28:
                  ((h4i)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 29:
                  ((b4f)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 30:
                  ((v6z)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 31:
                  ((v8v)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 32:
                  ((l3d)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 33:
                  ((w4a)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 34:
                  ((d8f)var5.k5()).n5("dr3d", var2, var5.n5());
                  break;
               case 35:
                  ((g3c)var5.k5()).n5("draw", var2, var5.n5());
                  break;
               case 36:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 37:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 38:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 39:
                  ((u4l)var5.k5()).n5("text", var2, var5.n5());
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
   static String n5(u4l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u4l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(u4l var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(u4l var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(u4l var0) {
      return var0.a6;
   }
}
