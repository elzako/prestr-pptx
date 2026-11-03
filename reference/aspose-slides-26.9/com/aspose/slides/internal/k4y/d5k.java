package com.aspose.slides.internal.k4y;

public class d5k extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private byte u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "dr3d:diffuse-color", "dr3d:direction", "dr3d:enabled", "dr3d:specular"
   );

   public d5k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5k$1 var2 = new d5k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public d5k() {
      this.l6();
   }

   private void l6() {
      this.k5 = -1;
      this.u3 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("dr3d:diffuse-color", this.n5);
      }

      var2.l6("dr3d:direction", this.l6);
      if (this.k5 != -1) {
         var2.l6("dr3d:enabled", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != -1) {
         var2.l6("dr3d:specular", this.u3 == 1 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(d5k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(d5k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(d5k var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte l6(d5k var0, byte var1) {
      return var0.u3 = var1;
   }
}
