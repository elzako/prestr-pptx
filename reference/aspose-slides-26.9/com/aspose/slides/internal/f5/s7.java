package com.aspose.slides.internal.f5;

import com.aspose.slides.ms.System.d1;

public class s7 implements com.aspose.slides.internal.j3.x8, com.aspose.slides.internal.k5.y2, com.aspose.slides.internal.p6.n5 {
   private com.aspose.slides.internal.k5.k5 n5 = new com.aspose.slides.internal.k5.k5();
   private com.aspose.slides.internal.w5.n5 l6 = new com.aspose.slides.internal.w5.n5();
   private k5 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("CORE", "CSS", "LS");

   public s7(k5 var1) {
      this.k5 = var1;
   }

   @Override
   public boolean l6(String var1, String var2) {
      switch (u3.n5(var1)) {
         case 0:
         case 1:
         case 2:
            return true;
         default:
            return false;
      }
   }

   public com.aspose.slides.internal.j3.q0 n5(String var1, String var2, String var3) {
      return new com.aspose.slides.internal.w5.l6(var1, var2, var3, null, null);
   }

   @Override
   public final com.aspose.slides.internal.j3.z1 n5(String var1, String var2, com.aspose.slides.internal.j3.q0 var3) {
      com.aspose.slides.internal.w8.t9 var4 = new com.aspose.slides.internal.w8.t9(this.k5);
      var4.u3().n5(d1.n5, var1);
      if (var3 != null) {
         var4.u3(var3);
      }

      return var4;
   }

   @Override
   public final Object k5(String var1, String var2) {
      return this;
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 n5(String var1, String var2) {
      return this.n5.n5(var1, var2);
   }

   public final com.aspose.slides.internal.w5.n5 n5() {
      return this.l6;
   }

   @Override
   public final com.aspose.slides.internal.p6.u3 n5(int var1, String var2) {
      if ((var1 & 65535) == 2) {
         throw new com.aspose.slides.internal.j3.l6((byte)9, "NOT_SUPPORTED_ERR");
      } else {
         return new com.aspose.slides.internal.y8.u3(1, this.k5, var2);
      }
   }

   @Override
   public final com.aspose.slides.internal.p6.a6 l6() {
      return new com.aspose.slides.internal.a7.l6(this.k5);
   }

   @Override
   public final com.aspose.slides.internal.p6.l6 k5() {
      return new com.aspose.slides.internal.y8.l6();
   }

   @Override
   public final com.aspose.slides.internal.p6.k5 u3() {
      return new com.aspose.slides.internal.y8.k5();
   }
}
