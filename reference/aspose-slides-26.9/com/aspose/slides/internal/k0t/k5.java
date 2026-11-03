package com.aspose.slides.internal.k0t;

import com.aspose.slides.internal.c1.a6;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.c8;
import com.aspose.slides.internal.z4.t4;

public class k5 extends a0 {
   private final byte[] n5;
   private final int k5;
   private final int u3;
   private final int a6;

   public k5(c8 var1, byte[] var2, int var3, int var4, int var5) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   @Override
   protected long u9() {
      return this.k5;
   }

   @Override
   public void n5(t4 var1) {
      super.n5(var1, this.n5, this.k5);
   }

   @Override
   public void l6(t4 var1) {
      var1.k5("/Type", "/XObject");
      var1.k5("/Subtype", "/Image");
      var1.n5("/Width", this.u3);
      var1.n5("/Height", this.a6);
      var1.k5("/ColorSpace", "/DeviceGray");
      var1.n5("/BitsPerComponent", 8);
   }

   @Override
   public com.aspose.slides.internal.c1.n5 a6() {
      switch (this.l6.l6().u9()) {
         case 0:
         case 2:
            a6 var1 = new a6();
            var1.k5(8);
            var1.l6(this.u3);
            var1.n5(1);
            var1.n5(true);
            return var1;
         default:
            return super.a6();
      }
   }
}
