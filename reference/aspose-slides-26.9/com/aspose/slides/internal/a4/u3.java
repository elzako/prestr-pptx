package com.aspose.slides.internal.a4;

public abstract class u3 extends b3 {
   public u3() {
   }

   protected u3(b3 var1) {
      super(var1);
   }

   public final byte n5() {
      return (byte)((this.G_() & 3840) >> 8);
   }

   public final void n5(byte var1) {
      short var2 = (short)((var1 & 255 & 15) << 8);
      short var3 = -3841;
      this.n5((short)(this.G_() & -3841));
      this.n5((short)(this.G_() | var2));
   }
}
