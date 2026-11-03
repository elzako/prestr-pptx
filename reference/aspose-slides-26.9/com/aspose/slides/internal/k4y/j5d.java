package com.aspose.slides.internal.k4y;

public class j5d extends b3 {
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private String y4;
   private String e2;
   private String t9;
   private String z1;
   private String t4;
   private String q0;
   private String z3;
   public static final int n5 = q3v.n5("none");
   public static final int l6 = w5t.n5("stop");
   public static final int k5 = m1p.n5("noControl");
   public static final int u3 = m9g.n5("between");
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "type",
      "errorStyle",
      "imeMode",
      "operator",
      "allowBlank",
      "showDropDown",
      "showInputMessage",
      "showErrorMessage",
      "errorTitle",
      "error",
      "promptTitle",
      "prompt",
      "sqref",
      "formula1",
      "formula2"
   );

   public j5d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j5d$1 var2 = new j5d$1(this);
      n5(var1, var2);
      n5(var1, new j5d$2(this, var1));
   }

   public j5d() {
      this.l6();
   }

   private void l6() {
      this.a6 = n5;
      this.u9 = l6;
      this.h0 = k5;
      this.c8 = u3;
      this.t2 = false;
      this.s7 = false;
      this.x8 = false;
      this.n3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.a6 != n5) {
         var2.l6("type", q3v.n5(this.a6));
      }

      if (this.u9 != l6) {
         var2.l6("errorStyle", w5t.n5(this.u9));
      }

      if (this.h0 != k5) {
         var2.l6("imeMode", m1p.n5(this.h0));
      }

      if (this.c8 != u3) {
         var2.l6("operator", m9g.n5(this.c8));
      }

      if (this.t2) {
         var2.l6("allowBlank", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("showDropDown", this.s7 ? "1" : "0");
      }

      if (this.x8) {
         var2.l6("showInputMessage", this.x8 ? "1" : "0");
      }

      if (this.n3) {
         var2.l6("showErrorMessage", this.n3 ? "1" : "0");
      }

      if (this.y4 != null) {
         var2.l6("errorTitle", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("error", this.e2);
      }

      if (this.t9 != null) {
         var2.l6("promptTitle", this.t9);
      }

      if (this.z1 != null) {
         var2.l6("prompt", this.z1);
      }

      var2.l6("sqref", this.t4);
      if (this.q0 != null) {
         this.n5("ssml", var2, "formula1", this.q0, true);
      }

      if (this.z3 != null) {
         this.n5("ssml", var2, "formula2", this.z3, true);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return m1;
   }

   // $VF: synthetic method
   static int n5(j5d var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(j5d var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(j5d var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int u3(j5d var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean n5(j5d var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean l6(j5d var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean k5(j5d var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean u3(j5d var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String n5(j5d var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String l6(j5d var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String k5(j5d var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String u3(j5d var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String a6(j5d var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String u9(j5d var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static String n5(j5d var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static String h0(j5d var0, String var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static String l6(j5d var0) {
      return var0.z3;
   }
}
