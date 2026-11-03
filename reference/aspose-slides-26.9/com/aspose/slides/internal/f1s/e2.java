package com.aspose.slides.internal.f1s;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.IDisposable;

public class e2 extends u3 {
   private List<u3> n5;
   private List<Float> k5;
   private float[] u3;

   public e2(com.aspose.slides.internal.z4.c8 var1, float[] var2) {
      super(var1, 1, 1, var2, null);
      this.l6(new List<>());
      this.n5(new List<>());
   }

   @Override
   public void n5(t4 var1) {
      var1.n5(this);
      var1.c8();
      this.l6(var1);
      var1.t2();
      var1.l6();
      List$Enumerator var2 = this.z3().iterator();

      try {
         while (var2.hasNext()) {
            u3 var3 = (u3)var2.next();
            var3.n5(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final List<u3> z3() {
      return this.n5;
   }

   private void l6(List<u3> var1) {
      this.n5 = var1;
   }

   public final List<Float> m1() {
      return this.k5;
   }

   public final void n5(List<Float> var1) {
      this.k5 = var1;
   }

   public final float[] k7() {
      return this.u3;
   }

   public final void l6(float[] var1) {
      this.u3 = var1;
   }

   @Override
   public void l6(t4 var1) {
      super.l6(var1);
      var1.n5("/Bounds", com.aspose.slides.internal.n2d.t4.k5(this.m1()));
      var1.n5("/Encode", this.k7());
      var1.n5("/Functions");
      var1.n5("[");

      for (int var2 = 0; var2 < this.z3().size(); var2++) {
         var1.n5(this.z3().get_Item(var2).t2());
         var1.u9();
      }

      var1.n5("]");
   }

   @Override
   protected int n5() {
      return 3;
   }
}
