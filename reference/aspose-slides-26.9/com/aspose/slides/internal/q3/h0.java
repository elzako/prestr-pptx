package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.c2;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.j9;
import com.aspose.slides.internal.i4.u6;
import com.aspose.slides.internal.i4.z8;
import com.aspose.slides.ms.System.d1;

public class h0 extends z8 {
   private final l6 u3;
   private j4 a6;
   private u6 u9;

   public h0(j9 var1, String var2, l6 var3) {
      super(var1);
      this.h0(var2);
      this.u3 = var3;
      this.a6 = var1.n3().n5(this);
      this.n5("prototype", this.a6, 7);
   }

   @Override
   public void n5(j9 var1) {
   }

   public final void u9(String var1) {
      this.u9 = new u9(this.x8(), var1, this.z1(), this.u3);
      this.z1().n5(var1, this.u9, 7);
   }

   public final void n5(String var1, int var2) {
      c2 var3 = new c2(this.x8(), this, var1);
      if ((var2 & 1) == 1) {
         var3.n5(new u9(this.x8(), d1.n5(new String[]{"get_", var1}), this.z1(), this.u3));
      }

      if ((var2 & 2) == 2) {
         var3.l6(new u9(this.x8(), d1.n5(new String[]{"set_", var1}), this.z1(), this.u3));
      }

      this.z1().n5(var3);
   }

   public final g7 l6(Object var1) {
      return new j4(var1, this.z1());
   }

   public final g7 s7() {
      return new j4(this.z1());
   }
}
