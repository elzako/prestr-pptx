package com.aspose.slides.internal.w0;

public abstract class t9 extends l6 {
   private c8 n5;
   private int l6 = 0;

   protected t9(int var1) {
      super(var1);
   }

   public final c8 n3() {
      if (this.n5 == null) {
         this.n5 = new c8();
      }

      return this.n5;
   }

   public final void n5(c8 var1) {
      this.n5 = var1;
   }

   public final int y4() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }
}
