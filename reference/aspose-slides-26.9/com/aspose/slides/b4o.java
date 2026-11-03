package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class b4o extends com.aspose.slides.internal.v6g.h0<b4o> {
   private d4n u3;
   public String n5;
   public String l6;
   public String k5;

   public b4o() {
      this.u3 = null;
      this.n5 = null;
      this.l6 = null;
      this.k5 = null;
   }

   public b4o(String var1) {
      this.k5 = this.n5 = this.l6 = var1;
      this.u3 = null;
   }

   public b4o(String var1, d4n var2) {
      this.k5 = this.n5 = this.l6 = var1;
      this.u3 = var2;
   }

   public b4o(String var1, String var2, String var3, d4n var4) {
      if (var1 == null) {
         throw new ArgumentNullException("originalString");
      }

      if (var2 == null) {
         throw new ArgumentNullException("validatedString");
      }

      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var2;
      this.u3 = var4;
   }

   public final String n5() {
      if (this.u3 == null) {
         return this.k5;
      } else {
         return this.u3.u3() && this.u3.a6() ? this.n5 : this.k5;
      }
   }

   public final b4o l6() {
      return new b4o(
         com.aspose.slides.ms.System.d1.t2(this.n5), com.aspose.slides.ms.System.d1.t2(this.k5), com.aspose.slides.ms.System.d1.t2(this.l6), this.u3
      );
   }

   public final b4o n5(String var1) {
      if (var1 == null) {
         return this.l6();
      }

      try {
         com.aspose.slides.internal.x7n.l6 var2 = com.aspose.slides.internal.x7n.l6.n5(var1);
         return new b4o(
            com.aspose.slides.ms.System.d1.l6(this.n5, var2),
            com.aspose.slides.ms.System.d1.l6(this.k5, var2),
            com.aspose.slides.ms.System.d1.l6(this.l6, var2),
            this.u3
         );
      } catch (RuntimeException var3) {
         return this.l6();
      }
   }

   public void n5(b4o var1) {
      var1.u3 = this.u3;
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
   }

   public b4o k5() {
      b4o var1 = new b4o();
      this.n5(var1);
      return var1;
   }

   @Override
   public Object clone() {
      return this.k5();
   }

   private boolean l6(b4o var1) {
      return com.aspose.slides.ms.System.j8.n5(var1.u3, this.u3)
         && com.aspose.slides.ms.System.j8.n5(var1.n5, this.n5)
         && com.aspose.slides.ms.System.j8.n5(var1.l6, this.l6)
         && com.aspose.slides.ms.System.j8.n5(var1.k5, this.k5);
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.u3, this.n5, this.l6, this.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return !(obj instanceof b4o) ? false : this.l6((b4o)obj);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public b4o Clone() {
      return this.k5();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public void CloneTo(b4o bridgeArg0) {
      this.n5(bridgeArg0);
   }

}
