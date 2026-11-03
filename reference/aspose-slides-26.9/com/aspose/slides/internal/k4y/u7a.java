package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u7a extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private n5v u3;
   private e5d a6;
   private String u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "Id", "Type", "URI", "Transforms", "DigestMethod", "DigestValue"
   );

   public u7a(com.aspose.slides.ms.System.Xml.c7 var1) {
      u7a$1 var2 = new u7a$1(this);
      n5(var1, var2);
      n5(var1, new u7a$2(this, var1));
   }

   public u7a() {
      this.a6 = new e5d();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("Type", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("URI", this.k5);
      }

      if (this.u3 != null) {
         this.u3.n5("", var2, "Transforms");
      }

      this.a6.n5("", var2, "DigestMethod");
      this.n5("", var2, "DigestValue", this.u9, false);
      var2.s7();
   }

   public final n5v n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <transforms> element can be added.");
      }

      this.u3 = new n5v();
      return this.u3;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final n5v k5() {
      return this.u3;
   }

   public final e5d u3() {
      return this.a6;
   }

   public final String a6() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(u7a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u7a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(u7a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static n5v n5(u7a var0, n5v var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static e5d n5(u7a var0, e5d var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(u7a var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String n5(u7a var0) {
      return var0.u9;
   }
}
