package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s7q extends b3 {
   private String n5;
   private String l6;
   private r3p k5;
   private l6w u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("Id", "Target", "SignatureTime", "SignatureInfoV1");

   public s7q(com.aspose.slides.ms.System.Xml.c7 var1) {
      s7q$1 var2 = new s7q$1(this);
      n5(var1, var2);
      n5(var1, new s7q$2(this, var1));
   }

   public s7q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      var2.l6("Target", this.l6);
      if (this.k5 != null) {
         this.k5.n5("", var2, "SignatureTime");
      }

      if (this.u3 != null) {
         this.u3.n5("", var2, "SignatureInfoV1");
      }

      var2.s7();
   }

   public final r3p n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <signatureTime> element can be added.");
      }

      this.k5 = new r3p();
      return this.k5;
   }

   public final l6w l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <signatureInfoV1> element can be added.");
      }

      this.u3 = new l6w();
      return this.u3;
   }

   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final r3p u3() {
      return this.k5;
   }

   public final l6w a6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(s7q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s7q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static r3p n5(s7q var0, r3p var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l6w n5(s7q var0, l6w var1) {
      return var0.u3 = var1;
   }
}
