package com.aspose.slides.internal.j6e;

import com.aspose.slides.internal.z0k.e2;

class l6$l6 {
   private final int n5;
   private final com.aspose.slides.internal.b8u.n5 l6;
   private final int k5;
   private final boolean u3;
   private e2 a6;
   private com.aspose.slides.internal.f9d.l6 u9;

   public l6$l6(int var1, com.aspose.slides.internal.b8u.n5 var2, int var3, boolean var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final void n5() {
      this.a6 = new e2();
      this.u9 = new com.aspose.slides.internal.f9d.l6(this.a6, this.k5, this.u3, false);
   }

   public final void n5(int var1) {
      this.u9.flush();
      this.u9.dispose();
      byte[] var2 = this.a6.toArray();
      this.l6.n5(var2, var2.length);
      this.l6.n5(var1);
   }

   public final void n5(byte[] var1, int var2) {
      this.u9.write(var1, 0, var2);
   }
}
