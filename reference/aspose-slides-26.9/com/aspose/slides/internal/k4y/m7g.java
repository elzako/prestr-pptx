package com.aspose.slides.internal.k4y;

public class m7g extends b3 {
   private String k5;
   private String u3;
   private int a6;
   private double u9;
   private String h0;
   private com.aspose.slides.ms.System.j5 c8 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.s4 t2 = new com.aspose.slides.ms.System.s4();
   private byte s7;
   private String x8;
   private int n3;
   private String y4;
   private String e2;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 t9 = new com.aspose.slides.internal.v6g.u9(
      "text:name",
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

   public m7g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m7g$1 var2 = new m7g$1(this);
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
               switch (t9.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.e2 = com.aspose.slides.ms.System.d1.n5(this.e2, var1.z1());
            }
         }
      }
   }

   public m7g() {
      this.l6();
   }

   private void l6() {
      this.a6 = 0;
      this.u9 = Double.NaN;
      n5.u3(this.c8);
      l6.u3(this.t2);
      this.s7 = -1;
      this.n3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:name", this.k5);
      if (this.u3 != null) {
         var2.l6("text:formula", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("office:value-type", x6e.n5(this.a6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6("office:value", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("office:currency", this.h0);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.c8, n5)) {
         var2.l6("office:date-value", com.aspose.slides.ms.System.Xml.f4.n5(this.c8.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (com.aspose.slides.ms.System.s4.a6(this.t2, l6)) {
         var2.l6("office:time-value", n5(this.t2.n3()));
      }

      if (this.s7 != -1) {
         var2.l6("office:boolean-value", this.s7 == 1 ? "true" : "false");
      }

      if (this.x8 != null) {
         var2.l6("office:string-value", this.x8);
      }

      if (this.n3 != 0) {
         var2.l6("text:display", u9b.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("style:data-style-name", this.y4);
      }

      if (this.e2 != null) {
         var2.l6(this.e2);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t9;
   }

   // $VF: synthetic method
   static String n5(m7g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(m7g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(m7g var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double n5(m7g var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(m7g var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(m7g var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 l6(m7g var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static byte n5(m7g var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String u3(m7g var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int l6(m7g var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(m7g var0, String var1) {
      return var0.y4 = var1;
   }
}
