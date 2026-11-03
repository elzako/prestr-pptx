package com.aspose.slides.internal.k4y;

public class s1z extends b3 {
   private byte n5;
   private String l6;
   private u2q k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("type", "cmd", "cBhvr");

   public s1z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      s1z$1 var2 = new s1z$1(this);
      n5(var1, var2);
      n5(var1, new s1z$2(this, var1));
   }

   public s1z() {
      this.a6();
      this.k5 = new u2q();
   }

   private void a6() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("type", p9.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("cmd", this.l6);
      }

      this.k5.n5("p", var2, "cBhvr");
      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final u2q k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(s1z var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(s1z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u2q n5(s1z var0, u2q var1) {
      return var0.k5 = var1;
   }
}
