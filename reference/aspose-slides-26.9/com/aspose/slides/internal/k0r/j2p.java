package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;

public final class j2p extends r4 {
   private d2a k5 = null;
   private final List<r5w> u3;
   public static final byte[] n5 = new byte[]{0, 0, -13, 3, 20, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};
   public static final byte[] l6 = new byte[]{6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0};

   public j2p() {
      this.w1().n5(4080);
      this.u3 = new List<>();
      this.k5 = new d2a(this, this.u3);
   }

   public final d2a l6() {
      return this.k5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.k5.n5(var1, this.w1().a6());
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      this.k5.n5(var1);
   }

   @Override
   public int n5() {
      return this.k5.a6();
   }
}
