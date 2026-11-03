package com.aspose.slides.internal.y4;

import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.internal.k5.z7;
import com.aspose.slides.ms.System.d1;

public class y4 extends n5 {
   private com.aspose.slides.internal.k5.u3 n5;
   private com.aspose.slides.internal.k5.u3 l6;
   private com.aspose.slides.internal.k5.u3 k5;
   private com.aspose.slides.internal.k5.u3 u3;
   private final String a6;

   public y4(com.aspose.slides.internal.k5.u3 var1, com.aspose.slides.internal.k5.u3 var2, com.aspose.slides.internal.k5.u3 var3) {
      super((short)25);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = l6$n5.c8;
      this.a6 = d1.n5("rgb({0}, {1}, {2})",new Object[]{ var1.u9(), var2.u9(), var3.u9()});
   }

   public y4(
      com.aspose.slides.internal.k5.u3 var1,
      com.aspose.slides.internal.k5.u3 var2,
      com.aspose.slides.internal.k5.u3 var3,
      com.aspose.slides.internal.k5.u3 var4
   ) {
      super((short)25);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var1;
      this.a6 = d1.n5("rgba({0}, {1}, {2}, {3})",new Object[]{ var2.u9(), var3.u9(), var4.u9(), var1.u9()});
   }

   public static y4 n5(float var0, float var1, float var2) {
      return new y4(c8.n5(var0, (short)1), c8.n5(var1, (short)1), c8.n5(var2, (short)1));
   }

   public static y4 n5(float var0, float var1, float var2, float var3) {
      return new y4(c8.n5(var0, (short)1), c8.n5(var1, (short)1), c8.n5(var2, (short)1), c8.n5(var3, (short)1));
   }

   @Override
   public String u9() {
      return this.a6;
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)15);
   }

   @Override
   public z7 a6() {
      return new z7(this.u3, this.n5, this.l6, this.k5);
   }
}
