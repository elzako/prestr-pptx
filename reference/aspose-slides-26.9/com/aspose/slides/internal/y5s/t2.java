package com.aspose.slides.internal.y5s;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class t2 extends s7 {
   private a0 n5;

   public a0 k5() {
      return this.n5;
   }

   public void n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      try {
         this.l6(var1);
      } finally {
         this.n5 = var1;
      }
   }

   public abstract boolean u3();

   public abstract void a6();

   public void n5(com.aspose.slides.internal.z0k.t4 var1) {
      this.t2();
      if (this.n5 != null && var1 == this.n5.l6() && !this.u3()) {
         long var2 = var1.getPosition();
         this.a6();
         var1.setPosition(var2);
      }

      this.l6(var1);
   }

   protected abstract void l6(com.aspose.slides.internal.z0k.t4 var1);

   @Override
   protected void u9() {
      if (this.n5 != null) {
         this.n5.dispose();
         this.n5 = null;
      }

      super.u9();
   }

   protected void l6(a0 var1) {
   }
}
