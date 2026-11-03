package com.aspose.slides;

class b0t extends q7n {
   private byte u3 = 0;

   b0t(v5s var1) {
      super(var1);
   }

   final byte n5() {
      return this.u3;
   }

   @Override
   void t2() {
      super.t2();
      this.u3 = (byte)(this.k5.t2() != 0 ? 1 : 0);
      this.u3 = (byte)(this.u3 & 0xFF | (byte)(this.k5.l6() != 0 ? 2 : 0) & 0xFF);
   }
}
