package com.aspose.slides.internal.k4y;

public class q8c extends b3 {
   private byte k5;
   private String u3;
   private String a6;
   private double u9;
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 c8 = new com.aspose.slides.ms.System.s4();
   private byte t2;
   private String s7;
   private String x8;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "text:fixed",
      "text:name",
      "style:data-style-name",
      "office:value",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value"
   );

   public q8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q8c$1 var2 = new q8c$1(this);
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
               switch (n3.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.x8 = com.aspose.slides.ms.System.d1.n5(this.x8, var1.z1());
            }
         }
      }
   }

   public q8c() {
      this.l6();
   }

   private void l6() {
      this.k5 = -1;
      this.u9 = Double.NaN;
      n5.u3(this.h0);
      l6.u3(this.c8);
      this.t2 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != -1) {
         var2.l6("text:fixed", this.k5 == 1 ? "true" : "false");
      }

      var2.l6("text:name", this.u3);
      if (this.a6 != null) {
         var2.l6("style:data-style-name", this.a6);
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (com.aspose.slides.ms.System.j5.c8(this.h0, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.h0.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.c8, l6)) {
         var2.l6("office:time-value", n5(this.c8.n3()));
      }

      if (this.t2 != -1) {
         var2.l6("office:boolean-value", this.t2 == 1 ? "true" : "false");
      }

      if (this.s7 != null) {
         var2.l6("office:string-value", this.s7);
      }

      if (this.x8 != null) {
         var2.l6(this.x8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n3;
   }

   // $VF: synthetic method
   static byte n5(q8c var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(q8c var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(q8c var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double n5(q8c var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(q8c var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(q8c var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static byte l6(q8c var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(q8c var0, String var1) {
      return var0.s7 = var1;
   }
}
