package com.aspose.slides.internal.k4y;

public class e0w extends b3 {
   private c3d n5;
   private p6k l6;
   private o9n k5;
   private d3v u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("docMk", "sldMk", "spMk", "txMk");

   public e0w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e0w$1(this, var1));
   }

   public e0w() {
      this.n5 = new c3d();
      this.l6 = new p6k();
      this.k5 = new o9n();
      this.u3 = new d3v();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ac", var3, "http://schemas.microsoft.com/office/drawing/2013/main/command");
      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2013/main/command") == null) {
         var2.u3("xmlns", "pc", null, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
      }

      this.n5.n5("ac", var2, "docMk");
      this.l6.n5("ac", var2, "sldMk");
      this.k5.n5("ac", var2, "spMk");
      this.u3.n5("ac", var2, "txMk");
      var2.s7();
   }

   public final p6k n5() {
      return this.l6;
   }

   public final o9n l6() {
      return this.k5;
   }

   public final d3v k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static c3d n5(e0w var0, c3d var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p6k n5(e0w var0, p6k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static o9n n5(e0w var0, o9n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static d3v n5(e0w var0, d3v var1) {
      return var0.u3 = var1;
   }
}
