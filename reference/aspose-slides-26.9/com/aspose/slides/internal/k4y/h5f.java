package com.aspose.slides.internal.k4y;

public class h5f extends b3 {
   private int n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "workbookPassword", "revisionsPassword", "lockStructure", "lockWindows", "lockRevision"
   );

   public h5f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h5f$1 var2 = new h5f$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h5f() {
      this.l6();
   }

   private void l6() {
      this.n5 = 65535;
      this.l6 = 65535;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 65535) != 65535) {
         var2.l6("workbookPassword", com.aspose.slides.ms.System.a3.n5(this.n5 & 65535 & 65535, "X4"));
      }

      if ((this.l6 & 65535) != 65535) {
         var2.l6("revisionsPassword", com.aspose.slides.ms.System.a3.n5(this.l6 & 65535 & 65535, "X4"));
      }

      if (this.k5) {
         var2.l6("lockStructure", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("lockWindows", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("lockRevision", this.a6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(h5f var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(h5f var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(h5f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(h5f var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(h5f var0, boolean var1) {
      return var0.a6 = var1;
   }
}
