package com.aspose.slides.internal.b8c;

public class u1s extends j9e implements Cloneable {
   private t4r n5;

   public final t4r n5() {
      return this.n5;
   }

   public final void n5(t4r var1) {
      this.n5 = var1;
   }

   @Override
   public x4 d2() {
      u1s var1 = (u1s)this.af_();
      if (this.n5 != null) {
         var1.n5((t4r)this.n5.d2());
      }

      return var1;
   }

   @Override
   protected Object af_() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
