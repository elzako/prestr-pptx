package com.aspose.slides.internal.k4y;

public class u1u extends b3 {
   private String n5;
   private g0e l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("entityId", "geoChildTypes");

   public u1u(com.aspose.slides.ms.System.Xml.c7 var1) {
      u1u$1 var2 = new u1u$1(this);
      n5(var1, var2);
      n5(var1, new u1u$2(this, var1));
   }

   public u1u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("entityId", this.n5);
      if (this.l6 != null) {
         this.l6.n5("cx", var2, "geoChildTypes");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(u1u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g0e n5(u1u var0, g0e var1) {
      return var0.l6 = var1;
   }
}
