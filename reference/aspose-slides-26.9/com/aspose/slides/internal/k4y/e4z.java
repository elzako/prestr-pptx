package com.aspose.slides.internal.k4y;

public class e4z extends b3 {
   private q2u n5;
   private u8b l6;
   private w6 k5;
   private t7p u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("ptLst", "cxnLst", "bg", "whole", "extLst");

   public e4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e4z$1(this, var1));
   }

   public e4z() {
      this.n5 = new q2u();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("dgm", var2, "ptLst");
      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "cxnLst");
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "bg");
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "whole");
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static q2u n5(e4z var0, q2u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u8b n5(e4z var0, u8b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w6 n5(e4z var0, w6 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static t7p n5(e4z var0, t7p var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l8r n5(e4z var0, l8r var1) {
      return var0.a6 = var1;
   }
}
