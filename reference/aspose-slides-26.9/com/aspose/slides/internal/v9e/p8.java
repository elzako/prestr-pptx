package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;

public class p8 {
   private s3 n5;
   private String l6 = com.aspose.slides.ms.System.d1.n5;
   private com.aspose.slides.internal.x6s.a6 k5;

   public p8(com.aspose.slides.internal.x6s.a6 var1, s3 var2) {
      this.k5 = var1;
      this.n5 = var2;
   }

   public final s3 n5() {
      return this.n5;
   }

   public final s3 l6() {
      return this.n5.l6();
   }

   public final p8 k5() {
      p8 var1 = new p8(this.k5, null);
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      return var1;
   }

   public final com.aspose.slides.internal.x6s.a6 u3() {
      return this.k5;
   }

   public final s3 a6() {
      this.n5 = new s3(this.n5);
      return this.n5;
   }

   public final void u9() {
      if (this.n5 != null) {
         for (e5 var1 = this.n5.n5(); var1 != null; var1 = var1.u3()) {
            this.l6 = var1.k5();
         }

         this.n5 = this.n5.l6();
      }
   }

   public final void n5(String var1, String var2) {
      this.n5.n5(var1, var2, this.l6);
      if (var1 == null || var1.length() == 0) {
         this.l6 = var2;
      }
   }

   public final String h0() {
      return this.l6;
   }

   private String a6(String var1) {
      if ("xml".equals(var1)) {
         return "http://www.w3.org/XML/1998/namespace";
      }

      if ("xmlns".equals(var1)) {
         return "http://www.w3.org/2000/xmlns/";
      }

      for (s3 var2 = this.n5; var2 != null; var2 = var2.l6()) {
         String var3 = var2.l6(var1);
         if (var3 != null) {
            return var3;
         }
      }

      throw XsltException.create("Prefix '{0}' is not defined.", var1);
   }

   public final String n5(String var1) {
      return var1.length() == 0 ? this.l6 : this.a6(var1);
   }

   public final String l6(String var1) {
      return var1.length() == 0 ? com.aspose.slides.ms.System.d1.n5 : this.a6(var1);
   }

   public final void n5(String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5.k5(var1[var2]);
      }
   }

   public final boolean k5(String var1) {
      for (s3 var2 = this.n5; var2 != null; var2 = var2.l6()) {
         if (var2.u3(var1)) {
            return true;
         }
      }

      return false;
   }

   public final void l6(String[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         this.n5.a6(var1[var2]);
      }
   }

   public final boolean u3(String var1) {
      for (s3 var2 = this.n5; var2 != null; var2 = var2.l6()) {
         if (var2.u9(var1)) {
            return true;
         }
      }

      return false;
   }
}
