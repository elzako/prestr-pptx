package com.aspose.slides.internal.w9;

public class z1 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      com.aspose.slides.internal.z0k.n5 var2 = new com.aspose.slides.internal.z0k.n5(var1);
      com.aspose.slides.internal.b9.z3 var3 = new com.aspose.slides.internal.b9.z3(var0[0]);
      var3.u3(var2.c4());
      long var4 = var2.c4();
      var2.x8().seek(-4L, 1);
      boolean var7;
      switch ((int)var4) {
         case 0:
            com.aspose.slides.internal.b9.z3[] var11 = new com.aspose.slides.internal.b9.z3[]{var3};
            var7 = new x8().n5(var11, var1);
            var3 = var11[0];
            break;
         case 726027589:
            com.aspose.slides.internal.b9.z3[] var10 = new com.aspose.slides.internal.b9.z3[]{var3};
            var7 = new s7(var10[0].r4().n3()).n5(var10, var1);
            var3 = var10[0];
            break;
         case 1128875079:
            com.aspose.slides.internal.b9.z3[] var9 = new com.aspose.slides.internal.b9.z3[]{var3};
            var7 = new e2().n5(var9, var1);
            var3 = var9[0];
            break;
         default:
            com.aspose.slides.internal.b9.z3[] var6 = new com.aspose.slides.internal.b9.z3[]{var3};
            var7 = new t9().n5(var6, var1);
            var3 = var6[0];
      }

      var0[0] = var3;
      return var7;
   }
}
