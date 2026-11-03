package com.aspose.slides.internal.l8;

public abstract class z1 {
   public final boolean l6(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2) {
      var1[0].l6(var2.r4());
      if ((var1[0].l6() & 65535) > ((var1[0].e2() & 4294967295L) * 2L & 4294967295L)) {
         com.aspose.slides.internal.f8y.n5.k5("Invalid WmfEscapeRecord. record.ByteCount > 2*record.RecordSize");
         return false;
      } else {
         return this.n5(var1, var2);
      }
   }

   protected abstract boolean n5(com.aspose.slides.internal.i3.q0[] var1, com.aspose.slides.internal.z0k.n5 var2);
}
