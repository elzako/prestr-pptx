package com.aspose.slides.internal.e6s;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.s3;
import com.aspose.slides.ms.System.Xml.a4;

public class k5 {
   private final int n5;
   private final boolean l6;
   private int k5;
   private int u3;

   public k5(int var1) {
      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.e6s.u3.n5(var1);
   }

   public k5(int var1, int var2, int var3) {
      this(var1);
      this.k5 = var2;
      this.u3 = var3;
   }

   public final boolean n5() {
      return this.l6;
   }

   @Override
   public String toString() {
      return d1.n5(super.toString(), " type: ", a3.l6(this.n5), ", control Node: ", s3.n5(a4.class, this.k5), ", test Node: ", s3.n5(a4.class, this.u3));
   }
}
