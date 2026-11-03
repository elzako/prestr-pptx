package com.aspose.slides.internal.k4y;

public class h5c extends b3 {
   private String n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "name", "showFirstColumn", "showLastColumn", "showRowStripes", "showColumnStripes"
   );

   public h5c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      h5c$1 var2 = new h5c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h5c() {
      this.k5();
   }

   private void k5() {
      this.l6 = -1;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("name", this.n5);
      }

      if (this.l6 != -1) {
         var2.l6("showFirstColumn", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != -1) {
         var2.l6("showLastColumn", this.k5 == 1 ? "1" : "0");
      }

      if (this.u3 != -1) {
         var2.l6("showRowStripes", this.u3 == 1 ? "1" : "0");
      }

      if (this.a6 != -1) {
         var2.l6("showColumnStripes", this.a6 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final void k5(byte var1) {
      this.u3 = var1;
   }

   public final void u3(byte var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(h5c var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(h5c var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(h5c var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte k5(h5c var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte u3(h5c var0, byte var1) {
      return var0.a6 = var1;
   }
}
