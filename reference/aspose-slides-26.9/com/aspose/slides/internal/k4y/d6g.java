package com.aspose.slides.internal.k4y;

public class d6g extends b3 {
   private h0 n5;
   private s2l l6;
   private p1i k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("movie", "control");

   public d6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (!var1.m1()) {
         String var2 = var1.n3();
         boolean var3 = false;

         while (var3 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var2)) {
               break;
            }

            var3 = false;
            if (var1.s7() == 1) {
               switch (u3.n5(var1.n3())) {
                  case 0:
                     this.l6 = new s2l(var1);
                     break;
                  case 1:
                     this.k5 = new p1i(var1);
                     break;
                  default:
                     this.n5 = new h0(var1);
                     var3 = true;
               }
            }
         }
      }
   }

   public d6g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("", var2, "");
      }

      if (this.l6 != null) {
         this.l6.n5("w", var2, "movie");
      }

      if (this.k5 != null) {
         this.k5.n5("w", var2, "control");
      }

      var2.s7();
   }
}
