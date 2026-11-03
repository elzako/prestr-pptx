package com.aspose.slides.internal.k4y;

public class e0p extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;
   private String a6;
   private String u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:name", "text:description", "office:value-type", "text:display", "style:data-style-name"
   );

   public e0p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e0p$1 var2 = new e0p$1(this);
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
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.u9 = com.aspose.slides.ms.System.d1.n5(this.u9, var1.z1());
            }
         }
      }
   }

   public e0p() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:name", this.n5);
      if (this.l6 != null) {
         var2.l6("text:description", this.l6);
      }

      var2.l6("office:value-type", this.k5);
      if (this.u3 != 0) {
         var2.l6("text:display", u9b.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("style:data-style-name", this.a6);
      }

      if (this.u9 != null) {
         var2.l6(this.u9);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(e0p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(e0p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(e0p var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(e0p var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(e0p var0, String var1) {
      return var0.a6 = var1;
   }
}
