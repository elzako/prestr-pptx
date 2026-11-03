package com.aspose.slides.internal.n2;

public class t9 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      n5(var1, var2);
      com.aspose.slides.internal.b9.z3 var3 = (com.aspose.slides.internal.b9.z3)var1;
      var2.n5(var3.c8() & 4294967295L);
      long var4 = this.n5(var3);
      boolean var6;
      switch ((int)var4) {
         case 0:
            var6 = new x8().n5(var3, var2);
            break;
         case 726027589:
            var6 = new s7().n5(var3, var2);
            break;
         case 1128875079:
            var6 = new e2().n5(var3, var2);
            break;
         default:
            var6 = new t4().n5(var3, var2);
      }

      return var6;
   }

   private long n5(com.aspose.slides.internal.b9.z3 var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b9.t9.class)) {
         return 0L;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b9.e2.class)) {
         return 726027589L;
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.b9.q0.class) ? 1128875079L : 1L;
      }
   }
}
