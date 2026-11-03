package com.aspose.slides.internal.k4y;

public class u7 extends b3 {
   private int l6;
   private h8 k5;
   private r5d u3;
   private l8r a6;
   public static final int n5 = d9.n5("plastic");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("prstMaterial", "bevel", "lightRig", "extLst");

   public u7(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      u7$1 var2 = new u7$1(this);
      n5(var1, var2);
      n5(var1, new u7$2(this, var1));
   }

   public u7() {
      this.a6();
      this.k5 = new h8();
   }

   private void a6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("prstMaterial", d9.n5(this.l6));
      }

      this.k5.n5("a", var2, "bevel");
      if (this.u3 != null) {
         this.u3.n5("a", var2, "lightRig");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final h8 l6() {
      return this.k5;
   }

   public final r5d k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(u7 var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static h8 n5(u7 var0, h8 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static r5d n5(u7 var0, r5d var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l8r n5(u7 var0, l8r var1) {
      return var0.a6 = var1;
   }
}
