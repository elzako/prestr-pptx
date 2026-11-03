package com.aspose.slides.internal.k4y;

public class r9g extends b3 {
   private int n5;
   private String l6;
   private q4v k5;
   private u7g u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("text:note-class", "text:id", "note-citation", "note-body");

   public r9g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r9g$1 var2 = new r9g$1(this);
      n5(var1, var2);
      n5(var1, new r9g$2(this, var1));
   }

   public r9g() {
      this.l6();
      this.k5 = new q4v();
      this.u3 = new u7g();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:note-class", u6f.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("text:id", this.l6);
      }

      this.k5.n5("text", var2, "note-citation");
      this.u3.n5("text", var2, "note-body");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(r9g var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r9g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q4v n5(r9g var0, q4v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static u7g n5(r9g var0, u7g var1) {
      return var0.u3 = var1;
   }
}
