package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private boolean u3;
   private byte a6;
   private int u9;
   private List<g7> h0;
   private List<h0> c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "fo:background-color",
      "fo:margin-left",
      "fo:margin-right",
      "style:protect",
      "text:dont-balance-text-columns",
      "style:writing-mode",
      "background-image",
      "columns",
      "notes-configuration"
   );

   public d5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5z$1 var2 = new d5z$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (t2.n5(var1.n3())) {
                  case 6:
                     v9d var5 = new v9d(var1);
                     this.h0.addItem(new g7("background-image", var5));
                     break;
                  case 7:
                     t2f var6 = new t2f(var1);
                     this.h0.addItem(new g7("columns", var6));
                     break;
                  case 8:
                     z4a var7 = new z4a(var1);
                     this.h0.addItem(new g7("notes-configuration", var7));
                     break;
                  default:
                     h0 var8 = new h0(var1);
                     this.c8.addItem(var8);
                     var4 = true;
               }
            }
         }
      }
   }

   public d5z() {
      this.l6();
   }

   private void l6() {
      this.a6 = -1;
      this.u9 = 0;
      this.h0 = new List<>();
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("fo:background-color", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("fo:margin-left", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("fo:margin-right", this.k5);
      }

      var2.l6("style:protect", this.u3 ? "true" : "false");
      if (this.a6 != -1) {
         var2.l6("text:dont-balance-text-columns", this.a6 == 1 ? "true" : "false");
      }

      if (this.u9 != 0) {
         var2.l6("style:writing-mode", w6i.n5(this.u9));
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (t2.n5(var5.n5())) {
               case 6:
                  ((v9d)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 7:
                  ((t2f)var5.k5()).n5("style", var2, var5.n5());
                  break;
               case 8:
                  ((z4a)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.c8.iterator();

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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(d5z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d5z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(d5z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d5z var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte n5(d5z var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(d5z var0, int var1) {
      return var0.u9 = var1;
   }
}
