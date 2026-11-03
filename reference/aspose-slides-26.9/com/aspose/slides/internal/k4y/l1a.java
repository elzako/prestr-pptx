package com.aspose.slides.internal.k4y;

public class l1a extends b3 {
   private int k5;
   private int u3;
   private int a6;
   private String u9;
   private com.aspose.slides.ms.System.s4 h0 = new com.aspose.slides.ms.System.s4();
   public static final int n5 = v5w.n5("simple");
   public static final com.aspose.slides.ms.System.s4 l6 = com.aspose.slides.ms.System.s4.k5.n3();
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "xlink:type", "xlink:show", "xlink:actuate", "xlink:href", "meta:delay"
   );

   public l1a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l1a$1 var2 = new l1a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l1a() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = 0;
      this.a6 = 0;
      l6.u3(this.h0);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("xlink:show", o7l.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("xlink:href", this.u9);
      }

      if (com.aspose.slides.ms.System.s4.a6(this.h0, l6)) {
         var2.l6("meta:delay", n5(this.h0.n3()));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static int n5(l1a var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(l1a var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int k5(l1a var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(l1a var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(l1a var0) {
      return var0.h0;
   }
}
