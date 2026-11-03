package com.aspose.slides.internal.k4y;

public class y3t extends b3 {
   private String n5;
   private byte l6;
   private byte k5;
   private int u3;
   private int a6;
   private String u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "style:num-format", "style:num-letter-sync", "text:fixed", "text:page-adjust", "text:select-page"
   );

   public y3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y3t$1 var2 = new y3t$1(this);
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

   public y3t() {
      this.l6();
   }

   private void l6() {
      this.l6 = -1;
      this.k5 = -1;
      this.u3 = 0;
      this.a6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("style:num-format", this.n5);
      }

      if (this.l6 != -1) {
         var2.l6("style:num-letter-sync", this.l6 == 1 ? "true" : "false");
      }

      if (this.k5 != -1) {
         var2.l6("text:fixed", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != 0) {
         var2.l6("text:page-adjust", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("text:select-page", k9k.n5(this.a6));
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
   static String n5(y3t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(y3t var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(y3t var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(y3t var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(y3t var0, int var1) {
      return var0.a6 = var1;
   }
}
