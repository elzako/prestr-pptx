package com.aspose.slides.internal.v7y;

import com.aspose.slides.exceptions.XPathException;

public final class u3 extends f4 {
   private j9[] a6;
   private com.aspose.slides.internal.k4s.n5 u9;

   public u3(String var1, String var2, j9[] var3) {
      super(var1, var2);
      this.a6 = var3;
   }

   private u3(u3 var1) {
      super(var1);
      this.u9 = var1.u9;
      this.a6 = new j9[var1.a6.length];

      for (int var2 = 0; var2 < var1.a6.length; var2++) {
         this.a6[var2] = n5(var1.a6[var2]);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      if (var1 == null) {
         throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
      }

      if (this.u3 != var1) {
         this.u3 = var1;

         for (int var2 = 0; var2 < this.a6.length; var2++) {
            this.a6[var2].n5(var1);
         }

         int[] var4 = new int[this.a6.length];

         for (int var3 = 0; var3 < this.a6.length; var3++) {
            var4[var3] = this.a6[var3].u9();
         }

         this.u9 = this.u3.n5(this.n5, this.l6, var4);
         if (this.u9 == null) {
            throw XPathException.create("The function '{0}()' is undefined.", this.n3());
         }
      }
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      if (this.u3 == null) {
         throw XPathException.create("Namespace Manager or XsltContext needed. This query has a prefix, variable, or user-defined function.");
      }

      Object[] var2 = new Object[this.a6.length];

      for (int var3 = 0; var3 < this.a6.length; var3++) {
         var2[var3] = this.a6[var3].n5(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var2[var3], com.aspose.slides.internal.x6s.h0.class)) {
            var2[var3] = new i6(var1.k5(), this.a6[var3]);
         }
      }

      try {
         return this.l6(this.u9.n5(this.u3, var2, var1.k5()));
      } catch (RuntimeException var4) {
         throw XPathException.create("Function '{0}()' has failed.", this.n3(), var4);
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      if (!"key".equals(this.l6) && this.n5.length() != 0) {
         throw XPathException.create("'{0}' is an invalid XSLT pattern.");
      }

      this.n5(new r8(var1, true));
      com.aspose.slides.internal.x6s.a6 var2 = null;

      while ((var2 = this.h0()) != null) {
         if (var2.l6(var1)) {
            return var2;
         }
      }

      return var2;
   }

   @Override
   public int u9() {
      int var1 = this.u9 != null ? this.u9.k5() : 5;
      if (var1 == 6) {
         var1 = 5;
      }

      return var1;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u3(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
