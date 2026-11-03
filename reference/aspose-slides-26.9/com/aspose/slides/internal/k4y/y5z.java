package com.aspose.slides.internal.k4y;

public class y5z extends b3 {
   private byte l6;
   private String k5;
   private com.aspose.slides.ms.System.j5 u3 = new com.aspose.slides.ms.System.j5();
   private String a6;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("text:fixed", "style:data-style-name", "text:date-value");

   public y5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y5z$1 var2 = new y5z$1(this);
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
               switch (u9.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.a6 = com.aspose.slides.ms.System.d1.n5(this.a6, var1.z1());
            }
         }
      }
   }

   public y5z() {
      this.l6();
   }

   private void l6() {
      this.l6 = -1;
      n5.u3(this.u3);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != -1) {
         var2.l6("text:fixed", this.l6 == 1 ? "true" : "false");
      }

      if (this.k5 != null) {
         var2.l6("style:data-style-name", this.k5);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.u3, n5)) {
         var2.l6("text:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.u3.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (this.a6 != null) {
         var2.l6(this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static byte n5(y5z var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(y5z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(y5z var0) {
      return var0.u3;
   }
}
