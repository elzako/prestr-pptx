package com.aspose.slides.internal.k4y;

public class m2h extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("v:ext", "id", "on", "offset", "origin", "matrix");

   public m2h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m2h$1 var2 = new m2h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m2h() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("id", this.l6);
      }

      if (this.k5 != 0) {
         var2.l6("on", m4w.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("offset", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("origin", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("matrix", this.u9);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(m2h var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(m2h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(m2h var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(m2h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(m2h var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(m2h var0, String var1) {
      return var0.u9 = var1;
   }
}
