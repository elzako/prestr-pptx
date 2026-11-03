package com.aspose.slides.internal.x4g;

class r4 extends n5 {
   public r4(n3 var1) {
      super(var1, false);
   }

   private boolean u3(int var1, int var2) {
      return var1 == 7 - var2;
   }

   @Override
   protected boolean n5(int var1, int var2) {
      return this.u3(var1, var2) || this.l6(var1, var2);
   }

   @Override
   protected boolean l6(int var1, int var2) {
      return this.u3(var1 + 1, var2) || this.u3(var1 - 1, var2) || this.u3(var1, var2 + 1) || this.u3(var1, var2 - 1) || this.k5(var1, var2);
   }

   @Override
   protected boolean k5(int var1, int var2) {
      return var1 == 0 && var2 == 0 || var1 == 7 && var2 == 7;
   }
}
