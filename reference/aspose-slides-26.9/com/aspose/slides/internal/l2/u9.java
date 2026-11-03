package com.aspose.slides.internal.l2;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.internal.z0k.z1;
import com.aspose.slides.ms.System.d1;

public class u9 {
   private final String n5;
   private String l6;
   private t4 k5;
   private final t2 u3;

   public u9(String var1, String var2) {
      com.aspose.slides.internal.n2d.t4.n5(var1, "partName");
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new e2();
      this.u3 = new t2(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return d1.u3(z1.a6(this.n5),new char[]{ '.'});
   }

   public final String k5() {
      return this.l6;
   }

   public final t4 u3() {
      return this.k5;
   }

   public final void n5(t4 var1) {
      this.k5 = var1;
   }

   public final e2 a6() {
      return com.aspose.slides.internal.n2d.t4.n5(this.k5);
   }

   public final t2 u9() {
      return this.u3;
   }
}
