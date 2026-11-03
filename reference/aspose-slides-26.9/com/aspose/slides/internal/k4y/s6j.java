package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s6j extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private String u3;
   private int a6;
   private int u9;
   private int h0;
   private v9d c8;
   private List<h0> t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "style:row-height",
      "style:min-row-height",
      "style:use-optimal-row-height",
      "fo:background-color",
      "fo:break-before",
      "fo:break-after",
      "fo:keep-together",
      "background-image"
   );

   public s6j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      s6j$1 var2 = new s6j$1(this);
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
               switch (s7.n5(var1.n3())) {
                  case 7:
                     this.c8 = new v9d(var1);
                     break;
                  default:
                     h0 var5 = new h0(var1);
                     this.t2.addItem(var5);
                     var4 = true;
               }
            }
         }
      }
   }

   public s6j() {
      this.k5();
   }

   private void k5() {
      this.k5 = -1;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.t2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("style:row-height", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("style:min-row-height", this.l6);
      }

      if (this.k5 != -1) {
         var2.l6("style:use-optimal-row-height", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("fo:background-color", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("fo:break-before", g4c.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("fo:break-after", w7s.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("fo:keep-together", i3z.n5(this.h0));
      }

      if (this.c8 != null) {
         this.c8.n5("style", var2, "background-image");
      }

      List$Enumerator var4 = this.t2.iterator();

      try {
         while (var4.hasNext()) {
            h0 var5 = (h0)var4.next();
            var5.n5("", var2, "");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(s6j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s6j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(s6j var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(s6j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(s6j var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(s6j var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(s6j var0, int var1) {
      return var0.h0 = var1;
   }
}
