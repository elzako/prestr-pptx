package com.aspose.slides.internal.x4g;

class h0 extends n5 {
   public h0(n3 var1) {
      super(var1, true);
   }

   @Override
   protected boolean n5(int var1, int var2) {
      return var1 == var2 || var1 == 7 - var2;
   }

   @Override
   protected boolean k5(int var1, int var2) {
      return Math.abs(var1 - var2) == 7 || var1 == 0 && var2 == 0 || var1 == 7 && var2 == 7;
   }
}
