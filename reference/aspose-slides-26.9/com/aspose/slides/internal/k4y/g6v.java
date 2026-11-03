package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class g6v extends b3 {
   private String n5;
   private j2x l6;
   private r8e k5;
   private s5y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "Id", "Manifest", "SignatureProperties", "QualifyingProperties"
   );

   public g6v(com.aspose.slides.ms.System.Xml.c7 var1) {
      g6v$1 var2 = new g6v$1(this);
      n5(var1, var2);
      n5(var1, new g6v$2(this, var1));
   }

   public g6v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("Id", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("", var2, "Manifest");
      }

      if (this.k5 != null) {
         this.k5.n5("", var2, "SignatureProperties");
      }

      if (this.u3 != null) {
         this.u3.n5("", var2, "QualifyingProperties");
      }

      var2.s7();
   }

   public final j2x n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <manifest> element can be added.");
      }

      this.l6 = new j2x();
      return this.l6;
   }

   public final r8e l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <signatureProperties> element can be added.");
      }

      this.k5 = new r8e();
      return this.k5;
   }

   public final s5y k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <qualifyingProperties> element can be added.");
      }

      this.u3 = new s5y();
      return this.u3;
   }

   public final String u3() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final j2x a6() {
      return this.l6;
   }

   public final r8e u9() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(g6v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static j2x n5(g6v var0, j2x var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static r8e n5(g6v var0, r8e var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s5y n5(g6v var0, s5y var1) {
      return var0.u3 = var1;
   }
}
