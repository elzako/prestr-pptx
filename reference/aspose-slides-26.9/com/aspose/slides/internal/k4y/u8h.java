package com.aspose.slides.internal.k4y;

public class u8h extends b3 {
   private boolean l6;
   private int k5;
   public static final int n5 = d7.n5("l");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("thruBlk", "dir");

   public u8h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      u8h$1 var2 = new u8h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u8h() {
      this.u3();
   }

   private void u3() {
      this.l6 = false;
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         var2.l6("thruBlk", this.l6 ? "1" : "0");
      }

      if (this.k5 != n5) {
         var2.l6("dir", d7.n5(this.k5));
      }

      var2.s7();
   }

   public final boolean n5() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final int l6() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(u8h var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(u8h var0, int var1) {
      return var0.k5 = var1;
   }
}
