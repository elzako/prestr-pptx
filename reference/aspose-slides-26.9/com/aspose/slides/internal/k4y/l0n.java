package com.aspose.slides.internal.k4y;

public class l0n extends b3 {
   private String n5;
   private long l6;
   private boolean k5;
   private g7 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("spid", "grpId", "uiExpand", "bldAsOne", "bldSub");

   public l0n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      l0n$1 var2 = new l0n$1(this);
      n5(var1, var2);
      n5(var1, new l0n$2(this, var1));
   }

   public l0n() {
      this.k5();
   }

   private void k5() {
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("spid", this.n5);
      var2.l6("grpId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      if (this.k5) {
         var2.l6("uiExpand", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 3:
               ((e0j)this.u3.k5()).n5("p", var2, this.u3.n5());
               break;
            case 4:
               ((g3)this.u3.k5()).n5("p", var2, this.u3.n5());
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(l0n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(l0n var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l0n var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(l0n var0, g7 var1) {
      return var0.u3 = var1;
   }
}
