package com.aspose.slides.internal.k4y;

public class n9u extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private int s7;
   private int x8;
   private String n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private float q0;
   private int z3;
   private float m1;
   private String k7;
   private String m3;
   private String z8;
   private String j5;
   private static final com.aspose.slides.internal.v6g.u9 w1 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "src",
      "cropleft",
      "croptop",
      "cropright",
      "cropbottom",
      "gain",
      "blacklevel",
      "gamma",
      "grayscale",
      "bilevel",
      "chromakey",
      "embosscolor",
      "recolortarget",
      "o:href",
      "o:althref",
      "o:title",
      "o:oleid",
      "o:detectmouseclick",
      "o:movie",
      "o:relid",
      "r:id",
      "r:pict",
      "r:href"
   );

   public n9u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n9u$1 var2 = new n9u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n9u() {
      this.h0();
   }

   private void h0() {
      this.s7 = 0;
      this.x8 = 0;
      this.q0 = Float.NaN;
      this.z3 = 0;
      this.m1 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("src", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("cropleft", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("croptop", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("cropright", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("cropbottom", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("gain", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("blacklevel", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("gamma", this.t2);
      }

      if (this.s7 != 0) {
         var2.l6("grayscale", r5b.n5(this.s7));
      }

      if (this.x8 != 0) {
         var2.l6("bilevel", r5b.n5(this.x8));
      }

      if (this.n3 != null) {
         var2.l6("chromakey", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("embosscolor", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("recolortarget", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("o:href", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("o:althref", this.z1);
      }

      if (this.t4 != null) {
         var2.l6("o:title", this.t4);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.q0)) {
         var2.l6("o:oleid", com.aspose.slides.ms.System.Xml.f4.n5(this.q0));
      }

      if (this.z3 != 0) {
         var2.l6("o:detectmouseclick", m4w.n5(this.z3));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.m1)) {
         var2.l6("o:movie", com.aspose.slides.ms.System.Xml.f4.n5(this.m1));
      }

      if (this.k7 != null) {
         var2.l6("o:relid", this.k7);
      }

      if (this.m3 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.m3);
      }

      if (this.z8 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:pict", this.z8);
      }

      if (this.j5 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:href", this.j5);
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final String l6() {
      return this.u3;
   }

   public final String k5() {
      return this.a6;
   }

   public final String u3() {
      return this.u9;
   }

   public final String a6() {
      return this.k7;
   }

   public final void n5(String var1) {
      this.k7 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return w1;
   }

   // $VF: synthetic method
   static String n5(n9u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(n9u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(n9u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(n9u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(n9u var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u9(n9u var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String h0(n9u var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String c8(n9u var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String t2(n9u var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int n5(n9u var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(n9u var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String s7(n9u var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String x8(n9u var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String n3(n9u var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String y4(n9u var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String e2(n9u var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t9(n9u var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static float n5(n9u var0, float var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int k5(n9u var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static float l6(n9u var0, float var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static String z1(n9u var0, String var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static String t4(n9u var0, String var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static String q0(n9u var0, String var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static String z3(n9u var0, String var1) {
      return var0.j5 = var1;
   }
}
