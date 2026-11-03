package com.aspose.slides.internal.k4y;

public class e5i extends b3 {
   private String n5;
   private int l6;
   private char k5;
   private int u3;
   private int a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "style:position",
      "style:type",
      "style:char",
      "style:leader-type",
      "style:leader-style",
      "style:leader-width",
      "style:leader-color",
      "style:leader-text",
      "style:leader-text-style"
   );

   public e5i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e5i$1 var2 = new e5i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e5i() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.c8 = " ";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:position", this.n5);
      if (this.l6 != 0) {
         var2.l6("style:type", i5x.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("style:char", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("style:leader-type", o6c.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("style:leader-style", w7z.n5(this.a6));
      }

      if (this.u9 != null) {
         var2.l6("style:leader-width", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("style:leader-color", this.h0);
      }

      if (!" ".equals(this.c8)) {
         var2.l6("style:leader-text", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("style:leader-text-style", this.t2);
      }

      var2.s7();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(e5i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(e5i var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static char n5(e5i var0, char var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(e5i var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int k5(e5i var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(e5i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(e5i var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String u3(e5i var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(e5i var0, String var1) {
      return var0.t2 = var1;
   }
}
