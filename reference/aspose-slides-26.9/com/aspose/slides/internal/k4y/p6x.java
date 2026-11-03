package com.aspose.slides.internal.k4y;

public class p6x extends b3 {
   private String n5;
   private byte l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("formatCode", "sourceLinked");

   public p6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      p6x$1 var2 = new p6x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p6x() {
      this.u3();
   }

   private void u3() {
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("formatCode", this.n5);
      if (this.l6 != -1) {
         var2.l6("sourceLinked", this.l6 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(p6x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(p6x var0, byte var1) {
      return var0.l6 = var1;
   }
}
