package com.aspose.slides.internal.k4y;

public class w5g extends b3 {
   private byte k5;
   private int u3;
   public static final byte n5 = q1.n5("horz");
   public static final int l6 = k3.n5("out");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("orient", "dir");

   public w5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      w5g$1 var2 = new w5g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w5g() {
      this.u3();
   }

   private void u3() {
      this.k5 = n5;
      this.u3 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("orient", q1.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("dir", k3.n5(this.u3));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static byte n5(w5g var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(w5g var0, int var1) {
      return var0.u3 = var1;
   }
}
