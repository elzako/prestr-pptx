package com.aspose.slides.internal.k4y;

public class p3f extends b3 {
   private byte k5;
   private String u3;
   private com.aspose.slides.ms.System.j5 a6 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 u9 = new com.aspose.slides.ms.System.s4();
   private String h0;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "text:fixed", "style:data-style-name", "text:date-value", "text:date-adjust"
   );

   public p3f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      p3f$1 var2 = new p3f$1(this);
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
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.h0 = com.aspose.slides.ms.System.d1.n5(this.h0, var1.z1());
            }
         }
      }
   }

   public p3f() {
      this.u3();
   }

   private void u3() {
      this.k5 = -1;
      n5.u3(this.a6);
      l6.u3(this.u9);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != -1) {
         var2.l6("text:fixed", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("style:data-style-name", this.u3);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.a6, n5)) {
         var2.l6("text:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.a6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.u9, l6)) {
         var2.l6("text:date-adjust", n5(this.u9.n3()));
      }

      if (this.h0 != null) {
         var2.l6(this.h0);
      }

      var2.s7();
   }

   public final byte n5() {
      return this.k5;
   }

   public final String l6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return c8;
   }

   // $VF: synthetic method
   static byte n5(p3f var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(p3f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(p3f var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(p3f var0) {
      return var0.u9;
   }
}
