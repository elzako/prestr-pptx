package com.aspose.slides.internal.a2w;

import com.aspose.slides.internal.z0k.e2;

public abstract class s7 {
   public void n5(com.aspose.slides.internal.l4o.k5 var1) {
      e2 var2 = new e2(this.l6());
      com.aspose.slides.internal.v2o.n5 var3 = new com.aspose.slides.internal.v2o.n5();
      long var4 = var2.getLength() - 4L;
      int var6 = var3.n5(var2);
      var1.k5(com.aspose.slides.internal.v6g.k5.a6(var4, 11));
      var1.l6(var2.toArray(), 0, com.aspose.slides.internal.v6g.k5.u3(var2.getLength(), 11));
      var1.k5(com.aspose.slides.internal.v6g.k5.a6(var6, 9));
   }

   protected abstract byte[] l6();
}
