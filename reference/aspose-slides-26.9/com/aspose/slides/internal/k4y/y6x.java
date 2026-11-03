package com.aspose.slides.internal.k4y;

public class y6x extends b3 {
   private boolean n5;
   private boolean l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "form:current-selected", "form:selected", "form:label", "form:value"
   );

   public y6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y6x$1 var2 = new y6x$1(this);
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

   public y6x() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("form:current-selected", this.n5 ? "true" : "false");
      }

      if (this.l6) {
         var2.l6("form:selected", this.l6 ? "true" : "false");
      }

      if (this.k5 != null) {
         var2.l6("form:label", this.k5);
      }

      var2.l6("form:value", this.u3);
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
   static boolean n5(y6x var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(y6x var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(y6x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(y6x var0, String var1) {
      return var0.u3 = var1;
   }
}
