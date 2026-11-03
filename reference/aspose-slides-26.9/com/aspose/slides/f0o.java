package com.aspose.slides;

import com.aspose.slides.exceptions.NullReferenceException;

class f0o {
   private boolean u3;
   private k1z a6;
   protected Object n5;
   protected com.aspose.slides.internal.k0r.r4 l6;
   protected n6s k5;

   f0o(n6s var1) {
      this.n5(true);
      this.k5 = var1;
      this.n5(null);
      if (!com.aspose.slides.internal.v6g.k5.l6(this.k5, n7r.class)) {
         if (this.k5 != null) {
            this.k5.n3().addItem(this);
         }
      }
   }

   void n5() {
   }

   final com.aspose.slides.internal.k0r.r4 l6() {
      if (this.l6 == null) {
         this.n5();
      }

      if (this.l6 == null) {
         throw new NullReferenceException("TargetConteiner for shape serialization is not created!");
      } else {
         return this.l6;
      }
   }

   y2q k5() {
      return this.k5 != null ? this.k5.a6() : null;
   }

   final n6s u3() {
      return this.k5;
   }

   final y2q a6() {
      return this.k5();
   }

   final boolean u9() {
      return this.k5 == null ? true : this.k5.y4();
   }

   final boolean h0() {
      return this.u3;
   }

   final void n5(boolean var1) {
      this.u3 = var1;
   }

   final void n5(k1z var1) {
      this.a6 = var1;
   }
}
