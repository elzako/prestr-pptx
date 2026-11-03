package com.aspose.slides.internal.k4y;

public class q3f extends b3 {
   private String k5;
   private int u3;
   private double a6;
   private String u9;
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 c8 = new com.aspose.slides.ms.System.s4();
   private byte t2;
   private String s7;
   private int x8;
   private String n3;
   private String y4;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "text:formula",
      "office:value-type",
      "office:value",
      "office:currency",
      "office:date-value",
      "office:time-value",
      "office:boolean-value",
      "office:string-value",
      "text:display",
      "style:data-style-name"
   );

   public q3f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q3f$1 var2 = new q3f$1(this);
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
               switch (e2.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.y4 = com.aspose.slides.ms.System.d1.n5(this.y4, var1.z1());
            }
         }
      }
   }

   public q3f() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
      this.a6 = Double.NaN;
      n5.u3(this.h0);
      l6.u3(this.c8);
      this.t2 = -1;
      this.x8 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != null) {
         var2.l6("text:formula", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("office:value-type", x6e.n5(this.u3));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.a6)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("office:currency", this.u9);
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

      if (this.x8 != 0) {
         var2.l6("text:display", d6w.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("style:data-style-name", this.n3);
      }

      if (this.y4 != null) {
         var2.l6(this.y4);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return e2;
   }

   // $VF: synthetic method
   static String n5(q3f var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(q3f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double n5(q3f var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(q3f var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(q3f var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(q3f var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static byte n5(q3f var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String k5(q3f var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(q3f var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u3(q3f var0, String var1) {
      return var0.n3 = var1;
   }
}
