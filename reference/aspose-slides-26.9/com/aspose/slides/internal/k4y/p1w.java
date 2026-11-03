package com.aspose.slides.internal.k4y;

public class p1w extends b3 {
   private String n5;
   private byte l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("style:num-format", "style:num-letter-sync");

   public p1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p1w$1 var2 = new p1w$1(this);
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
               switch (u3.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.k5 = com.aspose.slides.ms.System.d1.n5(this.k5, var1.z1());
            }
         }
      }
   }

   public p1w() {
      this.l6();
   }

   private void l6() {
      this.l6 = -1;
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

      if (this.k5 != null) {
         var2.l6(this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(p1w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(p1w var0, byte var1) {
      return var0.l6 = var1;
   }
}
