package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i4v extends b3 {
   private boolean n5;
   private p7f l6;
   private a0w k5;
   private d3o u3;
   private u8n a6;
   private t7a u9;
   private y6z h0;
   private List<g7> c8;
   private s4s t2;
   private s4s s7;
   private s4s x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "style:display",
      "tracked-changes",
      "variable-decls",
      "sequence-decls",
      "user-field-decls",
      "dde-connection-decls",
      "alphabetical-index-auto-mark-file",
      "h",
      "p",
      "list",
      "table",
      "section",
      "table-of-content",
      "illustration-index",
      "table-index",
      "object-index",
      "user-index",
      "alphabetical-index",
      "bibliography",
      "index-title",
      "change",
      "change-start",
      "change-end",
      "region-left",
      "region-center",
      "region-right"
   );

   public i4v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i4v$1 var2 = new i4v$1(this);
      n5(var1, var2);
      n5(var1, new i4v$2(this, var1));
   }

   public i4v() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("style:display", this.n5 ? "true" : "false");
      }

      if (this.l6 != null) {
         this.l6.n5("text", var2, "tracked-changes");
      }

      if (this.k5 != null) {
         this.k5.n5("text", var2, "variable-decls");
      }

      if (this.u3 != null) {
         this.u3.n5("text", var2, "sequence-decls");
      }

      if (this.a6 != null) {
         this.a6.n5("text", var2, "user-field-decls");
      }

      if (this.u9 != null) {
         this.u9.n5("text", var2, "dde-connection-decls");
      }

      if (this.h0 != null) {
         this.h0.n5("text", var2, "alphabetical-index-auto-mark-file");
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (n3.n5(var5.n5())) {
               case 7:
                  ((m2v)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 8:
                  ((u1x)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 9:
                  ((u0y)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 10:
                  ((y7e)var5.k5()).n5("table", var2, var5.n5());
                  break;
               case 11:
                  ((x6o)var5.k5()).n5("text", var2, var5.n5());
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
                  ((u4l)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 20:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 21:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 22:
                  ((t2s)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.t2 != null) {
         this.t2.n5("style", var2, "region-left");
      }

      if (this.s7 != null) {
         this.s7.n5("style", var2, "region-center");
      }

      if (this.x8 != null) {
         this.x8.n5("style", var2, "region-right");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n3;
   }

   // $VF: synthetic method
   static boolean n5(i4v var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p7f n5(i4v var0, p7f var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a0w n5(i4v var0, a0w var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static d3o n5(i4v var0, d3o var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u8n n5(i4v var0, u8n var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static t7a n5(i4v var0, t7a var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y6z n5(i4v var0, y6z var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(i4v var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static s4s n5(i4v var0, s4s var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static s4s l6(i4v var0, s4s var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static s4s k5(i4v var0, s4s var1) {
      return var0.x8 = var1;
   }
}
