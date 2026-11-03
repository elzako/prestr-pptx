package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j5h extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private String a6;
   private List<g7> u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:table-name", "text:table-type", "text:database-name", "style:data-style-name", "text:column-name", "connection-resource", "_TEXT"
   );

   public j5h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j5h$1 var2 = new j5h$1(this);
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
               switch (h0.n5(var1.n3())) {
                  case 5:
                     n7e var6 = new n7e(var1);
                     this.u9.addItem(new g7("connection-resource", var6));
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var5 = var1.z1();
               this.u9.addItem(new g7("_TEXT", var5));
            }
         }
      }
   }

   public j5h() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:table-name", this.n5);
      if (this.l6 != 0) {
         var2.l6("text:table-type", c5p.n5(this.l6));
      }

      if (this.k5 != null) {
         var2.l6("text:database-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("style:data-style-name", this.u3);
      }

      var2.l6("text:column-name", this.a6);
      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (h0.n5(var5.n5())) {
               case 5:
                  ((n7e)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 6:
                  var2.l6((String)var5.k5());
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
      return h0;
   }

   // $VF: synthetic method
   static String n5(j5h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(j5h var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j5h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(j5h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(j5h var0, String var1) {
      return var0.a6 = var1;
   }
}
