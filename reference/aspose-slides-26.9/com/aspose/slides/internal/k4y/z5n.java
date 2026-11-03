package com.aspose.slides.internal.k4y;

public class z5n extends b3 {
   private boolean n5;
   private String l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("readOnlyRecommended", "userName", "reservationPassword");

   public z5n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      z5n$1 var2 = new z5n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public z5n() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.k5 = 65535;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("readOnlyRecommended", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         var2.l6("userName", this.l6);
      }

      if ((this.k5 & 65535) != 65535) {
         var2.l6("reservationPassword", com.aspose.slides.ms.System.a3.n5(this.k5 & 65535 & 65535, "X4"));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(z5n var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(z5n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(z5n var0, int var1) {
      return var0.k5 = var1;
   }
}
