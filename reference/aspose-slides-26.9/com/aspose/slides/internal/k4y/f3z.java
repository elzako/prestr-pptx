package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class f3z extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private byte a6;
   private long u9;
   private List<g7> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "text:table-name", "text:table-type", "text:database-name", "style:num-format", "style:num-letter-sync", "text:value", "connection-resource", "_TEXT"
   );

   public f3z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f3z$1 var2 = new f3z$1(this);
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
               switch (c8.n5(var1.n3())) {
                  case 6:
                     n7e var6 = new n7e(var1);
                     this.h0.addItem(new g7("connection-resource", var6));
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               String var5 = var1.z1();
               this.h0.addItem(new g7("_TEXT", var5));
            }
         }
      }
   }

   public f3z() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.a6 = -1;
      this.u9 = 4294967295L;
      this.h0 = new List<>();
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
         var2.l6("style:num-format", this.u3);
      }

      if (this.a6 != -1) {
         var2.l6("style:num-letter-sync", this.a6 == 1 ? "true" : "false");
      }

      if ((this.u9 & 4294967295L) != 4294967295L) {
         var2.l6("text:value", com.aspose.slides.ms.System.Xml.f4.l6(this.u9));
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (c8.n5(var5.n5())) {
               case 6:
                  ((n7e)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 7:
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
      return c8;
   }

   // $VF: synthetic method
   static String n5(f3z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(f3z var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(f3z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(f3z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte n5(f3z var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static long n5(f3z var0, long var1) {
      return var0.u9 = var1;
   }
}
